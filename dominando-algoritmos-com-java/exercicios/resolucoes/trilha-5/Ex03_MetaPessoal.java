import java.util.Scanner;

public class Ex03_MetaPessoal {
    public static final int PERC_RESERVA = 30;

    public static String descricao;
    public static double meta;
    public static double salario;
    public static double despesas;
    public static double saldoMensal;
    public static double reservaFixa;
    public static double metaMensal;
    public static double tempoEstimado;

    public static void main(String[] args) {
        ler();
        processar();
        exibir();
    }

    public static void ler() {
        Scanner entrada = new Scanner(System.in);

        descricao = entrada.nextLine();
        meta = entrada.nextDouble();
        salario = entrada.nextDouble();
        despesas = entrada.nextDouble();
    }

    public static void processar() {
        saldoMensal = salario - despesas;
        reservaFixa = saldoMensal * PERC_RESERVA/100;
        metaMensal = saldoMensal - reservaFixa;
        tempoEstimado = meta / metaMensal;
    }

    public static void exibir() {
        System.out.printf("Meta: %s (R$ %.2f)\n", descricao, meta);
        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f\n", salario, despesas);
        System.out.printf("Saldo após despesas: R$ %.2f\n", saldoMensal);
        System.out.printf("Reserva fixa (%d%%): R$ %.2f\n", PERC_RESERVA, reservaFixa);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês\n", metaMensal);
        System.out.printf("Prazo estimado para atingir a meta: %.2f meses\n", tempoEstimado);
    }
}
