package listas_enlazadas;

class ListaEnlazada {

    //dato actual q se tiene al llamar (se renombra a cada rato y solo queda el final aprox)
    Nodo cabeza;

    public ListaEnlazada() {
        //por defecto se hace null
        cabeza = null;
    }
    
    public void insertarInicio(int dato) { //sirve para inserta en el inciio
        //se crea un nuevo nodo con el dato para asignarle 
        Nodo nuevo = new Nodo(dato);

        //el nodo creado se altera la varibale sigueinte ,para q este este aputnando hacia la cabeza
        nuevo.siguiente = cabeza;
        //la cabeza se convierte en el nuevo o bueno ultimo nodo o dato ingresado
        cabeza = nuevo;
    }

    public void insertarFinal(int dato) {
        //se crea un nuevo nodo con el dato para asignarle
        Nodo nuevo = new Nodo(dato);

        //si la cabeza es igual a null entonde la cabeza sera el nuevo nodo(dato) q se creo y se sale de la funcion
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
         
        //si lo anteirori no se cumplio entonses se crea un nuevo nodo actual q se convertira en cabeza
        Nodo actual = cabeza;

        //se pasa todo para el inicio para q quede el final libre
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        //al final el ultimo se queda como el nuevo
        actual.siguiente = nuevo;
    }

    public void eliminarInicio() {
        //se elimina siempre y cuando exista un dato en los nodos
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        }
    }

    public void eliminar(int dato) {
        // si la cabeza es nullo (es poruqe no ahi nada ) se sale
        if (cabeza == null) {
            return;
        }
        
        //si la cabeza del dato es igual al dato se remplazara con la sigueinte cabeza
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        //se crea un nodo actual el caul sera la cabeza
        Nodo actual = cabeza;

        //si actual es difrente de nullo y el dato actual sguiente del nodo dato es diferente del dato q se quier elimnar
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            //el nodo actual se convierte en el actual siguiente 
            actual = actual.siguiente;
        }
        
        //si el nodo actual siguiente es diferente de null 
        if (actual.siguiente != null) {
            //entonces el actual sigueitne se convierte en el actual del siguiente nodo siguiente
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        //se crea un nodo temporal el actual sera desde la cabeza como indice
        
        while (actual != null) {
            ///reocrres todos los nodos mientras el actual sea diferente de null
            System.out.print(actual.dato + " -> ");
            //el nodo actual se convierte en el nodo siguiente
            actual = actual.siguiente;
        }
        //termina todo :v
        System.out.println("null");
    }
}
