import java.util.*;

public class ResumenListStackQueue {

    public static void main(String[] args) {
        ejemploListas();
        //ejemploStack();
        //ejemploQueue();
    }

    //==============================Listas==============================

    public static void ejemploListas() {
        // Crear una lista
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Manzana");
        lista.add("Platano");
        lista.add("Naranja");

        // Acceder a un elemento por índice
        String primeraFruta = lista.get(0);
        System.out.println("Primera fruta: " + primeraFruta);

        // Modificar un elemento por índice
        lista.set(1, "Pera");

        // Eliminar un elemento por índice
        lista.remove(2);

        // Tamaño de la lista
        int tamano = lista.size();
        System.out.println("Tamano de la lista: " + tamano);

        // Verificar si la lista contiene un elemento
        boolean contieneSandia = lista.contains("Sandia");
        System.out.println("Contiene Sandia? " + contieneSandia);

        // Iterar a través de la lista
        System.out.println("Elementos en la lista:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        // Borrar todos los elementos de la lista
        lista.clear();

        // Verificar si la lista está vacía
        boolean estaVacia = lista.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);
    }

    //==============================Pilas==============================

     public static void ejemploStack() {
        // Crear una pila de números enteros
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila (push)
        pila.push(1);
        pila.push(2);
        pila.push(3);

        //Verificar si contiene un elemento
        boolean contieneNumero = pila.contains(4);
        System.out.println("Contiene el 4? " + contieneNumero);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();
        System.out.println("La pila está vacía? " + estaVacia);

        // Obtener el elemento en la cima de la pila (sin eliminarlo)
        int elementoEnCima = pila.peek();
        System.out.println("Elemento en la cima de la pila: " + elementoEnCima);

        // Eliminar el elemento en la cima de la pila (pop)
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);

        // Tamaño de la pila
        int tamano = pila.size();
        System.out.println("Tamano de la pila: " + tamano);

        // Iterar a través de la pila (desde abajo hasta arriba)
        System.out.println("Elementos en la pila:");
        for (int elemento : pila) {
            System.out.println(elemento);
        }

        // Borrar todos los elementos de la pila
        pila.clear();

        // Verificar si la pila está vacía nuevamente
        estaVacia = pila.isEmpty();
        System.out.println("La pila está vacía? " + estaVacia);
    }

    //==============================Colas==============================

    public static void ejemploQueue() {
        // Crear una cola de números enteros
        Queue<Integer> cola = new LinkedList<>();

        // Agregar elementos a la cola (enqueue)
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);

        //Verificar si contiene un elemento
        boolean contieneNumero = cola.contains(30);
        System.out.println("Contiene el 4? " + contieneNumero);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("La cola está vacía? " + estaVacia);

        // Obtener el elemento en el frente de la cola (sin eliminarlo)
        int elementoEnFrente = cola.peek();
        System.out.println("Elemento en el frente de la cola: " + elementoEnFrente);

        // Eliminar el elemento en el frente de la cola (dequeue)
        int elementoEliminado = cola.poll();
        System.out.println("Elemento eliminado de la cola: " + elementoEliminado);

        // Tamaño de la cola
        int tamano = cola.size();
        System.out.println("Tamaño de la cola: " + tamano);

        // Iterar a través de la cola (desde el frente hasta el final)
        System.out.println("Elementos en la cola (desde el frente hasta el final):");
        for (int elemento : cola) {
            System.out.println(elemento);
        }

        // Borrar todos los elementos de la cola
        cola.clear();

        // Verificar si la cola está vacía nuevamente
        estaVacia = cola.isEmpty();
        System.out.println("La cola está vacía? " + estaVacia);
    }
}