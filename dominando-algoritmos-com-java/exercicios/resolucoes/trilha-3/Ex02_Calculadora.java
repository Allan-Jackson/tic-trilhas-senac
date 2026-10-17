import java.util.Scanner;

public class Ex02_Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        while(true) {
            int operacao = entrada.nextInt();

            if(operacao == 0) {
                break;
            }

            if(operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida! Tente outra vez.");
                continue;
            }

            double n1 = entrada.nextDouble();
            double n2 = entrada.nextDouble();


            String res = "Resultado: ";

            switch (operacao) {
                case 1 -> res += "%.2f + %.2f = %.2f".formatted(n1, n2, n1 + n2);
                case 2 -> res += "%.2f - %.2f = %.2f".formatted(n1, n2, n1 - n2);
                case 3 -> res += "%.2f * %.2f = %.2f".formatted(n1, n2, n1 * n2);
                case 4 -> {
                    if(n2 == 0) {
                        System.out.println("Divisão por zero não permitida");
                        continue;
                    }
                    res += "%.2f / %.2f = %.2f".formatted(n1, n2, n1 / n2);
                }
            }

            System.out.println(res);
        }

        System.out.println("Fim.");
    }
}
