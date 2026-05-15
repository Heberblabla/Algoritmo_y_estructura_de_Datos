package listas_enlazadas_simples;

// ===== LISTA ENLAZADA =====
class ListaEnlazada {

    Nodo cabeza;

    // INSERTAR AL FINAL
    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);

        // seguridad NULL
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        // validar recorrido
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    // MOSTRAR LISTA
    public void mostrar() {

        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;
        }

        System.out.println("null");
    }

    // 1. INVERTIR LISTA
    public void invertir() {

        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {

            siguiente = actual.siguiente;

            actual.siguiente = anterior;

            anterior = actual;

            actual = siguiente;
        }

        cabeza = anterior;

        System.out.println("Lista invertida");
    }

    // 2. DETECTAR CICLO (FLOYD)
    public boolean detectarCiclo() {

        // seguridad NULL
        if (cabeza == null) {
            return false;
        }

        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        while (rapido != null &&
                rapido.siguiente != null) {

            lento = lento.siguiente;

            rapido = rapido.siguiente.siguiente;

            if (lento == rapido) {
                return true;
            }
        }

        return false;
    }

    // CREAR CICLO PARA PRUEBA
    public void crearCiclo() {

        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        // último apunta al inicio
        actual.siguiente = cabeza;

        System.out.println("Ciclo creado");
    }

    // 3. FUSIONAR LISTAS ORDENADAS
    public static ListaEnlazada fusionar(
            ListaEnlazada l1,
            ListaEnlazada l2) {

        ListaEnlazada fusion = new ListaEnlazada();

        Nodo a = l1.cabeza;
        Nodo b = l2.cabeza;

        while (a != null && b != null) {

            if (a.dato <= b.dato) {

                fusion.insertar(a.dato);

                a = a.siguiente;

            } else {

                fusion.insertar(b.dato);

                b = b.siguiente;
            }
        }

        // restantes de lista 1
        while (a != null) {

            fusion.insertar(a.dato);

            a = a.siguiente;
        }

        // restantes de lista 2
        while (b != null) {

            fusion.insertar(b.dato);

            b = b.siguiente;
        }

        return fusion;
    }
}
