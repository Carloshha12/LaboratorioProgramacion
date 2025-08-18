public class EstadoDescansoLargo implements EstadoPomodoro {
    @Override public String nombre() { return "DescansoLargo"; }

    @Override
    public void alEntrar(PomodoroTimer ctx) {
        // Configura la duración del descanso largo y notifica al usuario
        ctx.setDuracionActual(ctx.getDuraciones().descansoLargo());
        ctx.getNotificador().alEvento("Descanso largo (" +
                ctx.getDuraciones().descansoLargo().toMinutes() + " min).");
    }

    @Override public void alSalir(PomodoroTimer ctx) { /* nada */ }

    @Override
    public void alVencimiento(PomodoroTimer ctx) {
        // Notifica el vencimiento del descanso largo
        ctx.getNotificador().alEvento("⏰ Venció el descanso largo.");
        ctx.cambiarA(new EstadoEnfoque());
    }
}
