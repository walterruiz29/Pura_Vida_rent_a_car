/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pura_vida_rent_a_car;

/**
 *
 * @author danie
 */
public class Mantenimiento {
    private int idMantenimiento;
    private Vehiculo vehiculo;
    private String descripcion;
    private String fecha;
    private double costo;
    
    public Mantenimiento(int idMantenimiento, Vehiculo vehiculo, String descripcion, String fecha, double costo){
        this.idMantenimiento = idMantenimiento;
        this.vehiculo = vehiculo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.costo = costo;
    }
    public int getIdMantenimiento (){
        return idMantenimiento;
    }
    
    public void setIdMantenimiento(int idMantenimiento){
        this.idMantenimiento = idMantenimiento;
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
       
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Mantenimiento #" + idMantenimiento
                + " | Vehiculo: " + vehiculo.getModelo()
                + " " + vehiculo.getModelo()
                + " | Descripcion: " + descripcion
                + " | Fecha: " + fecha
                + " | Costo: $" + costo;
    }

    
}
