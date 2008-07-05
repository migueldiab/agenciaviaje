package modelo;

import global.Ciudad;

import java.util.ArrayList;

public class P_Ciudades {
  private static ArrayList<Ciudad> Ciudades = new ArrayList<Ciudad>();
  
  public static boolean guardar(Ciudad g) {
    int i = P_Ciudades.Ciudades.indexOf(g);
    
    if (i==-1) {
      Ciudades.add(g);
      return true;
    }
    else {
      Ciudades.set(i, g);      
      return true;
    }
  }
  public static boolean eliminar(Ciudad g) {
    int i = P_Ciudades.Ciudades.indexOf(g);
    if (i!=-1) {
      Ciudades.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Ciudad getCiudadPorId(int id) {
    for (Ciudad g : P_Ciudades.Ciudades) {
      if (g.getId()==id)
        return g;
    }
    return null;
  }  
  public static Ciudad getCiudadPorNombre(String nombre) {
    for (Ciudad g : P_Ciudades.Ciudades) {
      if (g.getNombre().equals(nombre))
        return g;
    }
    return null;
  }
  public static ArrayList<Ciudad> getCiudades() {
    return P_Ciudades.Ciudades;
  }
  

}
