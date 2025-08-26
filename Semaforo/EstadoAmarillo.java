public class EstadoAmarillo extends Estado {

    public EstadoAmarillo(Semaforo semaforo) {
        super(semaforo);
<<<<<<< HEAD
=======
        tiempo = 5;
>>>>>>> pollo/main
    }

    @Override
    public void cambiar() {
<<<<<<< HEAD
        this.getSemaforo().mostrar("🟡 AMARILLO: Precaucion que cambia");
        this.getSemaforo().changeState(new EstadoRojo(getSemaforo()));
=======
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
            }
        }
>>>>>>> pollo/main
    }
}
