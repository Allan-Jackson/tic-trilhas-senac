import java.util.Scanner;

public class Ex02_AnaliseMensal {

  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    int qtdMeses = entrada.nextInt();
    double[] faturamentos = new double[qtdMeses];

    String situacao;
    boolean crescimento = false;
    boolean queda = false;


    for(int i = 0; i < qtdMeses; i++) {
      faturamentos[i] = entrada.nextDouble();

      if(i == 0) {
        continue;
      }

      if(faturamentos[i] > faturamentos[i-1]) {
        crescimento = true;
      }

      if(faturamentos[i] < faturamentos[i-1]) {
        queda = true;
      }
    }

    if(crescimento && queda) {
      situacao = "Sem padrão";
    }else if(crescimento) {
      situacao = "Crescimento";
    }else if(queda) {
      situacao = "Queda";
    }else {
      situacao = "Constante";
    }

    //SAIDA
    System.out.println(">> Análise de Faturamento <<\n");
    System.out.print("Faturamento informado: ");
    for(int i = 0; i < qtdMeses-1; i++) {
      System.out.print(faturamentos[i] + ", ");
    }
    System.out.println(faturamentos[qtdMeses-1]);
    System.out.printf("Situação: %s\n", situacao);
  }
}