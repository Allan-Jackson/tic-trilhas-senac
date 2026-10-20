import java.util.Scanner;

public class Ex09_ControleTarefas {
  public static final int MAX_TAREFAS = 1000;
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    String[] tarefas = new String[MAX_TAREFAS];
    boolean[] statusTarefas = new boolean[MAX_TAREFAS];

    int ultimaTarefa = -1;

    lacoPrincipal:
    while(true) {
      System.out.println("Menu de opções");
      System.out.println("1. Adicionar tarefa");
      System.out.println("2. Listar tarefas");
      System.out.println("3. Marcar concluída");
      System.out.println("4. Exibir pendentes");
      System.out.println("0. Sair");
      System.out.print("\n> ");

      int opcao = entrada.nextInt();
      entrada.nextLine(); //consome o '\n'

      switch (opcao) {
        case 0 -> {
          break lacoPrincipal;
        }
        case 1 -> {
          String tarefa = entrada.nextLine();

          ++ultimaTarefa;
          tarefas[ultimaTarefa] = tarefa;
          System.out.println("Tarefa adicionada com sucesso!");
        }
        case 2 -> {
          System.out.println("Lista de tarefas:");
          for(int i = 0; i <= ultimaTarefa; i++) {
            System.out.printf("%d - [%c] %s\n", i+1, (statusTarefas[i] ? 'X' : ' '), tarefas[i]);
          }
        }
        case 3 -> {
          int idTarefa = entrada.nextInt();
          entrada.nextLine(); //consome o '\n'

          statusTarefas[idTarefa-1] = true;
          System.out.printf("Tarefa %d marcada como concluída.\n", idTarefa);
        }
        case 4 -> {
          System.out.println("Tarefas pendents:");
          for(int i = 0; i <= ultimaTarefa; i++) {
            if(!statusTarefas[i]) {
              System.out.printf("%d - [ ] %s\n", i+1, tarefas[i]);
            }
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