public class EstadoRojo extends Estado {

    public EstadoRojo(Semaforo semaforo) {
        super(semaforo);
        tiempo = 20;
    }

    @Override
    public void cambiar() {
        // Herencia para cambiar y usar las variables de EstadoSemaforo
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
            return;
        }
    }
    }
}
