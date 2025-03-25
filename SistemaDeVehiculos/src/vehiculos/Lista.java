
package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    
    private List<Vehiculo> vehiculo;

    public Lista() {
        this.vehiculo = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculos){
        vehiculo.add(vehiculos);
    }
   
    
    public void mostrarVehiculo(){
        System.out.println("VEHICULOS EN EL CONCESIONARIO");
        //La i ayuda a recorrer toda la lista
        for (Vehiculo i: vehiculo){
            i.mostrarDatos();
            i.acelerar();
            i.frenar();
            System.out.println("-----------------------------------------------");
            
        }
    }
}
