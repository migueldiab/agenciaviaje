package gui;

import utils.Fecha;
import viajes.Tramo;
import viajes.Frecuencia;
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
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

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
  private DefaultTableModel dTramos = new DefaultTableModel() {
    public boolean isCellEditable(int row, int column) { return column==2; } };
  private JCheckBox[] cDia = new JCheckBox[7];
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
      int i = 0;
      cDia = getCDia();
      for (i=0;i<7;i++) {
        pAbmFrecuencias.add(cDia[i], null);        
      }
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
    
    Frecuencia f = (Frecuencia) lFrecuencias.getSelectedValue();
    
    tFrecuencia.setText(f.getNombre());    
    cViaje.setSelectedItem(f.getViaje());
    int i = 0;
    for (boolean cb : f.getDias()) {
      if (cb) cDia[i].setSelected(true);
      i++;
    }
    dTramos.setRowCount(0);
    i = 0;
    for (Tramo t : f.getViaje().getTramos()) {      
      dTramos.addRow(new Object[]{t.getOrigen(),t.getDestino(),Fecha.horaToString(f.getHoras().get(i)),t.getDuracion()});
      i++;
    }
  }
  private void buscarFrecuencia() {
    
  }
  private void guardarFrecuencia() {
    
    try {
      Frecuencia unFrecuencia = Interfaz.getFrecuenciaPorNombre(tFrecuencia.getText());    
      if (unFrecuencia == null)
        unFrecuencia = new Frecuencia();
      
      if ((unFrecuencia.getNombre()==null) || (JOptionPane.showConfirmDialog(
          null,"Desea sobrescribir el Frecuencia "+tFrecuencia.getText()+"?",
          "Confirma guardar?",
          JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        )
      {
        if (tFrecuencia.getText()!="" )    
        {
          unFrecuencia.setNombre(tFrecuencia.getText());          
          if (unFrecuencia.getDisponible()==-1)
            unFrecuencia.setDisponible(((Viaje) cViaje.getSelectedItem()).getCapacidad());
          unFrecuencia.setViaje((Viaje) cViaje.getSelectedItem());
          ArrayList<Boolean> dias = new ArrayList<Boolean>();
          for (int i = 0;i<7;i++) {
            dias.add(cDia[i].isSelected());          
          }
          unFrecuencia.setDias(dias);
            
          ArrayList<Date> horas = new ArrayList<Date>();
          for (int i = 0; i < dTramos.getRowCount(); i++) {
            horas.add(Fecha.parseHora(dTramos.getValueAt(i, 2).toString()));
          }
          unFrecuencia.setHoras(horas);
          //unFrecuencia.setTramos(tramos);
          
          if (Interfaz.agregarFrecuencia(unFrecuencia)) {
            lInfo.setForeground(new Color(65, 190, 79));
            lInfo.setText("Frecuencia " + tFrecuencia.getText() + " guardado");
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
  private void cargarTramos() {
    dTramos.setRowCount(0);
    if (cViaje.getSelectedIndex()!=-1) {
      for (Tramo t : ((Viaje) cViaje.getSelectedItem()).getTramos()) {      
        dTramos.addRow(new Object[]{t.getOrigen(),t.getDestino(),null,t.getDuracion()});  
      }
      
    }
  }
  private void cargarListas() {
    listaFrecuencias.clear();
    for (Frecuencia u : Interfaz.getFrecuencias()) {
      listaFrecuencias.addElement(u);  
    }
    cViaje.removeAllItems();
    for (Viaje v : Interfaz.getViajes()) {
      cViaje.addItem(v);        
    }
    cViaje.setSelectedIndex(-1);
    cargarTramos();
  }
  


  private void limpiarCampos() {
    lFrecuencias.clearSelection();    
    tFrecuencia.setText("");    
    dTramos.setRowCount(0);
    tFrecuencia.requestFocus();
    cViaje.setSelectedIndex(-1);
    for (int i=0;i<7;i++) {
      cDia[i].setSelected(false);
    }
    
    
  }
  private void eliminarFrecuencia(Frecuencia u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el frecuencia "+tFrecuencia.getText()+"?",
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
   * This method initializes cDia	
   * 	
   * @return javax.swing.JCheckBox	
   */
  private JCheckBox[] getCDia() {
    if (cDia[0] == null) {
      cDia[0] = new JCheckBox();
      cDia[0].setBounds(new Rectangle(275, 20, 35, 20));
      cDia[0].setText("L");
      cDia[1] = new JCheckBox();
      cDia[1] .setBounds(new Rectangle(275, 40, 35, 20));
      cDia[1] .setText("M");
      cDia[2] = new JCheckBox();
      cDia[2] .setBounds(new Rectangle(310, 20, 40, 20));
      cDia[2] .setText("Mi");
      cDia[3] = new JCheckBox();
      cDia[3] .setBounds(new Rectangle(310, 40, 35, 20));
      cDia[3] .setText("J");
      cDia[4] = new JCheckBox();
      cDia[4] .setBounds(new Rectangle(350, 20, 35, 20));
      cDia[4] .setText("V");
      cDia[5] = new JCheckBox();
      cDia[5] .setBounds(new Rectangle(350, 40, 35, 20));
      cDia[5] .setText("S");
      cDia[6] = new JCheckBox();
      cDia[6] .setBounds(new Rectangle(385, 20, 35, 20));
      cDia[6] .setText("D");
    }
    return cDia;
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
      cViaje.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent e) {
          cargarTramos();
        }
      });
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
