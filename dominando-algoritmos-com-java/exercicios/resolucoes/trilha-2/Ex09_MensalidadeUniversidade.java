import java.util.Scanner;

public class Ex09_MensalidadeUniversidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String curso = entrada.nextLine();
        String isencao = entrada.nextLine();
        double desconto = entrada.nextDouble();

        double mensalidade = 0;

        switch (curso.toUpperCase()) {
            case "SI" -> {
                mensalidade = 900;
            }
            case "ADS" -> {
                mensalidade = 750;
            }
            case "CS" -> {
                mensalidade = 1150;
            }
            case "EC" -> {
                mensalidade = 1300;
            }
            case "ES" -> {
                mensalidade = 950;
            }
            default -> {
                System.out.println("Curso não encontrado");
                System.exit(1);
            }
        }

        boolean isento = isencao.equalsIgnoreCase("Sim");
        mensalidade -= (mensalidade * desconto/100);

        System.out.printf("Valor da mensalidade:\nR$ %.2f", isento ? 0 : mensalidade);
    }
}
