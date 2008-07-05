package modelo;

import global.Medio;

import java.util.ArrayList;


public class P_Medios {
  private static ArrayList<Medio> Medios = new ArrayList<Medio>();
  
  public static boolean guardar(Medio u) {
    int i = P_Medios.Medios.indexOf(u);
        
    if (i==-1) {
      Medios.add(u);
      return true;
    }
    else {
      Medios.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Medio u) {
    int i = P_Medios.Medios.indexOf(u);
    if (i!=-1) {
      Medios.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Medio getMedioPorId(int id) {
    for (Medio u : P_Medios.Medios) {
      if (u.getId()==id)
        return u;
    }
    return null;
  }
  
  public static Medio getMedioPorNombre(String nombre) {
    for (Medio u : P_Medios.Medios) {
      //if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Medio> getMedios() {
    return P_Medios.Medios;
  }
  
}
