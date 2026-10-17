import java.util.Scanner;

public class Ex05_BoletimAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        int faltas = entrada.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;
        String situacao = "";

        if(faltas > 4) {
            situacao = "Reprovado por Falta";
        }else if(media < 0 || media > 10) {
            situacao = "Parâmetros inválidos";
        }else if(media == 0) {
            situacao = "Desistente";
        }else if(media < 6) {
            situacao = "Recuperação";
        }else if(media < 8) {
            situacao = "Aprovado";
        }else {
            situacao = "Aprovado com sucesso";
        }

        System.out.printf("Média: %.1f\n", media);
        System.out.printf("Situação: %s\n", situacao);
    }
}
