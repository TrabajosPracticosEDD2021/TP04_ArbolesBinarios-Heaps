package a_arbolBinarioExt;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

public class ArbolBinarioExtCliente {
	public static void main(String[] args) {
		NodoArbolBinario<Integer> nodo20 = new NodoArbolBinario<Integer>(20);
		NodoArbolBinario<Integer> nodo30 = new NodoArbolBinario<Integer>(30);
		NodoArbolBinario<Integer> nodo40 = new NodoArbolBinario<Integer>(40);
		NodoArbolBinario<Integer> nodo50 = new NodoArbolBinario<Integer>(50);
		NodoArbolBinario<Integer> nodo10 = new NodoArbolBinario<Integer>(10);
		NodoArbolBinario<Integer> nodo60 = new NodoArbolBinario<Integer>(60);
		NodoArbolBinario<Integer> nodo70 = new NodoArbolBinario<Integer>(70);
		
		ArbolbinarioExt<Integer> arbolito = new ArbolbinarioExt<Integer>();
		arbolito.agregarHijoDerecho(null, nodo20);
		arbolito.agregarHijoDerecho(nodo20, nodo40);
		arbolito.agregarHijoIzquierdo(nodo20, nodo30);
		arbolito.agregarHijoIzquierdo(nodo30, nodo50);
		arbolito.agregarHijoDerecho(nodo30, nodo10);
		arbolito.agregarHijoDerecho(nodo40, nodo60);
		arbolito.agregarHijoDerecho(nodo10, nodo70);
		
		System.out.println("Arbolito: " + arbolito);
		
		System.out.println("Lista de Nodos Hojas: " + arbolito.hojas());
		
		System.out.println("Lista de Nodos Internos: " + arbolito.internos());
		
		System.out.println("Cantidad de elementos almacenados en la estructura: " + arbolito.size());
		
		System.out.println("La altura del arbol es: " + arbolito.altura());
		
		System.out.println("La altura del nodo 10 es: " + arbolito.altura(nodo10)); 
		
		System.out.println("La profundidad del arbol es: " + arbolito.profundidad());

		System.out.println("La profundidad del nodo 50 es: " + arbolito.profundidad(nodo50)); 
	}
}
