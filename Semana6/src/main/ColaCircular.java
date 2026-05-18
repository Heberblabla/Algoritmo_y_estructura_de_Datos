package main;

class ColaCircular {
    private int[] cola;
    private int frente, fin, tamaño, capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        frente = 0;
        tamaño = 0;
        fin = capacidad - 1;
    }

    public void enqueue(int dato) {
        if (tamaño == capacidad) {
            System.out.println("Cola llena");
            return;
        }
        fin = (fin + 1) % capacidad;
        cola[fin] = dato;
        tamaño++;
    }

    public int dequeue() {
        if (tamaño == 0) {
            System.out.println("Cola vacía");
            return -1;
        }
        int dato = cola[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return dato;
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[(frente + i) % capacidad] + " ");
        }System.out.print("]");
        System.out.println();
    }
}