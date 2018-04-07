/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Publicaciones implements Serializable {
    private int id;
    private String mensaje;
    private String usuarioautor;
    private String privacidad;
    private Date fecha;

    public Publicaciones() {
    }
   public Publicaciones(String mensaje) {
        this.mensaje = mensaje;
    }

    public Publicaciones(int id, String mensaje, String usuarioautor, String privacidad, Date fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.usuarioautor = usuarioautor;
        this.privacidad = privacidad;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuarioautor() {
        return usuarioautor;
    }

    public void setUsuarioautor(String usuarioautor) {
        this.usuarioautor = usuarioautor;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  mensaje + " Autor: "+usuarioautor;
    }
    
}
