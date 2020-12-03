package pho.formulaone.web.mapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pho.formulaone.web.annotation.BehaviourTest;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.persistence.entities.RaceData;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {RaceResultMapperTest.SpringTestConfig.class})
@ExtendWith(SpringExtension.class)
@BehaviourTest
class RaceResultMapperTest {

    @Configuration
    @ComponentScan(basePackageClasses = RaceResultMapperTest.class)
    public static class SpringTestConfig {
    }

    @Autowired
    private RaceResultMapper mapper;

    @Test
    @DisplayName("Source to Destination Test")
    void sourceToDestination() {
        RaceResult expected = crateRaceResult();
        RaceResult actual = mapper.sourceToDestination(createRaceData());

        assertEquals(expected, actual, "SOURCE TO DESTINATION");
    }

    private RaceData createRaceData() {
        return RaceData
                .builder()
                .pilotName("Robert Smith")
                .pilotNumber(42)
                .pilotGrid(1)
                .pilotPosition(2)
                .seasonNumber(4000)
                .seasonRound(1)
                .raceName("American Gran Prix")
                .raceCircuitName("USA Speed Rapids")
                .build();
    }

    private RaceResult crateRaceResult() {
        return RaceResult
                .builder()
                .pilot("Robert Smith")
                .number(42)
                .grid(1)
                .podium(2)
                .season(4000)
                .round(1)
                .race("American Gran Prix")
                .circuit("USA Speed Rapids")
                .build();
    }
}
