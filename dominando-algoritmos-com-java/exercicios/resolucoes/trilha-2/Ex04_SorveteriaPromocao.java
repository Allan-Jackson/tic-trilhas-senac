import java.util.Scanner;

public class Ex04_SorveteriaPromocao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double gramas = entrada.nextDouble();

        if(gramas <= 0) {
            System.out.println("Peso inválido");
            System.exit(1);
        }

        double total;

        if(gramas >= 1000) {
            total = gramas/100 * 3;
        }else {
            total = gramas/100 * 3.5;
        }

        System.out.printf("O total é R$ %.2f\n", total);
    }
}
