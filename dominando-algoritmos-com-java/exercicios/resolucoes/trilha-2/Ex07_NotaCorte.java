import java.util.Scanner;

public class Ex07_NotaCorte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notaCandidato = entrada.nextDouble();
        double notaCorte = entrada.nextDouble();
        double notaAprovacao = entrada.nextDouble();

        if(notaCorte >= notaAprovacao) {
            System.out.println("Parâmetros inválidos: nota de corte deve ser menor que a nota mínima de aprovação!");
            System.exit(1);
        }

        String situacao;

        if(notaCandidato < notaCorte) {
            situacao = "Reprovado";
        }else if(notaCandidato >= notaAprovacao) {
            situacao = "Aprovado";
        }else {
            situacao = "Lista de Espera";
        }

        System.out.println("Situação candidato:\n" + situacao);
    }
}
