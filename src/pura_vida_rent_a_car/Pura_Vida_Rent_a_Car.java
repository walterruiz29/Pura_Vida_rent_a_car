package pura_vida_rent_a_car;

import java.util.Scanner;

public class Pura_Vida_Rent_a_Car {
//se crea un menu donde el usuario puede seleccionar cualquier opcion que desee 

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        Sistema_Rent_a_Car sistema = new Sistema_Rent_a_Car();

        int opcion;

        do {

            System.out.println("===== PURA VIDA RENT A CAR =====");
            System.out.println("");
            System.out.println("== Menu principal ==");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar vehiculo");
            System.out.println("3. Registrar alquiler");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Mostrar vehiculos");
            System.out.println("6. Mostrar alquileres");
            System.out.println("7. Registrar mantenimientos");
            System.out.println("8. Mostrar mantenimientos");
            System.out.println("9. Registrar pago");
            System.out.println("10. Salir");
            System.out.println("");
            System.out.println("Seleccione una opcion para continuar: ");

            opcion = lectura.nextInt();
            lectura.nextLine();

            //se utiliza un switch para decidir que hacer segun la opcion seleccionada
            switch (opcion) {

                case 1:

                    //en el case 1 mediante el Scanner le solicitamos al usuario que ingrese los datos del nuevo cliente y creamos el nuevo cliente
                    System.out.print("Digite el nombre: ");
                    String nombre = lectura.nextLine();

                    System.out.print("Digite la cedula: ");
                    String cedula = lectura.nextLine();

                    System.out.print("Digite el telefono: ");
                    int telefono = lectura.nextInt();
                    lectura.nextLine();

                    System.out.print("Digite el correo: ");
                    String correo = lectura.nextLine();

                    Cliente cliente = new Cliente(nombre, cedula, telefono, correo);

                    sistema.registrarCliente(cliente);

                    System.out.println("Cliente registrado correctamente.");
                    System.out.println("");
                    break;

                case 2:
                    /*en el case 2 si el usuario selecciona la opcion 2 abre un submenu donde le solicita el tipo de vehiculo a registar 
                    segun lo seleccionado solicita los datos del nuevo vehiculo y creamos el nuevo vehiculo*/
                    System.out.println("===== REGISTRO DE VEHICULOS =====");
                    System.out.println("1. Sedan");
                    System.out.println("2. SUV");
                    System.out.println("3. Moto");

                    int tipoVehiculo = lectura.nextInt();
                    lectura.nextLine();                    
                    
                 
                    switch (tipoVehiculo) {
                        
                        case 1:{
                            // Sedan
                            System.out.print("ID del vehiculo: ");
                            int idVehiculo = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Marca: ");
                            String marca = lectura.nextLine();

                            System.out.print("Modelo: ");
                            String modelo = lectura.nextLine();

                            System.out.print("Kilometraje: ");
                            int kilometraje = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Color: ");
                            String color = lectura.nextLine();

                            System.out.print("Numero de puertas: ");
                            int numeroPuertas = lectura.nextInt();

                            Sedan sedan = new Sedan(idVehiculo, marca, modelo, kilometraje, color, numeroPuertas);

                            sistema.registrarVehiculo(sedan);

                            System.out.println("Sedan registrado correctamente.");
                            System.out.println("");
                            break;
                        }
                        
                        /*en este caso se ve la particularidad del atributo tiene traccion 4x4 donde implementamos una pregunta al usuario 
                        si el vehiculo tiene traccion 4x4 y mediante el condicional if implementamos si es true o false 
                        */

                        case 2:{
                            // SUV
                            System.out.print("ID del vehiculo: ");
                            int idVehiculo = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Marca: ");
                            String marca = lectura.nextLine();

                            System.out.print("Modelo: ");
                            String modelo = lectura.nextLine();

                            System.out.print("Kilometraje: ");
                            int kilometraje = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Color: ");
                            String color = lectura.nextLine();

                            System.out.println("¿Tiene traccion 4x4?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            int opcion4x4 = lectura.nextInt();

                            boolean tieneTraccion4x4;

                            if (opcion4x4 == 1) {
                                tieneTraccion4x4 = true;
                            } else {
                                tieneTraccion4x4 = false;
                            }

                            SUV suv = new SUV(idVehiculo,marca,modelo,kilometraje,color,tieneTraccion4x4);

                            sistema.registrarVehiculo(suv);

                            System.out.println("SUV registrado correctamente.");
                            System.out.println("");
                            break;
                        }
                        
                        /*en este caso ingresamos la informacion de la moto y creamos la nueva moto*/

                        case 3:{
                            // Moto
                            System.out.print("ID del vehiculo: ");
                            int idVehiculo = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Marca: ");
                            String marca = lectura.nextLine();

                            System.out.print("Modelo: ");
                            String modelo = lectura.nextLine();

                            System.out.print("Kilometraje: ");
                            int kilometraje = lectura.nextInt();
                            lectura.nextLine();

                            System.out.print("Color: ");
                            String color = lectura.nextLine();

                            System.out.print("Cilindraje: ");
                            int cilindraje = lectura.nextInt();

                            Moto moto = new Moto(idVehiculo, marca, modelo, kilometraje, color, cilindraje);

                            sistema.registrarVehiculo(moto);

                            System.out.println("Moto registrada correctamente.");
                            System.out.println("");
                            break;
                        }

                    }

                    break;

                case 3: {
                    /*en este caso se resgistra el alquiler de el vehiculo solicitando un id de alquiler, cedula del cliente, id del vehiculo, cantidad de dias a alquilar*/

                    System.out.println("===== REGISTRO DE ALQUILER =====");

                    System.out.print("ID del alquiler: ");
                    int idAlquiler = lectura.nextInt();
                    lectura.nextLine();

                    System.out.print("Cedula del cliente: ");
                    String cedulaCliente = lectura.nextLine();

                    Cliente clienteEncontrado = sistema.buscarCliente(cedulaCliente);

                    if (clienteEncontrado == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }

                    System.out.print("ID del vehiculo: ");
                    int idVehiculo = lectura.nextInt();

                    Vehiculo vehiculoEncontrado = sistema.buscarVehiculo(idVehiculo);

                    if (vehiculoEncontrado == null) {
                        System.out.println("Vehiculo no encontrado.");
                        break;
                    }

                    System.out.print("Cantidad de dias de alquiler: ");
                    int diasAlquiler = lectura.nextInt();

                    Alquiler alquiler = new Alquiler(idAlquiler,clienteEncontrado,vehiculoEncontrado,diasAlquiler);

                    sistema.registrarAlquiler(alquiler);

                    System.out.println("Alquiler registrado correctamente.");

                    break;
                }
                    
                 case 4: {
                     sistema.mostrarCliente();
                     System.out.println("");
                }
    

                case 5:{
                    sistema.mostrarVehiculos();
                    System.out.println("");
                    break;
                }

                case 6:{
                    sistema.mostrarAlquileres();
                    System.out.println("");
                    break;
                }
                
                 case 7:{
    
                 
                    // Registro de mantenimiento
                    System.out.println("===Registro de mantenimiento: ");
                    
                    System.out.println("ID del mantenimiento: ");
                    int idMantenimiento = lectura.nextInt();
                    lectura.nextLine();
                    
                    System.out.println("ID del vehiculo");
                    int idVehiculoMantenimiento = lectura.nextInt();
                    lectura.nextLine();
                    
                    Vehiculo vehiculoMantenimiento = sistema.buscarVehiculo(idVehiculoMantenimiento);
                    
                    if (vehiculoMantenimiento == null){
                    System.out.println("Vehiculo no encontrado");
                    break;
                    }
                  
                    System.out.println("Descripcion del mantenimiento");
                    String descripcion = lectura.nextLine();
                    
                    System.out.println("Fecha del mantenimiento: ");
                    String fecha = lectura.nextLine();
                    
                    System.out.println("Costo del mantenimiento: ");
                    double costo = lectura.nextDouble();
                    
                    Mantenimiento mantenimiento = new Mantenimiento(idMantenimiento, vehiculoMantenimiento, descripcion, fecha, costo);
                    
                    sistema.registrarMantenimiento(mantenimiento);
                    System.out.println("Mantenimiento registrado correctamente");
                    System.out.println("");
                    break;
                }
                 case 8: {
                    sistema.mostrarMantenimientos();
                    System.out.println("");
                    break;
                }

                case 9:{
                    sistema.RegistroPago();
                    System.out.println("");
                    break;
                }
               
                     
                
                    
                case 10:{
                    System.out.println("Gracias por usar el sistema.");
                    System.out.println("");
                    break;
                }

                default:
                    System.out.println("Opcion no valida.");
                    System.out.println("");

            }

            }while (opcion != 10);

                }
            }
