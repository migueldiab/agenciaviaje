package modelo;

import clientes.Descuento;

import java.util.ArrayList;


public class P_Descuentos {
  private static ArrayList<Descuento> descuentos = new ArrayList<Descuento>();
  
  public static boolean guardar(Descuento u) {
    int i = P_Descuentos.descuentos.indexOf(u);
        
    if (i==-1) {
      descuentos.add(u);
      return true;
    }
    else {
      descuentos.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Descuento u) {
    int i = P_Descuentos.descuentos.indexOf(u);
    if (i!=-1) {
      descuentos.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Descuento getDescuentoPorNombre(String nombre) {
    for (Descuento u : P_Descuentos.descuentos) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Descuento> getDescuentos() {
    return P_Descuentos.descuentos;
  }
  
}
