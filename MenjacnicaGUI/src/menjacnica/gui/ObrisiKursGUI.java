package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class ObrisiKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 810090061465038519L;

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNaziv;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblProdajni;
	private JTextField textFieldProdajni;
	private JLabel lblKupovni;
	private JTextField textFieldKupovni;
	private JLabel lblSrednji;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JLabel lblSkraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox chckbxZaistaObrisi;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/menjacnica/gui/5051-200.png")));
		setMaximumSize(new Dimension(61, 23));
		setMinimumSize(new Dimension(61, 23));
		setPreferredSize(new Dimension(61, 23));
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 340, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.textHighlight);
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 334, 267);
			panel.add(getLblNaziv());
			panel.add(getLblSifra());
			panel.add(getTextFieldSifra());
			panel.add(getTextFieldNaziv());
			panel.add(getLblProdajni());
			panel.add(getTextFieldProdajni());
			panel.add(getLblKupovni());
			panel.add(getTextFieldKupovni());
			panel.add(getLblSrednji());
			panel.add(getTextFieldSrednji());
			panel.add(getTextFieldSkraceni());
			panel.add(getLblSkraceniNaziv());
			panel.add(getBtnObrisi());
			panel.add(getBtnOdustani());
			panel.add(getChckbxZaistaObrisi());
		}
		return panel;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNaziv.setBounds(177, 29, 86, 14);
		}
		return lblNaziv;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSifra.setBounds(37, 29, 86, 14);
		}
		return lblSifra;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEnabled(false);
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(37, 54, 130, 20);
		}
		return textFieldSifra;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setEnabled(false);
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(177, 54, 130, 20);
		}
		return textFieldNaziv;
	}

	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblProdajni.setBounds(37, 85, 86, 14);
		}
		return lblProdajni;
	}

	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEnabled(false);
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(37, 110, 130, 20);
		}
		return textFieldProdajni;
	}

	private JLabel getLblKupovni() {
		if (lblKupovni == null) {
			lblKupovni = new JLabel("Kupovni kurs");
			lblKupovni.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblKupovni.setBounds(177, 85, 86, 14);
		}
		return lblKupovni;
	}

	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEnabled(false);
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(177, 110, 130, 20);
		}
		return textFieldKupovni;
	}

	private JLabel getLblSrednji() {
		if (lblSrednji == null) {
			lblSrednji = new JLabel("Srednji kurs");
			lblSrednji.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSrednji.setBounds(37, 141, 86, 14);
		}
		return lblSrednji;
	}

	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setEnabled(false);
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(37, 166, 130, 20);
		}
		return textFieldSrednji;
	}

	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setEnabled(false);
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(177, 166, 130, 20);
		}
		return textFieldSkraceni;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSkraceniNaziv.setBounds(177, 141, 86, 14);
		}
		return lblSkraceniNaziv;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setBackground(SystemColor.info);
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = "Obrisan je kurs( Sifra: ";
					str += textFieldSifra.getText();
					str += " Naziv: ";
					str += textFieldNaziv.getText();
					str += " Prodajni: ";
					str += textFieldProdajni.getText();
					str += " Srednji: ";
					str += textFieldSrednji.getText();
					str += " Kupovni: ";
					str += textFieldKupovni.getText();
					str += " Skraceni naziv: ";
					str += textFieldSkraceni.getText();
					str += " )";
					GUIKontroler.ispisIzbrisKursa(str);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(37, 233, 130, 23);
		}
		return btnObrisi;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBackground(SystemColor.info);
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(177, 233, 130, 23);
		}
		return btnOdustani;
	}

	private JCheckBox getChckbxZaistaObrisi() {
		if (chckbxZaistaObrisi == null) {
			chckbxZaistaObrisi = new JCheckBox("Zaista obrisi");
			chckbxZaistaObrisi.setFont(new Font("Tahoma", Font.BOLD, 11));
			chckbxZaistaObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaistaObrisi.isSelected())
						btnObrisi.setEnabled(true);
					else {
						btnObrisi.setEnabled(false);
					}
				}
			});
			chckbxZaistaObrisi.setBounds(37, 193, 97, 23);
		}
		return chckbxZaistaObrisi;
	}
}
