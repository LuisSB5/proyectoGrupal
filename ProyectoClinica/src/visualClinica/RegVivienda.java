package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Cita;

import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

public class RegVivienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPropietario;
	private JTextField txtDireccion;
	private JSpinner spnCantHab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegVivienda dialog = new RegVivienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegVivienda() {
		setTitle("Registrar Vivienda");
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegVivienda.class.getResource("/imagen/MnNo.png")));
		setBounds(100, 100, 372, 375);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Propietario:");
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
				lblNewLabel.setBounds(12, 27, 84, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
				lblDireccin.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblDireccin.setBounds(12, 193, 84, 16);
				panel.add(lblDireccin);
			}
			{
				JLabel lblNumhabitaciones = new JLabel("Cant. Personas:");
				lblNumhabitaciones.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNumhabitaciones.setBounds(195, 28, 123, 16);
				panel.add(lblNumhabitaciones);
			}
			{
				txtPropietario = new JTextField();
				txtPropietario.setBackground(SystemColor.inactiveCaption);
				txtPropietario.setBounds(12, 56, 116, 22);
				panel.add(txtPropietario);
				txtPropietario.setColumns(10);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBackground(SystemColor.inactiveCaption);
				txtDireccion.setBounds(12, 226, 123, 22);
				panel.add(txtDireccion);
			}
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(RegVivienda.class.getResource("/imagen/IcnRegViv.png")));
			lblNewLabel_1.setBounds(205, 109, 123, 73);
			panel.add(lblNewLabel_1);
			
			spnCantHab = new JSpinner();
			spnCantHab.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
			spnCantHab.setBackground(SystemColor.inactiveCaption);
			spnCantHab.setBounds(195, 56, 119, 22);
			panel.add(spnCantHab);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(SystemColor.inactiveCaption);
			comboBox.setBounds(12, 145, 123, 22);
			panel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				okButton.setForeground(new Color(0, 153, 255));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setBackground(SystemColor.text);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setForeground(new Color(0, 153, 255));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
