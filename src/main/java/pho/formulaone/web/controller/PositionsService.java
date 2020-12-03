package pho.formulaone.web.controller;

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
public class PositionsService {

    @Autowired
    private RaceDataRepository repository;

    @Autowired
    private RaceResultMapper mapper;

    public List<RaceResult> grid(int season, int round) {
        List<RaceData> seasonData = repository.findAllBySeasonNumberAndSeasonRound(season, round);

        return seasonData
                .stream()
                .map(raceData -> mapper.sourceToDestination(raceData))
                .sorted(Comparator.comparingInt(RaceResult::getGrid))
                .collect(Collectors.toList());
    }
}
