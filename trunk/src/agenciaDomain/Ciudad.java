package agenciaDomain;

import utils.Canonic;

/**
 * Contiene las ciudades por las que pueden circular los servicios de transporte
 * @author Alejandro Winkler - Miguel Diab
 * @since 0.05alpha 05/05/2008
 */
public class Ciudad implements Canonic, Comparable<Object>{
	//attributes
	private String _IdCiudad="";
	private String _Nombre="";
	private Pais _Pais = null;
	
	//gets and sets

	/**
	 * Devuelve el identificador de la ciudad a la que hace referencia.
	 * @return  Código identificador de Ciudad
	 * @author Alejandro Winkler - Miguel Diab
	 * @since 0.05alpha 05/05/2008
	 */
  public String get_IdCiudad() {
		return _IdCiudad;
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
  public void set_IdCiudad(String idCiudad) {
		_IdCiudad = idCiudad;
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
	 * @since 0.05alpha 05/05/2008
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
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public Pais get_Pais() {
		return _Pais;
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
  public void set_Pais(Pais pais) {
		_Pais = pais;
	}
	
	//constructors
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
  public Ciudad(){}
	
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
  public Ciudad(String pIdCiudad, String pNombre, Pais pPais){
		this.set_IdCiudad(pIdCiudad);
		this.set_Nombre(pNombre);
		this.set_Pais(pPais);	
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
  public Ciudad(Ciudad c){
		this.set_IdCiudad(c.get_IdCiudad());
		this.set_Nombre(c.get_Nombre());
		this.set_Pais(c._Pais);
	}

	//methods
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
  public String toString(){
		return this.get_Nombre() + "(" + this.get_Pais().get_IdPais() + ")";
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
  public boolean equals(Object obj){
		Ciudad c;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			c = (Ciudad)obj;
		}
		if(c.get_IdCiudad() == this.get_IdCiudad()){
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
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public int compareTo(Object o){
		if(o.getClass().isInstance(this)){
		    Ciudad c = (Ciudad)o;
		    return this.get_Nombre().compareToIgnoreCase(c.get_Nombre());			
		}
		else{
			return 1;
		}
	}
}


