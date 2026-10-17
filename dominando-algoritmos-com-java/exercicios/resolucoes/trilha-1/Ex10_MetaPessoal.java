import java.util.Scanner;

public class Ex10_MetaPessoal {
    public static final int PERC_RESERVA = 30;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String descricao = entrada.nextLine();
        double meta = entrada.nextDouble();
        double salario = entrada.nextDouble();
        double despesas = entrada.nextDouble();

        double saldoMensal = salario - despesas;
        double reservaFixa = saldoMensal * PERC_RESERVA/100;
        double metaMensal = saldoMensal - reservaFixa;
        double tempoEstimado = meta / metaMensal;

        System.out.printf("Meta: %s (R$ %.2f)\n", descricao, meta);
        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f\n", salario, despesas);
        System.out.printf("Saldo após despesas: R$ %.2f\n", saldoMensal);
        System.out.printf("Reserva fixa (%d%%): R$ %.2f\n", PERC_RESERVA, reservaFixa);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês\n", metaMensal);
        System.out.printf("Prazo estimado para atingir a meta: %.2f meses\n", tempoEstimado);

    }
}
