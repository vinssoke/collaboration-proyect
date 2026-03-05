import java.util.ArrayList;

/**
 * @author Celeste
 * @version 2.0
 * @since 2026
 */
public class GestorTareas {
    private ArrayList<Tarea> listaTareas;

    /**
     * metodo para inicializar el array
     */
    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    /**
     *
     * @param descripcion metodo para añadir tarea
     */
    public void añadirTarea(String descripcion) {

        listaTareas.add(new Tarea(descripcion));

    }

    /**
     * metodo para mostrar tarea,si la lista esta vacia nos avisa
     */
    public void mostrarTareas() {

        if (listaTareas.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < listaTareas.size(); i++) {
                System.out.println((i + 1) + ". " + listaTareas.get(i));
            }
        }
    }
}

