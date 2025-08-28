public class EstadoRojo extends Estado {

    public EstadoRojo(Semaforo semaforo) {
        super(semaforo);
        this.setTiempo(20);
    }

    @Override
    public void cambiar() {
        // Herencia para cambiar y usar las variables de EstadoSemaforo
        if (this.getTiempo() >= 0) {
            if (this.getTiempo() == 20){
                this.getSemaforo().mostrar("🟢 ROJO: No podes avanzar. Quedan " + this.getTiempo() + " segundos.");
        } else {
            this.getSemaforo().mostrar( this.getTiempo() + " segundos.");
        }
        this.setTiempo(getTiempo()-1);
        if (this.getTiempo() == -1) {
            this.getSemaforo().mostrar("Cambio a verde");
            this.getSemaforo().changeState(new EstadoVerde(getSemaforo()));
        }
    }
    }
}
