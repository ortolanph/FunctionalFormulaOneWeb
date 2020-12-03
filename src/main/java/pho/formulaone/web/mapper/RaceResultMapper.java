package pho.formulaone.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.persistence.entities.RaceData;

@Mapper(componentModel = "spring")
public interface RaceResultMapper {

    @Mappings(
            {
                    @Mapping(source = "pilotName", target = "pilot"),
                    @Mapping(source = "pilotNumber", target = "number"),
                    @Mapping(source = "pilotGrid", target = "grid"),
                    @Mapping(source = "pilotPosition", target = "podium"),
                    @Mapping(source = "seasonNumber", target = "season"),
                    @Mapping(source = "seasonRound", target = "round"),
                    @Mapping(source = "raceName", target = "race"),
                    @Mapping(source = "raceCircuitName", target = "circuit"),
            }
    )
    RaceResult sourceToDestination(RaceData source);

}
