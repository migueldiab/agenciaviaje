package modelo;

import global.Usuario;

import java.util.ArrayList;


public class P_Usuarios {
  private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
  public static boolean login(String usuario, char[] clave) {
    Usuario miUsuario = P_Usuarios.getUsuarioPorNombre(usuario);
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
  public static Usuario getUsuarioPorNombre(String nombre) {
    for (Usuario u : P_Usuarios.usuarios) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Usuario> getUsuarios() {
    return P_Usuarios.usuarios;
  }
  
}
