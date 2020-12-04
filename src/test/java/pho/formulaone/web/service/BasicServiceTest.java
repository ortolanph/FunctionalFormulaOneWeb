package pho.formulaone.web.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pho.formulaone.web.persistence.entities.RaceData;
import pho.formulaone.web.persistence.repositories.RaceDataRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BasicServiceTest {

    @Mock
    private RaceDataRepository repository;

    @InjectMocks
    private BasicService basicService;

    @Test
    @DisplayName("Find all seasons test")
    void findAllSeasons() {
        when(repository.findAll()).thenReturn(raceDataList());

        List<Integer> actual = basicService.findAllSeasons();
        List<Integer> expected = Arrays.asList(1, 2);

        assertEquals(expected, actual, "FIND ALL SEASON TEST FAILED");
    }

    @Test
    @DisplayName("Races per seasons test")
    void racesPerSeason() {
        when(repository.findAll()).thenReturn(raceDataList());

        Map<Integer, Integer> actual = basicService.racesPerSeason();
        Map<Integer, Integer> expected = new HashMap<>();

        expected.put(1, 4);
        expected.put(2, 4);

        assertEquals(expected, actual, "RACES PER SEASON FAILED");
    }

    @Test
    @DisplayName("Total races test")
    void totalRaces() {
        when(repository.findAll()).thenReturn(raceDataList());

        Integer actual = basicService.totalRaces();
        Integer expected = 8;

        assertEquals(expected, actual, "RACES PER SEASON FAILED");
    }

    @Test
    @DisplayName("All Seasons Test")
    void allSeasons() {
        List<Integer> actual = basicService.allSeasons(raceDataList());
        List<Integer> expected = Arrays.asList(1, 2);

        assertEquals(expected, actual, "ALL SEASON TEST FAILED");
    }

    @Test
    @DisplayName("Season test")
    void season() {
        List<RaceData> actual = basicService.season(raceDataList(), 1);
        List<RaceData> expected = raceDataList().stream().filter(raceData -> raceData.getSeasonNumber() == 1).collect(Collectors.toList());

        assertEquals(expected.size(), actual.size(), "NUMBER OF SEASONS ARE NOT THE SAME");
        assertEquals(expected.get(0).getSeasonNumber(), actual.get(0).getSeasonNumber(), "SEASONS ARE NOT THE SAME");
    }

    @Test
    @DisplayName("Max races")
    void numberOfRaces() {
        Integer actual = basicService.numberOfRaces(basicService.season(raceDataList(), 1));
        Integer expected = 4;

        assertEquals(expected, actual, "NUMBER OF RACES ARE DIFFERENT");
    }

    @Test
    @DisplayName("Racers per seasons test")
    void racersPerSeason() {
        when(repository.findAll()).thenReturn(raceDataList());

        Map<Integer, Long> actual = basicService.racersPerSeason();
        Map<Integer, Long> expected = new HashMap<>();

        expected.put(1, 4l);
        expected.put(2, 4l);

        assertEquals(expected, actual, "RACERS PER SEASON FAILED");
    }

    @Test
    @DisplayName("Constructors per seasons test")
    void constructorsPerSeason() {
        when(repository.findAll()).thenReturn(raceDataList());

        Map<Integer, Long> actual = basicService.constructorsPerSeason();
        Map<Integer, Long> expected = new HashMap<>();

        expected.put(1, 2l);
        expected.put(2, 2l);

        assertEquals(expected, actual, "RACES PER SEASON FAILED");
    }

    private List<RaceData> raceDataList() {
        List<RaceData> races = new ArrayList<>();

        races.add(RaceData.builder().seasonNumber(1).seasonRound(1).pilotName("Randolph McFast").constructorName("F1SpecialMotors").build());
        races.add(RaceData.builder().seasonNumber(1).seasonRound(2).pilotName("Alberto Veloz").constructorName("MTR").build());
        races.add(RaceData.builder().seasonNumber(1).seasonRound(3).pilotName("Rodrigo Deprissa").constructorName("F1SpecialMotors").build());
        races.add(RaceData.builder().seasonNumber(1).seasonRound(4).pilotName("Benjamin Speed").constructorName("MTR").build());
        races.add(RaceData.builder().seasonNumber(2).seasonRound(1).pilotName("Mario Velocità").constructorName("MTR").build());
        races.add(RaceData.builder().seasonNumber(2).seasonRound(2).pilotName("Alberto Veloz").constructorName("MTR").build());
        races.add(RaceData.builder().seasonNumber(2).seasonRound(3).pilotName("Benjamin Speed").constructorName("MadeForF1").build());
        races.add(RaceData.builder().seasonNumber(2).seasonRound(4).pilotName("Yang Zoom Zoom").constructorName("MadeForF1").build());

        return races;
    }
}
