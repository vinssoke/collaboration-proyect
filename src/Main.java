import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("\n--- MENÚ DE TAREAS ---");
            System.out.println("1. Nueva Tarea");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    String texto = entrada.nextLine();
                    gestor.añadirTarea(texto);
                    System.out.println("Tarea guardada.");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}