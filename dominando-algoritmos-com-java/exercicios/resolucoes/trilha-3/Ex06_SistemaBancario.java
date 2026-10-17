import java.util.Scanner;

public class Ex06_SistemaBancario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 0;

        while(true) {

            System.out.println("\nMenu de Opções: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("0. Sair");

            System.out.print("\n\n> ");

            int opcao = entrada.nextInt();
            entrada.nextLine(); //consome o '\n'
            System.out.println();

            if(opcao == 0) {
                break;
            }

            if(opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida: ");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                }
                case 2 -> {
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
                }
                case 3 -> {
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
                }
            }

            System.out.print("Tecle algo para continuar: ");
            entrada.nextLine();
            System.out.println();
        }

        System.exit(0);
    }
}
