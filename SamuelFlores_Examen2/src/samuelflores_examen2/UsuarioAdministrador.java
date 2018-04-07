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
public class UsuarioAdministrador extends Usuario {
    private ArrayList<Publicaciones> publoqueadas = new ArrayList();
    private ArrayList<Usuarionormal>usubloqueados = new ArrayList();
   

    public UsuarioAdministrador() {
        super();
    }

    public UsuarioAdministrador(String nombre, String correo, Date fecha, String usuario, String contrasena, Icon image) {
        super(nombre, correo, fecha, usuario, contrasena, image);
        
    }
    
    

    public ArrayList<Publicaciones> getPubloqueadas() {
        return publoqueadas;
    }

    public void setPubloqueadas(ArrayList<Publicaciones> publoqueadas) {
        this.publoqueadas = publoqueadas;
    }

    public ArrayList<Usuarionormal> getUsubloqueados() {
        return usubloqueados;
    }

    public void setUsubloqueados(ArrayList<Usuarionormal> usubloqueados) {
        this.usubloqueados = usubloqueados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
