/**
 * 
 */
package sistema;

import modelo.P_SisRes;
import global.*;
import viajes.*;
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
    unGrupo.setId(2);
    unGrupo.setNombre("Otro");
    SisRes.Grupos.guardar(unGrupo);
    
    unGrupo = new Grupo();
    unGrupo.setId(1);
    unGrupo.setNombre("Administrador");
    SisRes.Grupos.guardar(unGrupo);

    Usuario unUsuario = new Usuario();
    unUsuario.setNombre("Miguel");
    unUsuario.setClave("abc123");
    unUsuario.setGrupo(unGrupo);
    unUsuario.setId("mike");
    SisRes.Usuarios.guardar(unUsuario);

    Ciudad unCiudad = new Ciudad();
    unCiudad.setNombre("Montevideo");
    unCiudad.setCodigo("MVD");
    unCiudad.setId(1);
    SisRes.Ciudades.guardar(unCiudad);
    unCiudad = new Ciudad();
    unCiudad.setNombre("Colonia");
    unCiudad.setCodigo("COL");
    unCiudad.setId(2);
    SisRes.Ciudades.guardar(unCiudad);
    unCiudad = new Ciudad();
    unCiudad.setNombre("Buenos Aires");
    unCiudad.setCodigo("BUE");
    unCiudad.setId(3);
    SisRes.Ciudades.guardar(unCiudad);

    Medio unMedio = new Medio();
    unMedio.setNombre("Bus");
    unMedio.setId(1);
    SisRes.Medios.guardar(unMedio);

    Viaje unViaje = new Viaje();
    unViaje.setNombre("MiViaje");
    unViaje.setOrigen(unCiudad);
    unViaje.setDestino(unCiudad);
    unViaje.setCapacidad(10);
    unViaje.setPrecio(120.50);
        
    Tramo unTramo = new Tramo();
    unTramo.setOrigen(unCiudad);
    unTramo.setDestino(unCiudad);
    unTramo.setMedio(unMedio);
    unTramo.setDuracion(10);
    unTramo.setTramo(0);
    unViaje.addTramo(unTramo);
    
    SisRes.Viajes.guardar(unViaje);

  }
}
