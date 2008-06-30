package clientes;

public class Pasajero {
  private int    id = 0;
  private String nombre = "";
  private String tipoDoc = "";
  private String documento = "";
  /**
   * @return the documento
   */
  public String getDocumento() {
    return documento;
  }
  /**
   * @param documento the documento to set
   */
  public void setDocumento(String documento) {
    this.documento = documento;
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
   * @return the tipoDoc
   */
  public String getTipoDoc() {
    return tipoDoc;
  }
  /**
   * @param tipoDoc the tipoDoc to set
   */
  public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
  }
}
