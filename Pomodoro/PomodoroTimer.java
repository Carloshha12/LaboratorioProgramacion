import java.time.Duration;

public class PomodoroTimer {
    private EstadoPomodoro estadoActual;
    private final Duraciones duraciones;
    private final NotificadorConsola notificador;
    private int contadorFocos = 0; // 0..3
    private Duration duracionActual = Duration.ZERO; // solo informativa en esta etapa

    public PomodoroTimer(Duraciones duraciones, NotificadorConsola notificador) {
        this.duraciones = duraciones;
        this.notificador = notificador;
    }

    public void iniciar() {
        if (estadoActual != null) {
            notificador.alEvento("El temporizador ya fue iniciado.");
            
        }else {
            cambiarA(new EstadoEnfoque());
        }
    }

    public void cambiarA(EstadoPomodoro siguiente) {
        // Cambia el estado actual y utiliza al salir que nos da el siguiente estado
        String desde = (estadoActual == null) ? "(ninguno)" : estadoActual.nombre();
        if (estadoActual != null) estadoActual.alSalir(this);
        estadoActual = siguiente;
        notificador.alCambiarEstado(desde, estadoActual.nombre());
        estadoActual.alEntrar(this);
    }

    // Simula que terminó el bloque actual (equivalente a un timeout)
    public void simularVencimiento() {
        if (estadoActual == null) {
            // Si no hay estado no podemos terminar
            notificador.alEvento("No hay estado actual. Llamá a iniciar() primero.");
            
        }else if (duracionActual.isZero()) {
            // Si la duración actual es cero, significa que el bloque de tiempo ha terminado
            notificador.alEvento("⏰ Venció el bloque de " + estadoActual.nombre());
            estadoActual.alVencimiento(this);
        }
    }

    // Getters/Setters usados por los estados
    public Duraciones getDuraciones() { return duraciones; }
    public NotificadorConsola getNotificador() { return notificador; }
    public int getContadorFocos() { return contadorFocos; }
    public void setContadorFocos(int c) { this.contadorFocos = c; }
    public void setDuracionActual(Duration d) { this.duracionActual = d; }
    public Duration getDuracionActual() { return duracionActual; }
    public String estadoActualNombre() { return (estadoActual == null) ? "(ninguno)" : estadoActual.nombre(); }
}
