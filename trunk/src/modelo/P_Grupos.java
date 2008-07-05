package modelo;

import global.Grupo;

import java.util.ArrayList;

public class P_Grupos {
  private static ArrayList<Grupo> grupos = new ArrayList<Grupo>();
  
  public static boolean guardar(Grupo g) {
    int i = P_Grupos.grupos.indexOf(g);
    
    if (i==-1) {
      grupos.add(g);
      return true;
    }
    else {
      grupos.set(i, g);      
      return true;
    }
  }
  public static boolean eliminar(Grupo g) {
    int i = P_Grupos.grupos.indexOf(g);
    if (i!=-1) {
      grupos.remove(i);
      return true;
    }
    else {
      return false;
    }      
  }
  
  public static Grupo getGrupoPorId(int id) {
    for (Grupo g : P_Grupos.grupos) {
      if (g.getId()==id)
        return g;
    }
    return null;
  }  
  public static Grupo getGrupoPorNombre(String nombre) {
    for (Grupo g : P_Grupos.grupos) {
      if (g.getNombre().equals(nombre))
        return g;
    }
    return null;
  }
  public static ArrayList<Grupo> getGrupos() {
    return P_Grupos.grupos;
  }
  

}
