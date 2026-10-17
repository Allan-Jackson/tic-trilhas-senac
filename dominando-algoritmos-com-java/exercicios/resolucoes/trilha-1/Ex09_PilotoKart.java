import java.util.Scanner;

public class Ex09_PilotoKart {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double tamanhoPista = entrada.nextDouble();
        int voltas = entrada.nextInt();
        double tempo1aVoltaSeg = entrada.nextDouble();

        double distanciaTotal = tamanhoPista * voltas / 1000;

        double previsaoMin = tempo1aVoltaSeg * voltas / 60;


        System.out.println("Análise Preditiva Concluída\n--");
        System.out.printf("Distância total a ser percorrida: %.2f km.\n", distanciaTotal);
        System.out.printf("Previsão de conclusão: %.1f minutos.\n", previsaoMin);
    }
}
