class Semaforo {
    private Estado estado;
    public Semaforo() {
        //Se le pasa como referencia el objeto semaforo para que conozca su contexto, 
        //puede usar los metodos de semaforo y cambiar estado de esta manera
        this.estado = new EstadoRojo(this);
    }

    public void changeState(Estado nuevo) {
        this.estado = nuevo;
    }

    public void cambiarEstado() {
        estado.cambiar();
    }

    public void mostrar(String msg) {
        System.out.println(msg);
    }
}
