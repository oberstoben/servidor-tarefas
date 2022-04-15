import utils.LoggingUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

public class Servidor {

    public static final Logger LOGGER = Logger.getLogger(Servidor.class.getSimpleName());

    public static void main(String[] args) throws IOException {
        LoggingUtil.initializeLogManager();
        LOGGER.info("Iniciando o servidor !");
    }
}
