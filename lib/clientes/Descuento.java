package clientes;

import global.Ciudad;

public class Descuento {
  private int    id = 0;
  private String nombre = "";
  private String dias = "";
  private String salidaMin = "";
  private String salidaMax = "";
  private Ciudad origen = null;
  private Ciudad destino = null;
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
   * @return the dias
   */
  public String getDias() {
    return dias;
  }
  /**
   * @param dias the dias to set
   */
  public void setDias(String dias) {
    this.dias = dias;
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
   * @return the salidaMax
   */
  public String getSalidaMax() {
    return salidaMax;
  }
  /**
   * @param salidaMax the salidaMax to set
   */
  public void setSalidaMax(String salidaMax) {
    this.salidaMax = salidaMax;
  }
  /**
   * @return the salidaMin
   */
  public String getSalidaMin() {
    return salidaMin;
  }
  /**
   * @param salidaMin the salidaMin to set
   */
  public void setSalidaMin(String salidaMin) {
    this.salidaMin = salidaMin;
  }
  
}
