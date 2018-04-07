/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Respuesta extends Publicaciones {
    private ArrayList<Integer>calificaciones = new ArrayList();
    private int calificaciongeneral;
    private ArrayList<Comentario> comentarios = new ArrayList();

    public Respuesta() {
    }

    public Respuesta(String  mensaje) {
        super(mensaje);
    }
    

    public Respuesta(int calificaciongeneral, int id, String mensaje, String usuarioautor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioautor, privacidad, fecha);
        this.calificaciongeneral = calificaciongeneral;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificaciongeneral() {
        return calificaciongeneral;
    }

    public void setCalificaciongeneral(int calificaciongeneral) {
        this.calificaciongeneral = calificaciongeneral;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "calificaciones=" + calificaciones + ", calificaciongeneral=" + calificaciongeneral + ", comentarios=" + comentarios + '}';
    }
    
    
}
