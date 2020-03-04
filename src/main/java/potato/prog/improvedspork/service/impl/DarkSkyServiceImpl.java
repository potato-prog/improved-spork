package potato.prog.improvedspork.service.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import potato.prog.improvedspork.model.DarkSkyReturnResponse;
import potato.prog.improvedspork.model.darkskyresponse.DarkSkyResponse;
import potato.prog.improvedspork.service.DarkSkyService;

import java.io.File;

@Service
public class DarkSkyServiceImpl implements DarkSkyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DarkSkyServiceImpl.class);


    @Override
    public DarkSkyReturnResponse showWeatherInfo() throws Exception {

        DarkSkyReturnResponse darkSkyResponseReturn = new DarkSkyReturnResponse();

        try {
            DarkSkyResponse darkSkyResponse = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(new File("C:\\Users\\hquser\\Downloads\\darkSkyResponse2200-mastercard.json"), DarkSkyResponse.class);

            if (darkSkyResponse != null) {
                LOGGER.info("mapping object is not empty");
                darkSkyResponseReturn.setLatitude(darkSkyResponse.getLatitude());
                darkSkyResponseReturn.setLongitude(darkSkyResponse.getLongitude());
                darkSkyResponseReturn.setOffset(darkSkyResponse.getOffset());

            } else {
                LOGGER.error("*****Error****");
            }
        } catch (Exception e) {
//            LOGGER.error("Exception", e);
            throw new Exception("Mapping error", e);
        }

        return darkSkyResponseReturn;
    }
}
