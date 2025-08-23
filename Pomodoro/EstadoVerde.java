public class EstadoVerde extends Estado {
   public EstadoVerde(Semaforo semaforo) {

       super(semaforo);
   }

    @Override
    public void cambiar() {
        this.getSemaforo().mostrar("🟢 VERDE: Podes avanzar.");
        this.getSemaforo().changeState(new EstadoAmarillo(getSemaforo()));
    }
}