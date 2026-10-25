package pura_vida_rent_a_car;

public class Moto extends Vehiculo {
    private int cilindraje; // Ej: 150, 250, 500 cc

    public Moto(int idVehiculo, String marca, String modelo, int kilometraje, String color, int cilindraje) {
        super(idVehiculo, marca, modelo, kilometraje, color);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto [ID: " + idVehiculo + ", Marca: " + marca + ", Modelo: " + getModelo() + 
               ", Kilometraje: " + getKilometraje() + ", Color: " + getColor() + 
               ", Cilindraje: " + cilindraje + "cc]";
    }
}