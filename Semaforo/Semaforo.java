class Semaforo {
    private Estado estado;
    public Semaforo() {
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
