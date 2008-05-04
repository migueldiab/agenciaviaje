package usuarios;

import java.util.ArrayList;
import java.util.Collections;

/**
* ...
* 
* @author Alejandro Winkler - Miguel Diab
* @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
* @version 0.05alpha 05/05/2008
* @see         
*/
public class CtrlUsuario {
	//attributes
	private static ArrayList<Usuario> _Usuarios = new ArrayList<Usuario>();
	private static ArrayList<TipoUsuario> _TiposUsuario = new ArrayList<TipoUsuario>();
	
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
  public static ArrayList<Usuario> getUsuarios() {
		return _Usuarios;
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
  public static ArrayList<TipoUsuario> getTiposUsuario() {
		return _TiposUsuario;
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
  public static void AgregarUsuario(Usuario u){
		getUsuarios().add(u);
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
  public static void BorrarUsuario(Usuario u){
		int i = getUsuarios().indexOf(u);
		if(i!=-1){
			getUsuarios().remove(i);	
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
  public static Usuario GetUsuarioAModificar(int index){
		if(index>=0 && index<getUsuarios().size()){
			return getUsuarios().get(index);	
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
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static ArrayList<Usuario> GetSortedUsuarios(){
		Collections.sort(getUsuarios());
		return getUsuarios();
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
  public static void AgregarTipoUsuario(TipoUsuario t){
		getTiposUsuario().add(t);
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
  public static void BorrarTipoUsuario(TipoUsuario t){
		int i = getTiposUsuario().indexOf(t);
		if(i!=-1){
			getUsuarios().remove(i);	
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
  public static TipoUsuario GetTipoUsuarioAModificar(int index){
		if(index>=0 && index<getTiposUsuario().size()){
			return getTiposUsuario().get(index);	
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
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static ArrayList<TipoUsuario> GetSortedTiposUsuario(){
		Collections.sort(getTiposUsuario());
		return getTiposUsuario();
	}
}
