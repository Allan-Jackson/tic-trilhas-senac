import java.util.Scanner;
public class Ex01_Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        String tabuada = "";

        for(int i = 1; i <= 10; i++) {
            tabuada += "%d x %d = %d\n".formatted(num, i, num * i);
        }

        System.out.print(tabuada);
    }
}
