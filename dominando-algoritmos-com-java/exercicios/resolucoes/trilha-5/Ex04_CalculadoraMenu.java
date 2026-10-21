import java.util.Scanner;

public class Ex04_CalculadoraMenu {
    public static double num1;
    public static double num2;
    public static String operacao;
    public static double res;

    public static void main(String[] args) {
        lerDados();
        calcular();
        mostrarResultado();
    }

    public static void lerDados() {
        Scanner entrada = new Scanner(System.in);

        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        entrada.nextLine(); //consome o '\n'
        operacao = entrada.nextLine();
    }

    public static void calcular() throws IllegalArgumentException{
        switch (operacao.toUpperCase()) {
            case "POTÊNCIA" -> res = Math.pow(num1, num2);
            case "DIVISÃO" -> res = num1 / num2;
            case "SOMA" -> res = num1 + num2;
            case "SUBTRAÇÃO" -> res = num1 - num2;
            case "MULTIPLICAÇÃO" -> res = num1 * num2;
            case "RESTO" -> res = num1 % num2;
        }
    }

    public static void mostrarResultado() {
        switch (operacao.toUpperCase()) {
            case "POTÊNCIA" -> System.out.printf("%.1f ^ %.1f = %.1f", num1, num2, res);
            case "DIVISÃO" -> System.out.printf("%.1f / %.1f = %.1f", num1, num2, res);
            case "SOMA" -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, res);
            case "SUBTRAÇÃO" -> System.out.printf("%.1f - %.1f = %.1f", num1, num2, res);
            case "MULTIPLICAÇÃO" -> System.out.printf("%.1f * %.1f = %.1f", num1, num2, res);
            case "RESTO" -> System.out.printf("%.1f mod %.1f = %.1f", num1, num2, res);
            default -> System.out.println("Operação não suportada");
        }
    }
}
