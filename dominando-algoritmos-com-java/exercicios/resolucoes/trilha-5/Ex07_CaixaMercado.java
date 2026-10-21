import java.util.Scanner;

public class Ex07_CaixaMercado {
    public static Scanner entrada = new Scanner(System.in);
    public static int MAX_ITENS = 1000;
    public static int indiceInvalidos = 0;
    public static int indiceItens = 0;
    public static double[] invalidos = new double[MAX_ITENS];
    public static double[] itens = new double[MAX_ITENS];
    public static double totalAPagar = 0;
    public static int numParcela;

    public static double parcela;

    public static void main(String[] args) {
        armazenarValores();
        processar();
        exibirResultados();
    }

    public static void armazenarValores() {

        while(true) {
            double valorItem = entrada.nextDouble();

            if(valorItem == 0) {
                break;
            }

            if(valorItem < 0) {
                invalidos[indiceInvalidos++] = valorItem;
                continue;
            }

            itens[indiceItens++] = valorItem;
        }

        do {
            numParcela = entrada.nextInt();

            if(numParcela < 0) {
                invalidos[indiceInvalidos++] = numParcela;
            }

        }while(numParcela < 0);

    }

    public static void processar() {
        for(int i = 0; i < indiceItens; i++) {
            totalAPagar += itens[i];
        }

        if(numParcela > 1) {
            parcela = totalAPagar / numParcela;
        }
    }

    public static void exibirResultados() {
        for(int i = 0; i < indiceInvalidos; i++) {
            System.out.println("Valor inválido: " + invalidos[i]);
        }

        if(numParcela == 1 || numParcela == 0) {
            System.out.printf("Pagamento à vista: R$ %.2f\n", totalAPagar);
        }else {
            System.out.printf("Total da compra: R$ %.2f\n", totalAPagar);
            System.out.printf("Parcelado em %dx de R$ %.2f\n", numParcela, parcela);
        }
    }

}
