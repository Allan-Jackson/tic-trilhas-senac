import java.util.Scanner;

public class Ex02_PilotoKart {

    public static double tamanhoPista;
    public static int voltas;
    public static  double tempo1aVoltaSeg;

    public static double distanciaTotal;
    public static double previsaoMin;

    public static void main(String[] args) {
        ler();
        processar();
        exibir();
    }

    public static void ler() {
        Scanner entrada = new Scanner(System.in);

        tamanhoPista = entrada.nextDouble();
        voltas = entrada.nextInt();
        tempo1aVoltaSeg = entrada.nextDouble();
    }

    public static void processar() {
        distanciaTotal = tamanhoPista * voltas / 1000;
        previsaoMin = tempo1aVoltaSeg * voltas / 60;
    }

    public static void exibir() {
        System.out.println("Análise Preditiva Concluída\n--");
        System.out.printf("Distância total a ser percorrida: %.2f km.\n", distanciaTotal);
        System.out.printf("Previsão de conclusão: %.1f minutos.\n", previsaoMin);
    }
}
