package listas_enlazadas;

class Nodo {
    //dato q se guarda
    int dato;
    //el objeto q se guarda, por ende este objeto tiene un dato :v
    Nodo siguiente;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}