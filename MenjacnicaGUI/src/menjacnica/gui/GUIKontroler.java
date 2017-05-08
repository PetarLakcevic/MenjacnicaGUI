package menjacnica.gui;

import java.awt.EventQueue;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUIKontroler {
	private static MenjacnicaGUI menjacnica;
	private static DodajKursGUI dodajKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new MenjacnicaGUI();
					menjacnica.setVisible(true);
					menjacnica.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							ugasi();
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void dodajKurs(String str) {
		menjacnica.dodajKurs2(str);
	}
	 	public static void ispisIzbrisKursa(String str) {
	 		menjacnica.ispisIzbrisKursa2(str);
	}

	public static String izaberiFajl() {
		String f = "";
		try {
			JFileChooser fc = new JFileChooser();
			int odgovor = fc.showOpenDialog(menjacnica);
			if (odgovor == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				f = file.getAbsolutePath();
			} else {
				return null;
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(menjacnica, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}

		return f;

	}

	public static String ucitajFajl() {
		String s = "";
		try {
			JFileChooser jf = new JFileChooser();
			int f = jf.showSaveDialog(menjacnica);
			if (f == JFileChooser.APPROVE_OPTION) {
				File file = jf.getSelectedFile();
				s = file.getAbsolutePath();
			} else {
				return null;
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(menjacnica, ex.getMessage(), "Greska!!!", JOptionPane.ERROR_MESSAGE);
		}
		return s;
	}

	public static void ugasi() {
		int a = JOptionPane.showConfirmDialog(menjacnica, "Da li zaista zelite da izadjete?", "Kraj rada?",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (a == JOptionPane.YES_OPTION)
			System.exit(0);

	}

	public static void prikaziInfoOAutoru() {
		JOptionPane.showMessageDialog(menjacnica,
				"Autor: Petar Lakcevic\nE-mail: petar.lakcevic@gmail.com\nBeograd, 2017", "O autoru",
				JOptionPane.INFORMATION_MESSAGE);

	}
}