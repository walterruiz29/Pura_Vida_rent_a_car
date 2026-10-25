package pura_vida_rent_a_car;

public class SUV extends Vehiculo {
    private boolean tieneTraccion4x4;

    public SUV(int idVehiculo, String marca, String modelo, int kilometraje, String color, boolean tieneTraccion4x4) {
        super(idVehiculo, marca, modelo, kilometraje, color);
        this.tieneTraccion4x4 = tieneTraccion4x4;
    }

    public boolean isTieneTraccion4x4() {
        return tieneTraccion4x4;
    }

    public void setTieneTraccion4x4(boolean tieneTraccion4x4) {
        this.tieneTraccion4x4 = tieneTraccion4x4;
    }

    @Override
    public String toString() {
        return "SUV [ID: " + idVehiculo + ", Marca: " + marca + ", Modelo: " + getModelo() + 
               ", Kilometraje: " + getKilometraje() + ", Color: " + getColor() + 
               ", 4x4: " + (tieneTraccion4x4 ? "Sí" : "No") + "]";
    }
}