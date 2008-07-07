package gui;

import viajes.Tramo;
import viajes.Frecuencia;

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
import javax.swing.JCheckBox;

public class G_Frecuencias {

  private JDialog dAbmFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="1,-11"
  private JPanel pAbmFrecuencias = null;
  private JLabel lViaje = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JScrollPane pFrecuencias = null;
  private JList lFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="628,-3"
  private DefaultListModel listaFrecuencias = null;  //  @jve:decl-index=0:visual-constraint="785,54"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lDias = null;
  private JComboBox cCiudad = new JComboBox();
  private JComboBox cMedio = new JComboBox();


  private JLabel lInfo = null;
  private JScrollPane sTramos = null;
  private JTable tTramos = null;
  private DefaultTableModel dTramos = new DefaultTableModel();
  private JCheckBox cLunes = null;
  private JCheckBox cMartes = null;
  private JCheckBox jMiercoles = null;
  private JCheckBox cJueves = null;
  private JCheckBox cViernes = null;
  private JCheckBox cSabado = null;
  private JCheckBox cDomingo = null;
  private JComboBox cViaje = null;
  private JLabel lFrecuencia = null;
  private JTextField tFrecuencia = null;
  
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
      lFrecuencia = new JLabel();
      lFrecuencia.setBounds(new Rectangle(10, 20, 90, 20));
      lFrecuencia.setText("Frecuencia");
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 350, 590, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lDias = new JLabel();
      lDias.setBounds(new Rectangle(226, 20, 46, 20));
      lDias.setText("Dias");
      lViaje = new JLabel();
      lViaje.setBounds(new Rectangle(10, 45, 90, 20));
      lViaje.setText("Viaje");
      pAbmFrecuencias = new JPanel();
      pAbmFrecuencias.setLayout(null);
      pAbmFrecuencias.add(lViaje);
      pAbmFrecuencias.add(getBGuardar());
      pAbmFrecuencias.add(getBCancelar());
      pAbmFrecuencias.add(getBEliminar());
      pAbmFrecuencias.add(getPFrecuencias());
      pAbmFrecuencias.add(getTBuscar());
      pAbmFrecuencias.add(getBBuscar());
      pAbmFrecuencias.add(getBNuevo(), null);
      pAbmFrecuencias.add(lDias, null);
      pAbmFrecuencias.add(lInfo, null);
      pAbmFrecuencias.add(lDias, null);
      pAbmFrecuencias.add(getTTramos(), null);
      pAbmFrecuencias.add(getSTramos(), null);
      pAbmFrecuencias.add(getCLunes(), null);
      pAbmFrecuencias.add(getCMartes(), null);
      pAbmFrecuencias.add(getJMiercoles(), null);
      pAbmFrecuencias.add(getCJueves(), null);
      pAbmFrecuencias.add(getCViernes(), null);
      pAbmFrecuencias.add(getCSabado(), null);
      pAbmFrecuencias.add(getCDomingo(), null);
      pAbmFrecuencias.add(getCViaje(), null);
      pAbmFrecuencias.add(lFrecuencia, null);
      pAbmFrecuencias.add(getTFrecuencia(), null);
      cargarListas();
      
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
    
    tNombre.setText(u.getNombre());    
    tPrecio.setText(Double.toString(u.getPrecio()));
    tPasajeros.setText(Integer.toString(u.getCapacidad()));
        
    dTramos.setRowCount(0);
    for (Tramo t : u.getTramos()) {      
      dTramos.addRow(new Object[]{t.getOrigen(),t.getDestino(),t.getMedio(),t.getDuracion()});  
    }


  }
  private void buscarFrecuencia() {
    tNombre.setText("Test2");
  }
  private void guardarFrecuencia() {
    
    try {
      Frecuencia unFrecuencia = Interfaz.getFrecuenciaPorNombre(tNombre.getText());    
      if (unFrecuencia == null)
        unFrecuencia = new Frecuencia();
      
      if ((unFrecuencia.getNombre()==null) || (JOptionPane.showConfirmDialog(
          null,"Desea sobrescribir el Frecuencia "+tNombre.getText()+"?",
          "Confirma guardar?",
          JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        )
      {
        if (tNombre.getText()!="" )    
        {
          unFrecuencia.setNombre(tNombre.getText());          
          unFrecuencia.setOrigen((Ciudad) dTramos.getValueAt(0, 0));
          unFrecuencia.setDestino((Ciudad) dTramos.getValueAt(dTramos.getRowCount()-1, 1));
          unFrecuencia.setPrecio(Double.parseDouble(tPrecio.getText()));
          unFrecuencia.setCapacidad(Integer.parseInt(tPasajeros.getText()));

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
          unFrecuencia.setTramos(tramos);
          
          if (Interfaz.agregarFrecuencia(unFrecuencia)) {
            lInfo.setForeground(new Color(65, 190, 79));
            lInfo.setText("Frecuencia " + tNombre.getText() + " guardado");
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
          lInfo.setText("Complete los datos del Frecuencia antes de guardarlo");        
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
    listaFrecuencias.clear();
    for (Frecuencia u : Interfaz.getFrecuencias()) {
      listaFrecuencias.addElement(u);  
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
    lFrecuencias.clearSelection();    
    tNombre.setText("");    
    tPrecio.setText("");
    tPasajeros.setText("");        
    dTramos.setRowCount(0);
    tNombre.requestFocus();
    
  }
  private void eliminarFrecuencia(Frecuencia u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el frecuencia "+tNombre.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      if (Interfaz.eliminarFrecuencia(u)) {
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
      tTramos.setBounds(new Rectangle(29, 141, 437, 80));
      dTramos.addColumn("Origen");      
      dTramos.addColumn("Destino");
      dTramos.addColumn("Salida");
      dTramos.addColumn("Llegada");
      
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
   * This method initializes cLunes	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCLunes() {
    if (cLunes == null) {
      cLunes = new JCheckBox();
      cLunes.setBounds(new Rectangle(275, 20, 35, 20));
      cLunes.setText("L");
    }
    return cLunes;
  }

  /**
   * This method initializes cMartes	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCMartes() {
    if (cMartes == null) {
      cMartes = new JCheckBox();
      cMartes.setBounds(new Rectangle(275, 40, 35, 20));
      cMartes.setText("M");
    }
    return cMartes;
  }

  /**
   * This method initializes jMiercoles	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getJMiercoles() {
    if (jMiercoles == null) {
      jMiercoles = new JCheckBox();
      jMiercoles.setBounds(new Rectangle(310, 20, 40, 20));
      jMiercoles.setText("Mi");
    }
    return jMiercoles;
  }

  /**
   * This method initializes cJueves	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCJueves() {
    if (cJueves == null) {
      cJueves = new JCheckBox();
      cJueves.setBounds(new Rectangle(310, 40, 35, 20));
      cJueves.setText("J");
    }
    return cJueves;
  }

  /**
   * This method initializes cViernes	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCViernes() {
    if (cViernes == null) {
      cViernes = new JCheckBox();
      cViernes.setBounds(new Rectangle(350, 20, 35, 20));
      cViernes.setText("V");
    }
    return cViernes;
  }

  /**
   * This method initializes cSabado	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCSabado() {
    if (cSabado == null) {
      cSabado = new JCheckBox();
      cSabado.setBounds(new Rectangle(350, 40, 35, 20));
      cSabado.setText("S");
    }
    return cSabado;
  }

  /**
   * This method initializes cDomingo	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox getCDomingo() {
    if (cDomingo == null) {
      cDomingo = new JCheckBox();
      cDomingo.setBounds(new Rectangle(385, 20, 35, 20));
      cDomingo.setText("D");
    }
    return cDomingo;
  }

  /**
   * This method initializes cViaje	
   * 	
   * @return javax.swing.JComboBox	
   */
  private JComboBox getCViaje() {
    if (cViaje == null) {
      cViaje = new JComboBox();
      cViaje.setBounds(new Rectangle(100, 45, 120, 20));
    }
    return cViaje;
  }

  /**
   * This method initializes tFrecuencia	
   * 	
   * @return javax.swing.JTextField	
   */
  private JTextField getTFrecuencia() {
    if (tFrecuencia == null) {
      tFrecuencia = new JTextField();
      tFrecuencia.setBounds(new Rectangle(100, 20, 120, 20));
    }
    return tFrecuencia;
  }
}  //  @jve:decl-index=0:visual-constraint="742,42"
