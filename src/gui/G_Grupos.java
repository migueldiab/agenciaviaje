package gui;

import global.Grupo;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class G_Grupos {

  private JDialog dAbmGrupos = null;
  private JPanel pAbmGrupos = null;
  private JLabel lNombre = null;
  private JTextField tNombre = null;
  private JButton bGuardar = null;
  private JButton bCancelar = null;
  private JButton bEliminar = null;
  private JScrollPane pGrupos = null;
  private JList lGrupos = null;  
  private DefaultListModel listaGrupos = null;  //  @jve:decl-index=0:visual-constraint="538,137"
  private JTextField tBuscar = null;
  private JButton bBuscar = null;
  private JButton bNuevo = null;
  private JLabel lId = null;
  private JTextField tId = null;
  private JLabel lInfo = null;
  public JDialog getDAbmGrupos() {
    if (dAbmGrupos == null) {
      dAbmGrupos = new JDialog();
      dAbmGrupos.setBounds(new Rectangle(0, 0, 380, 290));
      dAbmGrupos.setContentPane(getPAbmGrupos());
      dAbmGrupos.setTitle("ABM Grupos");
    }
    return dAbmGrupos;
  }

  /**
   * This method initializes pAbmGrupos 
   *  
   * @return javax.swing.JPanel 
   */
  private JPanel getPAbmGrupos() {
    if (pAbmGrupos == null) {
      lInfo = new JLabel();
      lInfo.setBounds(new Rectangle(0, 240, 370, 30));
      lInfo.setHorizontalAlignment(SwingConstants.CENTER);
      lInfo.setHorizontalTextPosition(SwingConstants.CENTER);
      
      lInfo.setText("");
      lId = new JLabel();
      lId.setBounds(new Rectangle(10, 20, 90, 20));
      lId.setText("Id Grupo");
      lNombre = new JLabel();
      lNombre.setBounds(new Rectangle(10, 45, 90, 20));
      lNombre.setText("Nombre");
      pAbmGrupos = new JPanel();
      pAbmGrupos.setLayout(null);
      pAbmGrupos.add(lNombre);
      pAbmGrupos.add(getTNombre());
      pAbmGrupos.add(getBGuardar());
      pAbmGrupos.add(getBCancelar());
      pAbmGrupos.add(getBEliminar());
      pAbmGrupos.add(getPGrupos());
      pAbmGrupos.add(getTBuscar());
      pAbmGrupos.add(getBBuscar());
      pAbmGrupos.add(getBNuevo(), null);
      pAbmGrupos.add(lId, null);
      pAbmGrupos.add(getTId(), null);
      pAbmGrupos.add(lInfo, null);
      
    }
    return pAbmGrupos;
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
          guardarGrupo();
          
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
          dAbmGrupos.setVisible(false);
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
          if (lGrupos.getSelectedIndex()==-1) {
            lInfo.setForeground(new Color(190, 65, 79));
            lInfo.setText("Debe seleccionar un grupo de la lista para eliminarlo");
          }
          else {
            eliminarGrupo((Grupo) lGrupos.getSelectedValue());
          }
        }
      });
    }
    return bEliminar;
  }


  /**
   * This method initializes lGrupos  
   *  
   * @return javax.swing.JList  
   */
  private JScrollPane getPGrupos() {
    listaGrupos = new DefaultListModel();
    lGrupos = new JList(listaGrupos);
    lGrupos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lGrupos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (lGrupos.getSelectedIndex()!=-1) {
              cargarGrupo();
              lInfo.setText("");

            }
          }
        });
    if (pGrupos == null) {
      pGrupos = new JScrollPane(lGrupos);     
      pGrupos.setBounds(new Rectangle(260, 40, 100, 120));
      cargarListaGrupos();
    }
    return pGrupos;
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
          buscarGrupo();
        }
      });
    }
    return bBuscar;
  }
  
  private void cargarGrupo() {
    
    Grupo u = (Grupo) lGrupos.getSelectedValue();    
    tId.setText(Integer.toString(u.getId()));
    tNombre.setText(u.getNombre());
  }
  private void buscarGrupo() {
    tNombre.setText("Test2");
  }
  private void guardarGrupo() {
    Grupo unGrupo = Interfaz.getGrupoPorId(Integer.parseInt(tId.getText()));    
    if (unGrupo == null)
      unGrupo = new Grupo();
    
    if ((unGrupo.getId()==0) || (JOptionPane.showConfirmDialog(
        null,"Desea sobrescribir el grupo "+tId.getText()+"?",
        "Confirma guardar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      )
    {
      if (tId.getText()!="")    
      {      
        unGrupo.setId(Integer.parseInt(tId.getText()));
        unGrupo.setNombre(tNombre.getText());
        Interfaz.agregarGrupo(unGrupo);
        lInfo.setForeground(new Color(65, 190, 79));
        lInfo.setText("Grupo " + tId.getText() + " guardado");
        cargarListaGrupos();
        limpiarCampos();
      }
      else {
        lInfo.setForeground(new Color(190, 65, 79));
        lInfo.setText("Complete los datos del grupo antes de guardarlo");        
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
  private void cargarListaGrupos() {
    listaGrupos.clear();
    for (Grupo u : Interfaz.getGrupos()) {
      listaGrupos.addElement(u);  
    }

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
    lGrupos.clearSelection();
    
    tId.setText("");
    tNombre.setText("");
    tId.requestFocus();
  }
  private void eliminarGrupo(Grupo u) {
    if (JOptionPane.showConfirmDialog(
        null,"Desea eliminar el grupo "+tId.getText()+"?",
        "Confirma eliminar?",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    { 
      Interfaz.eliminarGrupo(u);
      cargarListaGrupos();
      limpiarCampos();
    }
  }
}  
