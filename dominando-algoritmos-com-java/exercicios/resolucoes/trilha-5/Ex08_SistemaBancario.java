import java.util.Scanner;

public class Ex08_SistemaBancario {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double saldo = 0;

        while(true) {
            int opcao = mostrarMenu();

            if(opcao == 0) {
                break;
            }

            if(opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida: ");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    mostrarSaldo(saldo);
                }
                case 2 -> {
                    saldo = realizarDeposito(saldo);
                }
                case 3 -> {
                    saldo = realizarSaque(saldo);
                }
            }

            pausa();
        }

        System.exit(0);
    }

    public static int mostrarMenu() {
        System.out.println("\nMenu de Opções: ");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar Depósito");
        System.out.println("3. Realizar Saque");
        System.out.println("0. Sair");

        System.out.print("\n\n> ");
        int opcao = entrada.nextInt();
        entrada.nextLine(); //consome o '\n'
        System.out.println();

        return opcao;
    }

    public static void pausa() {
        System.out.print("Tecle algo para continuar: ");
        entrada.nextLine();
        System.out.println();
    }

    public static void mostrarSaldo(double saldo) {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public static double realizarDeposito(double saldo) {
        double valor = -1;
        do {
            valor = entrada.nextDouble();
            entrada.nextLine();

            if(valor < 0) {
                System.out.println("Valor inválido");
                continue;
            }

            saldo += valor;
        }while(valor < 0);

        return saldo;
    }

    public static double realizarSaque(double saldo) {
        double valor = -1;
        do {
            valor = entrada.nextDouble();
            entrada.nextLine();


            if(valor < 0) {
                System.out.println("Valor inválido");
                continue;
            }

            if(valor > saldo) {
                System.out.println("Saldo insuficiente");
            }else {
                saldo -= valor;
            }
        }while(valor < 0);

        return saldo;
    }
}
