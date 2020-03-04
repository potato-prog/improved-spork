package potato.prog.improvedspork.model;

import lombok.Data;
import potato.prog.improvedspork.model.darkskyresponse.*;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DarkSkyReturnResponse {

    private BigDecimal latitude;
    private BigDecimal longitude;
    private String timezone;
    private Currently currently;
    private Minutely minutely;
    private Hourly hourly;
    private Daily daily;
    private List<Alerts> alerts;
    private Flags flags;
    private BigDecimal offset;

}
