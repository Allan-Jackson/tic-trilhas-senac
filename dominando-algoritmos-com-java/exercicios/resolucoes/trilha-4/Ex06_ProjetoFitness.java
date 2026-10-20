import java.util.Scanner;

public class Ex06_ProjetoFitness {
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    int maior = 0;
    int menor = 0;
    int diaMaior = 0;
    int diaMenor = 0;
    boolean primeiroPeso = true;

    int qtdPesos = entrada.nextInt();
    int[] pesos = new int[qtdPesos];

    for(int i = 0; i < qtdPesos; i++) {
      pesos[i] = entrada.nextInt();

      if(primeiroPeso) {
        maior = pesos[i];
        menor = pesos[i];
        primeiroPeso = false;
      }
      if(pesos[i] >= maior) {
        maior = Math.max(maior, pesos[i]);
        diaMaior = i + 1;
      }

      if(pesos[i] <= menor) {
        menor = Math.min(menor, pesos[i]);
        diaMenor = i + 1;
      }

    }

    //SAIDA
    System.out.print("Pesos informados: ");
    for(int i = 0; i < qtdPesos-1; i++) {
      System.out.print(pesos[i] + ", ");
    }
    System.out.println(pesos[qtdPesos-1]);
    System.out.printf("Maior peso: %d kg (Dia %d)\n", maior, diaMaior);
    System.out.printf("Menor peso: %d kg (Dia %d)\n", menor, diaMenor);

    System.out.println("\nGráfico de evolução:");
    for(int i = 0; i < qtdPesos; i++) {
      System.out.print("Dia " + i + 1 + " |");

      int barras = pesos[i] / 5;
      for(int b = 0; b < barras; b++) {
        System.out.printf("\u2588");
      }

      System.out.println(" " + pesos[i]);
    }
  }
}