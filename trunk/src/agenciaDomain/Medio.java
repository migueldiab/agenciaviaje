package agenciaDomain;

import utils.Canonic;

/**
 * ...
 * 
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @since 0.05alpha 05/05/2008
 * @see         
 */
public class Medio implements Canonic, Comparable<Object>{
	//attributes
	private String _IdMedio="";
	private String _Descripcion="";
	
	//gets and sets
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
  public String get_IdMedio() {
		return _IdMedio;
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
  public void set_IdMedio(String idMedio) {
		_IdMedio = idMedio;
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
  public String get_Descripcion() {
		return _Descripcion;
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
  public void set_Descripcion(String descripcion) {
		_Descripcion = descripcion;
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
  public Medio(){}
	
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
  public Medio(String pIdMedio, String pDescripcion){
		this.set_IdMedio(pIdMedio);
		this.set_Descripcion(pDescripcion);
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
  public Medio(Medio m){
		this.set_IdMedio(m.get_IdMedio());
		this.set_Descripcion(m.get_Descripcion());
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
		return this.get_Descripcion();
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
		Medio m;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			m = (Medio)obj;
		}
		if(m.get_IdMedio() == this.get_IdMedio()){
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
		    Medio m = (Medio) o;
		    return this.get_Descripcion().compareToIgnoreCase(m.get_Descripcion());			
		}
		else{
			return 1;
		}
	}
}
