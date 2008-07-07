package modelo;

import viajes.Frecuencia;
import viajes.Tramo;
import viajes.Venta;

import global.Ciudad;
import global.Usuario;

import java.util.ArrayList;
import java.util.Date;


public class P_Ventas {
  private static ArrayList<Venta> ventas = new ArrayList<Venta>();
  
  public static boolean guardar(Venta u) {
    
    int i = P_Ventas.ventas.indexOf(u);    
    if (i==-1) {
      ventas.add(u);
      return true;
    }
    else {
      ventas.set(i, u);
      return true;
    }
  }
  public static boolean eliminar(Venta u) {
    int i = P_Ventas.ventas.indexOf(u);
    if (i!=-1) {
      ventas.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  /*
  public static Venta getVentaPorNombre(String nombre) {
    for (Venta u : P_Ventas.ventas) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  */
  public static ArrayList<Venta> getVentas() {
    return P_Ventas.ventas;
  }
  public static ArrayList<Venta> getVentasPorFrecuencia(Frecuencia f) {
    /*
     * TODO return null si no hay frecuencias, o el array de frecuencias si las hay
     */
    return P_Ventas.ventas;
  }
  public static Venta getVentaPorCodigo(String s) {
    /*
     * TODO Buscar el pasaje por codigo y devolverlo
     */
    return null;
  }
  public static Venta getVentasPorVendedor(Usuario u) {
    /*
     * TODO Buscar el pasaje por codigo y devolverlo
     */
    return null;
  }
  
}
