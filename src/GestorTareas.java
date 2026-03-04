import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {

        this.listaTareas = new ArrayList<>();

    }

    public void añadirTarea(String descripcion) {

        listaTareas.add(new Tarea(descripcion));

    }
}