package potato.prog.improvedspork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import potato.prog.improvedspork.model.DarkSkyReturnResponse;
import potato.prog.improvedspork.service.DarkSkyService;

@Controller
public class DarkSkyController {

    @Autowired
    private DarkSkyService darkSkyService;

    @GetMapping("/weatherinfo")
    @ResponseBody
    public DarkSkyReturnResponse weatherForecast() throws Exception {

        darkSkyService.showWeatherInfo();
//        DarkSkyReturnResponse darkSkyReturnResponse = new DarkSkyReturnResponse();

        return darkSkyService.showWeatherInfo();
    }

}
