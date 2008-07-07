package viajes;

import global.Usuario;

import java.util.Date;

import clientes.Pasajero;

public class Venta {
  private Frecuencia frecuencia = null;
  private double     total = 0;
  private Date       fecha = null;
  private Pasajero   pasajero = null;
  private String     codigo = "";
  private Usuario    vendedor = null;  
  /**
   * @return the codigo
   */
  public String getCodigo() {
    return codigo;
  }
  /**
   * @param codigo the codigo to set
   */
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  /**
   * @return the fecha
   */
  public Date getFecha() {
    return fecha;
  }
  /**
   * @param fecha the fecha to set
   */
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
  /**
   * @return the frecuencia
   */
  public Frecuencia getFrecuencia() {
    return frecuencia;
  }
  /**
   * @param frecuencia the frecuencia to set
   */
  public void setFrecuencia(Frecuencia frecuencia) {
    this.frecuencia = frecuencia;
  }
  /**
   * @return the pasajero
   */
  public Pasajero getPasajero() {
    return pasajero;
  }
  /**
   * @param pasajero the pasajero to set
   */
  public void setPasajero(Pasajero pasajero) {
    this.pasajero = pasajero;
  }
  /**
   * @return the total
   */
  public double getTotal() {
    return total;
  }
  /**
   * @param total the total to set
   */
  public void setTotal(double total) {
    this.total = total;
  }
  /**
   * @return the vendedor
   */
  public Usuario getVendedor() {
    return vendedor;
  }
  /**
   * @param vendedor the vendedor to set
   */
  public void setVendedor(Usuario vendedor) {
    this.vendedor = vendedor;
  }
}
