import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1. Conversão de Temperaturas");
            System.out.println("2. Conversão de Comprimentos");
            System.out.println("3. Conversão de Massas");
            System.out.println("4. Conversão de Moedas");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Temperatura.conversaoTemperaturas(scanner);
                    break;
                case 2:
                    Comprimento.conversaoComprimentos(scanner);
                    break;
                case 3:
                    Massa.conversaoMassa(scanner);
                    break;
                case 4:
                    Moeda.conversaoMoeda(scanner);
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
