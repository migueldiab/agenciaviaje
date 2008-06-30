package controlador;

import modelo.pUsuarios;

public class cUsuario {
  public static boolean login(String usuario, char[] clave) {
    return pUsuarios.login(usuario, clave);
  }
}
