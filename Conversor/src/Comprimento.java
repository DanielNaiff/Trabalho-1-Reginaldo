import java.util.Scanner;

public class Comprimento {

    public static void conversaoComprimentos(Scanner scanner) {
        System.out.println("Escolha a conversão de comprimento:");
        System.out.println("1. Metros para Centímetros");
        System.out.println("2. Metros para Milímetros");
        System.out.println("3. Metros para Polegadas");
        System.out.println("4. Metros para Pés");
        System.out.println("5. Centímetros para Metros");
        System.out.println("6. Centímetros para Milímetros");
        System.out.println("7. Centímetros para Polegadas");
        System.out.println("8. Centímetros para Pés");
        System.out.println("9. Milímetros para Metros");
        System.out.println("10. Milímetros para Centímetros");
        System.out.println("11. Milímetros para Polegadas");
        System.out.println("12. Milímetros para Pés");
        System.out.println("13. Polegadas para Metros");
        System.out.println("14. Polegadas para Centímetros");
        System.out.println("15. Polegadas para Milímetros");
        System.out.println("16. Polegadas para Pés");
        System.out.println("17. Pés para Metros");
        System.out.println("18. Pés para Centímetros");
        System.out.println("19. Pés para Milímetros");
        System.out.println("20. Pés para Polegadas");

        int opcao = scanner.nextInt();

        System.out.println("Digite o valor para conversão:");
        double valor = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + metrosParaCentimetros(valor));
                break;
            case 2:
                System.out.println("Resultado: " + metrosParaMilimetros(valor));
                break;
            case 3:
                System.out.println("Resultado: " + metrosParaPolegadas(valor));
                break;
            case 4:
                System.out.println("Resultado: " + metrosParaPes(valor));
                break;
            case 5:
                System.out.println("Resultado: " + centimetrosParaMetros(valor));
                break;
            case 6:
                System.out.println("Resultado: " + centimetrosParaMilimetros(valor));
                break;
            case 7:
                System.out.println("Resultado: " + centimetrosParaPolegadas(valor));
                break;
            case 8:
                System.out.println("Resultado: " + centimetrosParaPes(valor));
                break;
            case 9:
                System.out.println("Resultado: " + milimetrosParaMetros(valor));
                break;
            case 10:
                System.out.println("Resultado: " + milimetrosParaCentimetros(valor));
                break;
            case 11:
                System.out.println("Resultado: " + milimetrosParaPolegadas(valor));
                break;
            case 12:
                System.out.println("Resultado: " + milimetrosParaPes(valor));
                break;
            case 13:
                System.out.println("Resultado: " + polegadasParaMetros(valor));
                break;
            case 14:
                System.out.println("Resultado: " + polegadasParaCentimetros(valor));
                break;
            case 15:
                System.out.println("Resultado: " + polegadasParaMilimetros(valor));
                break;
            case 16:
                System.out.println("Resultado: " + polegadasParaPes(valor));
                break;
            case 17:
                System.out.println("Resultado: " + pesParaMetros(valor));
                break;
            case 18:
                System.out.println("Resultado: " + pesParaCentimetros(valor));
                break;
            case 19:
                System.out.println("Resultado: " + pesParaMilimetros(valor));
                break;
            case 20:
                System.out.println("Resultado: " + pesParaPolegadas(valor));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Métodos de conversão para metros
    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    public static double metrosParaMilimetros(double metros) {
        return metros * 1000;
    }

    public static double metrosParaPolegadas(double metros) {
        return metros * 39.3701;
    }

    public static double metrosParaPes(double metros) {
        return metros * 3.28084;
    }

    // Métodos de conversão para centímetros
    public static double centimetrosParaMetros(double centimetros) {
        return centimetros / 100;
    }

    public static double centimetrosParaMilimetros(double centimetros) {
        return centimetros * 10;
    }

    public static double centimetrosParaPolegadas(double centimetros) {
        return centimetros / 2.54;
    }

    public static double centimetrosParaPes(double centimetros) {
        return centimetros / 30.48;
    }

    // Métodos de conversão para milímetros
    public static double milimetrosParaMetros(double milimetros) {
        return milimetros / 1000;
    }

    public static double milimetrosParaCentimetros(double milimetros) {
        return milimetros / 10;
    }

    public static double milimetrosParaPolegadas(double milimetros) {
        return milimetros / 25.4;
    }

    public static double milimetrosParaPes(double milimetros) {
        return milimetros / 304.8;
    }

    // Métodos de conversão para polegadas
    public static double polegadasParaMetros(double polegadas) {
        return polegadas * 0.0254;
    }

    public static double polegadasParaCentimetros(double polegadas) {
        return polegadas * 2.54;
    }

    public static double polegadasParaMilimetros(double polegadas) {
        return polegadas * 25.4;
    }

    public static double polegadasParaPes(double polegadas) {
        return polegadas / 12;
    }

    // Métodos de conversão para pés
    public static double pesParaMetros(double pes) {
        return pes / 3.28084;
    }

    public static double pesParaCentimetros(double pes) {
        return pes * 30.48;
    }

    public static double pesParaMilimetros(double pes) {
        return pes * 304.8;
    }

    public static double pesParaPolegadas(double pes) {
        return pes * 12;
    }
}
