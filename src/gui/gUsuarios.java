package gui;

import javax.swing.JDialog;
import javax.swing.JPanel;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;



public class gUsuarios {

  private JDialog dAbmUsuarios = null;  //  @jve:decl-index=0:visual-constraint="75,34"
  private JPanel pAbmUsuarios = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bAceptar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JPasswordField tClave1 = null;
  private JPasswordField tClave2 = null;
  private JComboBox cGrupo = null;
  private JLabel lClave1 = null;
  private JLabel lClave2 = null;
  private JLabel lGrupo = null;
  /**
   * This method initializes dAbmUsuarios	
   * 	
   * @return javax.swing.JDialog	
   */
  public JDialog getDAbmUsuarios() {
    if (dAbmUsuarios == null) {
      dAbmUsuarios = new JDialog();
      dAbmUsuarios.setSize(350, 300);
      dAbmUsuarios.setContentPane(getPAbmUsuarios());
      dAbmUsuarios.setTitle("ABM Usuarios");
    }
    return dAbmUsuarios;
  }

  /**
   * This method initializes pAbmUsuarios	
   * 	
   * @return javax.swing.JPanel	
   */
  private JPanel getPAbmUsuarios() {
    if (pAbmUsuarios == null) {
      lGrupo = new JLabel();
      lGrupo.setBounds(new Rectangle(10, 95, 90, 20));
      lGrupo.setText("Grupo");
      lClave2 = new JLabel();
      lClave2.setBounds(new Rectangle(10, 70, 90, 20));
      lClave2.setText("Repetir");
      lClave1 = new JLabel();
      lClave1.setBounds(new Rectangle(10, 45, 90, 20));
      lClave1.setText("Clave");
      lNombre = new JLabel();
      lNombre.setBounds(new Rectangle(10, 20, 90, 20));
      lNombre.setText("Nombre");
      pAbmUsuarios = new JPanel();
      pAbmUsuarios.setLayout(null);
      pAbmUsuarios.add(lNombre, null);
      pAbmUsuarios.add(getTNombre(), null);
      pAbmUsuarios.add(getBAceptar(), null);
      pAbmUsuarios.add(getBCancelar(), null);
      pAbmUsuarios.add(getBEliminar(), null);
      pAbmUsuarios.add(getTClave1(), null);
      pAbmUsuarios.add(getTClave2(), null);
      pAbmUsuarios.add(getCGrupo(), null);
      pAbmUsuarios.add(lClave1, null);
      pAbmUsuarios.add(lClave2, null);
      pAbmUsuarios.add(lGrupo, null);
    }
    return pAbmUsuarios;
  }

  /**
   * This method initializes tNombre	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTNombre() {
    if (tNombre == null) {
      tNombre = new JTextField();
      tNombre.setBounds(new Rectangle(100, 20, 100, 20));
    }
    return tNombre;
  }

  /**
   * This method initializes bAceptar	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBAceptar() {
    if (bAceptar == null) {
      bAceptar = new JButton();
      bAceptar.setBounds(new Rectangle(10, 230, 100, 30));
      bAceptar.setText("Aceptar");
    }
    return bAceptar;
  }

  /**
   * This method initializes bCancelar	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBCancelar() {
    if (bCancelar == null) {
      bCancelar = new JButton();
      bCancelar.setBounds(new Rectangle(120, 230, 100, 30));
      bCancelar.setText("Cancelar");
    }
    return bCancelar;
  }

  /**
   * This method initializes bEliminar	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBEliminar() {
    if (bEliminar == null) {
      bEliminar = new JButton();
      bEliminar.setBounds(new Rectangle(230, 230, 100, 30));
      bEliminar.setText("Eliminar");
    }
    return bEliminar;
  }

  /**
   * This method initializes tClave1	
   * 	
   * @return javax.swing.JPasswordField	
   */
  private JPasswordField getTClave1() {
    if (tClave1 == null) {
      tClave1 = new JPasswordField();
      tClave1.setBounds(new Rectangle(100, 45, 90, 20));
    }
    return tClave1;
  }

  /**
   * This method initializes tClave2	
   * 	
   * @return javax.swing.JPasswordField	
   */
  private JPasswordField getTClave2() {
    if (tClave2 == null) {
      tClave2 = new JPasswordField();
      tClave2.setBounds(new Rectangle(100, 70, 90, 20));
    }
    return tClave2;
  }

  /**
   * This method initializes cGrupo	
   * 	
   * @return javax.swing.JComboBox	
   */
  private JComboBox getCGrupo() {
    if (cGrupo == null) {
      cGrupo = new JComboBox();
      cGrupo.setBounds(new Rectangle(100, 95, 120, 20));
    }
    return cGrupo;
  }
  
}
