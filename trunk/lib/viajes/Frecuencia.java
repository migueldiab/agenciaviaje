package viajes;

import java.util.ArrayList;
import java.util.Date;

public class Frecuencia {
  private String nombre = "";
  private ArrayList<Boolean> dias = new ArrayList<Boolean>();
  private Viaje viaje = null;
  private int    disponible = -1;
  private ArrayList<Date> horas = new ArrayList<Date>();
  
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
  public ArrayList<Date> getHoras() {
    return horas;
  }
  public void setHoras(ArrayList<Date> horas) {
    this.horas = horas;
  }
  public Viaje getViaje() {
    return viaje;
  }
  public void setViaje(Viaje viaje) {
    this.viaje = viaje;
  }
 
  
  
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    if(this == obj)
      return true;
    if((obj == null) || (obj.getClass() != this.getClass()))
      return false;
    Frecuencia u = (Frecuencia) obj;
    if (this.getNombre().equals(u.getNombre())) {
      return true;
    }    
    return false;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.getNombre();
  }
 
}
