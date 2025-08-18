import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Duraciones dur = new Duraciones(25, 5, 15); // podés bajarlas para probar
        NotificadorConsola notif = new NotificadorConsola();
        PomodoroTimer timer = new PomodoroTimer(dur, notif);

        System.out.println("Demo Pomodoro (Etapa 1: State sin scheduler)");
        System.out.println("Comandos: iniciar | vencer | estado | salir");

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("> ");
                int cmd = sc.nextInt();
                switch (cmd) {
                    case 1:
                        timer.iniciar();
                        break;
                    case 2:
                        timer.simularVencimiento();
                        break;
                    case 3:
                        System.out.println("Estado actual: " + timer.estadoActualNombre()
                                + " | contadorFocos=" + timer.getContadorFocos());
                        break;
                    case 4:
                        System.out.println("Chau!");
                        return;
                    default:
                        System.out.println("Comandos: iniciar(1) | vencer(2) | estado(3) | salir(4)");
                }
            }
        } finally {
            sc.close();
        }
       
    }
    
}
