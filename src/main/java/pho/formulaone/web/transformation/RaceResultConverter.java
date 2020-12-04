package pho.formulaone.web.transformation;

import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.persistence.entities.RaceData;

import java.util.function.Function;

public class RaceResultConverter implements Function<RaceData, RaceResult> {
    @Override
    public RaceResult apply(RaceData raceData) {
        return RaceResult
                .builder()
                .pilot(raceData.getPilotName())
                .number(raceData.getPilotNumber())
                .grid(raceData.getPilotGrid())
                .podium(raceData.getPilotPosition())
                .season(raceData.getSeasonNumber())
                .round(raceData.getSeasonRound())
                .race(raceData.getRaceName())
                .circuit(raceData.getRaceCircuitName())
                .build();
    }
}
