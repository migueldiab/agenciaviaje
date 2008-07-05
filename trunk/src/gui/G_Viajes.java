package gui;

import viajes.Viaje;

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

public class G_Viajes {

  private JDialog dAbmViajes = null;  //  @jve:decl-index=0:visual-constraint="10,179"
  private JPanel pAbmViajes = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JComboBox cOrigen = null;
  private JLabel lPasajeros = null;
  private JLabel lOrigen = null;
  private JLabel lDestino = null;
  private JScrollPane pViajes = null;
  private JList lViajes = null;  
  private DefaultListModel listaViajes = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lPrecio = null;
  private JTextField tApellido = null;
  private JLabel lId = null;
  private JTextField tId = null;
  private JLabel lInfo = null;
  private JLabel lMedio = null;
  private JLabel lDuracion = null;
  private JComboBox cDestino = null;
  private JTextField tDuracion = null;
  private JComboBox cMedio = null;
  private JTextField tPasajeros = null;
  private JButton bMas = null;
  private JScrollPane sTramos = null;
  private JTable tTramos = null;
  public JDialog getDAbmViajes() {
    if (dAbmViajes == null) {
      dAbmViajes = new JDialog();
      dAbmViajes.setBounds(new Rectangle(0, 0, 590, 400));
      dAbmViajes.setContentPane(getPAbmViajes());
      dAbmViajes.setTitle("ABM Viajes");
    }
    return dAbmViajes;
  }

  /**
   * This method initializes pAbmViajes 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmViajes() {
    if (pAbmViajes == null) {
      lDuracion = new JLabel();
      lDuracion.setBounds(new Rectangle(310, 75, 100, 20));
      lDuracion.setText("Duracion");
      lMedio = new JLabel();
      lMedio.setBounds(new Rectangle(210, 75, 100, 20));
      lMedio.setText("Medio");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 350, 590, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lId = new JLabel();
      lId.setBounds(new Rectangle(10, 20, 90, 20));
      lId.setText("Id Viaje");
      lPrecio = new JLabel();
      lPrecio.setBounds(new Rectangle(254, 20, 90, 20));
      lPrecio.setText("Precio");
      lDestino = new JLabel();
      lDestino.setBounds(new Rectangle(110, 75, 100, 20));
      lDestino.setText("Destino");
      lOrigen = new JLabel();
      lOrigen.setBounds(new Rectangle(10, 75, 100, 20));
      lOrigen.setText("Origen");
      lPasajeros = new JLabel();
      lPasajeros.setBounds(new Rectangle(254, 45, 90, 20));
      lPasajeros.setText("Pasajeros");
      lNombre = new JLabel();
      lNombre.setBounds(new Rectangle(10, 45, 90, 20));
      lNombre.setText("Nombre");
      pAbmViajes = new JPanel();
      pAbmViajes.setLayout(null);
      pAbmViajes.add(lNombre);
      pAbmViajes.add(getTNombre());
      pAbmViajes.add(getBGuardar());
      pAbmViajes.add(getBCancelar());
      pAbmViajes.add(getBEliminar());
      pAbmViajes.add(getCOrigen());
      pAbmViajes.add(lPasajeros);
      pAbmViajes.add(lOrigen);
      pAbmViajes.add(lDestino);
      pAbmViajes.add(getPViajes());
      pAbmViajes.add(getTBuscar());
      pAbmViajes.add(getBBuscar());
      pAbmViajes.add(getBNuevo(), null);
      pAbmViajes.add(lPrecio, null);
      pAbmViajes.add(getTApellido(), null);
      pAbmViajes.add(lId, null);
      pAbmViajes.add(getTId(), null);
      pAbmViajes.add(lInfo, null);
      pAbmViajes.add(lMedio, null);
      pAbmViajes.add(lDuracion, null);
      pAbmViajes.add(getCDestino(), null);
      pAbmViajes.add(getTDuracion(), null);
      pAbmViajes.add(getCMedio(), null);
      pAbmViajes.add(getTPasajeros(), null);
      pAbmViajes.add(getBMas(), null);
      pAbmViajes.add(getTTramos(), null);
      pAbmViajes.add(getSTramos(), null);
      
    }
    return pAbmViajes;
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
      bGuardar.setBounds(new Rectangle(470, 200, 100, 30));
      bGuardar.setText("Guardar");
      bGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          guardarViaje();
          
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
          dAbmViajes.setVisible(false);
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
          if (lViajes.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un viaje de la lista para eliminarlo");
          }
          else {
            eliminarViaje((Viaje) lViajes.getSelectedValue());
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
   * This method initializes lViajes  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPViajes() {
    listaViajes = new DefaultListModel();
    lViajes = new JList(listaViajes);
    lViajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lViajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lViajes.getSelectedIndex()!=-1) {
              cargarViaje();
              lInfo.setText("");

            }
          }
        });
    if (pViajes == null) {
      pViajes = new JScrollPane(lViajes);     
      pViajes.setBounds(new Rectangle(470, 40, 100, 120));
      cargarListas();
    }
    return pViajes;
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
          buscarViaje();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarViaje() {
    
    Viaje u = (Viaje) lViajes.getSelectedValue();    

  }
  private void buscarViaje() {
    tNombre.setText("Test2");
  }
  private void guardarViaje() {
    
    
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
    listaViajes.clear();
    for (Viaje u : Interfaz.getViajes()) {
      listaViajes.addElement(u);  
    }
     
  }

  /**
   * This method initializes tApellido  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTApellido() {
    if (tApellido == null) {
      tApellido = new JTextField();
      tApellido.setBounds(new Rectangle(350, 20, 100, 20));
    }
    return tApellido;
  }

  /**
   * This method initializes tId  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTId() {
    if (tId == null) {
      tId = new JTextField();
      tId.setBounds(new Rectangle(100, 20, 100, 20));
    }
    return tId;
  }
  private void limpiarCampos() {
    lViajes.clearSelection();
    
    tId.setText("");
    tNombre.setText("");
    tApellido.setText("");
    
    
    tId.requestFocus();
  }
  private void eliminarViaje(Viaje u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el viaje "+tId.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      Interfaz.eliminarViaje(u);
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
   * This method initializes tPasajeros	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPasajeros() {
    if (tPasajeros == null) {
      tPasajeros = new JTextField();
      tPasajeros.setBounds(new Rectangle(350, 45, 60, 20));
    }
    return tPasajeros;
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
   * This method initializes sTramos	
   * 	
   * @return javax.swing.JScrollPane	
   */
  private JScrollPane getSTramos() {
    if (sTramos == null) {
      sTramos = new JScrollPane();
      sTramos.setBounds(new Rectangle(10, 115, 400, 240));
    }
    return sTramos;
  }

  /**
   * This method initializes tTramos	
   * 	
   * @return javax.swing.JTable	
   */
  private JTable getTTramos() {
    if (tTramos == null) {
      tTramos = new JTable();
      tTramos.setBounds(new Rectangle(10, 115, 400, 240));
    }
    return tTramos;
  }
}  
