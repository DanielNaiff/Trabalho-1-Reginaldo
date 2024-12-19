import java.util.Scanner;

public class Temperatura {
    public static void conversaoTemperaturas(Scanner scanner){
        System.out.println("Escolha a conversao de temperatura:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Celsius para Kelvin");
        System.out.println("3. Fahrenheit para Celsius");
        System.out.println("4. Fahrenheit para Kelvin");
        System.out.println("5. Kelvin para Celsius");
        System.out.println("6. Kelvin para Fahrenheit");

        int opcao = scanner.nextInt();

        System.out.println("Digite o valor para conversao");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + celsiusParaFahrenheit(valor));
                break;
            case 2:
                System.out.println("Resultado: " + celsiusParaKelvin(valor));
                break;
            case 3:
                System.out.println("Resultado: " + fahrenheitParaCelsius(valor));
                break;
            case 4:
                System.out.println("Resultado: " + fahrenheitParaKelvin(valor));
                break;
            case 5:
                System.out.println("Resultado: " + kelvinParaCelsius(valor));
                break;
            case 6:
                System.out.println("Resultado: " + kelvinParaFahrenheit(valor));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
