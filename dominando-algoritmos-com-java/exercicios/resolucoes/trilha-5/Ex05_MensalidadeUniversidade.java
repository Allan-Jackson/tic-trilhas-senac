import java.util.Scanner;

public class Ex05_MensalidadeUniversidade {

    public static String curso;
    public static String isencao;
    public static double desconto;

    public static void main(String[] args) {
        lerDados();
        double mensalidade = calculaMensalidade();
        exibirMensalidade(mensalidade);
    }

    public static void lerDados() {
        Scanner entrada = new Scanner(System.in);

        curso = entrada.nextLine();
        isencao = entrada.nextLine();
        desconto = entrada.nextDouble();
    }

    public static double calculaMensalidade() {
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
                exibeErro();
            }
        }

        if(isencao.equalsIgnoreCase("Sim")) {
            return 0;
        }

        mensalidade -= (mensalidade * desconto/100);

        return mensalidade;
    }

    public static void exibeErro() {
        System.out.println("Curso não encontrado");
        System.exit(1);
    }

    public static void exibirMensalidade(double mensalidade){
        System.out.printf("Valor da mensalidade:\nR$ %.2f", mensalidade);
    }

}
