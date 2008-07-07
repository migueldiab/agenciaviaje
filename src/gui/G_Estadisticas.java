package gui;

import viajes.Venta;

import global.Usuario;

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
import javax.swing.JTable;

public class G_Estadisticas {

  private JDialog dAbmVentas = null;
  private JPanel pAbmVentas = null;
  private JList lVentas = null;  
  private DefaultListModel listaVentas = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JLabel lPasajes = null;
  private JTextField tPasajes = null;
  private JLabel lMonto = null;
  private JTextField tMonto = null;
  private JScrollPane sVentas = null;
  private JTable tVentas = null;
  public JDialog getDAbmVentas() {
    if (dAbmVentas == null) {
      dAbmVentas = new JDialog();
      dAbmVentas.setBounds(new Rectangle(0, 0, 380, 290));
      dAbmVentas.setContentPane(getPAbmVentas());
      dAbmVentas.setTitle("Estadisticas");
    }
    return dAbmVentas;
  }

  /**
   * This method initializes pAbmVentas 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmVentas() {
    if (pAbmVentas == null) {
      lMonto = new JLabel();
      lMonto.setBounds(new Rectangle(12, 45, 90, 20));
      lMonto.setText("Monto Total");
      lPasajes = new JLabel();
      lPasajes.setBounds(new Rectangle(10, 20, 90, 20));
      lPasajes.setText("P. Vendidos");
      
      pAbmVentas = new JPanel();
      pAbmVentas.setLayout(null);
      pAbmVentas.add(lPasajes, null);
      pAbmVentas.add(getTPasajes(), null);
      pAbmVentas.add(lMonto, null);
      pAbmVentas.add(getTMonto(), null);
      pAbmVentas.add(getSVentas(), null);
      pAbmVentas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent e) {
          if ((e.getPropertyName().equals("enabled"))) {
            cargarDatos(); 
          }
        }
      });
      cargarListas();
      
    }
    return pAbmVentas;
  }

  private void cargarVenta() {    
    Venta u = (Venta) lVentas.getSelectedValue();    
    tPasajes.setText(u.getCodigo());
  }
  private void buscarVenta() {
    listaVentas.clear();
    listaVentas.addElement(Interfaz.getVentaPorCodigo(tPasajes.getText()));
  }
  private void cargarListas() {
    listaVentas.clear();
    for (Venta u : Interfaz.getVentas()) {
      listaVentas.addElement(u);  
    }
  }

  private void limpiarCampos() {
    lVentas.clearSelection();    
    tPasajes.setText("");
    tPasajes.requestFocus();
  }
  /**
   * This method initializes tPasajes  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTPasajes() {
    if (tPasajes == null) {
      tPasajes = new JTextField();
      tPasajes.setBounds(new Rectangle(100, 20, 135, 20));
    }
    return tPasajes;
  }

  /**
   * This method initializes tMonto	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTMonto() {
    if (tMonto == null) {
      tMonto = new JTextField();
      tMonto.setBounds(new Rectangle(105, 44, 128, 18));
    }
    return tMonto;
  }

  /**
   * This method initializes sVentas	
   * 	
   * @return javax.swing.JScrollPane	
   */
  private JScrollPane getSVentas() {
    if (sVentas == null) {
      sVentas = new JScrollPane();
      sVentas.setBounds(new Rectangle(16, 73, 343, 120));
      sVentas.setViewportView(getTVentas());
    }
    return sVentas;
  }

  /**
   * This method initializes tVentas	
   * 	
   * @return javax.swing.JTable	
   */
  private JTable getTVentas() {
    if (tVentas == null) {
      tVentas = new JTable();
    }
    return tVentas;
  }
  public void cargarDatos() {
    Interfaz.getVentasPorVendedor(sistema.Inicio.SisRes.usuarioActual);
  }

}
