package viajes;

import global.Ciudad;
import global.Medio;

public class Tramo {
  private Ciudad origen = null;
  private Ciudad destino = null;  
  private Medio  medio = null;
  private int    duracion = 0;
  private int    tramo = 0;
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
   * @return the duracion
   */
  public int getDuracion() {
    return duracion;
  }
  /**
   * @param duracion the duracion to set
   */
  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }
  /**
   * @return the medio
   */
  public Medio getMedio() {
    return medio;
  }
  /**
   * @param medio the medio to set
   */
  public void setMedio(Medio medio) {
    this.medio = medio;
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
   * @return the tramo
   */
  public int getTramo() {
    return tramo;
  }
  /**
   * @param tramo the tramo to set
   */
  public void setTramo(int tramo) {
    this.tramo = tramo;
  }

}
