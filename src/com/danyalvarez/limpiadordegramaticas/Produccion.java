package com.danyalvarez.limpiadordegramaticas;

/**
 * Limpiador de Gramáticas
 *
 * @author Daniel Alvarez
 */

public class Produccion {
    private char a;
    private String b;

    public Produccion(char a, String b) {
        this.a = a;
        this.b = b;
    }

    public char getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getImpresion() {
        return a + " -> " + b;
    }

    public boolean esValida() {
        return true;
    }

    public void mostrar() {
        System.out.println(a + " -> " + b);
    }

    public boolean esRenombradora() {
        if (b.length() == 1 && esMayuscula(b.charAt(0)))
            return true;
        return false;
    }

    public boolean esRenombradoraA() {
        if (a == b.charAt(0) && b.length() == 1)
            return true;
        return false;
    }

    public boolean esIgual(Produccion O) {
        if (a == O.a && b.equals(O.b))
            return true;
        return false;
    }

    public boolean contiene(Alfabeto A) {
        int c = 0;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < A.nroElems(); j++) {
                if (b.charAt(i) == A.getElemento(j))
                    c++;
            }
        }
        if (c == b.length())
            return true;
        return false;
    }

    public boolean tiene(char x) {
        if (a == x)
            return true;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == x)
                return true;
        }
        return false;
    }

    public boolean tieneEnI(char x) {
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == x)
                return true;
        }
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
}
