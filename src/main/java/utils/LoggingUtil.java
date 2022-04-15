package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

public class LoggingUtil {

    public static void initializeLogManager() throws IOException {
            LogManager.getLogManager().readConfiguration(new FileInputStream("./src/main/resources/logging.properties"));
    }
}
