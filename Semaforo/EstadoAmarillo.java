public class EstadoAmarillo extends Estado {

    public EstadoAmarillo(Semaforo semaforo) {
        super(semaforo);
        this.setTiempo(5);
    }

    @Override
    public void cambiar() {
        if (this.getTiempo() >= 0) {
            if (this.getTiempo() == 5) {
                this.getSemaforo()
                        .mostrar("🟢 Amarillo: Precaucion cambiando a rojo " + this.getTiempo() + " segundos.");
            } else {
                this.getSemaforo().mostrar(this.getTiempo() + " segundos.");
            }
            this.setTiempo(getTiempo()-1);
            if (this.getTiempo() == -1) {
                this.getSemaforo().mostrar("Cambio a Rojo");
                this.getSemaforo().changeState(new EstadoRojo(getSemaforo()));
            }
        }
    }
}
