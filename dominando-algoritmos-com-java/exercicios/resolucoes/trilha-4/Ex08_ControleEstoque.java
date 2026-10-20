import java.util.Scanner;

public class Ex08_ControleEstoque {
  public static final int MAX_PRODUTOS = 1000;
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    String[] produtos = new String[MAX_PRODUTOS];
    int[] estoque = new int[MAX_PRODUTOS];

    int ultimoProduto = -1;

    lacoPrincipal:
    while(true) {
      System.out.println("Menu de opções");
      System.out.println("1. Adicionar produto");
      System.out.println("2. Realizar entrada no estoque");
      System.out.println("3. Realizar saída no estoque");
      System.out.println("4. Listar estoque");
      System.out.println("0. Sair");
      System.out.print("\n> ");

      int opcao = entrada.nextInt();
      entrada.nextLine(); //consome o '\n'

      switch (opcao) {
        case 0 -> {
          break lacoPrincipal;
        }
        case 1 -> {
          String produto = entrada.nextLine();
          int qtd = entrada.nextInt();
          entrada.nextLine(); //consome o '\n'

          ++ultimoProduto;
          produtos[ultimoProduto] = produto;
          estoque[ultimoProduto] = qtd;
          System.out.println("Produto adicionado com sucesso!");
        }
        case 2 -> {
          int numProduto = entrada.nextInt();
          int qtd = entrada.nextInt();
          entrada.nextLine(); //consome o '\n'

          estoque[numProduto-1] += qtd;
          System.out.println("Entrada realizada com sucesso!");
        }
        case 3 -> {
          int numProduto = entrada.nextInt();
          int qtd = entrada.nextInt();
          entrada.nextLine(); //consome o '\n'

          estoque[numProduto-1] -= qtd;
          System.out.println("Saída realizada com sucesso!");
        }
        case 4 -> {
          System.out.println("Estoque atual:");
          for(int i = 0; i <= ultimoProduto; i++) {
            System.out.printf("Produto %d: %s - %d unidades\n", i+1, produtos[i], estoque[i]);
          }
        }
        default -> {
          System.out.println("Opção inválida!");
        }
      }

      System.out.print("\nDigite algo para continuar...");
      entrada.nextLine();
      System.out.println();
    }

    System.out.println("Encerrando o programa...");
  }
}