package gui;

import global.Grupo;
import global.Usuario;

import java.util.ArrayList;

import modelo.P_Grupos;
import modelo.P_Usuarios;

public class Interfaz {
  /*
   *  Usuarios
   */
  
  public static boolean login(String usuario, char[] clave) {
    return P_Usuarios.login(usuario, clave);
  }
  public static ArrayList<Usuario> getUsuarios() {
    return P_Usuarios.getUsuarios();
  }
  public static Usuario getUsuarioPorNombre(String s) {
    return P_Usuarios.getUsuarioPorNombre(s);
  }  
  /*
   *  Grupos
   */
  public static ArrayList<Grupo> getGrupos() {
    return P_Grupos.getGrupos();
  }
  public static Grupo getGrupoPorNombre(String s) {
    return P_Grupos.getGrupoPorNombre(s);
  }    
}
