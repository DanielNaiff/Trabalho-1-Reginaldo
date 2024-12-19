import java.util.Scanner;

public class Massa {

    public static void conversaoMassa(Scanner scanner) {
        System.out.println("Escolha a conversão de massa:");
        System.out.println("1. Quilogramas para Gramas");
        System.out.println("2. Quilogramas para Libras");
        System.out.println("3. Gramas para Quilogramas");
        System.out.println("4. Libras para Quilogramas");
        System.out.println("5. Gramas para Libras");
        System.out.println("6. Libras para Gramas");

        int opcao = scanner.nextInt();

        System.out.println("Digite o valor para conversão:");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + quilogramasParaGramas(valor));
                break;
            case 2:
                System.out.println("Resultado: " + quilogramasParaLibras(valor));
                break;
            case 3:
                System.out.println("Resultado: " + gramasParaQuilogramas(valor));
                break;
            case 4:
                System.out.println("Resultado: " + librasParaQuilogramas(valor));
                break;
            case 5:
                System.out.println("Resultado: " + gramasParaLibras(valor));
                break;
            case 6:
                System.out.println("Resultado: " + librasParaGramas(valor));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Métodos de conversão
    public static double quilogramasParaGramas(double quilogramas) {
        return quilogramas * 1000;
    }

    public static double quilogramasParaLibras(double quilogramas) {
        return quilogramas * 2.20462;
    }

    public static double gramasParaQuilogramas(double gramas) {
        return gramas / 1000;
    }

    public static double librasParaQuilogramas(double libras) {
        return libras / 2.20462;
    }

    public static double gramasParaLibras(double gramas) {
        return gramas / 453.592;
    }

    public static double librasParaGramas(double libras) {
        return libras * 453.592;
    }
}
