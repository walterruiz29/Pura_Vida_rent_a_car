
package pura_vida_rent_a_car;

public class Alquiler {
    private int idAlquiler;
    private Cliente cliente;   // Relación con la clase Cliente
    private Vehiculo vehiculo; // Relación con la clase Vehiculo
    private int diasAlquiler;
    private double costoTotal;

    // Constructor parametrizado
    public Alquiler(int idAlquiler, Cliente cliente, Vehiculo vehiculo, int diasAlquiler) {
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diasAlquiler = diasAlquiler;
        this.costoTotal = calcularCostoTotal(); // Calcula el costo automáticamente
    }

    // Método privado para calcular el costo total del alquiler
    private double calcularCostoTotal() {
        double tarifaDiaria = 45.0; // Puedes ajustar la tarifa diaria según prefieras
        return this.diasAlquiler * tarifaDiaria;
    }

    // --- Getters y Setters ---

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
        this.costoTotal = calcularCostoTotal(); // Se actualiza si cambian los días
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    // Método toString para visualizar la información del alquiler fácilmente
    @Override
    public String toString() {
        return "Alquiler #" + idAlquiler + 
               " | Cliente: " + cliente.nombre + 
               " | Vehículo: " + vehiculo.marca + " " + vehiculo.getModelo() + 
               " | Días: " + diasAlquiler + 
               " | Costo Total: $" + costoTotal;
    }
}