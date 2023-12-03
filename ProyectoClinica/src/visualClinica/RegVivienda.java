package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;

public class RegVivienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPropietario;
	private JTextField txtDireccion;
	private JTextField textField;

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
		setBounds(100, 100, 368, 288);
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
				lblNewLabel.setBounds(12, 45, 84, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
				lblDireccin.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblDireccin.setBounds(12, 121, 84, 16);
				panel.add(lblDireccin);
			}
			{
				JLabel lblNumhabitaciones = new JLabel("Num.Habitaciones:");
				lblNumhabitaciones.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNumhabitaciones.setBounds(195, 46, 123, 16);
				panel.add(lblNumhabitaciones);
			}
			{
				txtPropietario = new JTextField();
				txtPropietario.setBackground(SystemColor.inactiveCaption);
				txtPropietario.setBounds(12, 74, 116, 22);
				panel.add(txtPropietario);
				txtPropietario.setColumns(10);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBackground(SystemColor.inactiveCaption);
				txtDireccion.setBounds(12, 160, 123, 22);
				panel.add(txtDireccion);
			}
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBackground(SystemColor.inactiveCaption);
			textField.setBounds(195, 74, 116, 22);
			panel.add(textField);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(RegVivienda.class.getResource("/imagen/IcnRegViv.png")));
			lblNewLabel_1.setBounds(195, 109, 123, 73);
			panel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
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
