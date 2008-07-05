package gui;

import viajes.Frecuencia;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class G_Frecuencias {

  private JDialog dAbmFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="10,179"
  private JPanel pAbmFrecuencias = null;
  private JLabel lViaje = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JComboBox cOrigen = null;
  private JLabel lId = null;
  private JLabel lDestino = null;
  private JScrollPane pFrecuencias = null;
  private JList lFrecuencias = null;  
  private DefaultListModel listaFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lInfo = null;
  private JLabel lMedio = null;
  private JLabel lDuracion = null;
  private JComboBox cDestino = null;
  private JTextField tDuracion = null;
  private JComboBox cMedio = null;
  private JButton bMas = null;
  private JScrollPane sFrecuencias = null;
  private JTable tFrecuencias = null;
  private JComboBox cViaje = null;
  public JDialog getDAbmFrecuencias() {
    if (dAbmFrecuencias == null) {
      dAbmFrecuencias = new JDialog();
      dAbmFrecuencias.setBounds(new Rectangle(0, 0, 590, 400));
      dAbmFrecuencias.setContentPane(getPAbmFrecuencias());
      dAbmFrecuencias.setTitle("ABM Frecuencias");
    }
    return dAbmFrecuencias;
  }

  /**
   * This method initializes pAbmFrecuencias 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmFrecuencias() {
    if (pAbmFrecuencias == null) {
      lDuracion = new JLabel();
      lDuracion.setBounds(new Rectangle(310, 75, 100, 20));
      lDuracion.setText("Dias");
      lMedio = new JLabel();
      lMedio.setBounds(new Rectangle(210, 75, 100, 20));
      lMedio.setText("Hora Salida");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 350, 590, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lDestino = new JLabel();
      lDestino.setBounds(new Rectangle(110, 75, 100, 20));
      lDestino.setText("Tramos");
      lId = new JLabel();
      lId.setBounds(new Rectangle(10, 75, 100, 20));
      lId.setText("ID");
      lViaje = new JLabel();
      lViaje.setBounds(new Rectangle(10, 45, 90, 20));
      lViaje.setText("Viaje");
      pAbmFrecuencias = new JPanel();
      pAbmFrecuencias.setLayout(null);
      pAbmFrecuencias.add(lViaje);
      pAbmFrecuencias.add(getBGuardar());
      pAbmFrecuencias.add(getBCancelar());
      pAbmFrecuencias.add(getBEliminar());
      pAbmFrecuencias.add(getCOrigen());
      pAbmFrecuencias.add(lId);
      pAbmFrecuencias.add(lDestino);
      pAbmFrecuencias.add(getPFrecuencias());
      pAbmFrecuencias.add(getTBuscar());
      pAbmFrecuencias.add(getBBuscar());
      pAbmFrecuencias.add(getBNuevo(), null);
      pAbmFrecuencias.add(lInfo, null);
      pAbmFrecuencias.add(lMedio, null);
      pAbmFrecuencias.add(lDuracion, null);
      pAbmFrecuencias.add(getCDestino(), null);
      pAbmFrecuencias.add(getTDuracion(), null);
      pAbmFrecuencias.add(getCMedio(), null);
      pAbmFrecuencias.add(getBMas(), null);
      pAbmFrecuencias.add(getTFrecuencias(), null);
      pAbmFrecuencias.add(getSFrecuencias(), null);
      pAbmFrecuencias.add(getCViaje(), null);
      
    }
    return pAbmFrecuencias;
  }

  /**
   * This method initializes bGuardar 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBGuardar() {
    if (bGuardar == null) {
      bGuardar = new JButton();
      bGuardar.setBounds(new Rectangle(470, 200, 100, 30));
      bGuardar.setText("Guardar");
      bGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          guardarFrecuencia();
          
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
      bCancelar.setBounds(new Rectangle(470, 260, 100, 30));
      bCancelar.setText("Cerrar");
      bCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          limpiarCampos();
          dAbmFrecuencias.setVisible(false);
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
      bEliminar.setBounds(new Rectangle(470, 230, 100, 30));
      bEliminar.setText("Eliminar");
      bEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          if (lFrecuencias.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un frecuencia de la lista para eliminarlo");
          }
          else {
            eliminarFrecuencia((Frecuencia) lFrecuencias.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }

  /**
   * This method initializes cOrigen 
   *  
   * @return javax.swing.JComboBox  
   */
  private JComboBox getCOrigen() {
    if (cOrigen == null) {
      cOrigen = new JComboBox();
      cOrigen.setBounds(new Rectangle(10, 95, 100, 20));
    }
    return cOrigen;
  }

  /**
   * This method initializes lFrecuencias  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPFrecuencias() {
    listaFrecuencias = new DefaultListModel();
    lFrecuencias = new JList(listaFrecuencias);
    lFrecuencias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lFrecuencias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lFrecuencias.getSelectedIndex()!=-1) {
              cargarFrecuencia();
              lInfo.setText("");

            }
          }
        });
    if (pFrecuencias == null) {
      pFrecuencias = new JScrollPane(lFrecuencias);     
      pFrecuencias.setBounds(new Rectangle(470, 40, 100, 120));
      cargarListas();
    }
    return pFrecuencias;
  }
  
  /**
   * This method initializes tBuscar  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTBuscar() {
    if (tBuscar == null) {
      tBuscar = new JTextField();
      tBuscar.setBounds(new Rectangle(470, 20, 80, 20));      
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
      bBuscar.setBounds(new Rectangle(550, 20, 20, 20));
      bBuscar.setText("...");
      bBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          buscarFrecuencia();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarFrecuencia() {
    
    Frecuencia u = (Frecuencia) lFrecuencias.getSelectedValue();    

  }
  private void buscarFrecuencia() {
    
  }
  private void guardarFrecuencia() {
    
    
  }

  /**
   * This method initializes bNuevo 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBNuevo() {
    if (bNuevo == null) {
      bNuevo = new JButton();
      bNuevo.setBounds(new Rectangle(470, 170, 100, 30));
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
    listaFrecuencias.clear();
    for (Frecuencia u : Interfaz.getFrecuencias()) {
      listaFrecuencias.addElement(u);  
    }
     
  }

  private void limpiarCampos() {
    lFrecuencias.clearSelection();
    
  }
  private void eliminarFrecuencia(Frecuencia u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar la frecuencia?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      Interfaz.eliminarFrecuencia(u);
      cargarListas();
      limpiarCampos();
    }
  }

  /**
   * This method initializes cDestino 
   *  
   * @return javax.swing.JComboBox  
   */
  private JComboBox getCDestino() {
    if (cDestino == null) {
      cDestino = new JComboBox();
      cDestino.setBounds(new Rectangle(110, 95, 100, 20));
    }
    return cDestino;
  }

  /**
   * This method initializes tDuracion  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTDuracion() {
    if (tDuracion == null) {
      tDuracion = new JTextField();
      tDuracion.setBounds(new Rectangle(310, 95, 100, 20));
    }
    return tDuracion;
  }

  /**
   * This method initializes cMedio 
   *  
   * @return javax.swing.JComboBox  
   */
  private JComboBox getCMedio() {
    if (cMedio == null) {
      cMedio = new JComboBox();
      cMedio.setBounds(new Rectangle(210, 95, 100, 20));
    }
    return cMedio;
  }

  /**
   * This method initializes bMas 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBMas() {
    if (bMas == null) {
      bMas = new JButton();
      bMas.setBounds(new Rectangle(410, 95, 45, 20));
      bMas.setText("+");
    }
    return bMas;
  }

  /**
   * This method initializes sFrecuencias 
   *  
   * @return javax.swing.JScrollPane  
   */
  private JScrollPane getSFrecuencias() {
    if (sFrecuencias == null) {
      sFrecuencias = new JScrollPane();
      sFrecuencias.setBounds(new Rectangle(10, 115, 400, 240));
    }
    return sFrecuencias;
  }

  /**
   * This method initializes tFrecuencias 
   *  
   * @return javax.swing.JTable 
   */
  private JTable getTFrecuencias() {
    if (tFrecuencias == null) {
      tFrecuencias = new JTable();
      tFrecuencias.setBounds(new Rectangle(10, 115, 400, 240));
    }
    return tFrecuencias;
  }

  /**
   * This method initializes cViaje	
   * 	
   * @return javax.swing.JComboBox	
   */
  private JComboBox getCViaje() {
    if (cViaje == null) {
      cViaje = new JComboBox();
      cViaje.setBounds(new Rectangle(101, 45, 131, 23));
    }
    return cViaje;
  }
}  
