package main;

import java.util.Scanner;

public class Main {

    static ColaCircular c1 = new ColaCircular(3);
    static ColaLista c2 = new ColaLista();
    static ColaPrioridad c3 = new ColaPrioridad(3);

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static public void menu() {
        System.out.println("Donde desea ir?");
        System.out.println("1- Cola Circular");
        System.out.println("2- Cola Lista Enlazada?");
        System.out.println("3- Cola Prioridad");
        System.out.print("-->");
        int dato = leer.nextInt();
        if (dato == 1) {
            menu1();
        } else if (dato == 2) {
            menu2();
        } else if (dato == 3) {
            menu3();
        }
    }

    static public void menu1() {
        while (true) {
            System.out.println("que desea hacer?");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar Dato");
            System.out.println("3- Mostrar");
            System.out.println("4- Retroceder");
            System.out.print("-->");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el dato");
                    System.out.print("-->");
                    opcion = leer.nextInt();
                    c1.enqueue(opcion);
                    c1.mostrar();
                    break;
                case 2:
                    c1.dequeue();
                    c1.mostrar();
                    break;
                case 3:
                    c1.mostrar();
                    break;
                case 4:
                    menu();

            }
        }

    }

    static public void menu2() {
        while (true) {
            System.out.println("que desea hacer?");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar un dato");
            System.out.println("3- Mostrar");
            System.out.println("4- Retroceder");
            System.out.print("-->");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el dato");
                    System.out.print("-->");
                    opcion = leer.nextInt();
                    c2.enqueue(opcion);
                    c2.mostrar();
                    break;
                case 2:
                    c2.dequeue();
                    c2.mostrar();
                    break;
                case 3:
                    c2.mostrar();
                    break;
                case 4:
                    menu();

            }
        }
    }

    static public void menu3() {
        while (true) {
            System.out.println("que desea hacer?");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar");
            System.out.println("3- Mostrar");
            System.out.println("4- Retroceder");
            System.out.print("-->");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el dato");
                    System.out.print("-->");
                    opcion = leer.nextInt();
                    c3.enqueue(opcion);
                    c3.mostrar();
                    break;
                case 2:
                    c3.dequeue();
                    c3.mostrar();
                    break;
                case 3:
                    c3.mostrar();
                    break;
                case 4:
                    menu();

            }
        }
    }
}
