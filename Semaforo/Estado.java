public abstract class Estado {
    private final Semaforo semaforo;

    private  int tiempo; // segundos
    public Semaforo getSemaforo() { return semaforo; }

    public Estado(Semaforo semaforo) { this.semaforo = semaforo;
         this.tiempo = 0 ;
        }
public int getTiempo() { return tiempo; }
public void setTiempo(int tiempo) { this.tiempo = tiempo; }
    public abstract void cambiar();
}

