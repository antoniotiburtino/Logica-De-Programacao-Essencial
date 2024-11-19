package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();

        String message = "";

        if (idade >= 18) {
            message = "Com a idade " + idade + " você tem maioridade!";
        } else {
            message = "Com a idade " + idade + " você é de menoridade";
        }

        System.out.println(message);
        scanner.close();
    }
}
