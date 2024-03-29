package global;

public class Ciudad {
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
  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if((obj == null) || (obj.getClass() != this.getClass()))
      return false;
    Ciudad c = (Ciudad) obj;
    if (this.getCodigo().equals(c.getCodigo())) {
      return true;
    }    
    return false;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.getCodigo();
  }
}
