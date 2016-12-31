import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**.
 * Class describe a main logic of
 * simple programm, that use logging at it work.
 * @author http://www.slf4j.org/
 * @since 31.12.2016
 * @version 1.0
 */
public class LoggerTester {
    final Logger logger = LoggerFactory.getLogger(Main.class);
    Integer temperature;
    Integer oldT;

    public void setTemperature(Integer newTemperature) {
        oldT = temperature;
        temperature = newTemperature;
        logger.debug("Temperature set to {}, old temperature is {}.", temperature, oldT);

            if(temperature.intValue() > 50) {
                logger.info("Temperature has risen above 50 degrees.");
            }
    }
}
