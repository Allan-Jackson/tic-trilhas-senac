import java.util.Scanner;

public class Ex01_Prazer {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        String curso = entrada.nextLine();
        int semestre = entrada.nextInt();
        entrada.nextLine(); //consome o '\n' do nextInt
        String hobby = entrada.nextLine();


        System.out.printf(
                "Prazer, eu sou o(a) %s!\n" +
                "Atualmente estou no %dº semestre de %s e meu hobby favorito é %s.",
                nome, semestre, curso, hobby);
    }
}
