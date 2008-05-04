package usuarios;

import utils.Canonic;

/**
* ...
* 
* @author Alejandro Winkler - Miguel Diab
* @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
* @version 0.05alpha 05/05/2008
* @see         
*/
public class TipoUsuario implements Canonic, Comparable<Object> {
	//attributes
	private String _Id = "";
	private String _Descripcion = "";
	
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
  public String get_Id() {
		return _Id;
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
  public void set_Id(String id) {
		_Id = id;
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
	 * @version 0.05alpha 05/05/2008
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
	 * @version 0.05alpha 05/05/2008
	 * @see         
	 */
  public TipoUsuario(){}
	
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
  public TipoUsuario(String pId, String pDescripcion){
		this.set_Id(pId);
		this.set_Descripcion(pDescripcion);
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
  public TipoUsuario(TipoUsuario t){
		this.set_Id(t.get_Id());
		this.set_Descripcion(t.get_Descripcion());	}
	
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
		return this.get_Descripcion();
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
		TipoUsuario t;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			t = (TipoUsuario)obj;
		}
		if(t.get_Id() == this.get_Id()){
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
			TipoUsuario t = (TipoUsuario) o;
		    return this.toString().compareToIgnoreCase(t.toString());			
		}
		else{
			return 1;
		}
	}
}
