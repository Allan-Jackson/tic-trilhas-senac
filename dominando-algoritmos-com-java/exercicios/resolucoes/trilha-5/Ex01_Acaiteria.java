import java.util.Scanner;

public class Ex01_Acaiteria {
    public static final double PRECO_PQ = 13.5;
    public static final double PRECO_MD = 15;
    public static final double PRECO_GD = 17.5;
    public static final Scanner entrada = new Scanner(System.in);

    static double[] qtdAcai = new double[3];
    static double total;
    static double desconto = 0;


    public static void main(String[] args) {
        anotarPedido();
        processarValores();
        exibirValores();
    }

    public static void anotarPedido() {
        System.out.print("Quantidade de açaí pequeno: ");
        qtdAcai[0] = entrada.nextDouble();
        System.out.print("Quantidade de açaí médio: ");
        qtdAcai[1] = entrada.nextDouble();
        System.out.print("Quantidade de açaí grande: ");
        qtdAcai[2] = entrada.nextDouble();
        System.out.println("Cupom de desconto: ");
        desconto = entrada.nextDouble();
    }

    public static void processarValores() {
        total = (qtdAcai[0] * PRECO_PQ) + (qtdAcai[1] * PRECO_MD) + (qtdAcai[2] * PRECO_GD);
        total -= (total * desconto/100);
    }

    public static void exibirValores() {
        System.out.printf("Desconto de %.1f%% aplicado.\n", desconto);
        System.out.printf("Total R$ %.2f\n", total);
    }
}
