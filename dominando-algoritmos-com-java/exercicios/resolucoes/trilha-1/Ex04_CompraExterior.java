import java.util.Scanner;

public class Ex04_CompraExterior {
    public static final double COTACAO_DOLAR = 5.42;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double real = entrada.nextDouble();

        double dolar = real / COTACAO_DOLAR;


        System.out.printf("Valor em real R$ %.0f.\nValor em dólar $ %.2f", real, dolar);
    }
}
