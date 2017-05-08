package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	/**
	 * 
	*/
	private static final long serialVersionUID = -6365442993245365549L;

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovni;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private ButtonGroup buttonGroup;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnNewButton());

		buttonGroup = new ButtonGroup();
		rdbtnKupovina.setSelected(true);
		buttonGroup.add(rdbtnKupovina);
		buttonGroup.add(rdbtnProdaja);
		textFieldIznos.setText("" + slider.getValue());
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblKupovniKurs.setBounds(10, 11, 144, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEnabled(false);
			textFieldKupovni.setBounds(10, 36, 144, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "CHF", "USD" }));
			comboBox.setBounds(164, 36, 60, 20);
		}
		return comboBox;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblProdajniKurs.setBounds(234, 11, 144, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEnabled(false);
			textFieldProdajni.setBounds(234, 36, 144, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblIznos.setBounds(10, 67, 144, 14);
		}
		return lblIznos;
	}

	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(10, 92, 144, 20);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblVrstaTransakcije.setBounds(191, 67, 120, 14);
		}
		return lblVrstaTransakcije;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnKupovina.setBounds(201, 91, 109, 23);
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnProdaja.setBounds(202, 117, 109, 23);
		}
		return rdbtnProdaja;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText("" + slider.getValue());
				}
			});
			slider.setFont(new Font("Tahoma", Font.BOLD, 11));
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setSnapToTicks(true);
			slider.setBounds(29, 147, 324, 45);
		}
		return slider;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = "Izvrsena je zamena( Valuta: ";
					str += comboBox.getSelectedItem().toString();
					str += " Iznos: ";
					str += textFieldIznos.getText();
					str += " Vrsta transakcije: ";
					if (rdbtnKupovina.isSelected()) {
						str += " Kupovina ";
						str += " Po kursu: ";
						str += textFieldKupovni.getText();
					} else {
						str += " Prodaja ";
						str += " Po kursu: ";
						str += textFieldProdajni.getText();
					}

					GUIKontroler.ispisZamene(str);
					dispose();
				}
			});
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnIzvrsiZamenu.setBounds(39, 208, 144, 23);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Odustani");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.setBounds(203, 208, 144, 23);
		}
		return btnNewButton;
	}
}