/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Comentario extends Publicaciones {
    private String contenido;

    public Comentario() {
    }
    public Comentario(String contenido) {
        this.contenido = contenido;
    }
    public Comentario(String contenido, int id, String mensaje, String usuarioautor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioautor, privacidad, fecha);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Comentario{" + "contenido=" + contenido + '}';
    }
    
    
    
}
