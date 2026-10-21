import java.util.Scanner;

public class Ex06_IngressosCinema {
    public static final double ING_INTEIRA = 28.5;
    public static final double ING_PROMO_QUARTA = 14.5;
    public static final double ING_NACIONAL = 5;

    public static int inteiras;
    public static int meias;
    public static String dia;
    public static String nacional;
    public static double total;

    public static void main(String[] args) {
        lerDados();
        calcularTotal();
        exibirTotal();
    }

    public static void lerDados() {
        Scanner entrada = new Scanner(System.in);

        inteiras = entrada.nextInt();
        meias = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'
        dia = entrada.nextLine();
        nacional = entrada.nextLine();
    }

    public static void calcularTotal() {
        boolean ehNacional = nacional.equalsIgnoreCase("sim");
        boolean ehQuarta = dia.equalsIgnoreCase("quarta-feira");

        if(ehNacional) {
            total = (inteiras + meias) * ING_NACIONAL;
        }else if(ehQuarta) {
            total = (inteiras + meias) * ING_PROMO_QUARTA;
        }else {
            total = (inteiras * ING_INTEIRA) + (meias * ING_INTEIRA/2);
        }
    }

    public static void exibirTotal() {
        System.out.printf("Total à pagar:\nR$ %.2f", total);
    }
}
