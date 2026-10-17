import java.util.Scanner;

public class Ex02_Semaforo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cor = entrada.nextLine();

        var msg = switch (cor.toUpperCase()) {
                    case "VERMELHO" -> "Espere";
                    case "VERDE" -> "Atravesse";
                    default -> "Farol inoperante";
        };

        System.out.println(msg);
    }
}
