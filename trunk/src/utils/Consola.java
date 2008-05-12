package utils;

import java.io.*;
import java.util.*;

import sun.io.Converters;

/**
 * ...
 * @author Alejandro Winkler - Miguel Diab
 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
 * @since 0.05alpha 05/05/2008
 * @see         
 */
public class Consola {
	
	protected static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void print(String s){
		System.out.print(s);
		
	}
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void println(String s){
		
		System.out.println(s);
		
	}
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void print(int i){
    System.out.print(i);
    
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static  void println(int i){
    System.out.println(i);
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void print(double d){
    System.out.print(d);
    
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static  void println(double d){
    System.out.println(d);
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static void print(char c){
    System.out.print(c);
    
  }
  /**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static  void println(char c){
    System.out.println(c);
  }  
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static String leer(){
		
		try{
			return in.readLine();
		}catch(Exception e){return null;}
		
	}
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static  String leer(String s){
		print(s);
		return leer();
	}
	
  /**
   * Pide un par�metro, mostrando el valor a retornar si el usuario
   * presiona enter sin ingresar un valor.
   * Si el usuario ingresa un espacio en blanco, devuelve vac�o
   * 
   * @param  s  Texto a mostrar
   * @param actual  Valor a retornar al presionar enter
   * @return Texto ingresado por consola, 'actual' si entrada es "", "" si entrada es " " 
   * @author Alejandro Winkler - Miguel Diab
   * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
   * @since 0.05alpha 05/05/2008
   * @see         
   */
  public static  String leer(String s, String actual){
    String entrada = "";
    print(s + " [" + actual + "] :");
    entrada = leer();
    if (entrada.equals("")) {
      return actual;
    }
    else if (entrada.equals(" ")){
      return "";
    }
    else {
      return entrada;  
    }    
  }
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static int leerInt(){
		return leerInt(null);
	}
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static int leerInt(String msg){
		int num = -1;
		boolean ok = false;
		while(!ok){
			try{
				if (msg!=null){print(msg);}
				num = Integer.parseInt(leer());
				ok = true;
			}catch(Exception e){}
		}
		return num;
	}
  /**
   * ...
   * 
   * @param  
   * @return      
   * @author Alejandro Winkler - Miguel Diab
   * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
   * @since 0.05alpha 05/05/2008
   * @see         
   */
  public static int menu(ArrayList opciones, int defecto){
    for(int x=0;x<opciones.size();x++){
      println( (x+1) + "-" + opciones.get(x).toString());
    }
    String opcion;
    opcion = leer("opcion ["+defecto+"] :");
    if (opcion=="") {
      return defecto;
    }
    else {
      //return ConvertToInt(opcion);
      return 0;
    }
  }
	/**
	 * ...
	 * 
	 * @param  
	 * @return      
	 * @author Alejandro Winkler - Miguel Diab
	 * @author Dise�o y Desarollo de Aplicaciones, Obligatorio (C) 2008
	 * @since 0.05alpha 05/05/2008
	 * @see         
	 */
  public static int menu(ArrayList opciones){
	
		for(int x=0;x<opciones.size();x++){
			println( (x+1) + "-" + opciones.get(x).toString());
		}
		int opcion;
		do{
			opcion = leerInt("opcion:") - 1;
			
		}while(opcion < 0 || opcion >= opciones.size());
		return opcion;
	}
	
	
}
