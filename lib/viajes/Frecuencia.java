package viajes;

public class Frecuencia {
  private Tramo  tramo= null;
  private String salida = "";
  private String dias = "";
  private int    disponible = 0;
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
  /**
   * @return the salida
   */
  public String getSalida() {
    return salida;
  }
  /**
   * @param salida the salida to set
   */
  public void setSalida(String salida) {
    this.salida = salida;
  }
  /**
   * @return the tramo
   */
  public Tramo getTramo() {
    return tramo;
  }
  /**
   * @param tramo the tramo to set
   */
  public void setTramo(Tramo tramo) {
    this.tramo = tramo;
  }
  
}
