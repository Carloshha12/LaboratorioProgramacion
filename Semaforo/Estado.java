public abstract class Estado {
    private final Semaforo semaforo;

<<<<<<< HEAD
=======
    public int tiempo; // segundos
>>>>>>> pollo/main
    public Semaforo getSemaforo() { return semaforo; }

    public Estado(Semaforo semaforo) { this.semaforo = semaforo; }

    public abstract void cambiar();
}

