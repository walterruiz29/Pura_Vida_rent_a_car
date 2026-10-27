
package pura_vida_rent_a_car;



public class Vehiculo {

    public int idVehiculo;
    public String marca;
    private String modelo;
    private int kilometraje;
    private String color;

    public Vehiculo(int idVehiculo, String marca, String modelo, int kilometraje, String color) {

        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
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


}
