package clientes;

import utils.LoggingUtil;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class Cliente {
    public static final Logger LOGGER = Logger.getLogger(Cliente.class.getSimpleName());
    public static void main(String[] args) throws IOException {
        LoggingUtil.initializeLogManager();
        LOGGER.info("Inicializando cliente");
        Socket socket = new Socket("localhost", 12345);

        Scanner in = new Scanner(System.in);
        in.hasNextLine();

        socket.close();
    }
}
