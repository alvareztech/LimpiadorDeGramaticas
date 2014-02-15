package com.danyalvarez.limpiadordegramaticas;

import java.util.Stack;

/**
 * Limpiador de Gramáticas
 *
 * @author Daniel Alvarez
 */

public class ConjuntoProducciones {
    protected int n;
    protected Produccion[] C;

    public ConjuntoProducciones() {
        n = 0;
        C = new Produccion[99];
    }

    public int nroElems() {
        return n;
    }

    public void mostrar() {
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.println(C[i].getImpresion() + ", ");
        }
        System.out.println("} " + nroElems());
    }

    public void adicionar(Produccion X) {
        for (int i = 0; i < n; i++)
            if (C[i].esIgual(X))
                return;
        C[n] = X;
        n++;
    }

    public void eliminar(int j) {
        for (int i = j; i < n; i++)
            C[i - 1] = C[i];
        n--;
    }

    public String getImpresion() {
        String I = "";
        for (int i = 0; i < n; i++)
            I += "  " + C[i].getImpresion() + "\n";
        return I;
    }

    public String[] getImpresionV() {
        String V[] = new String[n];
        for (int i = 0; i < n; i++)
            V[i] = C[i].getImpresion();
        return V;
    }

    public Produccion getElemento(int i) {
        return C[i];
    }

    public ConjuntoProducciones union(ConjuntoProducciones B) {
        ConjuntoProducciones U = new ConjuntoProducciones();
        for (int i = 0; i < n; i++)
            U.adicionar(C[i]);
        for (int i = 0; i < B.n; i++)
            U.adicionar(B.C[i]);
        return U;
    }

    public ConjuntoProducciones interseccion(ConjuntoProducciones B) {
        ConjuntoProducciones I = new ConjuntoProducciones();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < B.n; j++)
                if (C[i].equals(B.C[j])) {
                    I.adicionar(C[i]);
                    break;
                }
        return I;
    }

    // verifica si existe la produccion X -> Y
    public boolean existeProduccion(char X, char Y) {
        for (int i = 0; i < nroElems(); i++)
            if (getElemento(i).getA() == X && getElemento(i).getB().charAt(0) == Y)
                return true;
        return false;
    }

    // R producciones del tipo A -> B, Y constante
    public boolean esGenerada(char X, char Y) {
        Stack<String> pila = new Stack<String>();
        pila.push(X + "");
        boolean sw = false;
        while (!pila.isEmpty()) {
            char W = ((String) pila.pop()).charAt(0);
            if (W == Y)
                return true;
            if (W == X && sw)
                return false;
            for (int i = 0; i < nroElems(); i++) {
                if (getElemento(i).getA() == W) {
                    pila.push(getElemento(i).getB());
                }
            }
            sw = true;
        }


        return false;
    }
}