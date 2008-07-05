/**
 * 
 */
package sistema;

import modelo.P_SisRes;
import global.Grupo;
import global.Usuario;
import gui.G_Login;

/**
 * @author Miguel A. Diab
 *
 */
public class Inicio {

  /**
   * @param args
   */
  
  public static P_SisRes SisRes = new P_SisRes();
  public static G_Login ventana = new G_Login();
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ventana.setVisible(true);   
      
    cargarDatosInicio();
    
    //System.out.print("Prueba");
    
  }

  private static void cargarDatosInicio() {
    Grupo unGrupo = new Grupo();
    unGrupo.setId(1);
    unGrupo.setNombre("Otro");
    SisRes.Grupos.agregar(unGrupo);
    
    unGrupo = new Grupo();
    unGrupo.setId(0);
    unGrupo.setNombre("Administrador");
    SisRes.Grupos.agregar(unGrupo);

    Usuario unUsuario = new Usuario();
    unUsuario.setNombre("Mike");
    unUsuario.setClave("abc123");
    unUsuario.setGrupo(unGrupo);
    unUsuario.setId(1);
    SisRes.Usuarios.agregar(unUsuario);

  }
}
