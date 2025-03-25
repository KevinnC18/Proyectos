
package vehiculos;

public class Moto extends Vehiculo {

    public Moto(String marca, String submarca, float km, float vel, float fren, int modelo) {
        super(marca, submarca, km, vel, fren, modelo);
    }

    
    @Override
    public void acelerar(){
        System.out.println(getMarca()+" "+ getSubmarca() +" tiene una aceleracion de 0-100 en: "+ getVel() +"s");
    }
    
    public void frenar(){
        System.out.println(getMarca()+" "+ getSubmarca() +" tiene una distancia de frenado de 100-0 de: "+ getFren() +" metros");
    }
    
}
