import java.util.Scanner;

public class Ex07_Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int fatorial = n;
        int aux = n;

        if(n <= 0) {
            System.out.println("Parâmetro inválido.");
            System.exit(1);
        }

        while(aux > 1 ) {
            fatorial *= --aux;
        }

        System.out.printf("O fatorial de %d é %d.", n, fatorial);

    }
}
