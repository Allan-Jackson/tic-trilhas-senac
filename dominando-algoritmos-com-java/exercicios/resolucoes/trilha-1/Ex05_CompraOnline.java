import java.util.Scanner;

public class Ex05_CompraOnline {
    public static final double COTACAO_DOLAR = 5.42;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cliente = entrada.nextLine();
        double valorCompra = entrada.nextDouble();
        double percDesconto = entrada.nextDouble();
        double valorFinal = valorCompra - (valorCompra * percDesconto/100);


        System.out.printf("Olá, %s, sua compra de R$ %.2f foi confirmada!\n", cliente, valorCompra);
        System.out.printf("Foi aplicado um desconto de %.1f%%.\n", percDesconto);
        System.out.printf("O total final ficou em R$ %.2f\n", valorFinal);
    }
}
