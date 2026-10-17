import java.util.Scanner;

public class Ex08_CalculadoraMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        entrada.nextLine(); //consome o '\n'
        String operacao = entrada.nextLine();

        double res;
        switch (operacao.toUpperCase()) {
            case "POTÊNCIA" -> {
                res = Math.pow(num1, num2);
                System.out.printf("%.1f ^ %.1f = %.1f", num1, num2, res);
            }
            case "DIVISÃO" -> {
                res = num1 / num2;
                System.out.printf("%.1f / %.1f = %.1f", num1, num2, res);
            }
            case "SOMA" -> {
                res = num1 + num2;
                System.out.printf("%.1f + %.1f = %.1f", num1, num2, res);
            }
            case "SUBTRAÇÃO" -> {
                res = num1 - num2;
                System.out.printf("%.1f - %.1f = %.1f", num1, num2, res);
            }
            case "MULTIPLICAÇÃO" -> {
                res = num1 * num2;
                System.out.printf("%.1f * %.1f = %.1f", num1, num2, res);
            }
            case "RESTO" -> {
                res = num1 % num2;
                System.out.printf("%.1f mod %.1f = %.1f", num1, num2, res);
            }
            default -> System.out.println("Operação não suportada");
        }
    }
}
