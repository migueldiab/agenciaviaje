package modelo;

import viajes.Tramo;

import java.util.ArrayList;


public class P_Tramos {
  private static ArrayList<Tramo> Tramos = new ArrayList<Tramo>();
  
  public static boolean guardar(Tramo u) {
    int i = P_Tramos.Tramos.indexOf(u);
        
    if (i==-1) {
      Tramos.add(u);
      return true;
    }
    else {
      Tramos.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Tramo u) {
    int i = P_Tramos.Tramos.indexOf(u);
    if (i!=-1) {
      Tramos.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  /*
  public static Tramo getTramoPorNombre(String nombre) {
    for (Tramo u : P_Tramos.Tramos) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  */
  
  public static ArrayList<Tramo> getTramos() {
    return P_Tramos.Tramos;
  }
  
}
