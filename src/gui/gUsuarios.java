package gui;

import global.Usuario;

import javax.swing.JDialog;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import controlador.cUsuario;



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
  private JScrollPane pUsuarios = null;
  private JList lUsuarios = null;  
  private DefaultListModel listaUsuarios = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;

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
      pAbmUsuarios.add(lNombre);
      pAbmUsuarios.add(getTNombre());
      pAbmUsuarios.add(getBAceptar());
      pAbmUsuarios.add(getBCancelar());
      pAbmUsuarios.add(getBEliminar());
      pAbmUsuarios.add(getTClave1());
      pAbmUsuarios.add(getTClave2());
      pAbmUsuarios.add(getCGrupo());
      pAbmUsuarios.add(lClave1);
      pAbmUsuarios.add(lClave2);
      pAbmUsuarios.add(lGrupo);
      pAbmUsuarios.add(getPUsuarios());
      pAbmUsuarios.add(getTBuscar());
      pAbmUsuarios.add(getBBuscar());
      
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

  /**
   * This method initializes lUsuarios	
   * 	
   * @return javax.swing.JList	
   */
  private JScrollPane getPUsuarios() {
    listaUsuarios = new DefaultListModel();
    JList lUsuarios = new JList(listaUsuarios);
    lUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 	  if (pUsuarios == null) {
		  pUsuarios = new JScrollPane(lUsuarios);		  
      pUsuarios.setBounds(new Rectangle(230, 40, 100, 160));
      for (Usuario u : cUsuario.getUsuarios()) {
			  listaUsuarios.addElement(u);  
		  }
	  }
	  return pUsuarios;
  }
  
  /**
   * This method initializes tBuscar	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTBuscar() {
    if (tBuscar == null) {
      tBuscar = new JTextField();
      tBuscar.setBounds(new Rectangle(230, 20, 80, 20));      
    }
    return tBuscar;
  }

  /**
   * This method initializes bBuscar	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBBuscar() {
    if (bBuscar == null) {
      bBuscar = new JButton();
      bBuscar.setBounds(new Rectangle(310, 20, 20, 20));
      bBuscar.setText("...");
      bBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return bBuscar;
  }
}  //  @jve:decl-index=0:visual-constraint="430,33"
