/**
 * 
 */
package sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import modelo.P_SisRes;
import global.*;
import utils.Fecha;
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
    unGrupo.setNombre("Encargado");
    ArrayList<String> permisos = new ArrayList<String>();
    permisos.clear();
    permisos.add("Viajes");
    permisos.add("PrecioViaje");
    permisos.add("NombreViaje");
    permisos.add("PasajerosViaje");
    permisos.add("Frecuencias");
    permisos.add("HorariosFrecuencia");
    permisos.add("HorariosFrecuencia");
    unGrupo.setPermisos(permisos);
    SisRes.Grupos.guardar(unGrupo);
    
    Usuario unUsuario = new Usuario();
    unUsuario.setNombre("El Encargado");
    unUsuario.setClave("encargado");
    unUsuario.setGrupo(unGrupo);
    unUsuario.setId("encargado");
    SisRes.Usuarios.guardar(unUsuario);

    unGrupo = new Grupo();
    unGrupo.setId(1);
    unGrupo.setNombre("Administrador");
    permisos = new ArrayList<String>();
    permisos.clear();
    permisos.add("*");
    unGrupo.setPermisos(permisos);
    SisRes.Grupos.guardar(unGrupo);

    unUsuario = new Usuario();
    unUsuario.setNombre("El Administrador");
    unUsuario.setClave("admin");
    unUsuario.setGrupo(unGrupo);
    unUsuario.setId("admin");
    SisRes.Usuarios.guardar(unUsuario);


    
    unGrupo = new Grupo();
    unGrupo.setId(3);
    unGrupo.setNombre("Vendedor");
    permisos = new ArrayList<String>();
    permisos.clear();
    permisos.add("Venta");
    unGrupo.setPermisos(permisos);
    SisRes.Grupos.guardar(unGrupo);

    unUsuario = new Usuario();
    unUsuario.setNombre("El Vendedor");
    unUsuario.setClave("vendedor");
    unUsuario.setGrupo(unGrupo);
    unUsuario.setId("vendedor");
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

    unViaje = new Viaje();
    unViaje.setNombre("OtroViaje");
    unViaje.setOrigen(unCiudad);
    unViaje.setDestino(unCiudad);
    unViaje.setCapacidad(20);
    unViaje.setPrecio(230.50);
        
    unTramo = new Tramo();
    unTramo.setOrigen(unCiudad);
    unTramo.setDestino(unCiudad);
    unTramo.setMedio(unMedio);
    unTramo.setDuracion(20);
    unTramo.setTramo(0);
    unViaje.addTramo(unTramo);
    
    SisRes.Viajes.guardar(unViaje);

    Frecuencia unFrecuencia = new Frecuencia();
    unFrecuencia.setNombre("Diario");
    unFrecuencia.setDisponible(100);
    unFrecuencia.setViaje(unViaje);
    ArrayList<Date> horas = new ArrayList<Date>();
    horas.add(Fecha.parseHora("10:10"));
    unFrecuencia.setHoras(horas);      
    SisRes.Frecuencias.guardar(unFrecuencia);
    
    //SisRes.usuarioActual = unUsuario;
  }
}
