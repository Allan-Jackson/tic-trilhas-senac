import java.util.Scanner;

public class Ex02_ChurrascoDomingo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pessoas = entrada.nextInt();

        double consumoCarne = 0.3 * pessoas;
        double consumoLinguica = 0.2 * pessoas;
        double consumoFrango = 0.15 * pessoas;

        double custoCarne = consumoCarne * 50;
        double custoLinguica = consumoLinguica * 28;
        double custoFrango = consumoFrango * 22;

        double custoChurrasco = custoFrango + custoCarne + custoLinguica;
        double custoPessoa = custoChurrasco / pessoas;

        System.out.printf("Quantidades:\nCarne: %.1f Kg - Linguiça: %.1f Kg - Frango: %.1f Kg\n", consumoCarne, consumoLinguica, consumoFrango);
        System.out.printf("Custo total:\nCarne: R$ %.2f - Linguiça: R$ %.2f - Frango: R$ %.2f\n", custoCarne, custoLinguica, custoFrango);
        System.out.printf("Custo total do churrasco: R$ %.2f\nCada pessoa deve contribuir com: R$ %.2f\n", custoChurrasco, custoPessoa);
    }
}
