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
public class Usuario implements Comparable<Object>, Canonic{
	//attributes
	private String _Id = "";
	private String _Nombre = "";
	private String _Apellido = "";
	private String _Password = "";
	private TipoUsuario _Tipo = null;
	
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
	 * @since 0.05alpha 05/05/2008
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
  public String get_Apellido() {
		return _Apellido;
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
  public void set_Apellido(String apellido) {
		_Apellido = apellido;
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
  public String get_Password() {
		return _Password;
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
  public void set_Password(String password) {
		_Password = password;
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
  public TipoUsuario get_Tipo() {
		return _Tipo;
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
  public void set_Tipo(TipoUsuario tipo) {
		_Tipo = tipo;
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
  public Usuario(){}
	
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
  public Usuario(String pId, String pPassword, String pNombre, String pApellido, TipoUsuario pTipo){
		this.set_Id(pId);
		this.set_Password(pPassword);
		this.set_Nombre(pNombre);
		this.set_Apellido(pApellido);
		this.set_Tipo(pTipo);
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
  public Usuario(Usuario u){
		this.set_Id(u.get_Id());
		this.set_Password(u.get_Password());
		this.set_Nombre(u.get_Nombre());
		this.set_Apellido(u.get_Apellido());
		this.set_Tipo(u.get_Tipo());
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
		return this.get_Nombre() + " " + this.get_Apellido();
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
		Usuario u;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			u = (Usuario)obj;
		}
		if(u.get_Id() == this.get_Id()){
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
		    Usuario u = (Usuario) o;
		    return this.toString().compareToIgnoreCase(u.toString());			
		}
		else{
			return 1;
		}
	}
}
