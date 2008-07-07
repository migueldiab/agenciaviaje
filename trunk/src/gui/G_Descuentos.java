package gui;

import global.Grupo;
import clientes.Descuento;

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

public class G_Descuentos {

  private JDialog dAbmDescuentos = null;
  private JPanel pAbmDescuentos = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JScrollPane pDescuentos = null;
  private JList lDescuentos = null;  
  private DefaultListModel listaDescuentos = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lInfo = null;
  private JLabel lCodigo = null;
  private JTextField tCodigo = null;
  public JDialog getDAbmDescuentos() {
    if (dAbmDescuentos == null) {
      dAbmDescuentos = new JDialog();
      dAbmDescuentos.setBounds(new Rectangle(0, 0, 380, 290));
      dAbmDescuentos.setContentPane(getPAbmDescuentos());
      dAbmDescuentos.setTitle("ABM Descuentos");
    }
    return dAbmDescuentos;
  }

  /**
   * This method initializes pAbmDescuentos 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmDescuentos() {
    if (pAbmDescuentos == null) {
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
      pAbmDescuentos = new JPanel();
      pAbmDescuentos.setLayout(null);
      pAbmDescuentos.add(lNombre);
      pAbmDescuentos.add(getTNombre());
      pAbmDescuentos.add(getBGuardar());
      pAbmDescuentos.add(getBCancelar());
      pAbmDescuentos.add(getBEliminar());
      pAbmDescuentos.add(getPDescuentos());
      pAbmDescuentos.add(getTBuscar());
      pAbmDescuentos.add(getBBuscar());
      pAbmDescuentos.add(getBNuevo(), null);
      pAbmDescuentos.add(lInfo, null);
      pAbmDescuentos.add(lCodigo, null);
      pAbmDescuentos.add(getTCodigo(), null);
      cargarListas();
      
    }
    return pAbmDescuentos;
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
          guardarDescuento();
          
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
          dAbmDescuentos.setVisible(false);
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
          if (lDescuentos.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un Descuento de la lista para eliminarlo");
          }
          else {
            eliminarDescuento((Descuento) lDescuentos.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }

  /**
   * This method initializes lDescuentos  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPDescuentos() {
    listaDescuentos = new DefaultListModel();
    lDescuentos = new JList(listaDescuentos);
    lDescuentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lDescuentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lDescuentos.getSelectedIndex()!=-1) {
              cargarDescuento();
              lInfo.setText("");
            }
          }
        });
    if (pDescuentos == null) {
      pDescuentos = new JScrollPane(lDescuentos);     
      pDescuentos.setBounds(new Rectangle(260, 40, 100, 120));
    }
    return pDescuentos;
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
          buscarDescuento();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarDescuento() {    
    Descuento u = (Descuento) lDescuentos.getSelectedValue();    
    tNombre.setText(u.getNombre());
  }
  private void buscarDescuento() {
    tNombre.setText("Test2");
  }
  private void guardarDescuento() {
    Descuento unDescuento = Interfaz.getDescuentoPorNombre(tCodigo.getText());    
    if (unDescuento == null)
      unDescuento = new Descuento();    
    if ((unDescuento.getDescuento()==-1) || (JOptionPane.showConfirmDialog(
        null,"Desea sobrescribir el Descuento "+tCodigo.getText()+"?",
        "Confirma guardar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      )
    {
      if (tCodigo.getText()!="")    
      {      
        unDescuento.setNombre(tNombre.getText());
        if (Interfaz.agregarDescuento(unDescuento)) {
          lInfo.setForeground(new Color(65, 190, 79));
          lInfo.setText("Descuento " + tNombre.getText() + " guardado");
          cargarListas();
          limpiarCampos();          
        }
        else {
          lInfo.setForeground(new Color(190, 65, 79));
          lInfo.setText("No se pudo guardar la Descuento. Verifique datos y reintente.");          
        }
      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("Complete los datos del Descuento antes de guardarlo");        
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
    listaDescuentos.clear();
    for (Descuento u : Interfaz.getDescuentos()) {
      listaDescuentos.addElement(u);  
    }
  }

  private void limpiarCampos() {
    lDescuentos.clearSelection();    
    tNombre.setText("");
    tCodigo.setText("");
    tCodigo.requestFocus();
  }
  private void eliminarDescuento(Descuento u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el Descuento "+tNombre.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      if (Interfaz.eliminarDescuento(u)) {        
        cargarListas();
        limpiarCampos();      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("No se pudo eliminar la Descuento.");          
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
