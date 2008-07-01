package modelo;

import global.Usuario;

import java.util.ArrayList;


public class pUsuarios {
  private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
  public static boolean login(String usuario, char[] clave) {
    Usuario miUsuario = pUsuarios.obtenerPorNombre(usuario);
    String pass = new String(clave);
    if (miUsuario.getClave().equals(pass))
      return true;
    else
      return false;
  }
  
  public boolean agregar(Usuario u) {
    usuarios.add(u);
    return true;
  }
  
/*private Usuario obtenerPorId(int id) {
    for (Usuario u : pUsuarios.usuarios) {
      if (u.getId()==id)
        return u;
    }
    return null;
  }
  */
  private static Usuario obtenerPorNombre(String nombre) {
    for (Usuario u : pUsuarios.usuarios) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Usuario> getUsuarios() {
    return pUsuarios.usuarios;
  }
  
}
