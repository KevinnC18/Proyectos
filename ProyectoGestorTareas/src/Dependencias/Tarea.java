
package Dependencias;

public class Tarea {
    
    private String titulo, descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion, boolean completada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }
    
    public void marcarCompletada (){
        this.completada = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }
    
    //La anotación @Override asegura que estamos realmente sobrescribiendo un método existente.
    @Override
    public String toString(){
        return titulo + ": " + descripcion + (completada? "[Completada]":"[Incompleta]");
    }
    
}
