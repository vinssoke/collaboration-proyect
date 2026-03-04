import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void añadirTarea(String descripcion) {

        listaTareas.add(new Tarea(descripcion));

    }

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

