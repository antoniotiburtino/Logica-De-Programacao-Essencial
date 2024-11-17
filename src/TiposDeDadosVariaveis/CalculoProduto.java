package TiposDeDadosVariaveis;

import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeDoProduto = scanner.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valorUnitarioProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto que você precisa: ");
        int quantidadeProduto = scanner.nextInt();

        double valorTotalProduto = valorUnitarioProduto * quantidadeProduto;

        System.out.println("O produto " + nomeDoProduto + " com valor unitário de R$ " + valorUnitarioProduto
                + ", com a quantidade " + quantidadeProduto + " custará o total de R$ " + valorTotalProduto);

        scanner.close();
    }
}
