import java.time.Duration;

//Creo la clase duraciones para encapsular las duraciones de los temporizadores,utiliza la clase Duration para representar las duraciones
// y la utilizacion especial es para verificar tiempos validos en un solo lugar
public class Duraciones {
    private final int enfoqueMinutos;
    private final int descansoCortoMinutos;
    private final int descansoLargoMinutos;

    public Duraciones(int enfoqueMin, int descansoCortoMin, int descansoLargoMin) {
        if (enfoqueMin <= 0 || descansoCortoMin <= 0 || descansoLargoMin <= 0)
            throw new IllegalArgumentException("Todas las duraciones deben ser > 0");
        this.enfoqueMinutos = enfoqueMin;
        this.descansoCortoMinutos = descansoCortoMin;
        this.descansoLargoMinutos = descansoLargoMin;
    }

    public Duration enfoque()       { return Duration.ofMinutes(enfoqueMinutos); }
    public Duration descansoCorto() { return Duration.ofMinutes(descansoCortoMinutos); }
    public Duration descansoLargo() { return Duration.ofMinutes(descansoLargoMinutos); }
}
