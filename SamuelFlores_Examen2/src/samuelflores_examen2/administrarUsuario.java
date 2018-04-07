/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class administrarUsuario implements Serializable{
    private ArrayList<Usuario> listaUsuario = new ArrayList();
    private File archivo = null;

    public administrarUsuario(String path) {
        archivo = new File(path);
        
    }

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarUsuario{" + "listaUsuario=" + listaUsuario + ", archivo=" + archivo + '}';
    }
    public void cargarArchivo(){
        try {
            listaUsuario = new ArrayList();
            Usuario temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Usuario)objeto.readObject())!=null){
                        listaUsuario.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listaUsuario) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    
    
}
