package modelo;

import viajes.Frecuencia;
import viajes.Viaje;

import gui.Interfaz;

import java.util.ArrayList;


public class P_Frecuencias {
  private static ArrayList<Frecuencia> frecuencias = new ArrayList<Frecuencia>();
  
  public static boolean guardar(Frecuencia u) {
    int i = P_Frecuencias.frecuencias.indexOf(u);        
    if (i==-1) {
      frecuencias.add(u);
      return true;
    }
    else {
      if (Interfaz.ventasPorFrecuencia(u)==null) {
        frecuencias.set(i, u);
        return true;
      }
      else {
        return false;
      }
    }
  }
  public static boolean eliminar(Frecuencia u) {
    int i = P_Frecuencias.frecuencias.indexOf(u);
    if (i!=-1) {
      frecuencias.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Frecuencia getFrecuenciaPorNombre(String nombre) {
    for (Frecuencia u : P_Frecuencias.frecuencias) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Frecuencia> getFrecuencias() {
    return P_Frecuencias.frecuencias;
  }
  public static ArrayList<Frecuencia> getFrecuenciasPorViaje(Viaje v) {
    return P_Frecuencias.frecuencias;
  }
  
}
