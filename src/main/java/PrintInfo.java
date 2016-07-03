import org.apache.log4j.Logger;

/**
 * Created by a_pan on 03.07.2016.
 */
public class PrintInfo {
    private static Logger logger = Logger.getLogger(PrintInfo.class);

    public void print(String s){
        if (s == "war"){
            logger.error("bad massage!");
        }
        logger.info("I get - " + s);
    }
}
