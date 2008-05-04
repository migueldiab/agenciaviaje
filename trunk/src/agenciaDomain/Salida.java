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
public class Salida implements Canonic, Comparable<Object> {
	//attributes
	private ArrayList<Horario> _Horarios = new ArrayList<Horario>();
	private int _IdSalida;

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
  public ArrayList<Horario> get_Horarios() {
		return _Horarios;
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
  private void set_Horarios(ArrayList<Horario> horarios) {
		_Horarios = horarios;
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
  public int get_IdSalida(){
		return _IdSalida;
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
  public void set_Idsalida(int i){
		_IdSalida = i;
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
  public Salida(){ }
	
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
  public Salida(ArrayList<Horario> horarios){
		this.set_Horarios(horarios);
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
  public Salida(Salida s){
		this.set_Idsalida(s.get_IdSalida());
		this.set_Horarios(s.get_Horarios());
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
		String s = "";
		for(Horario h: this.get_Horarios()){
			s += h.toString() + " ";
		}
		return s;
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
		Salida s;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			s = (Salida)obj;
		}
		if(s.get_IdSalida()==this.get_IdSalida()){
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
		    Salida s = (Salida) o;
		    return this.getHoraSalida().compareTo(s.getHoraSalida());
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
  public Horario getHoraSalida(){
		return this.get_Horarios().get(0);
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
  public boolean AgregarHorario(Horario h){
		if(this.get_Horarios().contains(h)){
			return false;
		}
		else{
			this.get_Horarios().add(h);
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
  public boolean BorrarHorario(Horario h){
		int i = this.get_Horarios().indexOf(h);
		if(i!=-1){
			this.get_Horarios().remove(i);
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
  public Horario GetHoraioAModificar(int index){
		if(index>=0 && index<this.get_Horarios().size()){
			return this.get_Horarios().get(index);	
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
  public ArrayList<Horario> GetSortedHorarios(){
		Collections.sort(this.get_Horarios());
		return this.get_Horarios();
	}
}
