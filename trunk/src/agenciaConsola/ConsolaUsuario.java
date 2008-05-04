package agenciaConsola;

import utils.Consola;
import usuarios.Usuario;
import agenciaDomain.InterfazAgencia;


/**
 *  
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @since 0.05alpha 05/05/2008
 */
public class ConsolaUsuario {
  /**
   *  
   * @author Alejandro Winkler - Miguel Diab
   * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
   * @since 0.05alpha 05/05/2008
   */
  public static void nuevoUsuario() {
    Usuario unUsuario = new Usuario();
    // String contrasena = "";
    // boolean validarContrasena = false;
    
    Consola.println("Crear nuevo Usuario");
    unUsuario.set_Id(Consola.leer("ID Usuario : "));
    // Buscar si usuario existe aca
    if (unUsuario.get_Nombre()!="") {
      if (Consola.leer("El usuario ya existe, desea modificar? S/N")=="S") {
        return;
      }
    }
    unUsuario.set_Nombre(Consola.leer("Nombre",unUsuario.get_Nombre()));
    unUsuario.set_Apellido(Consola.leer("Apellido",unUsuario.get_Apellido()));
    //Consola.leer("Tipo",unUsuario.get_Tipo().toString());
    //unUsuario.set_Tipo();
    unUsuario.set_Password(Consola.leer("Contraseña"));
      /*
    do {
       if (Consola.leer("Contraseña")==contrasena) {
        unUsuario.set_Password(contrasena);
        validarContrasena = true;
      }
      else {
        Consola.println(contrasena);
        Consola.println("La contraseña no verifica, por favor reintente");
      }
    } while (!validarContrasena);
       */
    String texto= Consola.leer("Confirma guardar usuario? S/N");
    Consola.println(texto);
    if (texto=="S") {
      Consola.println("Guardando Usuario");
      InterfazAgencia.AgregarUsuario(unUsuario);
    }
    else {
      Consola.println("Descartando cambios");      
    }
  }
}
