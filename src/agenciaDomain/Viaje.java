package agenciaDomain;

import java.util.ArrayList;
import java.util.Collections;
import utils.Canonic;

/**
 * ...
 * 
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @version 0.05alpha 05/05/2008
 * @see         
 */
public class Viaje implements Canonic, Comparable<Object>{
	//attributes
	private String _Nombre="";
	private int _Capacidad=0;
	private ArrayList<Tramo> _Tramos = new ArrayList<Tramo>();
	private ArrayList<Salida> _Salidas = new ArrayList<Salida>();
	
	//gets and sets
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
  public String get_Nombre() {
		return _Nombre;
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
  public void set_Nombre(String nombre) {
		_Nombre = nombre;
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
  public int get_Capacidad() {
		return _Capacidad;
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
  public void set_Capacidad(int capacidad) {
		_Capacidad = capacidad;
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
  public ArrayList<Tramo> get_Tramos() {
		return _Tramos;
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
  private void set_Tramos(ArrayList<Tramo> tramos) {
		_Tramos = tramos;
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
  public ArrayList<Salida> get_Salidas() {
		return _Salidas;
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
  private void set_Salidas(ArrayList<Salida> salidas) {
		_Salidas = salidas;
	}
	
	//constructors
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
  public Viaje(){}
	
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
  public Viaje(String pNombre, int pCapacidad){
		this.set_Nombre(pNombre);
		this.set_Capacidad(pCapacidad);
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
  public Viaje(Viaje v){
		this.set_Nombre(v.get_Nombre());
		this.set_Capacidad(v.get_Capacidad());
		this.set_Tramos(v.get_Tramos());
		this.set_Salidas(v.get_Salidas());
	}

	//methods
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
  public String toString(){
		return this.get_Nombre();
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
  public boolean equals(Object obj){
		Viaje v;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			v = (Viaje)obj;
		}
		if(v.get_Nombre()==this.get_Nombre()){
			return true;
			}
		else{
				return false;
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
  public int compareTo(Object o){
		if(o.getClass().isInstance(this)){
			Viaje v = (Viaje) o;
			return this.toString().compareTo(v.toString());
		}
		else{
			return 1;	
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
  public boolean AgregarSalida(Salida s){
		if(this.get_Salidas().contains(s)){
			return false;
		}
		else{
			s.set_Idsalida(GetNuevoIdSalida());
			this.get_Salidas().add(s);
			return true;
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
  public boolean BorrarSalida(Salida s){
		int i = this.get_Salidas().indexOf(s);
		if(i!=-1){
			this.get_Salidas().remove(i);
			return true;
			}
		else{
			return false;
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
  public Salida GetSalidaAModificar(int index){
		if(index>=0 && index<this.get_Salidas().size()){
			return this.get_Salidas().get(index);	
		}
		else{
			return null;
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
  public ArrayList<Salida> GetSortedSalidas(){
		Collections.sort(this.get_Salidas());
		return this.get_Salidas();
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
  private int GetNuevoIdSalida(){
		return this.get_Salidas().size() + 1;
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
  public boolean AgregarTramo(Tramo t){
		if(this.get_Tramos().contains(t)){
			return false;
		}
		else{
			this.get_Tramos().add(t);
			return true;
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
  public boolean BorrarTramo(Tramo t){
		int i = this.get_Tramos().indexOf(t);
		if(i!=-1){
			this.get_Tramos().remove(i);
			return true;
			}
		else{
			return false;
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
  public Tramo GetTramoAModificar(int index){
		if(index>=0 && index<this.get_Tramos().size()){
			return this.get_Tramos().get(index);	
		}
		else{
			return null;
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
  public ArrayList<Tramo> GetSortedTramos(){
		Collections.sort(this.get_Tramos());
		return this.get_Tramos();
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
  public Ciudad GetCiudadOrigen(){
		return this.GetSortedTramos().get(0).get_Origen();
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
  public Ciudad GetCiudadDestino(){
		return this.GetSortedTramos().get(this.get_Tramos().size()-1).get_Origen();
	}
}
