public class EstadoRojo extends Estado {

    public EstadoRojo(Semaforo semaforo) {
        super(semaforo);
    }

    @Override
    public void cambiar() {
        // Herencia para cambiar y usar las variables de EstadoSemaforo
        this.getSemaforo().mostrar("🔴 ROJO: Detenersee!!!!");
        this.getSemaforo().changeState(new EstadoVerde(this.getSemaforo()));
    }
}
