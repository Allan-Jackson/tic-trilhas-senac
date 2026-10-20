import java.util.Scanner;

public class Ex04_FarmaZoom {
  
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    int qtd = entrada.nextInt();

    double[] farmaciaA = new double[qtd];
    double[] farmaciaB = new double[qtd];

    double totalA = 0;
    double totalB = 0;

    int maisBaratoA = 0;
    int maisBaratoB = 0;
    int mesmoPreco = 0;

    for(int i = 0; i < 2 * qtd; i++) {
      if(i < qtd) {
        farmaciaA[i] = entrada.nextDouble();
        totalA += farmaciaA[i];
      }else {
        int j = i%qtd;
        farmaciaB[j] = entrada.nextDouble();
        totalB += farmaciaB[j];
      }
    }

    for(int i = 0; i < qtd; i++) {
      if(farmaciaA[i] == farmaciaB[i]) {
        mesmoPreco++;
      }else if(farmaciaA[i] < farmaciaB[i]) {
        maisBaratoA++;
      }else {
        maisBaratoB++;
      }
    }

    String melhorOpcao = totalA == totalB ? "Tanto faz" : (totalA < totalB ? "Farmácia A" : "Farmácia B");

    //SAÍDA
    System.out.println("FARMAZOOM");
    System.out.print("Farmácia A: ");
    for(int i = 0; i < qtd-1; i++) {
      System.out.print(farmaciaA[i] + ", ");
    }
    System.out.println(farmaciaA[qtd-1]);
    System.out.print("Farmácia B: ");
    for(int i = 0; i < qtd-1; i++) {
      System.out.print(farmaciaB[i] + ", ");
    }
    System.out.println(farmaciaB[qtd-1]);

    System.out.println("\nProdutos mais Baratos ");
    System.out.println("Na Farmácia A: " + maisBaratoA);
    System.out.println("Na Farmácia B: " + maisBaratoB);
    System.out.println("Mesmo preço: " + mesmoPreco);

    System.out.println("\nTotal");
    System.out.println("Farmácia A: " + totalA);
    System.out.println("Farmácia B: " + totalB);

    System.out.println("\nMelhor opção");
    System.out.println(melhorOpcao);
  }
}