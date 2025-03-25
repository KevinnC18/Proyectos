
package vehiculos;

public abstract class Vehiculo {
    
    private String marca, submarca;
    private float km, vel, fren;
    private int modelo;      

    public Vehiculo(String marca, String submarca, float km, float vel, float fren, int modelo) {
        this.marca = marca;
        this.submarca = submarca;
        this.km = km;
        this.vel = vel;
        this.fren = fren;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getVel() {
        return vel;
    }

    public void setVel(float vel) {
        this.vel = vel;
    }

    public float getFren() {
        return fren;
    }

    public void setFren(float fren) {
        this.fren = fren;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    
    public abstract void acelerar();
    
    public abstract void frenar();
    
    
    public void mostrarDatos(){
        System.out.println("Marca: "+marca+", Submarca: "+submarca);
        System.out.println("Modelo: "+modelo+", Kilometraje: "+km+", 0-100: "+vel);
    }
}
