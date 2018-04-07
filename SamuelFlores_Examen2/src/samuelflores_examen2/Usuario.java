/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Samuel
 */
public class Usuario implements Serializable {
    private String nombre;
    private String correo;
    private Date fecha;
    private String usuario;
    private String contrasena;
    private Icon image;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, Date fecha, String usuario, String contrasena, Icon image) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return  "usuario=" + usuario + ", contrasena=" + contrasena;
    }
    
}
