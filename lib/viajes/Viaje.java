package viajes;

import global.Ciudad;

public class Viaje {
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
  private int    id = 0;
  private String nombre = "";
  private double precio = 0;
  private int    capacidad = 0;
  private Ciudad origen = null;
  private Ciudad destino = null;
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
}
