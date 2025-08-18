public class EstadoDescansoCorto implements EstadoPomodoro {
    @Override public String nombre() { return "DescansoCorto"; }

    @Override
    public void alEntrar(PomodoroTimer ctx) {
        // Configura la duración del descanso corto y notifica al usuario
        ctx.setDuracionActual(ctx.getDuraciones().descansoCorto());
        ctx.getNotificador().alEvento("Descanso corto (" +
                ctx.getDuraciones().descansoCorto().toMinutes() + " min).");
    }

    @Override public void alSalir(PomodoroTimer ctx) { /* nada */ }

    @Override
    public void alVencimiento(PomodoroTimer ctx) {
        // Notifica el vencimiento del descanso corto
        ctx.getNotificador().alEvento("⏰ Venció el descanso corto.");
        ctx.cambiarA(new EstadoEnfoque());
    }
}
