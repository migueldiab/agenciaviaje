package agenciaConsola;

import java.util.ArrayList;
import utils.Consola;

/**
 * Controla el acceso a las diferentes áreas del sistema.
 * Despliega menúes en pantalla segun el nivel de autorización
 * del usuario, y permite navegación y acceso a las mismas.
 * 
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @since 0.05alpha 05/05/2008
 */
public class InterfazConsola {
  /**
	 * Menu desplegado luego de autenticarse con el sistema.
	 * Permite navegar a los sub-menús, cambiar el usuario o
	 * terminar la ejecución del sistema.
	 *  
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 */
  public static void menuPrincipal() {
    ArrayList<String> opciones = new ArrayList<String>();
    opciones.add("Administracion");
    opciones.add("Operaciones");
    opciones.add("Listados");
    opciones.add("Cambiar Usuario");
    opciones.add("Salir");
    boolean salir = false;
    
    do {
      switch (Consola.menu(opciones)) {
	    case 0:
	      menuAdministracion();
        break;
	    case 1:
	      menuOperaciones();
        break;
	    case 2:
	      menuListados();
        break;
	    case 3:
	      // Usuario.CambiarUsuario
        break;
	    case 4:
	    	salir=true;
        break;
	    }
    } while (!salir);
    
  }
  /**
	 * Menu de administración de usuarios y grupos.
   * Las opciones Usuarios y Grupos son solo accesibles por
   * un usuario con permisos de administrador.
	 * 
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
   * @since 0.05alpha 05/05/2008
	 */
  public static void menuAdministracion() {
	ArrayList<String> opciones = new ArrayList<String>();
    opciones.add("Usuarios");
    opciones.add("Grupos");
    opciones.add("Cambio de Clave");        
    opciones.add("Menu Anterior");
    boolean salir = false;
    
    do {
      switch (Consola.menu(opciones)) {
	    case 0:
        menuUsuario();
        break;
	    case 1:
        break;
	    case 2:
        break;
	    case 3:
	    	salir=true;
        break;
	    }
    } while (!salir);
  }
  /**
   * Menu de administración de usuarios.
   * 
   * @author Alejandro Winkler - Miguel Diab
   * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
   * @since 0.05alpha 05/05/2008
   */
  public static void menuUsuario() {
  ArrayList<String> opciones = new ArrayList<String>();
    opciones.add("Nuevo Usuario");
    opciones.add("Modificar Usuario");
    opciones.add("Listado Usuarios");        
    opciones.add("Menu Anterior");
    boolean salir = false;
    
    do {
      switch (Consola.menu(opciones)) {
      case 0:
        ConsolaUsuario.nuevoUsuario();
        break;
      case 1:
        break;
      case 2:
        break;
      case 3:
        salir=true;
        break;
      }
    } while (!salir);
  }
  /**
	 * Menu de Operaciones. Permite el control de Viajes, Frecuencias,
   * Medios, Ciudades y Países.
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 */
  public static void menuOperaciones() {
	  ArrayList<String> opciones = new ArrayList<String>();
    opciones.add("Viajes");
    opciones.add("Frecuencias");
    opciones.add("Medios");
    opciones.add("Ciudades");
    opciones.add("Paises");       
    opciones.add("Menu Anterior");
    boolean salir = false;
    
    do {
      switch (Consola.menu(opciones)) {
	    case 0:
        break;
	    case 1:
        break;
	    case 2:
        break;
	    case 3:
        break;
	    case 4:
        break;
	    case 5:
	    	salir=true;
        break;
	    }
    } while (!salir);
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void menuListados() {
	ArrayList<String> opciones = new ArrayList<String>();
    opciones.add("Frecuencias por Viaje");
    opciones.add("Frecuencias por Destino");
    opciones.add("Menu Anterior");
    boolean salir = false;
    
    do {
      switch (Consola.menu(opciones)) {
	    case 0:
        break;
	    case 1:
        break;
	    case 2:
	    	salir=true;
        break;
	    }
    } while (!salir);
        
    }
  }

