public class EstadoAmarillo extends Estado {

    public EstadoAmarillo(Semaforo semaforo) {
        super(semaforo);
        tiempo = 5;
    }

    @Override
    public void cambiar() {
        if (tiempo >= 0) {
            if (tiempo == 5) {
                this.getSemaforo()
                        .mostrar("🟢 Amarillo: Precaucion cambiando a rojo " + tiempo + " segundos.");
            } else {
                this.getSemaforo().mostrar(tiempo + " segundos.");
            }
            tiempo--;
            if (tiempo == -1) {
                this.getSemaforo().mostrar("Cambio a Rojo");
                this.getSemaforo().changeState(new EstadoRojo(getSemaforo()));
                return;
            }
        }
    }
}
