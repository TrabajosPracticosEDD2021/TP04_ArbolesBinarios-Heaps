package a_arbolBinarioExt;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

public interface ArbolBinarioExtInterfaz<T> {
	/** Indica la cantidad de elementos almacenados en la estructura. */
	public int size();

	/** Devuelve todos los nodos hoja de la estructura */
	public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas();

	/** Devuelve todos los nodos que no son raíz ni hoja */
	public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> internos();

	/** Devuelve la altura de un nodo */
	public int altura(NodoArbolBinario<T> nodo);

	/** Devuelve la profundidad de un nodo */
	public int profundidad(NodoArbolBinario<T> nodo);

	/** Devuelve la altura del árbol */
	public int altura();

	/** Devuelve la profundidad del árbol */
	public int profundidad();
}
