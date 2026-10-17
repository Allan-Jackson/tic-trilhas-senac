import java.util.Scanner;

public class Ex05_DesafioSoletracao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavraSoletrada = "";


        System.out.println("Informe uma palavra: ");
        String palavraOriginal = entrada.nextLine();


        System.out.println("Por favor, soletre essa palavra letra por letra [digite \"0\" para finalizar]: ");


        while(true) {

            String letra = entrada.nextLine();

            if(letra.equals("0")) {
                break;
            }

            if(!Character.isAlphabetic(letra.toCharArray()[0]) || letra.length() > 1) {
                System.out.println("Valor inválido: " + letra);
                continue;
            }

            palavraSoletrada += letra;

        }

        System.out.println("Palavra original: " + palavraOriginal);
        System.out.println("Palavra soletrada: " + palavraSoletrada);

    }
}
