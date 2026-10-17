import java.util.Scanner;

public class Ex06_CuidadoSaude {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String paciente = entrada.nextLine();
        double altura = entrada.nextDouble();
        double peso = entrada.nextDouble();
        double imc = peso / (altura * altura);


        System.out.printf("%s, seu IMC é de %.4f\n", paciente, imc);
    }
}
