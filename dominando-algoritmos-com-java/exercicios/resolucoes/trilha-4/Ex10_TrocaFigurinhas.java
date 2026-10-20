import java.util.Scanner;

public class Ex10_TrocaFigurinhas {
  public static final int MAX_TAREFAS = 1000;
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    System.out.print("Números de figurinhas do jogador A: ");
    int qtdFigurinhasA = entrada.nextInt();
    int[] figurinhasA = new int[qtdFigurinhasA];

    for(int i = 0; i < qtdFigurinhasA; i++) {
      figurinhasA[i] = entrada.nextInt();
    }

    System.out.print("Números de figurinhas do jogador B: ");
    int qtdFigurinhasB = entrada.nextInt();
    int[] figurinhasB = new int[qtdFigurinhasB];

    for(int i = 0; i < qtdFigurinhasB; i++) {
      figurinhasB[i] = entrada.nextInt();
    }

    int[] figurinhasComum = new int[Math.min(qtdFigurinhasA, qtdFigurinhasB)];
    int iComum = 0;

    int[] figurinhasAMenosB = new int[qtdFigurinhasA];
    int[] figurinhasBMenosA = new int[qtdFigurinhasB];
    
    //encontra as figurinhas somente de A e figurinhas em comum
    int iAB = 0;
    for(int i = 0; i < qtdFigurinhasA; i++) {
      boolean igual = false;
      for(int j = 0; j < qtdFigurinhasB; j++) {
        if(figurinhasA[i] == figurinhasB[j]) {
          figurinhasComum[iComum++] = figurinhasA[i];
          igual = true;
          break;
        }
      }

      if(!igual) {
        figurinhasAMenosB[iAB++] = figurinhasA[i];
      }
    }

    //encontra as figurinhas somente de B
    int iBA = 0;
    for(int i = 0; i < qtdFigurinhasB; i++) {
      boolean igual = false;
      for(int j = 0; j < qtdFigurinhasA; j++) {
        if(figurinhasB[i] == figurinhasA[j]) {
          igual = true;
          break;
        }
      }

      if(!igual) {
        figurinhasBMenosA[iBA++] = figurinhasB[i];
      }
    }

    //SAIDA
    System.out.print("Figurinhas em comum: ");
    for(int i = 0; i < iComum-1; i++) {
      System.out.print(figurinhasComum[i] + ", ");
    }
    System.out.println(figurinhasComum[iComum-1]);

    System.out.print("Apenas jogador A: ");
    for(int i = 0; i < iAB-1; i++) {
      System.out.print(figurinhasAMenosB[i] + ", ");
    }
    System.out.println(figurinhasAMenosB[iAB-1]);

    System.out.print("Apenas jogador B: ");
    for(int i = 0; i < iBA-1; i++) {
      System.out.print(figurinhasBMenosA[i] + ", ");
    }
    System.out.println(figurinhasBMenosA[iBA-1]);

    System.out.println("Quantidade de trocas possíveis: " + Math.min(iAB, iBA));
  }
}