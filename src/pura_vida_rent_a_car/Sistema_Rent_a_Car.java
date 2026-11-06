package pura_vida_rent_a_car;

import java.util.ArrayList;
import java.util.Scanner; // ✅ 1. Importación agregada

public class Sistema_Rent_a_Car {
    //se crea esta clase para almacenar la informacion en Array List simulando una base de datos

    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Alquiler> alquileres;
    
    //se crea un constructor vacio y se inicializan los arrayList
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

    //metodo para mostrar vehiculos
    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    //metodo para mostrar clientes
    public void mostrarCliente() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    //metodo para mostrar alquileres
    public void mostrarAlquileres() {
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
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

 
    public void RegistroPago() {
        Scanner lectura = new Scanner(System.in); 
        
        System.out.println("===== REGISTRO DE PAGO =====");
        
        // Solicitar monto
        System.out.print("Digite el monto del pago: ");
        double monto = lectura.nextDouble();
        lectura.nextLine(); // Limpiar buffer
        
        // Solicitar método de pago
        System.out.print("Digite el método de pago (Efectivo/Tarjeta/Transferencia): ");
        String metodoPago = lectura.nextLine();
        
        // Solicitar nombre del cliente
        System.out.print("Digite el nombre del cliente: ");
        String nombreCliente = lectura.nextLine();
        
        // Solicitar ID de alquiler
        System.out.print("Digite el ID del alquiler: ");
        String idAlquiler = lectura.nextLine();
        
        // Crear el objeto RegistroPago con los datos ingresados
        RegistroPago pago = new RegistroPago(monto, metodoPago, nombreCliente, idAlquiler);
        
        // Registrar el pago
        pago.registrarPago();
        
        // Verificar estado
        pago.verificarEstado();
        
        // Mostrar historial completo
        RegistroPago.mostrarHistorial();
    }
}