/**
 * @author Marco
 * @version 2.0
 * @since 2026
 */
public class Tarea {

    private String descripcion;

    private boolean completada;

    /**
     *
     * @param descripcion la descripcion de la tarea
     */
    public Tarea(String descripcion) {

        this.descripcion = descripcion;

        this.completada = false;

    }

    /**
     *
     * @return devuelve la descripcion de la tarea
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return devuelve la tarea completada
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     *
     * @param completada Modificar atributo completada a parámetro introducido ”completada”
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
/**
 *Rescribe el string marcando si esta completada o no
 */
    public String toString() {

        return "[" + (completada ? "X" : " ") + "] " + descripcion;

    }

}