import java.util.Scanner;

public class Ex09_DesenharRetangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base = entrada.nextInt();
        int altura = entrada.nextInt();

        if(base <= 0 || altura <= 0) {
            System.out.println("Retãngulo inválido");
            System.exit(1);
        }

        for(; altura > 0; --altura) {
            for(int b = base; b > 0; --b) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
