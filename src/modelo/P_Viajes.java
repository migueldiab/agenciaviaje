package modelo;

import viajes.Tramo;
import viajes.Viaje;

import java.util.ArrayList;


public class P_Viajes {
  private static ArrayList<Viaje> viajes = new ArrayList<Viaje>();
  
  public static boolean guardar(Viaje u) {
    
    for (Tramo t : u.getTramos()) {
      // Logica de tramos correcta - return false si falla
    }
    int i = P_Viajes.viajes.indexOf(u);    
    if (i==-1) {
      viajes.add(u);
      return true;
    }
    else {
      viajes.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Viaje u) {
    int i = P_Viajes.viajes.indexOf(u);
    if (i!=-1) {
      viajes.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Viaje getViajePorNombre(String nombre) {
    for (Viaje u : P_Viajes.viajes) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Viaje> getViajes() {
    return P_Viajes.viajes;
  }
  
}
