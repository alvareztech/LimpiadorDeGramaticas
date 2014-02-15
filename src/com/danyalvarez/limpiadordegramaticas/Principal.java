package com.danyalvarez.limpiadordegramaticas;

public class Principal
{
	public static void main(String[] a3d)
	{
		Gramatica G = new Gramatica();

        G.adicionarProduccion(new Produccion('S', "S"));
//        G.adicionarProduccion(new Produccion('X', "AB"));
//        G.adicionarProduccion(new Produccion('S', "aa"));
//        G.adicionarProduccion(new Produccion('X', "a"));
//        G.adicionarProduccion(new Produccion('A', "a"));

//        G.adicionarProduccion(new Produccion('S', "A"));
//        G.adicionarProduccion(new Produccion('A', "B"));
//        G.adicionarProduccion(new Produccion('B', "C"));
//        G.adicionarProduccion(new Produccion('C', "S"));
//        G.adicionarProduccion(new Produccion('B', "aBb"));
//        G.adicionarProduccion(new Produccion('C', "ab"));
//        G.adicionarProduccion(new Produccion('W', "W"));


//        G.adicionarProduccion(new Produccion('S', "aa"));
//        G.adicionarProduccion(new Produccion('S', "a"));
//        G.adicionarProduccion(new Produccion('X', "a"));
//        G.adicionarProduccion(new Produccion('A', "a"));

		G.limpiar();

        G.mostrar();
	}
}
