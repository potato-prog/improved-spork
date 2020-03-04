package potato.prog.improvedspork.service;

import org.springframework.stereotype.Service;
import potato.prog.improvedspork.model.DarkSkyReturnResponse;

@Service
public interface DarkSkyService {

    public DarkSkyReturnResponse showWeatherInfo() throws Exception;

}
