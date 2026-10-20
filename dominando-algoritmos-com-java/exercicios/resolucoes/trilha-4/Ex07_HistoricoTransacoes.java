import java.util.Scanner;

public class Ex07_HistoricoTransacoes {
  public static final int MAX_TRANSACOES = 1000;
  public static void main(String[] args){
    var entrada = new Scanner(System.in);

    double[] transacoes = new double[MAX_TRANSACOES];
    double saldoFinal = 0;

    for(int i = 0; i < MAX_TRANSACOES; i++) {
      double valor = entrada.nextDouble();

      if(valor == -1) {
        break;
      }

      //lógica de cancelamento
      if(valor == 0) {
        boolean flagCancelamento = false;
        for(int j = i - 1; j >= 0; j--) {
          if(transacoes[j] != 0) {
            transacoes[j] = 0;
            i = j - 1; //retorna o índice para o momento da útima transação válida
            flagCancelamento = true;
            break;
          }
        }
        if(!flagCancelamento) {
          i--; //reduz o índice para voltar na mesma posição na próxima iteração
        }
        continue;
      }

      transacoes[i] = valor;
    }

    for (int i = 0; i < MAX_TRANSACOES; i++) {
      if(transacoes[i] == 0) {
        break;
      }

      saldoFinal += transacoes[i];
    }

    System.out.println("Saldo final: " + saldoFinal);
  }
}