public abstract class Estado {
    private final Semaforo semaforo;

    private int tiempo; // segundos
    public Semaforo getSemaforo() { return semaforo; }

    public Estado(Semaforo semaforo) { this.semaforo = semaforo; }

    public abstract void cambiar();
}

