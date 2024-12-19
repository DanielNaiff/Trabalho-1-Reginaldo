import java.util.Scanner;

public class ValidadorCpf {
    private String cpf;

    public ValidadorCpf(String cpf) {
        this.cpf = cpf.replaceAll("[^0-9]", "");
    }

    public boolean isValido() {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") ||
                cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") ||
                cpf.equals("99999999999")) {
            return false;
        }

        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int resto1 = soma1 % 11;
        int digito1 = (resto1 < 2) ? 0 : 11 - resto1;

        if (digito1 != Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            return false;
        }

        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        int resto2 = soma2 % 11;
        int digito2 = (resto2 < 2) ? 0 : 11 - resto2;

        return digito2 == Integer.parseInt(String.valueOf(cpf.charAt(10)));
    }

    public String obterCpfFormatado() {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("[^0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("==== Validador de CPF ====");
            System.out.println("Digite o CPF (sem pontos ou traços) para validação: ");
            String cpfEntrada = scanner.nextLine();

            ValidadorCpf validadorCpf = new ValidadorCpf(cpfEntrada);

            if (validadorCpf.isValido()) {
                System.out.println("O CPF " + validadorCpf.obterCpfFormatado() + " é válido.");
            } else {
                System.out.println("O CPF " + validadorCpf.obterCpfFormatado() + " é inválido.");
            }

            System.out.println("\nDeseja testar outro CPF? (s/n): ");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Programa finalizado!");
            }
        }

        scanner.close();
    }
}
