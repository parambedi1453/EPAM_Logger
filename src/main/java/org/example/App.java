package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static final Logger Logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Logger.debug("This is Debug");
        Logger.info("This is Info");
        Logger.warn("This is Warn");
        Logger.error("This is Error");
        Logger.fatal("This is Fatal");
    }
}