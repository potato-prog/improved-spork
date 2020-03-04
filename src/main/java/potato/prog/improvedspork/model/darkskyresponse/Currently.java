package potato.prog.improvedspork.model.darkskyresponse;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Currently {

    private BigDecimal time;
    private String summary;
    private String icon;
    private BigDecimal nearestStormDistance;
    private BigDecimal nearestStormBearing;
    private BigDecimal precipIntensity;
    private BigDecimal precipProbability;
    private BigDecimal temperature;
    private BigDecimal apparentTemperature;
    private BigDecimal dewPoint;
    private BigDecimal humidity;
    private BigDecimal pressure;
    private BigDecimal windSpeed;
    private BigDecimal windGust;
    private BigDecimal windBearing;
    private BigDecimal cloudCover;
    private BigDecimal uvIndex;
    private BigDecimal visibility;
    private BigDecimal ozone;

}
