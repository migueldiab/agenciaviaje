package gui;

import viajes.Venta;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class G_BuscarPasaje {

  private JDialog dBusquedaCodigo = null;  //  @jve:decl-index=0:visual-constraint="10,-3"
  private JPanel pBusquedaCodigo = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private DefaultListModel listaVentas = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JLabel lInfo = null;
  private JLabel lCodigo = null;
  private JTextField tCodigo = null;
  private JLabel lFecha = null;
  private JLabel lVendedor = null;
  private JLabel lPasajero = null;
  private JTextField tFecha = null;
  private JTextField tVendedor = null;
  private JTextField tPasajero = null;
  private JLabel lViaje = null;
  private JTextField tViaje = null;
  private JLabel lPartida = null;
  private JTextField tPartida = null;
  public JDialog getDAbmVentas() {
    if (dBusquedaCodigo == null) {
      dBusquedaCodigo = new JDialog();
      dBusquedaCodigo.setBounds(new Rectangle(0, 0, 380, 290));
      dBusquedaCodigo.setContentPane(getPAbmVentas());
      dBusquedaCodigo.setTitle("Busqueda por Codigo");
    }
    return dBusquedaCodigo;
  }

  /**
   * This method initializes pAbmVentas 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmVentas() {
    if (pBusquedaCodigo == null) {
      lPartida = new JLabel();
      lPartida.setBounds(new Rectangle(10, 155, 90, 21));
      lPartida.setText("Partida");
      lViaje = new JLabel();
      lViaje.setBounds(new Rectangle(10, 130, 89, 24));
      lViaje.setText("Viaje");
      lPasajero = new JLabel();
      lPasajero.setBounds(new Rectangle(10, 95, 90, 20));
      lPasajero.setText("Pasajero");
      lVendedor = new JLabel();
      lVendedor.setBounds(new Rectangle(10, 70, 90, 20));
      lVendedor.setText("Vendedor");
      lFecha = new JLabel();
      lFecha.setBounds(new Rectangle(10, 45, 90, 20));
      lFecha.setText("Fecha");
      lCodigo = new JLabel();
      lCodigo.setBounds(new Rectangle(10, 20, 90, 20));
      lCodigo.setText("Codigo");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 240, 370, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      pBusquedaCodigo = new JPanel();
      pBusquedaCodigo.setLayout(null);
      pBusquedaCodigo.add(getBGuardar());
      pBusquedaCodigo.add(getBCancelar());
      pBusquedaCodigo.add(lInfo, null);
      pBusquedaCodigo.add(lCodigo, null);
      pBusquedaCodigo.add(getTCodigo(), null);
      pBusquedaCodigo.add(lFecha, null);
      pBusquedaCodigo.add(lVendedor, null);
      pBusquedaCodigo.add(lPasajero, null);
      pBusquedaCodigo.add(getTFecha(), null);
      pBusquedaCodigo.add(getTVendedor(), null);
      pBusquedaCodigo.add(getTPasajero(), null);
      pBusquedaCodigo.add(lViaje, null);
      pBusquedaCodigo.add(getTViaje(), null);
      pBusquedaCodigo.add(lPartida, null);
      pBusquedaCodigo.add(getTPartida(), null);
      cargarListas();
      
    }
    return pBusquedaCodigo;
  }

  /**
   * This method initializes bGuardar 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBGuardar() {
    if (bGuardar == null) {
      bGuardar = new JButton();
      bGuardar.setBounds(new Rectangle(244, 18, 100, 20));
      bGuardar.setText("Buscar");
      bGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          buscarVenta();
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
          dBusquedaCodigo.setVisible(false);
        }
      });
    }
    return bCancelar;
  }

  /**
   * This method initializes lVentas  
   *  
   * @return javax.swing.JList  
   */
  
  private void buscarVenta() {
    listaVentas.clear();
    listaVentas.addElement(Interfaz.getVentaPorCodigo(tCodigo.getText()));
  }
  private void cargarListas() {
    listaVentas.clear();
    for (Venta u : Interfaz.getVentas()) {
      listaVentas.addElement(u);  
    }
  }

  private void limpiarCampos() {
        
    tCodigo.setText("");
    tCodigo.requestFocus();
  }
  /**
   * This method initializes tCodigo  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTCodigo() {
    if (tCodigo == null) {
      tCodigo = new JTextField();
      tCodigo.setBounds(new Rectangle(100, 20, 135, 20));
    }
    return tCodigo;
  }

  /**
   * This method initializes tFecha	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTFecha() {
    if (tFecha == null) {
      tFecha = new JTextField();
      tFecha.setBounds(new Rectangle(100, 45, 100, 20));
    }
    return tFecha;
  }

  /**
   * This method initializes tVendedor	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTVendedor() {
    if (tVendedor == null) {
      tVendedor = new JTextField();
      tVendedor.setBounds(new Rectangle(100, 70, 100, 20));
    }
    return tVendedor;
  }

  /**
   * This method initializes tPasajero	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPasajero() {
    if (tPasajero == null) {
      tPasajero = new JTextField();
      tPasajero.setBounds(new Rectangle(100, 95, 100, 20));
    }
    return tPasajero;
  }

  /**
   * This method initializes tViaje	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTViaje() {
    if (tViaje == null) {
      tViaje = new JTextField();
      tViaje.setBounds(new Rectangle(100, 130, 100, 20));
    }
    return tViaje;
  }

  /**
   * This method initializes tPartida	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPartida() {
    if (tPartida == null) {
      tPartida = new JTextField();
      tPartida.setBounds(new Rectangle(100, 155, 100, 20));
    }
    return tPartida;
  }

}  //  @jve:decl-index=0:visual-constraint="491,21"
