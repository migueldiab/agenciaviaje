package viajes;

import java.util.ArrayList;

public class Frecuencia {
  private String nombre = "";
  private ArrayList<Boolean> dias = new ArrayList<Boolean>();
  private Viaje viaje = null;
  private int    disponible = 0;
  private ArrayList horas = new ArrayList();
  
  /**
   * @return the dias
   */
  public ArrayList<Boolean> getDias() {
    return dias;
  }
  /**
   * @param dias the dias to set
   */
  public void setDias(ArrayList<Boolean> dias) {
    this.dias = dias;
  }
  /**
   * @return the disponible
   */
  public int getDisponible() {
    return disponible;
  }
  /**
   * @param disponible the disponible to set
   */
  public void setDisponible(int disponible) {
    this.disponible = disponible;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public ArrayList getHoras() {
    return horas;
  }
  public void setHoras(ArrayList horas) {
    this.horas = horas;
  }
  public Viaje getViaje() {
    return viaje;
  }
  public void setViaje(Viaje viaje) {
    this.viaje = viaje;
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
 
}
