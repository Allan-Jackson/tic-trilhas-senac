import java.util.Scanner;

public class Ex06_QualCor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cor1 = entrada.nextLine().trim();
        String cor2 = entrada.nextLine().trim();

        boolean cor1Invalida = !(cor1.equalsIgnoreCase("Vermelho") ||  cor1.equalsIgnoreCase("Azul") || cor1.equalsIgnoreCase("Amarelo"));
        boolean cor2Invalida = !(cor2.equalsIgnoreCase("Vermelho") ||  cor2.equalsIgnoreCase("Azul") || cor2.equalsIgnoreCase("Amarelo"));

        if(cor1Invalida || cor2Invalida) {
            System.out.println("Apenas cores primárias são aceitas");
            System.exit(1);
        }

        boolean vermelho = cor1.equalsIgnoreCase("Vermelho") || cor2.equalsIgnoreCase("Vermelho");
        boolean azul = cor1.equalsIgnoreCase("azul") || cor2.equalsIgnoreCase("azul");
        boolean amarelo = cor1.equalsIgnoreCase("amarelo") || cor2.equalsIgnoreCase("amarelo");

        String combinacao;

        if(amarelo && !azul && !vermelho) {
            combinacao = "Amarelo";
        }else if(!amarelo && azul && !vermelho) {
            combinacao = "Azul";
        }else if(!amarelo && !azul && vermelho) {
            combinacao = "Vermelho";
        }else if(amarelo && azul) {
            combinacao = "Verde";
        }else if(amarelo && vermelho) {
            combinacao = "Laranja";
        }else {
            combinacao = "Roxo";
        }

        System.out.println("A combinação resulta em:\n" + combinacao);
    }
}
