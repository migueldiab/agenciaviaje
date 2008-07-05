package modelo;

import global.Grupo;

import java.util.ArrayList;

public class P_Grupos {
  private static ArrayList<Grupo> grupos = new ArrayList<Grupo>();
  
  public boolean agregar(Grupo u) {
    grupos.add(u);
    return true;
  }
  
/*private Grupo obtenerPorId(int id) {
    for (Grupo u : pGrupos.grupos) {
      if (u.getId()==id)
        return u;
    }
    return null;
  }
  */
  public static Grupo getGrupoPorNombre(String nombre) {
    for (Grupo u : P_Grupos.grupos) {
      if (u.getNombre().equals(nombre))
        return u;
    }
    return null;
  }
  public static ArrayList<Grupo> getGrupos() {
    return P_Grupos.grupos;
  }
  

}
