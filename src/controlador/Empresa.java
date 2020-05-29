/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author Barbero
 */
public class Empresa {
    
    private ArrayList<Usuario>usuarios;

    public Empresa() {
        usuarios = new ArrayList<>();
    }
    
    public void nuevoUsuario(String login, String contra, boolean tipo, String correo){
        usuarios.add(new Usuario(login,contra,tipo,correo));
    }
    
    public void nuevoUsuario(Usuario u){
        usuarios.add(u);
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public int buscarPosicionUsuario(String contra){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(contra.equalsIgnoreCase(usuarios.get(pos).getContra())){
                encontrado = true;
            }else{
                pos++;
            }
        }
        if(!encontrado){
            pos = -1;
        }
        return pos;
    }
    
    /* public boolean buscarUsuario(String login, String contra){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(usuarios.get(pos) != null){
                if(login.equalsIgnoreCase(usuarios.get(pos).getUsuario())
                        && contra.equalsIgnoreCase(usuarios.get(pos).getContra())){
                    encontrado = true;
                }else{
                    pos++;
                }
            }else{
                pos = usuarios.size();
            }
        }
        return encontrado;
    }
    
    public int nuevoUsuario(String login, String pass, boolean admin){
        int pos = buscarPosicion();
        if(pos == usuarios.size()){
            pos = -1; //no tengo espacio
        }else{
            if(buscarUsuario(login,pass)){
                pos = -2; //tengo espacio, pero ya existe
            }else{
                usuarios.add(pos, new Usuario(login,pass,admin));
                pos = 0; //cuando lo e podido hacer
            }
        }
        return pos;
    }
    
    public int buscarPosicion(){
        boolean encontrado = false;
        int pos = 0;
        while(pos < usuarios.size() && !encontrado){
            if(usuarios.get(pos) == null){
                encontrado = true;
            }else{
                pos++;
            }
        }
        return pos;
    }
    
    

    /*public Usuario[] getUsuarios() {
        return usuarios;
    }
    
    public int numeroElementos(){
        return usuarios.size();
    }
    
    public boolean saberAdmin(int pos){
        return usuarios.get(pos).isAdmin(); 
    }
    
    public String saberContra(int pos){
        return usuarios.get(pos).getContra(); 
    }
    
    public String saberUsuario(int pos){
        return usuarios.get(pos).getUsuario(); 
    }
    
    public void cambiarContra(int pos, String contra){
        usuarios.get(pos).setContra(contra);
    } */

}
