package global;


public class Usuario {
  private int    id = 0;
  private String nombre = "";
  private String clave = "";
  private Grupo grupo = null;
  /**
   * @return the grupo
   */
  public Grupo getGrupo() {
    return grupo;
  }
  /**
   * @param grupo the grupo to set
   */
  public void setGrupo(Grupo grupo) {
    this.grupo = grupo;
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
   * @return the clave
   */
  public String getClave() {
    return clave;
  }
  /**
   * @param clave the clave to set
   */
  public void setClave(String clave) {
    this.clave = clave;
  }
}
