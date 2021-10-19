package a_arbolBinarioExt;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

public class ArbolbinarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz<T> {

	/** Indica la cantidad de elementos almacenados en la estructura. */
	public int size() {
		int resultado = 0;

		if (vacio()) {
			return resultado;
		}

		ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<NodoArbolBinario<T>>();
		NodoArbolBinario<T> nodoCopia = raiz;
		cola.enqueue(nodoCopia);

		while (!cola.isEmpty()) {
			NodoArbolBinario<T> nodoActual = cola.getFront();
			resultado++;

			if (nodoActual.tieneHijoIzquierdo()) {
				cola.enqueue(nodoActual.getHijoIzquierdo());
			}

			if (nodoActual.tieneHijoDerecho()) {
				cola.enqueue(nodoActual.getHijoDerecho());
			}

			cola.dequeue();
		}

		return resultado;
	}

	/** Devuelve todos los nodos hoja de la estructura */
	public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas() {
		ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> resultado = new ListaEnlazadaNoOrdenada<NodoArbolBinario<T>>();

		if (vacio()) {
			return resultado;
		}

		NodoArbolBinario<T> nodoCopia = raiz;

		ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<NodoArbolBinario<T>>();
		cola.enqueue(nodoCopia);

		while (!cola.isEmpty()) {
			NodoArbolBinario<T> nodoActual = cola.getFront();

			if (nodoActual.getCantidadHijos() == 0) {
				resultado.addToRear(nodoActual);
			}

			if (nodoActual.tieneHijoIzquierdo()) {
				cola.enqueue(nodoActual.getHijoIzquierdo());
			}

			if (nodoActual.tieneHijoDerecho()) {
				cola.enqueue(nodoActual.getHijoDerecho());
			}

			cola.dequeue();
		}

		return resultado;
	}

	/** Devuelve todos los nodos que no son raíz ni hoja */
	public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> internos() {
		ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> resultado = new ListaEnlazadaNoOrdenada<NodoArbolBinario<T>>();

		if (vacio()) {
			return resultado;
		}

		NodoArbolBinario<T> nodoCopia = raiz;

		ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<NodoArbolBinario<T>>();
		cola.enqueue(nodoCopia);

		while (!cola.isEmpty()) {
			NodoArbolBinario<T> nodoActual = cola.getFront();

			if (nodoActual.getCantidadHijos() != 0 && !nodoActual.equals(raiz)) {
				resultado.addToRear(nodoActual);
			}

			if (nodoActual.tieneHijoIzquierdo()) {
				cola.enqueue(nodoActual.getHijoIzquierdo());
			}

			if (nodoActual.tieneHijoDerecho()) {
				cola.enqueue(nodoActual.getHijoDerecho());
			}

			cola.dequeue();
		}

		return resultado;
	}

	/** Devuelve la altura de un nodo */
	public int altura(NodoArbolBinario<T> nodo) {
		int resultado = 0;

		if (nodo.getCantidadHijos() != 0) {
			if (nodo.getHijoIzquierdo() != null) {
				resultado = Math.max(resultado, altura(nodo.getHijoIzquierdo()));
			}

			if (nodo.getHijoDerecho() != null) {
				resultado = Math.max(resultado, altura(nodo.getHijoDerecho()));
			}

			resultado++;
		}

		return resultado;
	}

	/** Devuelve la profundidad de un nodo */
	public int profundidad(NodoArbolBinario<T> nodo) {
		int resultado = 0;

		if (nodo != raiz) {
			resultado = 1 + profundidad(padre(nodo));
		}
		return resultado;
	}

	/** Devuelve la altura del árbol */
	public int altura() {
		return altura(raiz);
	}

	/** Devuelve la profundidad del árbol */
	public int profundidad() {
		return altura();
	}

}
