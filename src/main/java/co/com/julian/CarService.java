package co.com.julian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger LOGGER = LoggerFactory.getLogger(CarService.class);

    public void process(String input){
        LOGGER.trace("TRACE {}", input);
        LOGGER.debug("DEBUG {}", input);
        LOGGER.info("INFO {}", input);
        LOGGER.warn("WARN {}", input);
        LOGGER.error("ERROR {}", input);
    }
}
