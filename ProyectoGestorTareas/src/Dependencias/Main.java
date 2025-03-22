
package Dependencias;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ListaDeTareas lista = new ListaDeTareas();
        
        int opcion =0;
        while (opcion !=5){
            System.out.println("");
            System.out.println(" === Menú de gestor de tareas === ");
            System.out.println("1. Mostrar tareas");
            System.out.println("2. Agregar tareas");
            System.out.println("3. Marcar tareas como completadas");
            System.out.println("4. Eliminar tareas");
            System.out.println("5. Salir");
            System.out.print("Por favor ingrese una opcion (1-5): ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion){
                case 1: 
                    lista.mostrarTareas();
                    break;
                case 2:
                    System.out.print("Ingrese el título de la tarea: ");
                    String titulo = entrada.nextLine();
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = entrada.nextLine();
                    lista.agregarTarea(titulo, descripcion, false);
                    System.out.println("Tarea agregada.");
                    break;
                case 3: 
                    lista.mostrarTareas();
                    System.out.print("Ingrese el numero de la tarea que quiere marcar como completada: ");
                    int indiceCompletar = entrada.nextInt()-1;
                    lista.marcarCompletada(indiceCompletar);
                    break;
                case 4: 
                    lista.mostrarTareas();
                    System.out.print("Ingrese el numero de la tarea que quiera eliminar: ");
                    int indiceEliminar = entrada.nextInt()-1;
                    lista.eliminarTarea(indiceEliminar);
                    break;
                case 5: 
                    System.out.println("Gracias por utilizar nuestros servicios de tareas, ¡vuelva pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intentelo nuevamente");
                    break;
            }
        }
        entrada.close();
    }
    
    
}
