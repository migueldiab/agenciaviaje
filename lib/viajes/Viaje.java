package viajes;

import java.util.ArrayList;

import global.Ciudad;
import global.Usuario;

public class Viaje {
  private String nombre = "";
  private double precio = 0;
  private int    capacidad = 0;
  private Ciudad origen = null;
  private Ciudad destino = null;
  private ArrayList<Tramo> tramos = new ArrayList<Tramo>();

  /**
   * @return the tramos
   */
  public ArrayList<Tramo> getTramos() {
    return tramos;
  }
  /**
   * @param tramos the tramos to set
   */
  public boolean setTramos(ArrayList<Tramo> tramos) {
    
    this.tramos = tramos;
    return true;
  }
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    if(this == obj)
      return true;
    if((obj == null) || (obj.getClass() != this.getClass()))
      return false;
    Viaje u = (Viaje) obj;
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

  /**
   * @return the capacidad
   */
  public int getCapacidad() {
    return capacidad;
  }
  /**
   * @param capacidad the capacidad to set
   */
  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }
  /**
   * @return the destino
   */
  public Ciudad getDestino() {
    return destino;
  }
  /**
   * @param destino the destino to set
   */
  public void setDestino(Ciudad destino) {
    this.destino = destino;
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
  /**
   * @return the origen
   */
  public Ciudad getOrigen() {
    return origen;
  }
  /**
   * @param origen the origen to set
   */
  public void setOrigen(Ciudad origen) {
    this.origen = origen;
  }
  /**
   * @return the precio
   */
  public double getPrecio() {
    return precio;
  }
  /**
   * @param precio the precio to set
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  
  public void addTramo(Tramo t) {
    this.tramos.add(t);
  }
  
}
