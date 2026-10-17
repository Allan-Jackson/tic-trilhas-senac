import java.util.Scanner;

public class Ex03_ControleTemperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double maxima = 0;
        double minima = 0;
        boolean tempValida = false;

        while(true) {
            double temperatura = entrada.nextDouble();

            if(temperatura == 0) {
                break;
            }

            if(temperatura < -50 || temperatura > 60) {
                System.out.println("Temperatura inválida");
                continue;
            }

            if(!tempValida) {
                tempValida = true;
                minima = temperatura;
                maxima = temperatura;
            }

            maxima = Math.max(temperatura, maxima);
            minima = Math.min(temperatura, minima);
        }

        if(tempValida) {
            System.out.printf("Maior temperatura: %.0f\n", maxima);
            System.out.printf("Menor temperatura: %.0f\n", minima);
        }else {
            System.out.println("Nenhuma temperatura válida informada.\nFim.");
        }

    }
}
