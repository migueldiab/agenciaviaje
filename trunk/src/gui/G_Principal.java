package gui;

import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class G_Principal {

  private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="10,10"

  private JPanel jContentPane = null;
  private JMenuBar jJMenuBar = null;
  private JMenu fileMenu = null;
  private JMenuItem exitMenuItem = null;
  private JMenu editMenu = null;
  private JMenuItem cutMenuItem = null;
  private JMenuItem copyMenuItem = null;
  private JMenuItem pasteMenuItem = null;
  private JMenu adminMenu = null;
  private JMenuItem usuariosMenuItem = null;
  private JMenuItem gruposMenuItem = null;
  private JMenuItem cambioClaveMenuItem = null;
  private JMenuItem clientesMenuItem = null;
  private JMenuItem descuentosMenuItem = null;
  

  private JMenu operacionesMenu = null;
  private JMenuItem viajesMenuItem = null;
  private JMenuItem frecuenciasMenuItem = null;
  private JMenuItem mediosMenuItem = null;
  private JMenuItem ciudadesMenuItem = null;
  private JMenuItem ventasMenuItem = null;

  private JMenu listadosMenu = null;
  private JMenuItem listado1MenuItem = null;
  private JMenuItem listado2MenuItem = null;
  private JMenuItem listado3MenuItem = null;

  private JMenu helpMenu = null;
  private JMenuItem aboutMenuItem = null;
  //private JMenuItem saveMenuItem = null;
  private JDialog aboutDialog = null;
  private JPanel aboutContentPane = null;
  private JLabel aboutVersionLabel = null;

  private JDialog dUsuario = null; 
  private JDialog dGrupo = null;
  private JDialog dViaje = null;
  private JDialog dFrecuencia = null;
  private JDialog dCiudad = null;
  private JDialog dMedio = null;
  
  /**
   * This method initializes jFrame
   * 
   * @return javax.swing.JFrame
   */
  private JFrame getJFrame() {
    if (jFrame == null) {
      jFrame = new JFrame();
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jFrame.setJMenuBar(getJJMenuBar());
      jFrame.setSize(800, 600);
      jFrame.setContentPane(getJContentPane());
      jFrame.setTitle("Sistema de Reservas");
    }
    return jFrame;
  }

  /**
   * This method initializes jContentPane
   * 
   * @return javax.swing.JPanel
   */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      jContentPane = new JPanel();
      jContentPane.setLayout(new BorderLayout());
    }
    return jContentPane;
  }

  /**
   * This method initializes jJMenuBar	
   * 	
   * @return javax.swing.JMenuBar	
   */
  private JMenuBar getJJMenuBar() {
    if (jJMenuBar == null) {
      jJMenuBar = new JMenuBar();
      jJMenuBar.add(getFileMenu());
      jJMenuBar.add(getEditMenu());
      jJMenuBar.add(getAdminMenu());
      jJMenuBar.add(getOperacionesMenu());
      jJMenuBar.add(getListadosMenu());
      jJMenuBar.add(getHelpMenu());
    }
    return jJMenuBar;
  }

  /**
   * This method initializes jMenu	
   * 	
   * @return javax.swing.JMenu	
   */
  private JMenu getFileMenu() {
    if (fileMenu == null) {
      fileMenu = new JMenu();
      fileMenu.setText("Archivo");
      //fileMenu.add(getSaveMenuItem());
      fileMenu.add(getExitMenuItem());
    }
    return fileMenu;
  }

  /**
   * This method initializes jMenu	
   * 	
   * @return javax.swing.JMenu	
   */
  private JMenu getEditMenu() {
    if (editMenu == null) {
      editMenu = new JMenu();
      editMenu.setText("Edición");
      editMenu.add(getCutMenuItem());
      editMenu.add(getCopyMenuItem());
      editMenu.add(getPasteMenuItem());
    }
    return editMenu;
  }

  private JMenu getAdminMenu() {
    if (adminMenu == null) {
      adminMenu = new JMenu();
      adminMenu.setText("Administrar");
      adminMenu.add(getUsuariosMenuItem());
      adminMenu.add(getGruposMenuItem());
      adminMenu.add(getCambioClaveMenuItem());
      adminMenu.add(getClientesMenuItem());
      adminMenu.add(getDescuentosMenuItem());
    }
    return adminMenu;
  }
  private JMenuItem getUsuariosMenuItem() {
    if (usuariosMenuItem == null) {
      usuariosMenuItem = new JMenuItem();
      usuariosMenuItem.setText("Usuarios");
      usuariosMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dUsuario == null) {
            G_Usuarios guiUsuario = new G_Usuarios();
            dUsuario = guiUsuario.getDAbmUsuarios();
            dUsuario.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dUsuario.setLocation(loc);
            dUsuario.setBounds(10,10,380,300);
            dUsuario.setVisible(true);            
          }
          else {
            dUsuario.setVisible(true);
          }
          
        }
      });
    }
    return usuariosMenuItem;
  }
  private JMenuItem getGruposMenuItem() {
    if (gruposMenuItem == null) {
      gruposMenuItem = new JMenuItem();
      gruposMenuItem.setText("Grupos");
      gruposMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dGrupo == null) {
            G_Grupos guiGrupo = new G_Grupos();
            dGrupo = guiGrupo.getDAbmGrupos();
            dGrupo.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dGrupo.setLocation(loc);
            dGrupo.setBounds(10,10,380,300);
            dGrupo.setVisible(true);            
          }
          else {
            dGrupo.setVisible(true);
          }

        }
      });
    }
    return gruposMenuItem;
  }
  private JMenuItem getCambioClaveMenuItem() {
    if (cambioClaveMenuItem == null) {
      cambioClaveMenuItem = new JMenuItem();
      cambioClaveMenuItem.setText("Cambio Clave");
      cambioClaveMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return cambioClaveMenuItem;
  }
  private JMenuItem getClientesMenuItem() {
    if (clientesMenuItem == null) {
      clientesMenuItem = new JMenuItem();
      clientesMenuItem.setText("Clientes");
      clientesMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return clientesMenuItem;
  }
  private JMenuItem getDescuentosMenuItem() {
    if (descuentosMenuItem == null) {
      descuentosMenuItem = new JMenuItem();
      descuentosMenuItem.setText("Descuentos");
      descuentosMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return descuentosMenuItem;
  }
  
  private JMenu getOperacionesMenu() {
    if (operacionesMenu == null) {
      operacionesMenu = new JMenu();
      operacionesMenu.setText("Operaciones");
      operacionesMenu.add(getViajesMenuItem());
      operacionesMenu.add(getFrecuenciasMenuItem());
      operacionesMenu.add(getMediosMenuItem());
      operacionesMenu.add(getCiudadesMenuItem());
      operacionesMenu.add(getVentasMenuItem());
    }
    return operacionesMenu;
  }
  private JMenuItem getViajesMenuItem() {
    if (viajesMenuItem == null) {
      viajesMenuItem = new JMenuItem();
      viajesMenuItem.setText("Viajes");
      viajesMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dViaje == null) {
            G_Viajes guiViaje = new G_Viajes();
            dViaje = guiViaje.getDAbmViajes();
            dViaje.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dViaje.setLocation(loc);
            dViaje.setBounds(10,10,700,500);
            dViaje.setVisible(true);            
          }
          else {
            dViaje.setVisible(true);
          }          
        }
      });
    }
    return viajesMenuItem;
  }
  private JMenuItem getFrecuenciasMenuItem() {
    if (frecuenciasMenuItem == null) {
      frecuenciasMenuItem = new JMenuItem();
      frecuenciasMenuItem.setText("Frecuencias");
      frecuenciasMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dFrecuencia == null) {
            G_Frecuencias guiFrecuencia = new G_Frecuencias();
            dFrecuencia = guiFrecuencia.getDAbmFrecuencias();
            dFrecuencia.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dFrecuencia.setLocation(loc);
            dFrecuencia.setBounds(10,10,700,500);
            dFrecuencia.setVisible(true);            
          }
          else {
            dFrecuencia.setVisible(true);
          }                    
        }
      });
    }
    return frecuenciasMenuItem;
  }
  private JMenuItem getMediosMenuItem() {
    if (mediosMenuItem == null) {
      mediosMenuItem = new JMenuItem();
      mediosMenuItem.setText("Medios");
      mediosMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dMedio == null) {
            G_Medios guiMedio = new G_Medios();
            dMedio = guiMedio.getDAbmMedios();
            dMedio.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dMedio.setLocation(loc);
            dMedio.setBounds(10,10,700,500);
            dMedio.setVisible(true);            
          }
          else {
            dMedio.setVisible(true);
          }                 
        }
      });
    }
    return mediosMenuItem;
  }
  private JMenuItem getCiudadesMenuItem() {
    if (ciudadesMenuItem == null) {
      ciudadesMenuItem = new JMenuItem();
      ciudadesMenuItem.setText("Ciudades");
      ciudadesMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (dCiudad == null) {
            G_Ciudades guiCiudad = new G_Ciudades();
            dCiudad = guiCiudad.getDAbmCiudades();
            dCiudad.pack();
            Point loc = getJFrame().getLocation();
            loc.translate(20, 20);
            dCiudad.setLocation(loc);
            dCiudad.setBounds(10,10,380,300);
            dCiudad.setVisible(true);            
          }
          else {
            dCiudad.setVisible(true);
          }          
        }
      });
    }
    return ciudadesMenuItem;
  }
  private JMenuItem getVentasMenuItem() {
    if (ventasMenuItem == null) {
      ventasMenuItem = new JMenuItem();
      ventasMenuItem.setText("Ventas");
      ventasMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return ventasMenuItem;
  }  
  private JMenu getListadosMenu() {
    if (listadosMenu == null) {
      listadosMenu = new JMenu();
      listadosMenu.setText("Listados");
      listadosMenu.add(getListado1MenuItem());
      listadosMenu.add(getListado2MenuItem());
      listadosMenu.add(getListado3MenuItem());
    }
    return listadosMenu;
  }
  private JMenuItem getListado1MenuItem() {
    if (listado1MenuItem == null) {
      listado1MenuItem = new JMenuItem();
      listado1MenuItem.setText("L1");
      listado1MenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return listado1MenuItem;
  }
  private JMenuItem getListado2MenuItem() {
    if (listado2MenuItem == null) {
      listado2MenuItem = new JMenuItem();
      listado2MenuItem.setText("L2");
      listado2MenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return listado2MenuItem;
  }
  private JMenuItem getListado3MenuItem() {
    if (listado3MenuItem == null) {
      listado3MenuItem = new JMenuItem();
      listado3MenuItem.setText("L3");
      listado3MenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
        }
      });
    }
    return listado3MenuItem;
  }  
  /**
   * This method initializes jMenu	
   * 	
   * @return javax.swing.JMenu	
   */
  private JMenu getHelpMenu() {
    if (helpMenu == null) {
      helpMenu = new JMenu();
      helpMenu.setText("Ayuda");
      helpMenu.add(getAboutMenuItem());
    }
    return helpMenu;
  }
  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getExitMenuItem() {
    if (exitMenuItem == null) {
      exitMenuItem = new JMenuItem();
      exitMenuItem.setText("Salir");
      exitMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
        }
      });
    }
    return exitMenuItem;
  }
  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getAboutMenuItem() {
    if (aboutMenuItem == null) {
      aboutMenuItem = new JMenuItem();
      aboutMenuItem.setText("Acerca de");
      aboutMenuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          JDialog aboutDialog = getAboutDialog();
          aboutDialog.pack();
          Point loc = getJFrame().getLocation();
          loc.translate(20, 20);
          aboutDialog.setLocation(loc);
          aboutDialog.setVisible(true);
        }
      });
    }
    return aboutMenuItem;
  }

  /**
   * This method initializes aboutDialog	
   * 	
   * @return javax.swing.JDialog
   */
  private JDialog getAboutDialog() {
    if (aboutDialog == null) {
      aboutDialog = new JDialog(getJFrame(), true);
      aboutDialog.setTitle("Acerca de");
      aboutDialog.setContentPane(getAboutContentPane());
    }
    return aboutDialog;
  }

  /**
   * This method initializes aboutContentPane
   * 
   * @return javax.swing.JPanel
   */
  private JPanel getAboutContentPane() {
    if (aboutContentPane == null) {
      aboutContentPane = new JPanel();
      aboutContentPane.setLayout(new BorderLayout());
      aboutContentPane.add(getAboutVersionLabel(), BorderLayout.CENTER);
    }
    return aboutContentPane;
  }

  /**
   * This method initializes aboutVersionLabel	
   * 	
   * @return javax.swing.JLabel	
   */
  private JLabel getAboutVersionLabel() {
    if (aboutVersionLabel == null) {
      aboutVersionLabel = new JLabel();
      aboutVersionLabel.setText("Versión 1.0");
      aboutVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
    return aboutVersionLabel;
  }

  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getCutMenuItem() {
    if (cutMenuItem == null) {
      cutMenuItem = new JMenuItem();
      cutMenuItem.setText("Cortar");
      cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
          Event.CTRL_MASK, true));
    }
    return cutMenuItem;
  }

  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getCopyMenuItem() {
    if (copyMenuItem == null) {
      copyMenuItem = new JMenuItem();
      copyMenuItem.setText("Copiar");
      copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
          Event.CTRL_MASK, true));
    }
    return copyMenuItem;
  }

  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getPasteMenuItem() {
    if (pasteMenuItem == null) {
      pasteMenuItem = new JMenuItem();
      pasteMenuItem.setText("Pegar");
      pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
          Event.CTRL_MASK, true));
    }
    return pasteMenuItem;
  }

  /**
   * This method initializes jMenuItem	
   * 	
   * @return javax.swing.JMenuItem	
   */
  /*
  private JMenuItem getSaveMenuItem() {
    if (saveMenuItem == null) {
      saveMenuItem = new JMenuItem();
      saveMenuItem.setText("Save");
      saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
          Event.CTRL_MASK, true));
    }
    return saveMenuItem;
  }
  */

  public static void cargar() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        G_Principal application = new G_Principal();
        application.getJFrame().setVisible(true);
      }
    });
  }
}
