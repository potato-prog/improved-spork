package potato.prog.improvedspork.model.darkskyresponse;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MinutelyData {

    private BigDecimal time;
    private BigDecimal precipIntensity;
    private BigDecimal precipProbability;

}
