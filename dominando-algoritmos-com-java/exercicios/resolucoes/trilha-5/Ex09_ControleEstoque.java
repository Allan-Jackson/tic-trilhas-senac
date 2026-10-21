import java.util.Scanner;

public class Ex09_ControleEstoque {
    public static final int MAX_PRODUTOS = 1000;
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        String[] produtos = new String[MAX_PRODUTOS];
        int[] estoque = new int[MAX_PRODUTOS];

        int ultimoProduto = -1;

        lacoPrincipal:
        while(true) {
            int opcao = mostrarMenu();

            switch (opcao) {
                case 0 -> {
                    break lacoPrincipal;
                }
                case 1 -> {
                    ultimoProduto = adicionarProduto(produtos, estoque, ultimoProduto);
                }
                case 2 -> {
                    adicionarEstoque(estoque);
                }
                case 3 -> {
                    retirarEstoque(estoque);
                }
                case 4 -> {
                    listarEstoque(produtos, estoque, ultimoProduto);
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }

            pausa();
        }

        System.out.println("Encerrando o programa...");
    }

    public static void pausa() {
        System.out.print("Tecle algo para continuar: ");
        entrada.nextLine();
        System.out.println();
    }

    public static int mostrarMenu() {
        System.out.println("Menu de opções");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Realizar entrada no estoque");
        System.out.println("3. Realizar saída no estoque");
        System.out.println("4. Listar estoque");
        System.out.println("0. Sair");
        System.out.print("\n> ");
        int opcao = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'
        System.out.println();

        return opcao;
    }

    public static int adicionarProduto(String[] produtos, int[] quantidades, int indice) {
        String produto = entrada.nextLine();
        int qtd = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'

        ++indice;
        produtos[indice] = produto;
        quantidades[indice] = qtd;
        System.out.println("Produto adicionado com sucesso!");

        return indice;
    }

    public static void adicionarEstoque(int[] estoque) {
        int numProduto = entrada.nextInt();
        int qtd = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'

        estoque[numProduto-1] += qtd;
        System.out.println("Entrada realizada com sucesso!");
    }

    public static void retirarEstoque(int[] estoque) {
        int numProduto = entrada.nextInt();
        int qtd = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'

        estoque[numProduto-1] -= qtd;
        System.out.println("Saída realizada com sucesso!");
    }

    public static void listarEstoque(String[] produtos, int[] quantidades, int indice) {
        System.out.println("Estoque atual:");
        for(int i = 0; i <= indice; i++) {
            System.out.printf("Produto %d: %s - %d unidades\n", i+1, produtos[i], quantidades[i]);
        }
    }

}