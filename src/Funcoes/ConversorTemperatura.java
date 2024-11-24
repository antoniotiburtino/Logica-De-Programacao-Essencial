package Funcoes;

import java.util.Scanner;

public class ConversorTemperatura {
    // "codigo para converter celsius para fareheint : " °F = C X 1,8 + 32

    public double conversorCeliusFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 1.8) + 32;
    }

    // "codigo para converter fareheint para celsius : " °C = (F - 32) + 1,8.

    public double conversorFahrenheitCelius(double temperaturafahrenheit) {
        return (temperaturafahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        double temperaturaCelsiusInformada = scanner.nextDouble();

        double resultadoCelsiusFahrenheit = conversor.conversorCeliusFahrenheit(temperaturaCelsiusInformada);
        System.out.println("A conversão °C -> °F: " + resultadoCelsiusFahrenheit + " \n");

        System.out.print("Informe a temepratura em °F: ");
        double temperaturafahrenheitInformada = scanner.nextDouble();

        double resultadoFahrenheitCelsius = conversor.conversorFahrenheitCelius(temperaturafahrenheitInformada);
        System.out.println("A conversão °F -> °C: " + resultadoFahrenheitCelsius + "\n");

        scanner.close();

    }
}
