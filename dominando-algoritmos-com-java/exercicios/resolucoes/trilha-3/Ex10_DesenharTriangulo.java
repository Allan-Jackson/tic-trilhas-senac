import java.util.Scanner;

public class Ex10_DesenharTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura = entrada.nextInt();

        if(altura <= 0) {
            System.out.println("Triângulo inválido");
            System.exit(1);
        }

        for(int i = 0; i < altura; i++) {
            for(int b = 0; b <= i; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
