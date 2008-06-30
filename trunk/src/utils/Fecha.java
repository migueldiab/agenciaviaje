package utils;

import java.util.Calendar;
import java.sql.Time;

/**
 * ...
 * @author Alejandro Winkler - Miguel Diab
 * @author Diseño y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @version 0.05alpha 05/05/2008
 * @see         
 */
public class Fecha {
	private static Calendar c = Calendar.getInstance();
	private static Time t; 
	
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
  public static int MaximoDiaDeLaSemana(){
		return c.getMaximum(Calendar.DAY_OF_WEEK);
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
  public static int MinimoDiaDeLaSemana(){
		return c.getMinimum(Calendar.DAY_OF_WEEK);
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
  public static String NombreDiaDeLaSemana(int d){
		switch (d){
			case 1: return "Domingo";
			case 2: return "Lunes";
			case 3: return "Martes";
			case 4: return "Miercoles";
			case 5: return "Jueves";
			case 6: return "Viernes";
			case 7: return "Sabado";
			default: return "";
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
  public static int MaximoHorasDelDia(){
		return c.getMaximum(Calendar.HOUR_OF_DAY);
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
  public static int MinimoHorasDelDia(){
		return c.getMinimum(Calendar.HOUR_OF_DAY);
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
  public static int MaximoMinutosHora(){
		return c.getMaximum(Calendar.MINUTE);
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
  public static int MinimoMinutosHora(){
		return c.getMinimum(Calendar.MINUTE);
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
  public static boolean ValidarHoras(int h){
		if(h<MinimoHorasDelDia() || h>MaximoHorasDelDia()){
			return false;
		}
		else{
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
  public static boolean ValidarMinutos(int m){
		if(m<MinimoMinutosHora() || m>MaximoMinutosHora()){
			return false;
		}
		else{
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
  public static boolean ValidarDia(int d){
		if(d<MinimoDiaDeLaSemana() || d>MaximoDiaDeLaSemana()){
			return false;
		}
		else{
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
  public static Time GetTime(int pHora, int pMinuto){
		c.set(1900, 1, 1, pHora, pMinuto, 0);
		t = new Time(c.getTimeInMillis());
		return t;
	}

}
