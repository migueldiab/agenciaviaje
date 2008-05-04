package agenciaDomain;

import java.sql.Time;
import utils.Canonic;
import utils.Fecha;


/**
 * ...
 * 
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @since 0.05alpha 05/05/2008
 * @see         
 */
public class Horario implements Canonic, Comparable<Object> {
	//attributes
	private int _Dia=0;
	private Time _Hora=null;
	private Tramo _Tramo=null;
	
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
  public int get_Dia() {
		return _Dia;
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
  public void set_Dia(int dia) {
		if(Fecha.ValidarDia(dia)){
			_Dia = dia;	
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
  public Time get_Hora() {
		return _Hora;
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
  public void set_Hora(Time hora) {
		_Hora = hora;	
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
  public Tramo get_Tramo() {
		return _Tramo;
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
  public void set_Tramo(Tramo tramo) {
		_Tramo = tramo;	
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
  public Horario(){}
	
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
  public Horario(int pDia, Time pHora, Tramo pTramo){
		this.set_Dia(pDia);
		this.set_Hora(pHora);
		this.set_Tramo(pTramo);
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
  public Horario(Horario f){
		this.set_Dia(f.get_Dia());
		this.set_Hora(f.get_Hora());
		this.set_Tramo(f.get_Tramo());
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
		return Fecha.NombreDiaDeLaSemana(this.get_Dia()) + " " + this.get_Hora().toString() + " " + this.get_Tramo().toString();
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
		Horario h;
		if(obj == this){return true;}
		if(!obj.getClass().isInstance(this)){ 
			return false; 
			}
		else{
			h = (Horario)obj;
		}
		return this.get_Tramo().equals(h.get_Tramo());
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
		    Horario h = (Horario) o;
		    if(this.get_Dia()<h.get_Dia()){
		    	return -1;
		    	}
		    else if(this.get_Dia()>h.get_Dia()){
		    	return 1;	
		    	}
		    else{
		    	return this.get_Hora().compareTo(h.get_Hora());
		    	}			
		    }
		else{
			return 1;
			}
		}
	}
