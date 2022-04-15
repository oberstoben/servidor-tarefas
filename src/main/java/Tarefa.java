import java.util.logging.Logger;

public class Tarefa implements Runnable {
    public static final Logger LOGGER = Logger.getLogger(Tarefa.class.getSimpleName());
    @Override
    public void run() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
