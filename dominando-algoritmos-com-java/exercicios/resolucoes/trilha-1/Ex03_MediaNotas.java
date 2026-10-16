import java.util.Scanner;

public class Ex03_MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String aluno = entrada.nextLine();
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O(A) estudante %s ficou com média %.1f", aluno, media);
    }
}
