package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------");
        System.out.println("Informe seu turno de estudos: ");
        System.out.println("M-matutino ou V-vespertino ou N-noturno");

        char turno = scanner.nextLine().toUpperCase().charAt(0);

        String message = "";

        if (turno == 'M' || turno == 'm') {
            message = "Bom dia!";
        } else if (turno == 'V' || turno == 'v') {
            message = "Boa tarde!";
        } else if (turno == 'N' || turno == 'n') {
            message = "Boa noite!";
        } else
            message = "Valor inválido";

        System.out.println(message);

        System.out.println("-------------");
        scanner.close();
    }
}
