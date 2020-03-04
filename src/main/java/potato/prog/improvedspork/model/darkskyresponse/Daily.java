package potato.prog.improvedspork.model.darkskyresponse;

import lombok.Data;

import java.util.List;

@Data
public class Daily {

    private String summary;
    private String icon;
    private List<DailyData> data;

}
