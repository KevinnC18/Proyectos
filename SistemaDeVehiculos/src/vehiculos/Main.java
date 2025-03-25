
package vehiculos;

public class Main {
    
    public static void main(String[] args) {
        
        Lista miVehiculo = new Lista();
            
        miVehiculo.agregarVehiculo(new Carro("Ferrari", "F40", 0, 4.1f, 38.5f, 2025));
        miVehiculo.agregarVehiculo(new Carro("Ford", "Fiesta", 15000, 11, 45, 2020));
        miVehiculo.agregarVehiculo(new Carro("Chevrolet", "Swift", 480000, 12, 51, 1978));
        miVehiculo.agregarVehiculo(new Carro("Mitsubishi", "Lancer Evolution X", 250000, 4.5f, 38, 2018));
        miVehiculo.agregarVehiculo(new Moto("BMW", "S1000 RR", 0, 3.5f, 41.3f, 2025));
        miVehiculo.agregarVehiculo(new Moto("Kawasaki", "Ninja 400", 10000, 4.6f, 40, 2024));
        miVehiculo.agregarVehiculo(new Moto("Ducati", "Monster 821", 250000, 3.4f, 44.8f, 2021));
        miVehiculo.agregarVehiculo(new Moto("KTM", "Duke 390", 28000, 5.5f, 42, 2023));
        
        miVehiculo.mostrarVehiculo();
    }
    
}
