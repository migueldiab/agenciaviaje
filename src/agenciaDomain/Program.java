package agenciaDomain;

import agenciaConsola.InterfazConsola;
import utils.Fecha;
import usuarios.*;

/**
 * ...
 * 
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @version 0.05alpha 05/05/2008
 * @see         
 */
public class Program {

	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void main(String[] args) {
		// TODO Auto-generated method stub		
		CargarDatosPrueba();		
		InterfazConsola.menuPrincipal();		
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CargarDatosPrueba(){
		CrearPaises();
		CrearCiudades();
		CrearMedios();
		AgregarViajes();
		AgregarTramos();
		AgregarSalidasYHorarios();
		CrearTiposUsuario();
		CrearUsuarios();
		
		/*
		 System.out.println("Tipos De Usuario");
		System.out.println("-----------------");
		for(TipoUsuario tu: InterfazAgencia.GetSortedTiposUsuario()){
			System.out.println(tu.toString());
		}
		System.out.println("\n");
		
		System.out.println("Usuarios");
		System.out.println("-----------------");
		for(Usuario u: InterfazAgencia.GetSortedUsuarios()){
			System.out.println(u.toString());
		}
		System.out.println("\n");
		
		System.out.println("Viajes");
		System.out.println("-----------------");
		for (Viaje v: InterfazAgencia.GetSortedViajes()){
			System.out.println(v.toString() + " (" + v.GetCiudadOrigen().toString() + "-" + v.GetCiudadDestino().toString() + ")");
			System.out.println(" Salidas");
			for (Salida s: v.GetSortedSalidas()){
				System.out.println("  " + s.toString());
			}
			System.out.println("\n");
		}
		 */
		
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CrearPaises(){
		Pais p1, p2;
		p1 = new Pais("URU", "Uruguay");
		p2 = new Pais("ARG", "Argentina");
		InterfazAgencia.AgregarPais(p1);
		InterfazAgencia.AgregarPais(p2);
	}

	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CrearCiudades(){
		Ciudad c1, c2;
		for(Pais p: InterfazAgencia.GetPaises()){
			if(p.get_IdPais()=="URU"){
				c1 = new Ciudad("MVD", "Montevideo", p);
				c2 = new Ciudad("COL", "Colonia", p);
				p.AgregarCiudad(c1);
				p.AgregarCiudad(c2);
			}
			else{
				c1 = new Ciudad("BSAS", "Buenos Aires", p);
				p.AgregarCiudad(c1);
			}
		}
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CrearMedios(){
		Medio m;
		m = new Medio("BUS", "Omnibus");
		InterfazAgencia.GetMedios().add(m);
		m = new Medio("BAR", "Barco");
		InterfazAgencia.GetMedios().add(m);
	}

	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void AgregarViajes(){
		Viaje v;
		
		v = new Viaje("Buquebus-Directo", 400);
		InterfazAgencia.AgregarViaje(v);
		
		v = new Viaje("Buquebus-Colonia", 350);
		InterfazAgencia.AgregarViaje(v);
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void AgregarTramos(){
		Pais uruguay = InterfazAgencia.GetPaisAModificar(0);
		Ciudad mdeo = uruguay.GetCiudadAModificar(0);
		Ciudad colonia = uruguay.GetCiudadAModificar(1);

		Pais argentina = InterfazAgencia.GetPaisAModificar(1);
		Ciudad bsas = argentina.GetCiudadAModificar(0);
		
		Medio omnibus = InterfazAgencia.GetMedioAModificar(0);
		Medio barco = InterfazAgencia.GetMedioAModificar(1);
		
		for (Viaje v: InterfazAgencia.GetViajes()){
			if(v.get_Nombre()=="Buquebus-Directo"){
				Tramo t1 = new Tramo(mdeo, barco, 3, 1);
				v.AgregarTramo(t1);
				Tramo t2 = new Tramo(bsas, barco, 0, 2);
				v.AgregarTramo(t2);
			}
			else{
				Tramo t1 = new Tramo(mdeo, omnibus, 2, 1);
				v.AgregarTramo(t1);
				Tramo t2 = new Tramo(colonia, barco, 3, 2);
				v.AgregarTramo(t2);
				Tramo t3 = new Tramo(bsas, barco, 0, 3);
				v.AgregarTramo(t3);
			}
		}
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void AgregarSalidasYHorarios(){
		Horario h = null;
		Salida s = null;
		Salida s2 = null;
		
		for (Viaje v: InterfazAgencia.GetViajes()){
			if(v.get_Nombre()=="Buquebus-Directo"){
				s = new Salida();
				v.AgregarSalida(s);
				for(Tramo t: v.get_Tramos()){
					if(t.get_Indice()==1){
						h = new Horario(1, Fecha.GetTime(14, 0), t);
						s.AgregarHorario(h);
					}					
				}
				s2 = new Salida();
				v.AgregarSalida(s2);
				for(Tramo t: v.get_Tramos()){
					if(t.get_Indice()==1){
						h = new Horario(1, Fecha.GetTime(15, 0), t);
						s2.AgregarHorario(h);
					}					
				}
			}
			else{
				s = new Salida();
				v.AgregarSalida(s);
				for(Tramo t: v.get_Tramos()){
					if(t.get_Indice()==1){
						h = new Horario(1, Fecha.GetTime(15, 00), t);
						s.AgregarHorario(h);
					}
					if(t.get_Indice()==2){
						h = new Horario(1, Fecha.GetTime(17, 20), t);
						s.AgregarHorario(h);						
					}
				}
				s2 = new Salida();
				v.AgregarSalida(s2);
				for(Tramo t: v.get_Tramos()){
					if(t.get_Indice()==1){
						h = new Horario(1, Fecha.GetTime(18, 00), t);
						s2.AgregarHorario(h);
					}
					if(t.get_Indice()==2){
						h = new Horario(1, Fecha.GetTime(20, 30), t);
						s2.AgregarHorario(h);						
					}
				}
			}
		}		
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CrearTiposUsuario(){
		TipoUsuario tA = new TipoUsuario("adm", "Administrador");
		TipoUsuario tE = new TipoUsuario("enc", "Encargado");
		InterfazAgencia.AgregarTipoUsuario(tA);
		InterfazAgencia.AgregarTipoUsuario(tE);
	}
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  private static void CrearUsuarios(){
		//obtengo tipos de usuario
		TipoUsuario tA = InterfazAgencia.GetTipoUsuarioAModificar(0);
		TipoUsuario tE = InterfazAgencia.GetTipoUsuarioAModificar(1);
		//creo y agrego usuarios
		Usuario uA = new Usuario("usu1", "1234", "El Tuna", "Fornaroli", tA);
		Usuario uE = new Usuario("usu2", "1111", "Chengue", "Morales", tE);
		InterfazAgencia.AgregarUsuario(uA);
		InterfazAgencia.AgregarUsuario(uE);
	}
}
