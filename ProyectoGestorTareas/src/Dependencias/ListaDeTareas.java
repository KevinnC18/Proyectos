
package Dependencias;

import java.util.ArrayList;

public class ListaDeTareas {
    //Declaracion del ArrayList (Lista)
    private ArrayList<Tarea> tareas;
    //Iniaciacion de la lista
    public ListaDeTareas (){
        tareas = new ArrayList<>();
    }
    
    public void agregarTarea(String titulo, String descripcion, boolean completada) {
    tareas.add(new Tarea(titulo, descripcion, completada));
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas, intente agregar una nueva tarea");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public void marcarCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
}
