import java.util.Scanner;

public class Ex10_IngressosCinema {
    public static final double ING_INTEIRA = 28.5;
    public static final double ING_PROMO_QUARTA = 14.5;
    public static final double ING_NACIONAL = 5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int inteiras = entrada.nextInt();
        int meias = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'
        String dia = entrada.nextLine();
        String nacional = entrada.nextLine();

        boolean ehNacional = nacional.equalsIgnoreCase("sim");
        boolean ehQuarta = dia.equalsIgnoreCase("quarta-feira");
        double total;

        if(ehNacional) {
            total = (inteiras + meias) * ING_NACIONAL;
        }else if(ehQuarta) {
            total = (inteiras + meias) * ING_PROMO_QUARTA;
        }else {
            total = (inteiras * ING_INTEIRA) + (meias * ING_INTEIRA/2);
        }

        System.out.printf("Total à pagar:\nR$ %.2f", total);
    }
}
