import java.util.Scanner;

public class Ex08_Fibonacci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int a = 1;
        int b = 1;

        if(n <= 0) {
            System.out.println("Parâmetro inválido.");
            System.exit(1);
        }

        if(n == 1 || n == 2) {
            System.out.println("O valor na posição " + n + " da sequência de Fibonacci é 1");
            System.exit(0);
        }

        int fibonacci = 0;

        for(int i = n; i > 2; i--){
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        System.out.println("O valor da na posição " + n + " da sequência de Fibonacci é " + fibonacci);

    }
}
