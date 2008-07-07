package gui;

import global.*;

import java.util.ArrayList;
import java.util.Date;

import clientes.*;

import viajes.*;

import modelo.*;

public class Interfaz {
  /*
   *  Usuarios
   */  
  public static boolean login(String usuario, char[] clave) {
    return P_Usuarios.login(usuario, clave);
  }
  public static ArrayList<Usuario> getUsuarios() {
    return P_Usuarios.getUsuarios();
  }
  public static Usuario getUsuarioPorNombre(String s) {
    return P_Usuarios.getUsuarioPorNombre(s);
  }  
  public static Usuario getUsuarioPorId(String id) {
    return P_Usuarios.getUsuarioPorId(id);
  }  
  public static boolean agregarUsuario(Usuario u) {
    return P_Usuarios.guardar(u);
  }
  public static boolean eliminarUsuario(Usuario u) {
    return P_Usuarios.eliminar(u);
  }
  /*
   *  Grupos
   */
  public static ArrayList<Grupo> getGrupos() {
    return P_Grupos.getGrupos();
  }
  public static Grupo getGrupoPorNombre(String s) {
    return P_Grupos.getGrupoPorNombre(s);
  }    
  public static Grupo getGrupoPorId(int id) {
    return P_Grupos.getGrupoPorId(id);
  }  
  public static boolean agregarGrupo(Grupo g) {
    return P_Grupos.guardar(g);
  }
  public static boolean eliminarGrupo(Grupo g) {
    return P_Grupos.eliminar(g);
  }
  
  /*
   *  Viajes
   */
  public static ArrayList<Viaje> getViajes() {
    return P_Viajes.getViajes();
  }
  public static Viaje getViajePorNombre(String s) {
    return P_Viajes.getViajePorNombre(s);
  }  
  public static boolean agregarViaje(Viaje u) {
    return P_Viajes.guardar(u);
  }
  public static boolean eliminarViaje(Viaje u) {
    return P_Viajes.eliminar(u);
  }
  public static ArrayList<Viaje> getViajesVenta(Date f, Ciudad o, Ciudad d) {
    return P_Viajes.getViajesVenta(f,o,d);
  }
  
  /*
   *  Frecuencias
   */
  public static ArrayList<Frecuencia> getFrecuencias() {
    return P_Frecuencias.getFrecuencias();
  }
  public static Frecuencia getFrecuenciaPorNombre(String s) {
    return P_Frecuencias.getFrecuenciaPorNombre(s);
  }  
  public static boolean agregarFrecuencia(Frecuencia u) {
    return P_Frecuencias.guardar(u);
  }
  public static boolean eliminarFrecuencia(Frecuencia u) {
    return P_Frecuencias.eliminar(u);
  }
  public static ArrayList<Frecuencia> getFrecuenciasPorViaje(Viaje v) {
    return P_Frecuencias.getFrecuenciasPorViaje(v);
  }
  
  /*
   *  Ciudades
   */
  public static ArrayList<Ciudad> getCiudades() {
    return P_Ciudades.getCiudades();
  }
  public static Ciudad getCiudadPorCodigo(String s) {
    return P_Ciudades.getCiudadPorCodigo(s);
  }  
  public static boolean agregarCiudad(Ciudad u) {
    return P_Ciudades.guardar(u);
  }
  public static boolean eliminarCiudad(Ciudad u) {
    return P_Ciudades.eliminar(u);
  }  
  /*
   *  Medios
   */
  public static ArrayList<Medio> getMedios() {
    return P_Medios.getMedios();
  }
  public static Medio getMedioPorNombre(String s) {
    return P_Medios.getMedioPorNombre(s);
  }  
  public static Medio getMedioPorId(int id) {
    return P_Medios.getMedioPorId(id);
  }  
  public static boolean agregarMedio(Medio u) {
    return P_Medios.guardar(u);
  }
  public static boolean eliminarMedio(Medio u) {
    return P_Medios.eliminar(u);
  }    
  /*
   *  Tramos
   */
  public static ArrayList<Tramo> getTramos() {
    return P_Tramos.getTramos();
  }
  /*
  public static Tramo getTramoPorNombre(String s) {
    return P_Tramos.getTramoPorNombre(s);
  } 
  */ 
  public static boolean agregarTramo(Tramo u) {
    return P_Tramos.guardar(u);
  }
  public static boolean eliminarTramo(Tramo u) {
    return P_Tramos.eliminar(u);
  }    
  /*
   *  Ventas
   */
  public static ArrayList<Venta> getVentas() {
    return P_Ventas.getVentas();
  }
  public static ArrayList<Venta> ventasPorFrecuencia(Frecuencia f) {
    return P_Ventas.getVentasPorFrecuencia(f);
  }
  public static Venta getVentaPorCodigo(String s) {
    return P_Ventas.getVentaPorCodigo(s);
  }
  public static Venta getVentasPorVendedor(Usuario u) {
    return P_Ventas.getVentasPorVendedor(u);
  }
  
  /*
  public static Venta getVentaPorNombre(String s) {
    return P_Ventas.getVentaPorNombre(s);
  } 
  
  */

  public static boolean agregarVenta(Venta u) {
    return P_Ventas.guardar(u);
  }
  public static boolean eliminarVenta(Venta u) {
    return P_Ventas.eliminar(u);
  }  
  /*
   *  Descuentos
   */  
  public static ArrayList<Descuento> getDescuentos() {
    return P_Descuentos.getDescuentos();
  }
  public static Descuento getDescuentoPorNombre(String s) {
    return P_Descuentos.getDescuentoPorNombre(s);
  }  
  public static boolean agregarDescuento(Descuento u) {
    return P_Descuentos.guardar(u);
  }
  public static boolean eliminarDescuento(Descuento u) {
    return P_Descuentos.eliminar(u);
  }  
}
