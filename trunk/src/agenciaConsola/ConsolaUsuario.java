package agenciaConsola;

import java.util.ArrayList;

import utils.Consola;
import utils.I18n;
import usuarios.CtrlUsuario;
import usuarios.TipoUsuario;
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
    Usuario tmpUsuario = new Usuario();
    int idTipo = 0;
    boolean validarContrasena = false;
    
    Consola.println("Crear nuevo Usuario");
    tmpUsuario.set_Id(Consola.leer("ID Usuario : "));
    unUsuario = CtrlUsuario.BuscarUsuarioPorID(tmpUsuario.get_Id());
    if (unUsuario.get_Id().toString()!="") {
      if (Consola.leer("El usuario ya existe, desea modificar? S/N")
    		  .toUpperCase().equals(I18n.NO)) {
        return;
      }
    }
    else {
      unUsuario.set_Id(tmpUsuario.get_Id());
    }
    tmpUsuario.set_Nombre(Consola.leer("Nombre",unUsuario.get_Nombre()));
    tmpUsuario.set_Apellido(Consola.leer("Apellido",unUsuario.get_Apellido()));
    ArrayList<TipoUsuario> tipoUsuarios = CtrlUsuario.GetSortedTiposUsuario();
    //idTipo = Consola.menu(tipoUsuarios, unUsuario);
    tmpUsuario.set_Tipo(CtrlUsuario.GetTipoUsuarioAModificar(idTipo));
    //Consola.leer("Tipo",unUsuario.get_Tipo().toString());
    //unUsuario.set_Tipo();
    tmpUsuario.set_Password(Consola.leer("Contraseña"));
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
    
    if (Consola.leer("Confirma guardar usuario? S/N")
    		.toUpperCase().equals(I18n.SI)) {
      Consola.println("Guardando Usuario");
      unUsuario.set_Nombre(tmpUsuario.get_Nombre());
      unUsuario.set_Apellido(tmpUsuario.get_Apellido());
      unUsuario.set_Tipo(tmpUsuario.get_Tipo());
      unUsuario.set_Password(tmpUsuario.get_Password());
      
      InterfazAgencia.AgregarUsuario(unUsuario);
    }
    else {
      Consola.println("Descartando cambios");
    }
  }
}
