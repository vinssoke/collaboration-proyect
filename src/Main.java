import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GestorTareas gestor = new GestorTareas();

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\n--- MENÚ DE TAREAS ---");

            System.out.println("1. Nueva Tarea");

            System.out.println("2. Listar Tareas");

            System.out.println("3. Salir");

            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Escribe la tarea: ");

                    gestor.añadirTarea(entrada.nextLine());

                    break;

                case 2:

                    gestor.mostrarTareas();

                    break;
                case 3:

                    System.out.println("Saliendo...");

                    break;

            }

        }

    }

}