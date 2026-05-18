package main;

class ColaPrioridad {
    private int[] cola;
    private int tamaño;

    public ColaPrioridad(int capacidad) {
        cola = new int[capacidad];
        tamaño = 0;
    }

    public void enqueue(int dato) {
        int i;
        for (i = tamaño - 1; i >= 0 && cola[i] > dato; i--) {
            cola[i + 1] = cola[i];
        }
        cola[i + 1] = dato;
        tamaño++;
    }

    public int dequeue() {
        if (tamaño == 0) {
            System.out.println("Cola vacía");
            return -1;
        }
        return cola[--tamaño]; // mayor prioridad sale primero
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}