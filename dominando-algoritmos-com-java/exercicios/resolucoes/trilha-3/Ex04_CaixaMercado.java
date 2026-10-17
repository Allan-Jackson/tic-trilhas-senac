import java.util.Scanner;

public class Ex04_CaixaMercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double totalAPagar = 0;

        while(true) {
            double valorItem = entrada.nextDouble();

            if(valorItem == 0) {
                break;
            }

            if(valorItem < 0) {
                System.out.println("Valor inválido: " + valorItem);
                continue;
            }

            totalAPagar += valorItem;
        }

        int numParcela;
        do {
            numParcela = entrada.nextInt();

            if(numParcela == 1) {
                System.out.printf("Pagamento à vista: R$ %.2f\n", totalAPagar);
            }else if(numParcela > 1) {
                double parcela = totalAPagar / numParcela;
                System.out.printf("Parcelado em %dx de R$ %.2f\n", numParcela, parcela);
            }else {
                System.out.println("Valor inválido");
            }
        }while(numParcela <= 0);

    }
}
