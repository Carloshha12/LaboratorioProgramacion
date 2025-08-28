import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);

        // Cambia de estado cada 30 segundos
        //exec.scheduleAtFixedRate(semaforo::cambiarEstado, 0, 30, TimeUnit.SECONDS);

        // Pruebas cortitas
         exec.scheduleAtFixedRate(semaforo::cambiarEstado, 0, 1, TimeUnit.SECONDS);

        // Detiene la ejecucion despues de 2 minutos
         exec.schedule(exec::shutdown, 2, TimeUnit.MINUTES);
    }}