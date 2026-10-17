import java.util.Scanner;

public class Ex07_TempoLeitura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String leitor = entrada.nextLine();
        String livro = entrada.nextLine();
        int paginas = entrada.nextInt();
        double tempoPorPaginaSeg = entrada.nextDouble();

        double tempoEstimadoHoras = (paginas * tempoPorPaginaSeg) / 3600;

        System.out.printf("%s, você finalizará a leitura do livro %s em aproximadamente %.2f horas.\n", leitor, livro, tempoEstimadoHoras);
    }
}
