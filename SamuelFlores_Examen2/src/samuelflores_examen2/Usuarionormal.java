/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Samuel
 */
public class Usuarionormal extends Usuario {
    private ArrayList<Publicaciones> publica = new ArrayList();
    private ArrayList<Usuarionormal>amigos = new ArrayList();
    private ArrayList<Usuarionormal>solicitudes = new ArrayList();
    public Usuarionormal() {
        super();
    }

    public Usuarionormal(String nombre, String correo, Date fecha, String usuario, String contrasena, Icon image) {
        super(nombre, correo, fecha, usuario, contrasena, image);
    }
    
    

    public ArrayList<Publicaciones> getPublica() {
        return publica;
    }

    public void setPublica(ArrayList<Publicaciones> publica) {
        this.publica = publica;
    }

    public ArrayList<Usuarionormal> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuarionormal> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Usuarionormal> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Usuarionormal solicitudes) {
        this.solicitudes.add(solicitudes);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
