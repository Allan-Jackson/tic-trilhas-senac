import java.util.Scanner;

public class Ex03_Doacoes {
  
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    String projeto = entrada.nextLine();
    int qtdDoacoes = entrada.nextInt();
    double meta = entrada.nextDouble();

    double[] doacoes = new double[qtdDoacoes];
    double soma = 0;
    double maior = 0;

    for(int i = 0; i < qtdDoacoes; i++) {
      doacoes[i] = entrada.nextDouble();

      soma += doacoes[i];
      maior = Math.max(maior, doacoes[i]);
    }

    String situacao = soma >= meta ? "Meta atingida" : "Meta não atingida";

    System.out.println(">> Resumo das Doações <<\n");
    System.out.println("Projeto: " + projeto);
    System.out.print("Doações recebidas:");
    for(int i = 0; i < qtdDoacoes-1; i++) {
      System.out.print(doacoes[i] + ", ");
    }
    System.out.println(doacoes[qtdDoacoes-1] + "\n");
    System.out.println("Total arrecadado: " + soma);
    System.out.println("Maior doação: " + maior);
    System.out.println("Situação: " + situacao);
      
  }
}