package EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class GeradorDeTabuadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada = 0;

        do {
            System.out.println("Informe o número da tabuada entre 1 e 10: ");
            int numeroInformado = scanner.nextInt();

            if (numeroInformado < 0 || numeroInformado > 10) {
                System.out.println("Número inválido " + numeroInformado);
                continue;
            } else {
                tabuada = numeroInformado;
                break;
            }
        } while (true);

        System.out.println("Imprimindo a tabuada de " + tabuada + "...");
        for (int i = 0; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }

        scanner.close();
    }
}
