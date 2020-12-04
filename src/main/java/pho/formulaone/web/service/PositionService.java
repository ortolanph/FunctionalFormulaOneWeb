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
import java.util.stream.Collectors;

@Service
@Slf4j
public class PositionService {

    @Autowired
    private RaceDataRepository repository;

    @Autowired
    private RaceResultMapper mapper;

    public List<RaceResult> grid(int season, int round) {
        log.debug("POSITIONS_API_GRID (SEASON={}, ROUND={})", season, round);
        List<RaceData> seasonData = repository.findAllBySeasonNumberAndSeasonRound(season, round);

        return seasonData
                .stream()
                .map(raceData -> mapper.sourceToDestination(raceData))
                .sorted(Comparator.comparingInt(RaceResult::getGrid))
                .collect(Collectors.toList());
    }

    public List<RaceResult> podium(Integer season, Integer round) {
        log.debug("POSITIONS_API_PODIUM (SEASON={}, ROUND={})", season, round);
        List<RaceData> seasonData = repository.findAllBySeasonNumberAndSeasonRound(season, round);

        return seasonData
                .stream()
                .map(raceData -> mapper.sourceToDestination(raceData))
                .sorted(Comparator.comparingInt(RaceResult::getPodium))
                .collect(Collectors.toList());
    }

    public RaceResult winner(Integer season, Integer round) {
        log.debug("POSITIONS_API_WINNER (SEASON={}, ROUND={})", season, round);
        return podium(season, round)
                .get(0);
    }

    public RaceResult poleposition(Integer season, Integer round) {
        log.debug("POSITIONS_API_POLE_POSITION(SEASON={}, ROUND={})", season, round);
        return grid(season, round)
                .get(0);
    }
}
