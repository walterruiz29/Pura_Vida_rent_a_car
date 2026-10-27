package pura_vida_rent_a_car;

public class Sedan extends Vehiculo {
    private int numeroPuertas;

    // Constructor que reutiliza el de la clase padre con 'super'
    public Sedan(int idVehiculo, String marca, String modelo, int kilometraje, String color, int numeroPuertas) {
        super(idVehiculo, marca, modelo, kilometraje, color);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Sedan [ID: " + idVehiculo + ", Marca: " + marca + ", Modelo: " + getModelo() + 
               ", Kilometraje: " + getKilometraje() + ", Color: " + getColor() + 
               ", Puertas: " + numeroPuertas + "]";
    }
}