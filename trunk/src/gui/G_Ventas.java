package gui;

import utils.Fecha;
import viajes.Frecuencia;
import viajes.Viaje;
import viajes.Venta;

import global.Ciudad;
import global.Grupo;
import global.Medio;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;

public class G_Ventas {

  private JDialog dAbmVentas = null;  //  @jve:decl-index=0:visual-constraint="1,-11"
  private JPanel pAbmVentas = null;
  private JLabel lPrecio = null;
  private JLabel lDescuento = null;
  private JLabel lDisp = null;
  private JLabel lFecha = null;
  private JLabel lOrigen = null;
  private JLabel lDestino = null;
  private JLabel lInfo = null;

  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JButton bBuscarViajes = null;

  private JTextField tFecha = null;
  private JTextField tBuscar = null;
  private JTextField tPrecio = null;
  private JTextField tDescuento = null;
  private JTextField tDisponible = null;

  private JComboBox cCiudad = new JComboBox();
  private JComboBox cMedio = new JComboBox();
  private JComboBox cOrigen = null;
  private JComboBox cDestino = null;

  private DefaultListModel listaVentas = null;  //  @jve:decl-index=0:visual-constraint="785,54"
  private DefaultListModel dViajes = new DefaultListModel();
  private DefaultListModel dFrecuencias = new DefaultListModel();
  private JList lVentas = null;  //  @jve:decl-index=0:visual-constraint="628,-3"
  private JList lViajes = null;  //  @jve:decl-index=0:visual-constraint="630,143"
  private JList lFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="712,238"
  private JScrollPane pVentas = null;
  private JScrollPane sViajes = null;
  private JScrollPane sFrecuencias = null;

  private JTable tVentas = null;  //  @jve:decl-index=0:visual-constraint="630,138"
  private JScrollPane sVenta = null;
  private DefaultTableModel dVentas = new DefaultTableModel();
  
  private JButton bMasPasjero = null;
  private JButton bMenosPasajero = null;
  private JLabel lTotal = null;
  private JTextField tTotal = null;
  
  public JDialog getDAbmVentas() {
    if (dAbmVentas == null) {
      dAbmVentas = new JDialog();
      dAbmVentas.setBounds(new Rectangle(0, 0, 590, 400));
      dAbmVentas.setContentPane(getPAbmVentas());
      dAbmVentas.setTitle("ABM Ventas");
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
      lTotal = new JLabel();
      lTotal.setBounds(new Rectangle(10, 320, 90, 20));
      lTotal.setText("Total");
      lDisp = new JLabel();
      lDisp.setBounds(new Rectangle(10, 295, 90, 20));
      lDisp.setText("Disponible");
      lDescuento = new JLabel();
      lDescuento.setBounds(new Rectangle(10, 270, 90, 20));
      lDescuento.setText("Descuento");
      lPrecio = new JLabel();
      lPrecio.setBounds(new Rectangle(10, 245, 90, 20));
      lPrecio.setText("Precio");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 350, 590, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lOrigen = new JLabel();
      lOrigen.setBounds(new Rectangle(254, 20, 90, 20));
      lOrigen.setText("Origen");
      lDestino = new JLabel();
      lDestino.setBounds(new Rectangle(254, 45, 90, 20));
      lDestino.setText("Destino");
      lFecha = new JLabel();
      lFecha.setBounds(new Rectangle(10, 20, 90, 20));
      lFecha.setText("Fecha");
      pAbmVentas = new JPanel();
      pAbmVentas.setLayout(null);
      pAbmVentas.add(lFecha);
      pAbmVentas.add(lDestino);
      pAbmVentas.add(lOrigen, null);
      pAbmVentas.add(lInfo, null);
      pAbmVentas.add(lOrigen, null);
      pAbmVentas.add(lPrecio, null);
      pAbmVentas.add(lDescuento, null);
      pAbmVentas.add(lDisp, null);
      pAbmVentas.add(getTFecha());
      pAbmVentas.add(getTBuscar());
      pAbmVentas.add(getTDescuento(), null);
      pAbmVentas.add(getTDisponible(), null);
      pAbmVentas.add(getTPrecio(), null);
      pAbmVentas.add(getBGuardar());
      pAbmVentas.add(getBBuscar());
      pAbmVentas.add(getBNuevo(), null);
      pAbmVentas.add(getBBuscarViajes(), null);
      pAbmVentas.add(getBCancelar());
      pAbmVentas.add(getBEliminar());
      pAbmVentas.add(getBMasPasjero(), null);
      pAbmVentas.add(getBMenosPasajero(), null);

      pAbmVentas.add(getCOrigen(), null);
      pAbmVentas.add(getCDestino(), null);
      
      pAbmVentas.add(getSVenta(), null);
      pAbmVentas.add(getPVentas());

      pAbmVentas.add(getLFrecuencias(), null);
      pAbmVentas.add(getSFrecuencias(), null);

      pAbmVentas.add(getLViajes(), null);
      pAbmVentas.add(getSViajes(), null);
      pAbmVentas.add(lTotal, null);
      pAbmVentas.add(getTTotal(), null);
      cargarListas();
      
    }
    return pAbmVentas;
  }

  /**
   * This method initializes tFecha  
   *  
   * @return javax.swing.JTextField 
   */
  private JTextField getTFecha() {
    if (tFecha == null) {
      tFecha = new JTextField();
      tFecha.setBounds(new Rectangle(100, 20, 150, 20));
    }
    return tFecha;
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
      bGuardar.setText("Vender");
      bGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          guardarVenta();
          
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
          dAbmVentas.setVisible(false);
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
          if (lVentas.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un venta de la lista para eliminarlo");
          }
          else {
            eliminarVenta((Venta) lVentas.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }

  /**
   * This method initializes lVentas  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPVentas() {
    listaVentas = new DefaultListModel();
    lVentas = new JList(listaVentas);
    lVentas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lVentas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lVentas.getSelectedIndex()!=-1) {
              cargarVenta();
              lInfo.setText("");

            }
          }
        });
    if (pVentas == null) {
      pVentas = new JScrollPane(lVentas);     
      pVentas.setBounds(new Rectangle(470, 40, 100, 120));
    }
    return pVentas;
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
          buscarVenta();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarVenta() {
/*    
    Venta u = (Venta) lVentas.getSelectedValue();
    
    tFecha.setText(u.getNombre());    
    tPrecio.setText(Double.toString(u.getPrecio()));
    tPasajeros.setText(Integer.toString(u.getCapacidad()));
        
    dViajes.setRowCount(0);
    for (Viaje t : u.getViajes()) {      
      dViajes.addRow(new Object[]{t.getOrigen(),t.getDestino(),t.getMedio(),t.getDuracion()});  
    }
*/

  }
  private void buscarVenta() {
    tFecha.setText("Test2");
  }
  private void guardarVenta() {
    /*
    try {
      Venta unVenta = Interfaz.getVentaPorNombre(tFecha.getText());    
      if (unVenta == null)
        unVenta = new Venta();
      
      if ((unVenta.getNombre()==null) || (JOptionPane.showConfirmDialog(
          null,"Desea sobrescribir el Venta "+tFecha.getText()+"?",
          "Confirma guardar?",
          JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        )
      {
        if (tFecha.getText()!="" )    
        {
          unVenta.setNombre(tFecha.getText());          
          unVenta.setOrigen((Ciudad) dViajes.getValueAt(0, 0));
          unVenta.setDestino((Ciudad) dViajes.getValueAt(dViajes.getRowCount()-1, 1));
          unVenta.setPrecio(Double.parseDouble(tPrecio.getText()));
          unVenta.setCapacidad(Integer.parseInt(tPasajeros.getText()));

          ArrayList<Viaje> viajes = new ArrayList<Viaje>();
          for (int i = 0; i < dViajes.getRowCount(); i++) {
            Viaje uViaje = new Viaje();
            uViaje.setOrigen((Ciudad) dViajes.getValueAt(i, 0));
            uViaje.setDestino((Ciudad) dViajes.getValueAt(i, 1));
            uViaje.setMedio((Medio) dViajes.getValueAt(i, 2));
            uViaje.setDuracion(Integer.parseInt(dViajes.getValueAt(i, 3).toString()));
            uViaje.setViaje(i);
            viajes.add(uViaje);
          }
          unVenta.setViajes(viajes);
          
          if (Interfaz.agregarVenta(unVenta)) {
            lInfo.setForeground(new Color(65, 190, 79));
            lInfo.setText("Venta " + tFecha.getText() + " guardado");
            cargarListas();
            limpiarCampos();
          }
          else {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Los viajes no son correctos. Verifique.");        
          }
        }
        else {
          lInfo.setForeground(new Color(190, 65, 79));
          lInfo.setText("Complete los datos del Venta antes de guardarlo");        
        }
      }
    }
    catch(Exception e){
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("Error de formato de entrada. Verifique los valores numéricos de fecha.");        
    }    
    */
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
    listaVentas.clear();
    for (Venta u : Interfaz.getVentas()) {
      listaVentas.addElement(u);  
    }
    cCiudad.removeAllItems();
    for (Ciudad c : Interfaz.getCiudades()) {
      cCiudad.addItem(c);
      cOrigen.addItem(c);
      cDestino.addItem(c);
    }   
    cMedio.removeAllItems();
    for (Medio m : Interfaz.getMedios()) {
      cMedio.addItem(m);        
    }
  }
  


  private void limpiarCampos() {
    lVentas.clearSelection();    
    tFecha.setText("");    
    tPrecio.setText("");
            
    dViajes.clear();
    tFecha.requestFocus();
    
  }
  private void eliminarVenta(Venta u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el venta "+tFecha.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      if (Interfaz.eliminarVenta(u)) {
        cargarListas();
        limpiarCampos();
      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("No se pudo eliminar el medio.");           
      }
    }
  }

  /**
   * This method initializes sViajes  
   *  
   * @return javax.swing.JScrollPane  
   */
  private JScrollPane getSViajes() {
    if (sViajes == null) {
      sViajes = new JScrollPane();
      sViajes.setBounds(new Rectangle(10, 75, 220, 160));
      sViajes.setViewportView(getLViajes());
    }
    return sViajes;
  }

  /**
   * This method initializes tViajes  
   *  
   * @return javax.swing.JTable 
   */
  public void borrarViaje() {
    /*
    int filas = dViajes.getRowCount()-1;
    if (filas==-1) {
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("No hay viajes para borrar.");        
    }
    else {
      dViajes.removeRow(filas);
    }
     */
  }
  public void agregarViaje() {
    /*
    int filas = dViajes.getRowCount()-1;
    if ((filas!=-1)  && 
        (dViajes.getValueAt(filas,0)==null) &&
        (dViajes.getValueAt(filas,1)==null) &&
        (dViajes.getValueAt(filas,2)==null) 
        ) {
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("Complete el viaje actual antes de ingresar uno nuevo.");        
    }
    else {
      Ciudad origen = null;
      if (filas!=-1) {
        origen = (Ciudad) dViajes.getValueAt(dViajes.getRowCount()-1, 1);
      }
      dViajes.addRow(new Object[]{origen,null,null,0});
      
    }
    */      
  }

  /**
   * This method initializes bBuscarViajes 
   *  
   * @return javax.swing.JButton  
   */
  private JButton getBBuscarViajes() {
    if (bBuscarViajes == null) {
      bBuscarViajes = new JButton();
      bBuscarViajes.setBounds(new Rectangle(10, 45, 190, 20));
      bBuscarViajes.setText("Buscar");
      bBuscarViajes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          buscarViajes();
        }
      });
    }
    return bBuscarViajes;
  }

  /**
   * This method initializes cOrigen  
   *  
   * @return javax.swing.JComboBox  
   */
  private JComboBox getCOrigen() {
    if (cOrigen == null) {
      cOrigen = new JComboBox();
      cOrigen.setBounds(new Rectangle(345, 20, 100, 20));
    }
    return cOrigen;
  }

  /**
   * This method initializes cDestino 
   *  
   * @return javax.swing.JComboBox  
   */
  private JComboBox getCDestino() {
    if (cDestino == null) {
      cDestino = new JComboBox();
      cDestino.setBounds(new Rectangle(345, 45, 100, 20));
    }
    return cDestino;
  }

  /**
   * This method initializes sFrecuencias 
   *  
   * @return javax.swing.JScrollPane  
   */
  private JScrollPane getSFrecuencias() {
    if (sFrecuencias == null) {
      sFrecuencias = new JScrollPane();
      sFrecuencias.setBounds(new Rectangle(240, 75, 220, 160));
      sFrecuencias.setViewportView(getLFrecuencias());      
    }
    return sFrecuencias;
  }

  /**
   * This method initializes sVenta	
   * 	
   * @return javax.swing.JScrollPane	
   */
  private JScrollPane getSVenta() {
    if (sVenta == null) {
      sVenta = new JScrollPane();
      sVenta.setBounds(new Rectangle(210, 245, 220, 100));
      sVenta.setViewportView(getTVenta());
    }
    return sVenta;
  }

  /**
   * This method initializes tPrecio	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPrecio() {
    if (tPrecio == null) {
      tPrecio = new JTextField();
      tPrecio.setBounds(new Rectangle(100, 245, 100, 20));
      tPrecio.setEditable(false);
    }
    return tPrecio;
  }

  /**
   * This method initializes tDescuento	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTDescuento() {
    if (tDescuento == null) {
      tDescuento = new JTextField();
      tDescuento.setBounds(new Rectangle(100, 270, 100, 20));
      tDescuento.setEditable(false);
    }
    return tDescuento;
  }

  /**
   * This method initializes tDisponible	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTDisponible() {
    if (tDisponible == null) {
      tDisponible = new JTextField();
      tDisponible.setBounds(new Rectangle(100, 295, 100, 20));
      tDisponible.setEditable(false);
    }
    return tDisponible;
  }
  private void buscarViajes() {
    dViajes.clear();
    Date fecha = Fecha.parseFecha(tFecha.getText());
    Ciudad origen = (Ciudad) cOrigen.getSelectedItem();
    Ciudad destino = (Ciudad) cDestino.getSelectedItem();
    if ((fecha!=null) && (origen!=null) && (destino!=null)) {
      for (Viaje v : Interfaz.getViajesVenta(fecha, origen, destino)) {
        dViajes.addElement(v);  
      }      
    }
    else {
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("Los datos de busqueda no son correctos.");
    }
  }
  
  private void buscarFrecuencias(Viaje v) {
    dFrecuencias.clear();
    for (Frecuencia f : Interfaz.getFrecuenciasPorViaje(v)) {
      dFrecuencias.addElement(f);  
    }    
  }
  


  /**
   * This method initializes bMasPasjero	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBMasPasjero() {
    if (bMasPasjero == null) {
      bMasPasjero = new JButton();
      bMasPasjero.setBounds(new Rectangle(430, 300, 45, 20));
      bMasPasjero.setText("+");
      bMasPasjero.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          agregarPasajero();
        }
      });
    }
    return bMasPasjero;
  }

  /**
   * This method initializes bMenosPasajero	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBMenosPasajero() {
    if (bMenosPasajero == null) {
      bMenosPasajero = new JButton();
      bMenosPasajero.setBounds(new Rectangle(430, 320, 45, 20));
      bMenosPasajero.setText("-");
    }
    return bMenosPasajero;
  }
  private void agregarPasajero() {
    dVentas.addRow(new Object[]{"a1","b2"});
  }

  /**
   * This method initializes lViajes	
   * 	
   * @return javax.swing.JList	
   */
  private JList getLViajes() {
    if (lViajes == null) {
      lViajes = new JList(dViajes);
      //lViajes.setSize(new Dimension(60, 50));
      lViajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent e) {
          if (lViajes.getSelectedIndex()!=-1) {
            buscarFrecuencias((Viaje) lViajes.getSelectedValue());
          }
        }
      });
    }
    return lViajes;
  }
  /**
   * This method initializes tVenta 
   *  
   * @return javax.swing.JTable 
   */
  private JTable getTVenta() {
    if (tVentas == null) {
      tVentas = new JTable(dVentas); // dVentas
      dVentas.addColumn("Nombre");
      dVentas.addColumn("Documento");
    }
    return tVentas;
  }

  /**
   * This method initializes lFrecuencias	
   * 	
   * @return javax.swing.JList	
   */
  private JList getLFrecuencias() {
    if (lFrecuencias == null) {
      lFrecuencias = new JList(dFrecuencias);
      lFrecuencias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent e) {
          if (lFrecuencias.getSelectedIndex()!=-1) {
            cargarFrecuencias();
          }
        }
      });

    }
    return lFrecuencias;
  }
  public void cargarFrecuencias() {
    
  }

  /**
   * This method initializes tTotal	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTTotal() {
    if (tTotal == null) {
      tTotal = new JTextField();
      tTotal.setBounds(new Rectangle(100, 320, 100, 20));
      tTotal.setEditable(false);
    }
    return tTotal;
  }
  
  
} 
