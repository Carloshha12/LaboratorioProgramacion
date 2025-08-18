public interface EstadoPomodoro {
    // Métodos que deben implementar los estados del Pomodoro este seria fundamental para el patron State   
    String nombre();
    void alEntrar(PomodoroTimer ctx);
    void alSalir(PomodoroTimer ctx);
    void alVencimiento(PomodoroTimer ctx); // se invoca cuando “termina” el bloque
}
