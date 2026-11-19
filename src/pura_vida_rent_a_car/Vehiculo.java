package pura_vida_rent_a_car;

public class Vehiculo {

    public int idVehiculo;
    public String marca;
    public String modelo;
    public int kilometraje;
    public String color;
    public boolean disponible;

    public Vehiculo(int idVehiculo, String marca, String modelo, int kilometraje, String color) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.disponible = true;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo [ID: " + idVehiculo + ", Marca: " + marca + ", Modelo: " + modelo +
               ", Kilometraje: " + kilometraje + ", Color: " + color +
               ", Disponible: " + (disponible ? "Sí" : "No") + "]";
    }
}