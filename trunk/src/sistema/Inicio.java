/**
 * 
 */
package sistema;

import modelo.pSisRes;
import global.Usuario;
import gui.Login;

/**
 * @author Miguel A. Diab
 *
 */
public class Inicio {

  /**
   * @param args
   */
  
  public static pSisRes SisRes = new pSisRes();
  public static Login ventana = new Login();
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ventana.setVisible(true);   
      
    cargarDatosInicio();
    
    //System.out.print("Prueba");
    
  }

  private static void cargarDatosInicio() {
    Usuario unUsuario = new Usuario();
    unUsuario.setNombre("Mike");
    unUsuario.setClave("abc123");
    unUsuario.setGrupo(null);
    unUsuario.setId(1);
    
    
    SisRes.Usuarios.agregar(unUsuario);
    
  }
}
