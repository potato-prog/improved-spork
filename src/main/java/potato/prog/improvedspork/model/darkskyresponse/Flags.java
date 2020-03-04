package potato.prog.improvedspork.model.darkskyresponse;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Flags {

    private List<String> sources;
    private BigDecimal nearestStation;
    private String units;
}
