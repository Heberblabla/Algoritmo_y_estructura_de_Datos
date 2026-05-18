package main;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ColaLista {
    private Nodo frente, fin;

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = fin = nuevo;
            return;
        }
        fin.siguiente = nuevo;
        fin = nuevo;
    }

    public int dequeue() {
        if (frente == null) {
            System.out.println("Cola vacía");
            return -1;
        }
        int dato = frente.dato;
        frente = frente.siguiente;

        if (frente == null) fin = null;

        return dato;
    }

    public void mostrar() {
        Nodo temp = frente;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.print("]");
        System.out.println();
    }
}