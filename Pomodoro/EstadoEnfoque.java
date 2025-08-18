public class EstadoEnfoque implements EstadoPomodoro {
    @Override public String nombre() { return "Enfoque"; }

    @Override
    public void alEntrar(PomodoroTimer ctx) {
        // Configura la duración del enfoque y notifica al usuario
        ctx.setDuracionActual(ctx.getDuraciones().enfoque());
        ctx.getNotificador().alEvento("Comienza un bloque de enfoque (" +
                ctx.getDuraciones().enfoque().toMinutes() + " min).");
    }

    @Override public void alSalir(PomodoroTimer ctx) { /* nada */ }

    @Override
    public void alVencimiento(PomodoroTimer ctx) {
        // Regla: al terminar enfoque, si contador<3 → descanso corto y contador++
        //        si contador==3 → descanso largo y contador=0
        int cantidadDeFocos = ctx.getContadorFocos();
        if (cantidadDeFocos < 3) {
            ctx.setContadorFocos(cantidadDeFocos + 1);
            ctx.cambiarA(new EstadoDescansoCorto());
        } else {
            ctx.setContadorFocos(0);
            ctx.cambiarA(new EstadoDescansoLargo());
        }
    }
}
