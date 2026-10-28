package pura_vida_rent_a_car;
import java.util.ArrayList;
public class Sistema_Rent_a_Car {
    //se crea esta clase para almacenar la informacion en Array List simulando una base de datos

    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Alquiler> alquileres;
    
    
    //se crea un costructor vacio y se inicializan los arrayList
    public Sistema_Rent_a_Car(){
        
        clientes = new ArrayList<>();
        
        vehiculos = new ArrayList<>();
        
        alquileres = new ArrayList<>();
        
        
    }
    //metodo para registrar los clientes
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    
    }
    //metodo para registar los vehiculos
    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    
    }
    
    //metodo para registro de alquileres
    public void registrarAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
        
    }
    //metodo para mostarr vehiculos

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos)
        System.out.println(vehiculo);
    }
    //metodo para mostrar clientes
    public void mostrarCliente() {
        for (Cliente cliente : clientes)
        System.out.println(cliente);
    }
    //metodo para mostrar alquileres
    public void mostrarAlquileres() {
        for (Alquiler alquiler : alquileres)
        System.out.println(alquiler);
    }
    
    //metodo para buscar vehiculo
    public Vehiculo buscarVehiculo(int idVehiculo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.idVehiculo == idVehiculo) {
                return vehiculo;
            }
        }
        return null;
    }

    //metodo buscar cliente
    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

}


