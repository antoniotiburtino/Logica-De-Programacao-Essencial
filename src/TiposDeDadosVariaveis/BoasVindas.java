package TiposDeDadosVariaveis;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seja bem-vindo(a) " + nome);

        scanner.close();
    }
}
