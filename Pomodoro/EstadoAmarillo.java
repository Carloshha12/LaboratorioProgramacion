public class EstadoAmarillo extends Estado {

    public EstadoAmarillo(Semaforo semaforo) {
        super(semaforo);
    }

    @Override
    public void cambiar() {
        this.getSemaforo().mostrar("🟡 AMARILLO: Precaucion que cambia");
        this.getSemaforo().changeState(new EstadoRojo(getSemaforo()));
    }
}
