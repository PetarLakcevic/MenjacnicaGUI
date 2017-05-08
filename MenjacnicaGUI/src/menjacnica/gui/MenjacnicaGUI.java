package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class MenjacnicaGUI extends JFrame {

	/**
	 * 
	 */
	DodajKursGUI dodajKurs;
	ObrisiKursGUI obrisiKurs;
	IzvrsiZamenuGUI izvrsiZamenu;
	private static final long serialVersionUID = -8678529010427450890L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JPanel eastPanel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JPanel southPanel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel centerPanel;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;

	/**
	 * Launch the application.
	 * 
	 * @@ -35,12 +80,223 @@ public void run() { Create the frame.
	 */
	public MenjacnicaGUI() {
		setBackground(UIManager.getColor("Menu.selectionBackground"));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("5051-200.png")));

		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 749, 510);
		setBounds(100, 100, 650, 434);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(UIManager.getColor("Menu.selectionBackground"));
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String f = GUIKontroler.izaberiFajl();
					if (f != null) {
						String s = "Ucitan fajl: " + f;
						textArea.append(s + "\n");
					}
				}
			});
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));

		}
		return mntmOpen;
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String f = GUIKontroler.ucitajFajl();
					if (f != null) {
						String s = "Sacuvan fajl: " + f;
						textArea.append(s + "\n");
					}
				}
			});
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.ugasi();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
		}
		return mntmAbout;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setBackground(UIManager.getColor("List.selectionBackground"));
			eastPanel.setPreferredSize(new Dimension(130, 10));
			eastPanel.add(getBtnDodajKurs());
			eastPanel.add(getBtnObrisiKurs());
			eastPanel.add(getBtnIzvrsiZamenu());
		}
		return eastPanel;
	}

	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.setBackground(SystemColor.info);
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dodajKurs = new DodajKursGUI();
					dodajKurs.setVisible(true);
				}
			});
			btnDodajKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnDodajKurs.setMinimumSize(new Dimension(99, 23));
			btnDodajKurs.setMaximumSize(new Dimension(120, 23));
			btnDodajKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnDodajKurs;
	}

	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.setBackground(SystemColor.info);
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obrisiKurs = new ObrisiKursGUI();
					obrisiKurs.setVisible(true);
				}
			});
			btnObrisiKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnObrisiKurs.setMinimumSize(new Dimension(99, 23));
			btnObrisiKurs.setMaximumSize(new Dimension(120, 23));
			btnObrisiKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnObrisiKurs;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izvrsiZamenu = new IzvrsiZamenuGUI();
					izvrsiZamenu.setVisible(true);
				}
			});
			btnIzvrsiZamenu.setBackground(SystemColor.info);
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return btnIzvrsiZamenu;
	}

	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setBackground(UIManager.getColor("Menu.selectionBackground"));
			southPanel.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			southPanel.setPreferredSize(new Dimension(410, 65));
			southPanel.setLayout(new BorderLayout(0, 0));
			southPanel.add(getScrollPane(), BorderLayout.CENTER);
		}
		return southPanel;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setWrapStyleWord(true);
		}
		return textArea;
	}

	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout(0, 0));
			centerPanel.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return centerPanel;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setMaximumSize(new Dimension(20000, 20000));
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setPreferredScrollableViewportSize(new Dimension(450, 500));
			table.setModel(new DefaultTableModel(
					new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
					new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
			addPopup(table, getPopupMenu());
			table.getColumnModel().getColumn(1).setPreferredWidth(90);
		}
		return table;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dodajKurs = new DodajKursGUI();
					dodajKurs.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}

	public void dodajKurs2(String str) {
		textArea.append(str + "\n");
	}

	public void ispisIzbrisKursa2(String str) {
		textArea.append(str + "\n");

	}

	public void ispisZamene2(String str) {
		textArea.append(str + "\n");

	}

	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obrisiKurs = new ObrisiKursGUI();
					obrisiKurs.setVisible(true);
				}
			});
		}
		return mntmObrisiKurs;
	}

	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Zameni");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izvrsiZamenu = new IzvrsiZamenuGUI();
					izvrsiZamenu.setVisible(true);
				}
			});
		}
		return mntmIzvrsiZamenu;
	}
}
