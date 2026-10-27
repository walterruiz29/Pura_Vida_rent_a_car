
package pura_vida_rent_a_car;


public class Cliente {
    public String nombre;
    private String cedula;
    private int telefono;
    private String correo_electronico;

    public Cliente(String nombre, String cedula, int telefono, String correo_electronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
    @Override
    public String toString() {
        return "Cliente [Nombre: " + nombre
                + ", Cedula: " + cedula
                + ", Telefono: " + telefono
                + ", Correo: " + correo_electronico + "]";
    }
    
}
