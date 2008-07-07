package modelo;

import global.Usuario;

import java.util.ArrayList;


public class P_Usuarios {
  private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
  public static boolean login(String usuario, char[] clave) {
    Usuario miUsuario = P_Usuarios.getUsuarioPorId(usuario);
    String pass = new String(clave);
    if (miUsuario.getClave().equals(pass)) {
      P_SisRes.usuarioActual = miUsuario;    
      return true;
    }
    else
      return false;
  }
  
  public static boolean guardar(Usuario u) {
    int i = P_Usuarios.usuarios.indexOf(u);
        
    if (i==-1) {
      usuarios.add(u);
      return true;
    }
    else {
      usuarios.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Usuario u) {
    int i = P_Usuarios.usuarios.indexOf(u);
    if (i!=-1) {
      usuarios.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Usuario getUsuarioPorId(String id) {
    for (Usuario u : P_Usuarios.usuarios) {
      if (u.getId().equals(id))
        return u;
    }
    return null;
  }
  
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
