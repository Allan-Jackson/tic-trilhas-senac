import java.util.Scanner;
public class Ex01_OrcamentoFamiliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ganhos = entrada.nextDouble();
        double gastos = entrada.nextDouble();

        String msg = ganhos >= gastos ? "Você está dentro do orçamento!" : "Você está fora do orçamento! Não gaste mais!";

        System.out.println(msg);
    }
}
