package pho.formulaone.web.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RaceResult {

    private String pilot;
    private int number;
    private int grid;
    private int podium;
    private int season;
    private int round;
    private String race;
    private String circuit;

}
