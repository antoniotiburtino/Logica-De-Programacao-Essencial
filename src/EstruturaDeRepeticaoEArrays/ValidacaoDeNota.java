package EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = -1;

        do {
            System.out.println("Informe uma nota entre 0 e 10: ");
            int numeroInformado = scanner.nextInt();

            if (numeroInformado >= 0 && numeroInformado <= 10) {
                nota = numeroInformado;
                break;
            } else {
                System.out.println("O número " + numeroInformado + " é inválido");
            }
        } while (true);

        System.out.println("A nota informada foi: " + nota);

        scanner.close();
    }
}
