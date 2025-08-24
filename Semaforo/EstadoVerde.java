public class EstadoVerde extends Estado {
   public EstadoVerde(Semaforo semaforo) {

       super(semaforo);
       tiempo=10;
   }

    @Override
    public void cambiar() {
        if(tiempo>=0){
      if (tiempo==10){
            this.getSemaforo().mostrar("🟢 VERDE: Podes avanzar. Quedan "+tiempo+" segundos.");  
        }else{
            this.getSemaforo().mostrar("🟢 VERDE, "+tiempo+" segundos.");
        }    
        tiempo--;
        if (tiempo==-1){
            this.getSemaforo().mostrar("Cambio a AMARILLO");
            this.getSemaforo().changeState(new EstadoAmarillo(getSemaforo()));
            return;
        }
    }
        
    }
}