package pho.formulaone.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pho.formulaone.web.persistence.entities.RaceData;
import pho.formulaone.web.persistence.repositories.RaceDataRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BasicService {

    @Autowired
    private RaceDataRepository repository;

    public List<Integer> findAllSeasons() {
        return allSeasons(repository.findAll());
    }

    public Integer totalRaces() {
        return racesPerSeason()
                .values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }


    public Map<Integer, Integer> racesPerSeason() {
        List<RaceData> allData = repository.findAll();
        List<Integer> allSeasons = allSeasons(allData);

        return allSeasons
                .stream()
                .collect(
                        Collectors.toMap(
                                season -> season,
                                races -> numberOfRaces(season(allData, races))
                        )
                );
    }

    public Map<Integer, Long> racersPerSeason() {
        List<RaceData> allData = repository.findAll();
        List<Integer> allSeasons = allSeasons(allData);

        return allSeasons
                .stream()
                .collect(
                        Collectors.toMap(
                                season -> season,
                                races -> numberOfRacers(season(allData, races))
                        )
                );
    }

    public Map<Integer, Long> constructorsPerSeason() {
        List<RaceData> allData = repository.findAll();
        List<Integer> allSeasons = allSeasons(allData);

        return allSeasons
                .stream()
                .collect(
                        Collectors.toMap(
                                season -> season,
                                races -> numberOfConstructors(season(allData, races))
                        )
                );
    }

    protected List<Integer> allSeasons(List<RaceData> allData) {
        return allData
                .stream()
                .map(RaceData::getSeasonNumber)
                .distinct()
                .collect(Collectors.toList());
    }

    protected List<RaceData> season(List<RaceData> allData, int season) {
        return allData
                .stream()
                .filter(raceData -> raceData.getSeasonNumber() == season)
                .collect(Collectors.toList());
    }

    protected Integer numberOfRaces(List<RaceData> season) {
        return season
                .stream()
                .mapToInt(RaceData::getSeasonRound)
                .distinct()
                .max()
                .getAsInt();
    }

    private Long numberOfRacers(List<RaceData> season) {
        return season
                .stream()
                .map(RaceData::getPilotName)
                .distinct()
                .count();
    }

    private Long numberOfConstructors(List<RaceData> season) {
        return season
                .stream()
                .map(RaceData::getConstructorName)
                .distinct()
                .count();
    }
}
