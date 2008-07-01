package controlador;

import global.Usuario;

import java.util.ArrayList;

import modelo.pUsuarios;

public class cUsuario {
  public static boolean login(String usuario, char[] clave) {
    return pUsuarios.login(usuario, clave);
  }
  public static ArrayList<Usuario> getUsuarios() {
    return pUsuarios.getUsuarios();
  }
}
