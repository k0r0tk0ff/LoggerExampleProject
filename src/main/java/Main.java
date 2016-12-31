import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**.
 * main class
 * @author k0r0tk0ff
 * @since 31.12.2016
 * @version 1.0
 */
public class Main {

    //final Logger logger = LoggerFactory.getLogger(Main.class);

    // from https://habrahabr.ru/post/247647
    //java.util.logging.Logger log4jLog = java.util.logging.getLogger("log4Log");


    // http://www.slf4j.org/manual.html
    //final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LoggerTester tester = new LoggerTester();
        tester.setTemperature(30);
    }
}
