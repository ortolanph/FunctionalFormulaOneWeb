package pho.formulaone.web.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "race_data")
@SequenceGenerator(name = "seq_race", sequenceName = "seq_race", allocationSize = 1)
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RaceData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_race")
    private Long id;
    private int seasonNumber;
    private int seasonRound;
    private String raceName;
    private String raceCircuitName;
    private String raceLocality;
    private String raceCountry;
    private String pilotName;
    private int pilotNumber;
    private int pilotGrid;
    private int pilotPosition;
    private String constructorName;
    private int fastestLapRank;
    private String status;
    private String finishStatus;

}
