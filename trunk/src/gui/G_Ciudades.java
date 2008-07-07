package gui;

import global.Grupo;
import global.Ciudad;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class G_Ciudades {

  private JDialog dAbmCiudades = null;
  private JPanel pAbmCiudades = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JScrollPane pCiudades = null;
  private JList lCiudades = null;  
  private DefaultListModel listaCiudades = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lInfo = null;
  private JLabel lCodigo = null;
  private JTextField tCodigo = null;
  public JDialog getDAbmCiudades() {
    if (dAbmCiudades == null) {
      dAbmCiudades = new JDialog();
      dAbmCiudades.setBounds(new Rectangle(0, 0, 380, 290));
      dAbmCiudades.setContentPane(getPAbmCiudades());
      dAbmCiudades.setTitle("ABM Ciudades");
    }
    return dAbmCiudades;
  }

  /**
   * This method initializes pAbmCiudades 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmCiudades() {
    if (pAbmCiudades == null) {
      lCodigo = new JLabel();
      lCodigo.setBounds(new Rectangle(10, 20, 90, 20));
      lCodigo.setText("Codigo");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 240, 370, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lNombre = new JLabel();
      lNombre.setBounds(new Rectangle(10, 45, 90, 20));
      lNombre.setText("Nombre");
      pAbmCiudades = new JPanel();
      pAbmCiudades.setLayout(null);
      pAbmCiudades.add(lNombre);
      pAbmCiudades.add(getTNombre());
      pAbmCiudades.add(getBGuardar());
      pAbmCiudades.add(getBCancelar());
      pAbmCiudades.add(getBEliminar());
      pAbmCiudades.add(getPCiudades());
      pAbmCiudades.add(getTBuscar());
      pAbmCiudades.add(getBBuscar());
      pAbmCiudades.add(getBNuevo(), null);
      pAbmCiudades.add(lInfo, null);
      pAbmCiudades.add(lCodigo, null);
      pAbmCiudades.add(getTCodigo(), null);
      cargarListas();
      
    }
    return pAbmCiudades;
  }

  /**
   * This method initializes tNombre  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTNombre() {
    if (tNombre == null) {
      tNombre = new JTextField();
      tNombre.setBounds(new Rectangle(100, 45, 150, 20));
    }
    return tNombre;
  }

  /**
   * This method initializes bGuardar 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBGuardar() {
    if (bGuardar == null) {
      bGuardar = new JButton();
      bGuardar.setBounds(new Rectangle(10, 200, 100, 30));
      bGuardar.setText("Guardar");
      bGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          guardarCiudad();
          
        }
      });
    }
    return bGuardar;
  }
  

  /**
   * This method initializes bCancelar  
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBCancelar() {
    if (bCancelar == null) {
      bCancelar = new JButton();
      bCancelar.setBounds(new Rectangle(250, 200, 100, 30));
      bCancelar.setText("Cerrar");
      bCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          limpiarCampos();
          dAbmCiudades.setVisible(false);
        }
      });
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
      bEliminar.setBounds(new Rectangle(130, 200, 100, 30));
      bEliminar.setText("Eliminar");
      bEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          if (lCiudades.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un Ciudad de la lista para eliminarlo");
          }
          else {
            eliminarCiudad((Ciudad) lCiudades.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }

  /**
   * This method initializes lCiudades  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPCiudades() {
    listaCiudades = new DefaultListModel();
    lCiudades = new JList(listaCiudades);
    lCiudades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lCiudades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lCiudades.getSelectedIndex()!=-1) {
              cargarCiudad();
              lInfo.setText("");
            }
          }
        });
    if (pCiudades == null) {
      pCiudades = new JScrollPane(lCiudades);     
      pCiudades.setBounds(new Rectangle(260, 40, 100, 120));
    }
    return pCiudades;
  }
  
  /**
   * This method initializes tBuscar  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTBuscar() {
    if (tBuscar == null) {
      tBuscar = new JTextField();
      tBuscar.setBounds(new Rectangle(260, 20, 80, 20));      
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
      bBuscar.setBounds(new Rectangle(340, 20, 20, 20));
      bBuscar.setText("...");
      bBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          buscarCiudad();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarCiudad() {    
    Ciudad u = (Ciudad) lCiudades.getSelectedValue();    
    tNombre.setText(u.getNombre());
    tCodigo.setText(u.getCodigo());
  }
  private void buscarCiudad() {
    tNombre.setText("Test2");
  }
  private void guardarCiudad() {
    Ciudad unCiudad = Interfaz.getCiudadPorCodigo(tCodigo.getText());    
    if (unCiudad == null)
      unCiudad = new Ciudad();    
    if ((unCiudad.getId()==-1) || (JOptionPane.showConfirmDialog(
        null,"Desea sobrescribir el Ciudad "+tCodigo.getText()+"?",
        "Confirma guardar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      )
    {
      if (tCodigo.getText()!="")    
      {      
        unCiudad.setNombre(tNombre.getText());
        unCiudad.setCodigo(tCodigo.getText());
        if (Interfaz.agregarCiudad(unCiudad)) {
          lInfo.setForeground(new Color(65, 190, 79));
          lInfo.setText("Ciudad " + tNombre.getText() + " guardado");
          cargarListas();
          limpiarCampos();          
        }
        else {
          lInfo.setForeground(new Color(190, 65, 79));
          lInfo.setText("No se pudo guardar la ciudad. Verifique datos y reintente.");          
        }
      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("Complete los datos del Ciudad antes de guardarlo");        
      }
    }
  }

  /**
   * This method initializes bNuevo 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBNuevo() {
    if (bNuevo == null) {
      bNuevo = new JButton();
      bNuevo.setBounds(new Rectangle(260, 165, 100, 20));
      bNuevo.setText("Nuevo");
      bNuevo.addActionListener(new java.awt.event.ActionListener() {   
        public void actionPerformed(java.awt.event.ActionEvent e) {    
          limpiarCampos();
        }
      
      });
    }
    return bNuevo;
  }
  private void cargarListas() {
    listaCiudades.clear();
    for (Ciudad u : Interfaz.getCiudades()) {
      listaCiudades.addElement(u);  
    }
  }

  private void limpiarCampos() {
    lCiudades.clearSelection();    
    tNombre.setText("");
    tCodigo.setText("");
    tCodigo.requestFocus();
  }
  private void eliminarCiudad(Ciudad u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el Ciudad "+tNombre.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      if (Interfaz.eliminarCiudad(u)) {        
        cargarListas();
        limpiarCampos();      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("No se pudo eliminar la ciudad.");          
      }
    }
  }

  /**
   * This method initializes tCodigo	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTCodigo() {
    if (tCodigo == null) {
      tCodigo = new JTextField();
      tCodigo.setBounds(new Rectangle(100, 20, 60, 20));
    }
    return tCodigo;
  }
}  
