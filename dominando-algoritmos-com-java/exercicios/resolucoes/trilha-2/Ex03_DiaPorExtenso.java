import java.util.Scanner;

public class Ex03_DiaPorExtenso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia = entrada.nextInt();

        String diaExtenso = switch (dia) {
                    case 0-> "Domingo";
                    case 1 -> "Segunda";
                    case 2 -> "Terça";
                    case 3 -> "Quarta";
                    case 4 -> "Quinta";
                    case 5 -> "Sexta";
                    case 6 -> "Sábado";
                    default -> "Dia da semana inválido";
        };

        System.out.println(diaExtenso);
    }
}
