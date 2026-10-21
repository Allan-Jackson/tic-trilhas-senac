import java.util.Scanner;

public class Ex10_AnaliseMensal {

    public static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args){
        double[] faturamentos = obterFaturamentos();
        String situacao = realizarAnalise(faturamentos);
        exibirResultados(faturamentos, situacao);
    }

    public static double[] obterFaturamentos() {
        int qtdMeses = entrada.nextInt();
        double[] faturamentos = new double[qtdMeses];

        for(int i = 0; i < faturamentos.length; i++) {
            faturamentos[i] = entrada.nextDouble();
        }

        return faturamentos;
    }

    public static String realizarAnalise(double[] faturamentos) {
        boolean crescimento = false;
        boolean queda = false;

        for(int i = 1; i < faturamentos.length; i++) {

            if(faturamentos[i] > faturamentos[i-1]) {
                crescimento = true;
            }

            if(faturamentos[i] < faturamentos[i-1]) {
                queda = true;
            }
        }

        if(crescimento && queda) {
            return "Sem padrão";
        }else if(crescimento) {
            return "Crescimento";
        }else if(queda) {
            return "Queda";
        }else {
            return "Constante";
        }
    }

    public static void exibirResultados(double[] faturamentos, String situacao) {
        System.out.println(">> Análise de Faturamento <<\n");
        System.out.print("Faturamento informado: ");
        for(int i = 0; i < faturamentos.length-1; i++) {
            System.out.print(faturamentos[i] + ", ");
        }
        System.out.println(faturamentos[faturamentos.length-1]);
        System.out.printf("Situação: %s\n", situacao);
    }
}