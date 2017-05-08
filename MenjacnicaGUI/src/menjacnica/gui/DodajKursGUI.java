package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2084821923953659846L;

	private JPanel contentPane;
	private JLabel lblNaziv;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblNewLabel;
	private JTextField textFieldProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JLabel lblSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 340, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNaziv());
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
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
			textFieldSifra.setBounds(37, 54, 130, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(177, 54, 130, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Prodajni kurs");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(37, 85, 86, 14);
		}
		return lblNewLabel;
	}

	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setBounds(37, 110, 130, 20);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblKupovniKurs.setBounds(177, 85, 86, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setBounds(177, 110, 130, 20);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSrednjiKurs.setBounds(37, 141, 86, 14);
		}
		return lblSrednjiKurs;
	}

	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setBounds(37, 166, 130, 20);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}

	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setBounds(177, 166, 130, 20);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSkraceniNaziv.setBounds(177, 141, 86, 14);
		}
		return lblSkraceniNaziv;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = "Sifra: ";
					str += textFieldSifra.getText();
					str += " Naziv: ";
					str += textFieldNaziv.getText();
					str += " Prodajni: ";
					str += textFieldProdajniKurs.getText();
					str += " Srednji: ";
					str += textFieldSrednjiKurs.getText();
					str += " Kupovni: ";
					str += textFieldKupovniKurs.getText();
					str += " Skraceni naziv: ";
					str += textFieldSkraceniNaziv.getText();

					GUIKontroler.dodajKurs(str);
					dispose();
				}
			});
			btnDodaj.setBounds(37, 213, 130, 23);
		}
		return btnDodaj;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(177, 213, 130, 23);
		}
		return btnOdustani;
	}
}