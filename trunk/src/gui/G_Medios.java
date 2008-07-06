package gui;

import global.Grupo;
import global.Medio;

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

public class G_Medios {

  private JDialog dAbmMedios = null;
  private JPanel pAbmMedios = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JScrollPane pMedios = null;
  private JList lMedios = null;  
  private DefaultListModel listaMedios = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lInfo = null;
  private JLabel lCodigo = null;
  private JTextField tCodigo = null;
  public JDialog getDAbmMedios() {
    if (dAbmMedios == null) {
      dAbmMedios = new JDialog();
      dAbmMedios.setBounds(new Rectangle(0, 0, 380, 290));
      dAbmMedios.setContentPane(getPAbmMedios());
      dAbmMedios.setTitle("ABM Medios");
    }
    return dAbmMedios;
  }

  /**
   * This method initializes pAbmMedios 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmMedios() {
    if (pAbmMedios == null) {
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
      pAbmMedios = new JPanel();
      pAbmMedios.setLayout(null);
      pAbmMedios.add(lNombre);
      pAbmMedios.add(getTNombre());
      pAbmMedios.add(getBGuardar());
      pAbmMedios.add(getBCancelar());
      pAbmMedios.add(getBEliminar());
      pAbmMedios.add(getPMedios());
      pAbmMedios.add(getTBuscar());
      pAbmMedios.add(getBBuscar());
      pAbmMedios.add(getBNuevo(), null);
      pAbmMedios.add(lInfo, null);
      pAbmMedios.add(lCodigo, null);
      pAbmMedios.add(getTCodigo(), null);
      cargarListas();
      
    }
    return pAbmMedios;
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
          guardarMedio();
          
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
          dAbmMedios.setVisible(false);
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
          if (lMedios.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un Medio de la lista para eliminarlo");
          }
          else {
            eliminarMedio((Medio) lMedios.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }

  /**
   * This method initializes lMedios  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPMedios() {
    listaMedios = new DefaultListModel();
    lMedios = new JList(listaMedios);
    lMedios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lMedios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lMedios.getSelectedIndex()!=-1) {
              cargarMedio();
              lInfo.setText("");

            }
          }
        });
    if (pMedios == null) {
      pMedios = new JScrollPane(lMedios);     
      pMedios.setBounds(new Rectangle(260, 40, 100, 120));
    }
    return pMedios;
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
          buscarMedio();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarMedio() {
    
    Medio u = (Medio) lMedios.getSelectedValue();    
    tNombre.setText(u.getNombre());
    tCodigo.setText(u.getCodigo());
  }
  private void buscarMedio() {
    tNombre.setText("Test2");
  }
  private void guardarMedio() {
    Medio unMedio = Interfaz.getMedioPorCodigo(tCodigo.getText());    
    if (unMedio == null)
      unMedio = new Medio();
    
    if ((unMedio.getId()==-1) || (JOptionPane.showConfirmDialog(
        null,"Desea sobrescribir el Medio "+tCodigo.getText()+"?",
        "Confirma guardar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      )
    {
      if (tCodigo.getText()!="")    
      {      
        unMedio.setNombre(tNombre.getText());
        unMedio.setCodigo(tCodigo.getText());
        Interfaz.agregarMedio(unMedio);
        lInfo.setForeground(new Color(65, 190, 79));
        lInfo.setText("Medio " + tNombre.getText() + " guardado");
        cargarListas();
        limpiarCampos();
      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("Complete los datos del Medio antes de guardarlo");        
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
    listaMedios.clear();
    for (Medio u : Interfaz.getMedios()) {
      listaMedios.addElement(u);  
    }
  }

  private void limpiarCampos() {
    lMedios.clearSelection();
    
    tNombre.setText("");
    tCodigo.setText("");
    tCodigo.requestFocus();
  }
  private void eliminarMedio(Medio u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el Medio "+tNombre.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      Interfaz.eliminarMedio(u);
      cargarListas();
      limpiarCampos();
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

