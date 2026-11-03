package pura_vida_rent_a_car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroPago {

    // Atributos
    private int idPago;
    private double monto;
    private String metodoPago; // "Efectivo", "Tarjeta", "Transferencia"
    private LocalDate fechaPago;
    private boolean pagado;
    private String clienteNombre;
    private String vehiculoPlaca;

    // Lista para guardar todos los pagos registrados
    private static List<RegistroPago> historialPagos = new ArrayList<>();
    private static int contadorId = 1;

    // Constructor
    public RegistroPago(double monto, String metodoPago, String clienteNombre, String vehiculoPlaca) {
        this.idPago = contadorId++;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = LocalDate.now();
        this.pagado = false;
        this.clienteNombre = clienteNombre;
        this.vehiculoPlaca = vehiculoPlaca;
    }

    // Método para registrar el pago
    public void registrarPago() {
        if (monto <= 0) {
            System.out.println("❌ Error: El monto debe ser mayor a cero.");
            return;
        }
        this.pagado = true;
        historialPagos.add(this);
        System.out.println("✅ Pago registrado exitosamente:");
        System.out.println("   ID Pago: " + idPago);
        System.out.println("   Cliente: " + clienteNombre);
        System.out.println("   Vehículo: " + vehiculoPlaca);
        System.out.println("   Monto: $" + monto);
        System.out.println("   Método: " + metodoPago);
        System.out.println("   Fecha: " + fechaPago);
    }

    // Método para verificar estado del pago
    public void verificarEstado() {
        if (pagado) {
            System.out.println("✔️ Pago #" + idPago + " está PAGADO.");
        } else {
            System.out.println("⚠️ Pago #" + idPago + " está PENDIENTE.");
        }
    }

    // Método estático para ver todo el historial
    public static void mostrarHistorial() {
        System.out.println("\n=== HISTORIAL DE PAGOS ===");
        if (historialPagos.isEmpty()) {
            System.out.println("No hay pagos registrados.");
        } else {
            for (RegistroPago p : historialPagos) {
                System.out.println("ID: " + p.idPago + " | Cliente: " + p.clienteNombre
                        + " | Monto: $" + p.monto + " | Método: " + p.metodoPago
                        + " | Fecha: " + p.fechaPago);
            }
        }
        System.out.println("=========================\n");
    }

    // Getters
    public int getIdPago() { return idPago; }
    public double getMonto() { return monto; }
    public boolean isPagado() { return pagado; }
}

