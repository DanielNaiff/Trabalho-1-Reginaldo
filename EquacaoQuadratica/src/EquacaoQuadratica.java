public class EquacaoQuadratica {
    private int a, b, c;

    public EquacaoQuadratica(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calcularDiscriminante() {
        return (getB() * getB()) - (4 * getA() * getC());
    }

    public void calcularRaizes() {
        int delta = calcularDiscriminante();

        if (delta > 0) {
            double raiz1 = (-getB() + Math.sqrt(delta)) / (2 * getA());
            double raiz2 = (-getB() - Math.sqrt(delta)) / (2 * getA());
            System.out.println("As raízes reais são distintas:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else if (delta == 0) {
            double raiz = -getB() / (2.0 * getA());
            System.out.println("A equação tem uma raiz real dupla:");
            System.out.println("Raiz: " + raiz);
        } else {
            System.out.println("A equação não tem raízes reais.");
        }
    }

    // Métodos getters para acessar os coeficientes
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

}
