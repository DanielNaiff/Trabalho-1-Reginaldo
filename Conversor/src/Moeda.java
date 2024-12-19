import java.util.Scanner;

public class Moeda {

    public static void conversaoMoeda(Scanner scanner) {
        System.out.println("Escolha a conversão de moeda:");
        System.out.println("1. Real para Dólar");
        System.out.println("2. Real para Euro");
        System.out.println("3. Real para Libra");
        System.out.println("4. Dólar para Real");
        System.out.println("5. Euro para Real");
        System.out.println("6. Libra para Real");
        System.out.println("7. Dólar para Euro");
        System.out.println("8. Dólar para Libra");
        System.out.println("9. Euro para Dólar");
        System.out.println("10. Euro para Libra");
        System.out.println("11. Libra para Dólar");
        System.out.println("12. Libra para Euro");

        int opcao = scanner.nextInt();

        System.out.println("Digite o valor para conversão:");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + realParaDolar(valor));
                break;
            case 2:
                System.out.println("Resultado: " + realParaEuro(valor));
                break;
            case 3:
                System.out.println("Resultado: " + realParaLibra(valor));
                break;
            case 4:
                System.out.println("Resultado: " + dolarParaReal(valor));
                break;
            case 5:
                System.out.println("Resultado: " + euroParaReal(valor));
                break;
            case 6:
                System.out.println("Resultado: " + libraParaReal(valor));
                break;
            case 7:
                System.out.println("Resultado: " + dolarParaEuro(valor));
                break;
            case 8:
                System.out.println("Resultado: " + dolarParaLibra(valor));
                break;
            case 9:
                System.out.println("Resultado: " + euroParaDolar(valor));
                break;
            case 10:
                System.out.println("Resultado: " + euroParaLibra(valor));
                break;
            case 11:
                System.out.println("Resultado: " + libraParaDolar(valor));
                break;
            case 12:
                System.out.println("Resultado: " + libraParaEuro(valor));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Taxas de câmbio reais aproximadas (em 2024)
    public static double realParaDolar(double valor) {
        return valor * 0.17;
    }

    public static double realParaEuro(double valor) {
        return valor * 0.16;
    }

    public static double realParaLibra(double valor) {
        return valor * 0.13;
    }

    public static double dolarParaReal(double valor) {
        return valor / 0.17;
    }

    public static double euroParaReal(double valor) {
        return valor / 0.16;
    }

    public static double libraParaReal(double valor) {
        return valor / 0.13;
    }

    public static double dolarParaEuro(double valor) {
        return valor * 0.95;
    }

    public static double dolarParaLibra(double valor) {
        return valor * 0.79; // 1 USD para GBP
    }

    public static double euroParaDolar(double valor) {
        return valor * 1.05; // 1 EUR para USD
    }

    public static double euroParaLibra(double valor) {
        return valor * 0.83; // 1 EUR para GBP
    }

    public static double libraParaDolar(double valor) {
        return valor * 1.27; // 1 GBP para USD
    }

    public static double libraParaEuro(double valor) {
        return valor * 1.21; // 1 GBP para EUR
    }
}
