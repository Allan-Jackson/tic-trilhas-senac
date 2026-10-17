import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex08_Acaiteria {
    public static final double PRECO_ACAI_PQ = 13.5;
    public static final double PRECO_ACAI_MD = 15;
    public static final double PRECO_ACAI_GD = 17.5;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int acaiPq = entrada.nextInt();
        int acaiMd = entrada.nextInt();
        int acaiGd = entrada.nextInt();

        double cupomDescontoPerc = entrada.nextDouble();

        double total = (acaiPq * PRECO_ACAI_PQ) + (acaiMd * PRECO_ACAI_MD) + (acaiGd * PRECO_ACAI_GD);
        total -= total * cupomDescontoPerc/100;

        System.out.println("Seu pedido foi registrado.");
        System.out.println("- Açaí P: " + acaiPq);
        System.out.println("- Açaí M: " + acaiMd);
        System.out.println("- Açaí G: " + acaiGd);
        System.out.println("Desconto de " + cupomDescontoPerc + "% aplicado.");
        System.out.printf("Total R$ %.2f", total);
    }
}
