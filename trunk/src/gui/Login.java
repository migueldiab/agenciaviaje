package gui;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;


import sistema.Inicio;

import controlador.cUsuario;
import java.awt.Color;


public class Login extends JFrame {

  private static final long serialVersionUID = 1L;

  private JPanel jContentPane = null;

  private JTextField tUsuario = null;

  private JPasswordField tClave = null;

  private JButton bLogin = null;

  private JLabel jLabel = null;

  private JLabel lPassword = null;

  private JLabel lError = null;

  /**
   * This is the default constructor
   */
  public Login() {
    super();
    initialize();
    Principal.cargar(); 
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setSize(270, 154);
    this.setContentPane(getJContentPane());
    this.setTitle("Acceso a SisRes");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /**
   * This method initializes jContentPane
   * 
   * @return javax.swing.JPanel
   */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      lError = new JLabel();
      lError.setBounds(new Rectangle(70, 5, 160, 20));
      
      lError.setForeground(new Color(200,10,10));
      lPassword = new JLabel();      
      lPassword.setBounds(new Rectangle(5, 60, 60, 20));
      lPassword.setText("Clave");
      jLabel = new JLabel();
      jLabel.setBounds(new Rectangle(5, 30, 60, 20));
      jLabel.setText("Usuario");
      jContentPane = new JPanel();
      jContentPane.setLayout(null);
      jContentPane.add(getTUsuario(), null);
      jContentPane.add(getTClave(), null);
      jContentPane.add(getBLogin(), null);
      jContentPane.add(jLabel, null);
      jContentPane.add(lPassword, null);
      jContentPane.add(lError, null);
    }
    return jContentPane;
  }

  /**
   * This method initializes tUsuario	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTUsuario() {
    if (tUsuario == null) {
      tUsuario = new JTextField();
      tUsuario.setBounds(new Rectangle(70, 30, 110, 20));
      tUsuario.setText("");
    }
    return tUsuario;
  }

  /**
   * This method initializes tClave	
   * 	
   * @return javax.swing.JPasswordField	
   */
  private JPasswordField getTClave() {
    if (tClave == null) {
      tClave = new JPasswordField();
      tClave.setBounds(new Rectangle(70, 60, 110, 20));
    }
    return tClave;
  }

  /**
   * This method initializes bLogin	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBLogin() {
    if (bLogin == null) {
      bLogin = new JButton();
      bLogin.setBounds(new Rectangle(70, 90, 110, 30));
      bLogin.setText("Login");
      bLogin.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          if (cUsuario.login(tUsuario.getText(), tClave.getPassword())) {
            Principal.cargar();            
            lError.setText("");
            Inicio.ventana.setVisible(false);
          }
          else {
            lError.setText("Login incorrecto");
          }
        }
      });
    }
    
    
    return bLogin;
  }

}  //  @jve:decl-index=0:visual-constraint="77,39"
