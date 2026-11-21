package pura_vida_rent_a_car;

public class Contrato {
    private int idContrato;
    private Alquiler alquiler; // Relación con la clase Alquiler
    private String fechaInicio;
    private String fechaFin;
    private String estado; // "Activo", "Finalizado" o "Cancelado"
    private String observaciones;

    // Constructor parametrizado, todo contrato nuevo inicia como Activo
    public Contrato(int idContrato, Alquiler alquiler, String fechaInicio, String fechaFin, String observaciones) {
        this.idContrato = idContrato;
        this.alquiler = alquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observaciones = observaciones;
        this.estado = "Activo";
    }

    // Metodo para verificar si el contrato sigue vigente
    public boolean isActivo() {
        return estado.equals("Activo");
    }

    // Metodo para finalizar el contrato, el vehiculo vuelve a quedar disponible
    public boolean finalizar() {
        if (!isActivo()) {
            return false;
        }
        this.estado = "Finalizado";
        alquiler.getVehiculo().setDisponible(true);
        return true;
    }

    // Metodo para cancelar el contrato, el vehiculo vuelve a quedar disponible
    public boolean cancelar() {
        if (!isActivo()) {
            return false;
        }
        this.estado = "Cancelado";
        alquiler.getVehiculo().setDisponible(true);
        return true;
    }

    // --- Getters y Setters ---

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Contrato #" + idContrato
                + " | Alquiler #" + alquiler.getIdAlquiler()
                + " | Cliente: " + alquiler.getCliente().nombre
                + " | Vehiculo: " + alquiler.getVehiculo().getMarca()
                + " " + alquiler.getVehiculo().getModelo()
                + " | Inicio: " + fechaInicio
                + " | Fin: " + fechaFin
                + " | Estado: " + estado
                + " | Observaciones: " + observaciones;
    }
}
