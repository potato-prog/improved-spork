package potato.prog.improvedspork.model.darkskyresponse;

import lombok.Data;

import java.util.List;

@Data
public class Minutely {

    private String summary;
    private String icon;
    private List<MinutelyData> minutely;

}
