public class EstadoVerde extends Estado {
   public EstadoVerde(Semaforo semaforo) {

       super(semaforo);
<<<<<<< HEAD
=======
       tiempo=10;
>>>>>>> pollo/main
   }

    @Override
    public void cambiar() {
<<<<<<< HEAD
        this.getSemaforo().mostrar("🟢 VERDE: Podes avanzar.");
        this.getSemaforo().changeState(new EstadoAmarillo(getSemaforo()));
=======
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
        }
    }
        
>>>>>>> pollo/main
    }
}