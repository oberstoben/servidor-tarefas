import utils.LoggingUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Servidor {

    public static final Logger LOGGER = Logger.getLogger(Servidor.class.getSimpleName());

    public static void main(String[] args) throws IOException, InterruptedException {
        LoggingUtil.initializeLogManager();
        LOGGER.info("Iniciando o servidor !");

        ServerSocket sSocket = new ServerSocket(12345);
        LOGGER.info("Aceitando conexoes !");
        while (true){
            Socket accept = sSocket.accept();
            LOGGER.info("Client socket info: "+accept.toString());
            new Thread(new Tarefa()).start();
        }
    }
}
