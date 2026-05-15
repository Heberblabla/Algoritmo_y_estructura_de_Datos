package listas_enlazadas_simples;

import java.util.Scanner;

// ===== MAIN =====
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaEnlazada lista1 = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada();

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar en Lista 1");
            System.out.println("2. Mostrar Lista 1");
            System.out.println("3. Invertir Lista 1");
            System.out.println("4. Detectar ciclo");
            System.out.println("5. Crear ciclo");
            System.out.println("6. Insertar en Lista 2");
            System.out.println("7. Mostrar Lista 2");
            System.out.println("8. Fusionar listas");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Dato: ");
                    int d1 = sc.nextInt();
                    lista1.insertar(d1);
                    break;

                case 2:
                    lista1.mostrar();
                    break;

                case 3:
                    lista1.invertir();
                    break;

                case 4:
                    if (lista1.detectarCiclo()) {
                        System.out.println("La lista tiene ciclo");
                    } else {
                        System.out.println("La lista NO tiene ciclo");
                    }
                    break;

                case 5:
                    lista1.crearCiclo();
                    break;

                case 6:
                    System.out.print("Dato: ");
                    int d2 = sc.nextInt();
                    lista2.insertar(d2);
                    break;

                case 7:
                    lista2.mostrar();
                    break;

                case 8:
                    ListaEnlazada fusion
                            = ListaEnlazada.fusionar(
                                    lista1,
                                    lista2);

                    System.out.println("Lista fusionada:");
                    fusion.mostrar();
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }
}
