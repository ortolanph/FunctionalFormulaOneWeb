package pho.formulaone.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.mapper.RaceResultMapper;
import pho.formulaone.web.persistence.entities.RaceData;
import pho.formulaone.web.persistence.repositories.RaceDataRepository;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PositionService {

    @Autowired
    private RaceDataRepository repository;

    @Autowired
    private RaceResultMapper mapper;

    private static final Predicate<RaceData> END_TO_END_PREDICATE =
            raceData -> raceData.getPilotGrid() == 1 && raceData.getPilotPosition() == 1;

    public List<RaceResult> grid(int season, int round) {
        log.debug("POSITIONS_API_GRID (SEASON={}, ROUND={})", season, round);
        List<RaceData> roundData = repository.findAllBySeasonNumberAndSeasonRound(season, round);
        return orderBy(Comparator.comparingInt(RaceResult::getGrid), roundData);
    }

    public List<RaceResult> podium(Integer season, Integer round) {
        log.debug("POSITIONS_API_PODIUM (SEASON={}, ROUND={})", season, round);
        List<RaceData> roundData = repository.findAllBySeasonNumberAndSeasonRound(season, round);
        return orderBy(Comparator.comparingInt(RaceResult::getPodium), roundData);
    }

    public RaceResult winner(Integer season, Integer round) {
        log.debug("POSITIONS_API_WINNER (SEASON={}, ROUND={})", season, round);
        return podium(season, round).get(0);
    }

    public RaceResult poleposition(Integer season, Integer round) {
        log.debug("POSITIONS_API_POLE_POSITION(SEASON={}, ROUND={})", season, round);
        return grid(season, round).get(0);
    }

    public Boolean endToEnd(Integer season, Integer round) {
        log.debug("POSITIONS_API_END_TO_END(SEASON={}, ROUND={})", season, round);
        List<RaceData> roundData = repository.findAllBySeasonNumberAndSeasonRound(season, round);

        long countEndToEnd = roundData
                .stream()
                .filter(END_TO_END_PREDICATE)
                .count();

        return (countEndToEnd == 1L);
    }

    public List<RaceResult> endToEnd(Integer season) {
        log.debug("POSITIONS_API_END_TO_END(SEASON={})", season);
        return filterData(repository.findAllBySeasonNumber(season));
    }

    public List<RaceResult> endToEnd() {
        log.debug("POSITIONS_API_END_TO_END");
        return filterData(repository.findAll());
    }

    protected List<RaceResult> orderBy(Comparator<RaceResult> comparator, List<RaceData> data) {
        return data
                .stream()
                .map(raceData -> mapper.sourceToDestination(raceData))
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    protected List<RaceResult> filterData(List<RaceData> data) {
        return data
                .stream()
                .filter(END_TO_END_PREDICATE)
                .map(raceData -> mapper.sourceToDestination(raceData))
                .sorted(Comparator.comparingInt(RaceResult::getRound))
                .collect(Collectors.toList());
    }
}
