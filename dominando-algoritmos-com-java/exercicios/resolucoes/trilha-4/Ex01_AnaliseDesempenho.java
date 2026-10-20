import java.util.Scanner;

public class Ex01_AnaliseDesempenho{
  
  public static void main(String[] args){
    var e = new Scanner(System.in);
    double maior = 0;
    double menor = 0;
    double soma = 0;
    int reprovados = 0;
    
    int a = e.nextInt();

    double[] notas = new double[a];

    for(int i = 0; i < a; i++) {
      notas[i] = e.nextDouble();


      if(notas[i] < 6) {
        reprovados++;
      }
      soma += notas[i];
      menor = Math.min(notas[i], menor);
      maior = Math.max(notas[i], maior);
    }

    double media = soma / a;

    System.out.println(">> Resultado da Turma <<");
    System.out.print("Notas informadas: ");
    for(int i = 0; i < a-1; i++) {
      System.out.print(notas[i] + ", ");
    }
    System.out.println(notas[a-1]);
    System.out.println("Média da turma: " + media);
    System.out.println("Maior nota: " + maior);
    System.out.println("Menor nota: " + menor);
    System.out.println("Aprovados: " + (a - reprovados));
    System.out.println("Reprovados: " + reprovados);
    if(reprovados == 0) {
      System.out.println("Situação geral: Todos os alunos foram aprovados");
    }else {
      System.out.println("Situação geral: Nem todos os alunos foram aprovados");
    }
      
  }
}