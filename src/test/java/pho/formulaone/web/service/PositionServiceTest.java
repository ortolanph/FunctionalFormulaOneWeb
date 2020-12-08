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
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PositionServiceTest {

    @Mock
    private RaceDataRepository repository;

    @InjectMocks
    private PositionService positionService;

    @Test
    @DisplayName("End to End Test Checker: true")
    void endToEndChecker_true() {
        when(repository.findAllBySeasonNumberAndSeasonRound(4000, 1)).thenReturn(raceDataList(4000, 1, true));

        boolean isEndToEnd = positionService.endToEnd(4000, 1);
        assertTrue(isEndToEnd);
    }

    @Test
    @DisplayName("End to End Test Checker: false")
    void endToEndChecker_false() {
        when(repository.findAllBySeasonNumberAndSeasonRound(4000, 2)).thenReturn(raceDataList(4000, 2, false));

        boolean isEndToEnd = positionService.endToEnd(4000, 2);
        assertFalse(isEndToEnd);
    }

    private List<RaceData> raceDataList(Integer season, Integer round, boolean endToEnd) {
        List<RaceData> races = new ArrayList<>();

        races.add(RaceData.builder().seasonNumber(season).seasonRound(round).pilotName("Randolph McFast").pilotGrid(1).pilotPosition((endToEnd)?1:2).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build());
        races.add(RaceData.builder().seasonNumber(season).seasonRound(round).pilotName("Alberto Veloz").pilotGrid(2).pilotPosition((endToEnd)?2:1).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build());
        races.add(RaceData.builder().seasonNumber(season).seasonRound(round).pilotName("Rodrigo Deprissa").pilotGrid(3).pilotPosition(3).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build());
        races.add(RaceData.builder().seasonNumber(season).seasonRound(round).pilotName("Benjamin Speed").pilotGrid(4).pilotPosition(4).raceName("American Gran Prix").raceCircuitName("USA Speed Rapids").build());

        return races;
    }

}
