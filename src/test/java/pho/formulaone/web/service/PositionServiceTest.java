package pho.formulaone.web.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.mapper.RaceResultMapper;
import pho.formulaone.web.persistence.entities.RaceData;
import pho.formulaone.web.persistence.repositories.RaceDataRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PositionServiceTest {

    @Mock
    private RaceDataRepository repository;
    
    @Mock
    private RaceResultMapper mapper;

    private static final RaceData RACE_DATA_1 = RaceData.builder().seasonNumber(4000).seasonRound(1).pilotName("Randolph McFast").pilotNumber(12).pilotGrid(1).pilotPosition(1).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build();
    private static final RaceData RACE_DATA_2 = RaceData.builder().seasonNumber(4000).seasonRound(1).pilotName("Alberto Veloz").pilotNumber(34).pilotGrid(2).pilotPosition(2).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build();
    private static final RaceData RACE_DATA_3 = RaceData.builder().seasonNumber(4000).seasonRound(1).pilotName("Rodrigo Deprissa").pilotNumber(56).pilotGrid(3).pilotPosition(3).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build();
    private static final RaceData RACE_DATA_4 = RaceData.builder().seasonNumber(4000).seasonRound(1).pilotName("Benjamin Speed").pilotNumber(78).pilotGrid(4).pilotPosition(4).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build();

    private static final RaceResult RACE_RESULT_1 = RaceResult.builder().season(4000).round(1).pilot("Alberto Veloz").number(12).grid(2).podium(1).race("American Gran Prix").circuit("USA Speed Rapids").build();
    private static final RaceResult RACE_RESULT_2 = RaceResult.builder().season(4000).round(1).pilot("Randolph McFast").number(34).grid(1).podium(2).race("American Gran Prix").circuit("USA Speed Rapids").build();
    private static final RaceResult RACE_RESULT_3 = RaceResult.builder().season(4000).round(1).pilot("Rodrigo Deprissa").number(56).grid(3).podium(3).race("American Gran Prix").circuit("USA Speed Rapids").build();
    private static final RaceResult RACE_RESULT_4 = RaceResult.builder().season(4000).round(1).pilot("Benjamin Speed").number(78).grid(4).podium(4).race("American Gran Prix").circuit("USA Speed Rapids").build();

    @InjectMocks
    private PositionService positionService;

    @Test
    @DisplayName("End to End Test Checker: true")
    void endToEndChecker_true() {
        when(repository.findAllBySeasonNumberAndSeasonRound(4000, 1)).thenReturn(raceDataList(true));

        boolean isEndToEnd = positionService.endToEnd(4000, 1);
        assertTrue(isEndToEnd, "END TO END: TRUE");
    }

    @Test
    @DisplayName("End to End Test Checker: false")
    void endToEndChecker_false() {
        when(repository.findAllBySeasonNumberAndSeasonRound(4000, 1)).thenReturn(raceDataList(false));

        boolean isEndToEnd = positionService.endToEnd(4000, 1);
        assertFalse(isEndToEnd, "END TO END: FALSE");
    }

    @Test
    @DisplayName("Order By test")
    void orderby() {
        when(mapper.sourceToDestination(RACE_DATA_1)).thenReturn(RACE_RESULT_1);
        when(mapper.sourceToDestination(RACE_DATA_2)).thenReturn(RACE_RESULT_2);
        when(mapper.sourceToDestination(RACE_DATA_3)).thenReturn(RACE_RESULT_3);
        when(mapper.sourceToDestination(RACE_DATA_4)).thenReturn(RACE_RESULT_4);

        List<RaceResult> actual = positionService.orderBy(Comparator.comparingInt(RaceResult::getPodium), raceDataList(true));
        List<RaceResult> expected = raceResultList();

        assertEquals(expected, actual, "ORDER BY TEST");
    }

    @Test
    @DisplayName("Filter test")
    void filter() {
        when(mapper.sourceToDestination(RACE_DATA_1)).thenReturn(RACE_RESULT_1);;

        List<RaceResult> actual = positionService.filter(raceDataList(true));
        List<RaceResult> expected = Arrays.asList(RACE_RESULT_1);

        assertEquals(expected, actual, "FILTER TEST");
    }

    private List<RaceData> raceDataList(boolean endToEnd) {
        List<RaceData> races = new ArrayList<>();

        RACE_DATA_1.setPilotPosition((endToEnd)? 1 : 2);
        RACE_DATA_2.setPilotPosition((endToEnd)? 2 : 1);

        races.add(RACE_DATA_1);
        races.add(RACE_DATA_2);
        races.add(RACE_DATA_3);
        races.add(RACE_DATA_4);

        return races;
    }

    private List<RaceResult> raceResultList() {
        List<RaceResult> races = new ArrayList<>();

        races.add(RACE_RESULT_1);
        races.add(RACE_RESULT_2);
        races.add(RACE_RESULT_3);
        races.add(RACE_RESULT_4);

        return races;
    }

}
