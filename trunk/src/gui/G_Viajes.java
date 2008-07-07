package gui;

import viajes.Tramo;
import viajes.Viaje;

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

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class G_Viajes {

  private JDialog dAbmViajes = null;  //  @jve:decl-index=0:visual-constraint="1,-11"
  private JPanel pAbmViajes = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JLabel lPasajeros = null;
  private JScrollPane pViajes = null;
  private JList lViajes = null;  //  @jve:decl-index=0:visual-constraint="628,-3"
  private DefaultListModel listaViajes = null;  //  @jve:decl-index=0:visual-constraint="785,54"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lPrecio = null;
  private JComboBox cCiudad = new JComboBox();
  private JComboBox cMedio = new JComboBox();


  private JLabel lInfo = null;
  private JTextField tPrecio = null;
  private JTextField tPasajeros = null;
  private JButton bMas = null;
  private JScrollPane sTramos = null;
  private JTable tTramos = null;
  private DefaultTableModel dTramos = new DefaultTableModel();
  private JButton bMenos = null;
  
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
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 350, 590, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lPrecio = new JLabel();
      lPrecio.setBounds(new Rectangle(254, 20, 90, 20));
      lPrecio.setText("Precio");
      lPasajeros = new JLabel();
      lPasajeros.setBounds(new Rectangle(254, 45, 90, 20));
      lPasajeros.setText("Pasajeros");
      lNombre = new JLabel();
      lNombre.setBounds(new Rectangle(10, 20, 90, 20));
      lNombre.setText("Nombre");
      pAbmViajes = new JPanel();
      pAbmViajes.setLayout(null);
      pAbmViajes.add(lNombre);
      pAbmViajes.add(getTNombre());
      pAbmViajes.add(getBGuardar());
      pAbmViajes.add(getBCancelar());
      pAbmViajes.add(getBEliminar());
      pAbmViajes.add(lPasajeros);
      pAbmViajes.add(getPViajes());
      pAbmViajes.add(getTBuscar());
      pAbmViajes.add(getBBuscar());
      pAbmViajes.add(getBNuevo(), null);
      pAbmViajes.add(lPrecio, null);
      pAbmViajes.add(lInfo, null);
      pAbmViajes.add(lPrecio, null);
      pAbmViajes.add(getTPrecio(), null);
      pAbmViajes.add(getTPasajeros(), null);
      pAbmViajes.add(getBMas(), null);
      pAbmViajes.add(getTTramos(), null);
      pAbmViajes.add(getSTramos(), null);
      pAbmViajes.add(getBMenos(), null);
      cargarListas();
      
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
      tNombre.setBounds(new Rectangle(100, 20, 150, 20));
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
    
    tNombre.setText(u.getNombre());    
    tPrecio.setText(Double.toString(u.getPrecio()));
    tPasajeros.setText(Integer.toString(u.getCapacidad()));
        
    dTramos.setRowCount(0);
    for (Tramo t : u.getTramos()) {      
      dTramos.addRow(new Object[]{t.getOrigen(),t.getDestino(),t.getMedio(),t.getDuracion()});  
    }


  }
  private void buscarViaje() {
    tNombre.setText("Test2");
  }
  private void guardarViaje() {
    
    try {
      Viaje unViaje = Interfaz.getViajePorNombre(tNombre.getText());    
      if (unViaje == null)
        unViaje = new Viaje();
      
      if ((unViaje.getNombre()==null) || (JOptionPane.showConfirmDialog(
          null,"Desea sobrescribir el Viaje "+tNombre.getText()+"?",
          "Confirma guardar?",
          JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        )
      {
        if (tNombre.getText()!="" )    
        {
          unViaje.setNombre(tNombre.getText());          
          unViaje.setOrigen((Ciudad) dTramos.getValueAt(0, 0));
          unViaje.setDestino((Ciudad) dTramos.getValueAt(dTramos.getRowCount()-1, 1));
          unViaje.setPrecio(Double.parseDouble(tPrecio.getText()));
          unViaje.setCapacidad(Integer.parseInt(tPasajeros.getText()));

          ArrayList<Tramo> tramos = new ArrayList<Tramo>();
          for (int i = 0; i < dTramos.getRowCount(); i++) {
            Tramo uTramo = new Tramo();
            uTramo.setOrigen((Ciudad) dTramos.getValueAt(i, 0));
            uTramo.setDestino((Ciudad) dTramos.getValueAt(i, 1));
            uTramo.setMedio((Medio) dTramos.getValueAt(i, 2));
            uTramo.setDuracion(Integer.parseInt(dTramos.getValueAt(i, 3).toString()));
            uTramo.setTramo(i);
            tramos.add(uTramo);
          }
          unViaje.setTramos(tramos);
          
          if (Interfaz.agregarViaje(unViaje)) {
            lInfo.setForeground(new Color(65, 190, 79));
            lInfo.setText("Viaje " + tNombre.getText() + " guardado");
            cargarListas();
            limpiarCampos();
          }
          else {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Los tramos no son correctos. Verifique.");        
          }
        }
        else {
          lInfo.setForeground(new Color(190, 65, 79));
          lInfo.setText("Complete los datos del Viaje antes de guardarlo");        
        }
      }
    }
    catch(Exception e){
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("Error de formato de entrada. Verifique los valores numéricos de fecha.");        
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
    cCiudad.removeAllItems();
    for (Ciudad c : Interfaz.getCiudades()) {
      cCiudad.addItem(c);        
    }   
    cMedio.removeAllItems();
    for (Medio m : Interfaz.getMedios()) {
      cMedio.addItem(m);        
    }
  }
  


  private void limpiarCampos() {
    lViajes.clearSelection();    
    tNombre.setText("");    
    tPrecio.setText("");
    tPasajeros.setText("");        
    dTramos.setRowCount(0);
    tNombre.requestFocus();
    
  }
  private void eliminarViaje(Viaje u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el viaje "+tNombre.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      if (Interfaz.eliminarViaje(u)) {
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
   * This method initializes tDuracion	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPrecio() {
    if (tPrecio == null) {
      tPrecio = new JTextField();
      tPrecio.setBounds(new Rectangle(345, 20, 100, 20));
      tPrecio.setHorizontalAlignment(JTextField.LEFT);
    }
    return tPrecio;
  }

  /**
   * This method initializes tPasajeros	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTPasajeros() {
    if (tPasajeros == null) {
      tPasajeros = new JTextField();
      tPasajeros.setBounds(new Rectangle(385, 45, 60, 20));
      tPasajeros.setHorizontalAlignment(JTextField.LEFT);
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
      bMas.setBounds(new Rectangle(10, 45, 90, 20));
      bMas.setText("+ Tramo");
      bMas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          agregarTramo();
        }
      });
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
      sTramos.setBounds(new Rectangle(10, 75, 440, 260));
      sTramos.setViewportView(tTramos);
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
      tTramos = new JTable(dTramos);
      dTramos.addColumn("Origen");
      dTramos.addColumn("Destino");
      dTramos.addColumn("Medio");
      dTramos.addColumn("Duracion");
      tTramos.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(cCiudad));
      tTramos.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(cCiudad));
      tTramos.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(cMedio));
      //tTramos.setBounds(new Rectangle(50, 115, 400, 240));
    }
    return tTramos;
  }
  public void borrarTramo() {
    int filas = dTramos.getRowCount()-1;
    if (filas==-1) {
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("No hay tramos para borrar.");        
    }
    else {
      dTramos.removeRow(filas);
    }
    
      
  }
  public void agregarTramo() {
    int filas = dTramos.getRowCount()-1;
    if ((filas!=-1)  && 
        (dTramos.getValueAt(filas,0)==null) &&
        (dTramos.getValueAt(filas,1)==null) &&
        (dTramos.getValueAt(filas,2)==null) 
        ) {
      lInfo.setForeground(new Color(190, 65, 79));
      lInfo.setText("Complete el tramo actual antes de ingresar uno nuevo.");        
    }
    else {
      Ciudad origen = null;
      if (filas!=-1) {
        origen = (Ciudad) dTramos.getValueAt(dTramos.getRowCount()-1, 1);
      }
      dTramos.addRow(new Object[]{origen,null,null,0});
      
    }
    
      
  }

  /**
   * This method initializes bMenos	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getBMenos() {
    if (bMenos == null) {
      bMenos = new JButton();
      bMenos.setBounds(new Rectangle(100, 45, 90, 20));
      bMenos.setText("- Tramo");
      bMenos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          borrarTramo();
        }
      });
    }
    return bMenos;
  }
}  //  @jve:decl-index=0:visual-constraint="742,42"
