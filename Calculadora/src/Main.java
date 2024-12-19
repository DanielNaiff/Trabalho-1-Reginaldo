import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        do {
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Exponenciação");
            System.out.println("6. Divisão Inteira");
            System.out.println("7. Resto da Divisão");
            System.out.println("8. Fatorial");
            System.out.println("9. Arranjo");
            System.out.println("10. Permutação");
            System.out.println("11. Piso");
            System.out.println("12. Teto");
            System.out.println("13. Raiz de Grau N");
            System.out.println("14. Validar Número Primo");
            System.out.println("15. Validar Quadrado Perfeito");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            int n1, n2;
            double n;
            boolean isValid;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.soma(n1, n2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.subtracao(n1, n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.multiplicacao(n1, n2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.divisao(n1, n2));
                    break;

                case 5:
                    System.out.print("Digite a base: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o expoente: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.exponenciacao(n1, n2));
                    break;

                case 6:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.divisao_inteira(n1, n2));
                    break;

                case 7:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.resto_divisao(n1, n2));
                    break;

                case 8:
                    System.out.print("Digite um número: ");
                    n1 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.fatorial(n1));
                    break;

                case 9:
                    System.out.print("Digite o valor de n: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o valor de p: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.arranjo(n1, n2));
                    break;

                case 10:
                    System.out.print("Digite o valor de n: ");
                    n1 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.permutacao(n1));
                    break;

                case 11:
                    System.out.print("Digite um número: ");
                    n = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.piso(n));
                    break;

                case 12:
                    System.out.print("Digite um número: ");
                    n = scanner.nextDouble();
                    System.out.println("Resultado: " + calc.teto(n));
                    break;

                case 13:
                    System.out.print("Digite o valor de x: ");
                    n1 = scanner.nextInt();
                    System.out.print("Digite o valor de n: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + calc.raizesGrauN(n1, n2));
                    break;

                case 14:
                    System.out.print("Digite um número: ");
                    n1 = scanner.nextInt();
                    if (calc.validarPrimo(n1)) {
                        System.out.println(n1 + " é um número primo.");
                    } else {
                        System.out.println(n1 + " não é um número primo.");
                    }
                    break;

                case 15:
                    System.out.print("Digite um número: ");
                    n1 = scanner.nextInt();
                    if (calc.validarQuadrado(n1)) {
                        System.out.println(n1 + " é um quadrado perfeito.");
                    } else {
                        System.out.println(n1 + " não é um quadrado perfeito.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
