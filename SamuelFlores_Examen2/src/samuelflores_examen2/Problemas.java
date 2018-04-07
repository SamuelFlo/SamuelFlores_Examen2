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
public class Problemas extends Publicaciones {
    private ArrayList<Respuesta>resultado = new ArrayList();
    private String estado;
    private String categoria;

    public Problemas() {
    }

    public Problemas(String estado, String categoria, int id, String mensaje, String usuarioautor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioautor, privacidad, fecha);
        this.estado = estado;
        this.categoria = categoria;
    }

    public ArrayList<Respuesta> getResultado() {
        return resultado;
    }

    public void setResultado(ArrayList<Respuesta> resultado) {
        this.resultado = resultado;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Problemas{" + "resultado=" + resultado + ", estado=" + estado + ", categoria=" + categoria + '}';
    }
    
}
