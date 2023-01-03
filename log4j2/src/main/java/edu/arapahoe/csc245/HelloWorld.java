/*

    Added comment

*/

package edu.arapahoe.csc245;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");

        logger.debug("Example of a DEBUG {}", () -> 1);
        logger.fatal("Example of a FATAL {}", () -> 2);
        logger.error("Example of a ERROR {}", () -> 3);
        logger.warn("Example of a WARN {}", () -> 4);
        logger.info("Example of a INFO {}", () -> 5);
        logger.trace("Example of a TRACE {}", () -> 6);

//        while (true)//test rolling file
//            logger.debug("hello {}", () -> getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
