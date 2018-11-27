package tech.alvarez.limpiadordegramaticas;

/**
 * Un alfabeto es un conjunto finito, no vacío, de símbolos indivisibles u objetos atómicos.
 */

public class Alfabeto {
    /**
     * tipo 1: Mayúsculas, tipo 2: minúsculas, tipo 3: mixto
     */
    private int tipo;
    private int n;
    private char[] C;

    public Alfabeto(int tipo) {
        n = 0;
        C = new char[99];
        this.tipo = tipo;
    }

    public void adicionar(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (tipo == 1)
                if (esMayuscula(a.charAt(i)))
                    adicionar(a.charAt(i));
            if (tipo == 2)
                if (esMinuscula(a.charAt(i)))
                    adicionar(a.charAt(i));
            if (tipo == 3)
                adicionar(a.charAt(i));
        }
    }

    public boolean esIgual(Alfabeto X) {
        int c = 0;
        for (int i = 0; i < nroElems(); i++)
            for (int j = 0; j < X.nroElems(); j++)
                if (getElemento(i) == X.getElemento(j))
                    c++;
        if (c == nroElems())
            return true;
        return false;
    }

    public boolean esMayuscula(char x) {
        if (x > 64 && x < 91)
            return true;
        return false;
    }

    public boolean esMinuscula(char x) {
        if (x > 96 && x < 123)
            return true;
        return false;
    }

    public int nroElems() {
        return n;
    }

    public void mostrar() {
        System.out.print("{");
        for (int i = 0; i < n; i++)
            System.out.print(C[i] + ", ");
        System.out.println("} " + nroElems());
    }

    public void adicionar(char x) {
        for (int i = 0; i < n; i++)
            if (C[i] == x)
                return;
        C[n++] = x;
    }

    public void eliminar(int j) {
        for (int i = j; i < n; i++)
            C[i - 1] = C[i];
        n--;
    }

    public String getImpresion() {
        String I = "{";
        if (n == 0)
            return I + " }";
        for (int i = 0; i < n - 1; i++)
            I += C[i] + ", ";
        return I + C[n - 1] + "}";
    }

    public char getElemento(int i) {
        return C[i];
    }

    public Alfabeto union(Alfabeto B) {
        Alfabeto U = new Alfabeto(tipo);
        for (int i = 0; i < n; i++)
            U.adicionar(C[i]);
        for (int i = 0; i < B.n; i++)
            U.adicionar(B.C[i]);
        return U;
    }

    public Alfabeto interseccion(Alfabeto B) {
        Alfabeto I = new Alfabeto(tipo);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < B.n; j++)
                if (C[i] == B.C[j]) {
                    I.adicionar(C[i]);
                    break;
                }
        return I;
    }
}