package listas_enlazadas;

public class Main {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(5);
        System.out.println("mostranto datos isertados al inicio(10,20,5)");
        lista.mostrar();
        
        
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(10);
        System.out.println("mostranto datos isertados al final (20,30,10)");
        lista.mostrar();
        
        lista.eliminar(5);
        System.out.println("mostranto datos eliminado (5)");
        lista.mostrar();

        System.out.println("mostranto datos eliminado del inicio (en teoria 20)");
        lista.eliminarInicio();
        lista.mostrar();
    }
}