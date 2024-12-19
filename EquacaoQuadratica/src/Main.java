import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o coeficiente b: ");
        int b = scanner.nextInt();

        System.out.print("Digite o coeficiente c: ");
        int c = scanner.nextInt();

        EquacaoQuadratica equacao = new EquacaoQuadratica(a, b, c);

        equacao.calcularRaizes();

        scanner.close();
    }
}
