package global;

public class Medio {
  private int    id = 0;
  private String nombre = "";
  private String codigo = "";
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
  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object arg0) {
    // TODO Auto-generated method stub
    return super.equals(arg0);
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.getCodigo();
  }
}