public class EstadoRojo extends Estado {

    public EstadoRojo(Semaforo semaforo) {
        super(semaforo);
<<<<<<< HEAD
=======
        tiempo = 20;
>>>>>>> pollo/main
    }

    @Override
    public void cambiar() {
        // Herencia para cambiar y usar las variables de EstadoSemaforo
<<<<<<< HEAD
        this.getSemaforo().mostrar("🔴 ROJO: Detenersee!!!!");
        this.getSemaforo().changeState(new EstadoVerde(this.getSemaforo()));
=======
        if (tiempo >= 0) {
            if (tiempo == 20){
                this.getSemaforo().mostrar("🟢 ROJO: No podes avanzar. Quedan " + tiempo + " segundos.");
        } else {
            this.getSemaforo().mostrar( tiempo + " segundos.");
        }
        tiempo--;
        if (tiempo == -1) {
            this.getSemaforo().mostrar("Cambio a verde");
            this.getSemaforo().changeState(new EstadoVerde(getSemaforo()));
        }
    }
>>>>>>> pollo/main
    }
}
