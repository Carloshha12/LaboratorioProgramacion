import java.time.Duration;

//Utilizo esta clase para mantener encapsulados los mensajes de notificación
public class NotificadorConsola {
    
    public void alCambiarEstado(String desde, String hacia) {
        System.out.println(" Cambio de estado: " + desde + " → " + hacia);
    }
    public void alEvento(String mensaje) {
        System.out.println("ℹ! " + mensaje);
    }
    public void alTick(Duration restante, String estado) { // usar cuando implementemos schedule
        System.out.println(" " + estado + " — restante: " + restante.toMinutes() + " min");
    }
}
