import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex05_JogoForca {
  public static final int MAX_TENTATIVAS = 7;

  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    int erros = 0;
    String palavra;
    boolean[] mapaExibicao;
    int letrasReveladas = 0;


    System.out.print("Palavra secreta: ");
    palavra = entrada.nextLine().toUpperCase();
    System.out.println("\n");

    mapaExibicao = new boolean[palavra.length()];


    do {
      boolean acerto = false;

      System.out.print("Chute uma letra: ");
      char chute = entrada.nextLine().toUpperCase().charAt(0);

      //modifica a exibição para as letras encontradas
      for(int i = 0; i < palavra.length(); i++) {
        if(chute == palavra.charAt(i)) {
          mapaExibicao[i] = true;
          acerto = true;
          letrasReveladas++;
        }
      }

      if(!acerto) {
        erros++;
      }

      System.out.print("Forca: ");
      for(int i = 0; i < mapaExibicao.length; i++) {
        if(mapaExibicao[i]) {
          System.out.print(palavra.charAt(i));
        }else {
          System.out.print("_");
        }
      }
      System.out.println("\nErros: " + erros + "\n");

      if(letrasReveladas == palavra.length()) {
        System.out.println("Parabéns! Você descobriu a palavra.");
        System.exit(0);
      }

    }while(erros < MAX_TENTATIVAS);

    System.out.println("Você perdeu! A palavra era: " + palavra);

  }
}