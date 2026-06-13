/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tf.poo2;

/**
 *
 * @author herbe
 */
public class Ticket {
    private String nombre;
    private String hora;
    private String ubicacion;
    private String sala;
    private String tipo;
    
    /**
     * Constructor de la clase Ticket
     * 
     * @param nombre Nombre del comprador del ticket
     * @param hora Hora del evento
     * @param ubicacion Ubicación del evento
     * @param sala Sala del evento
     * @param tipo Tipo de ticket
     */
    public Ticket(String nombre, String hora, String ubicacion, String sala, String tipo) {
        this.nombre = nombre;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.sala = sala;
        this.tipo = tipo;
    }
    
    /**
     * Constructor vacío
     */
    public Ticket() {
    }
    
    /**
     * @return el nombre del comprador
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return la hora del evento
     */
    public String getHora() {
        return hora;
    }
    
    /**
     * @param hora la hora a establecer
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    /**
     * @return la ubicación del evento
     */
    public String getUbicacion() {
        return ubicacion;
    }
    
    /**
     * @param ubicacion la ubicación a establecer
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * @return la sala del evento
     */
    public String getSala() {
        return sala;
    }
    
    /**
     * @param sala la sala a establecer
     */
    public void setSala(String sala) {
        this.sala = sala;
    }
    
    /**
     * @return el tipo de ticket
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * @param tipo el tipo a establecer
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
