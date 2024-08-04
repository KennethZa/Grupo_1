package clases;

public class EventoPrivado {

    private String id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private String Direccion;
    private String tipoEvento;
    private String fechaEvento;
    private String horaEvento;
    private String paquete;
    private String tipoPago;
   
    
    public EventoPrivado(){    
    }

    public EventoPrivado(String id, String nombre,String cedula, String telefono, String correo, String Direccion, String tipoEvento, String fechaEvento, String horaEvento, String paquete, String tipoPago) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.Direccion = Direccion;
        this.tipoEvento = tipoEvento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.paquete = paquete;
        this.tipoPago = tipoPago;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
        /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EventoPrivado{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo + ", Direccion=" + Direccion + ", tipoEvento=" + tipoEvento + ", fechaEvento=" + fechaEvento + ", horaEvento=" + horaEvento + ", paquete=" + paquete + ", tipoPago=" + tipoPago + '}';
    }


}
