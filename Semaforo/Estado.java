public abstract class Estado {
    private final Semaforo semaforo;

    public int tiempo; // segundos
    public Semaforo getSemaforo() { return semaforo; }

    public Estado(Semaforo semaforo) { this.semaforo = semaforo; }

    public abstract void cambiar();
}

