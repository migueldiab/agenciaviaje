package gui;

import global.*;

import java.util.ArrayList;

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
  public static Viaje getViajePorId(int id) {
    return P_Viajes.getViajePorId(id);
  }  
  public static boolean agregarViaje(Viaje u) {
    return P_Viajes.guardar(u);
  }
  public static boolean eliminarViaje(Viaje u) {
    return P_Viajes.eliminar(u);
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
  public static Frecuencia getFrecuenciaPorId(int id) {
    return P_Frecuencias.getFrecuenciaPorId(id);
  }  
  public static boolean agregarFrecuencia(Frecuencia u) {
    return P_Frecuencias.guardar(u);
  }
  public static boolean eliminarFrecuencia(Frecuencia u) {
    return P_Frecuencias.eliminar(u);
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
}
