package com.mezglews.rx.common;

import org.apache.log4j.Logger;

/**
 * User: Szymon Mezglewski
 * Date: 2016-10-25
 */
public class Utils {
    final static Logger logger = Logger.getLogger(Utils.class);

    public static void log(Object msg) {
        logger.info(msg);
    }

    public static void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            logger.error("Sleep error", e);
        }
    }
}
