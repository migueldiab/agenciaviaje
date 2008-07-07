package global;

import java.util.ArrayList;

public class Grupo {
  private int    id = 0;
  private String nombre = "";
  private ArrayList<String> permisos = new ArrayList<String>();
  /**
   * @return the id
   */
  public int getId() {
    return id;
  }
  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }
  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }
  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  @Override
  public boolean equals(Object arg0) {
    // TODO Auto-generated method stub
    return super.equals(arg0);
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.getNombre();
  }
  /**
   * @return the permisos
   */
  public ArrayList<String> getPermisos() {
    return permisos;
  }
  /**
   * @param permisos the permisos to set
   */
  public void setPermisos(ArrayList<String> permisos) {
    this.permisos = permisos;
  }
  
  public boolean tienePermiso(String s) {
    for (String t : this.getPermisos()) {
      if (t.equals(s)) return true;
    }
    return false;
    
  }
}
