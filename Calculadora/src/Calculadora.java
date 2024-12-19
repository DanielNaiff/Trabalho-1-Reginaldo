public class Calculadora {
    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    public int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public int divisao(int n1, int n2) {
        return n1 / n2;
    }

    public int exponenciacao(int n1, int n2) {
        int aux = 1;
        for (int i = 1; i <= n2; i++) {
            aux *= n1;
        }
        return aux;
    }

    public int divisao_inteira(int n1, int n2) {
        return n1 / n2;
    }

    public int resto_divisao(int n1, int n2) {
        return n1 % n2;
    }

    public int fatorial(int n) {
        int x = 1;
        if (n == 0) {
            return x;
        } else {
            for (int i = n; i >= 1; i--) {
                x *= i;
            }
            return x;
        }
    }

    public double arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }

    public double permutacao(int n) {
        return fatorial(n);
    }

    public int piso(double n) {
        return (int) n;
    }

    public int teto(double n) {
        return (int) n + (n % 1 == 0 ? 0 : 1);
    }

    public double raizesGrauN(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return Math.pow(x, 1.0 / n);
        }
    }

    public boolean validarPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean validarQuadrado(int n) {
        int raiz = (int) Math.sqrt(n);
        return raiz * raiz == n;
    }
}
