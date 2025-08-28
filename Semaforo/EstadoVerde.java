public class EstadoVerde extends Estado {
   public EstadoVerde(Semaforo semaforo) {

       super(semaforo);
       this.setTiempo(10);
   }

    @Override
    public void cambiar() {
        if(this.getTiempo()>=0){
      if (this.getTiempo()==10){
            this.getSemaforo().mostrar("🟢 VERDE: Podes avanzar. Quedan "+ this.getTiempo()+" segundos.");  
        }else{
            this.getSemaforo().mostrar("🟢 VERDE, "+ this.getTiempo()+" segundos.");
        }    
        this.setTiempo(getTiempo()-1);
        if (this.getTiempo()==-1){
            this.getSemaforo().mostrar("Cambio a AMARILLO");
            this.getSemaforo().changeState(new EstadoAmarillo(getSemaforo()));
        }
    }
        
    }
}