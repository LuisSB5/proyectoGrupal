package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RegSecretaria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JTextField txtPasswordC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegSecretaria dialog = new RegSecretaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegSecretaria() {
		setBounds(100, 100, 535, 496);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_general = new JPanel();
			panel_general.setBorder(new TitledBorder(null, "Informacion General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_general.setBounds(12, 13, 492, 225);
			panel.add(panel_general);
			panel_general.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(258, 26, 56, 16);
			panel_general.add(lblNewLabel);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(316, 23, 164, 22);
			panel_general.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Cedula:");
			lblNewLabel_1.setBounds(12, 26, 56, 16);
			panel_general.add(lblNewLabel_1);
			
			txtCedula = new JTextField();
			txtCedula.setBounds(75, 23, 144, 22);
			panel_general.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Telefono: ");
			lblNewLabel_2.setBounds(12, 65, 66, 16);
			panel_general.add(lblNewLabel_2);
			
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(75, 62, 144, 22);
			panel_general.add(txtTelefono);
			
			JLabel lblNewLabel_3 = new JLabel("Sexo:");
			lblNewLabel_3.setBounds(258, 65, 56, 16);
			panel_general.add(lblNewLabel_3);
			
			JComboBox cbxSexo = new JComboBox();
			cbxSexo.setBounds(316, 64, 164, 19);
			panel_general.add(cbxSexo);
			
			JLabel lblNewLabel_4 = new JLabel("Direccion:");
			lblNewLabel_4.setBounds(12, 94, 81, 16);
			panel_general.add(lblNewLabel_4);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(12, 110, 307, 22);
			panel_general.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Doctor a asignar:");
			lblNewLabel_5.setBounds(12, 145, 117, 16);
			panel_general.add(lblNewLabel_5);
			
			JComboBox cbxDoc = new JComboBox();
			cbxDoc.setBounds(12, 169, 201, 22);
			panel_general.add(cbxDoc);
			
			JPanel panel_Usuario = new JPanel();
			panel_Usuario.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_Usuario.setBounds(12, 253, 492, 133);
			panel.add(panel_Usuario);
			panel_Usuario.setLayout(null);
			
			JLabel lblNewLabel_6 = new JLabel("Usuario:");
			lblNewLabel_6.setBounds(12, 27, 56, 16);
			panel_Usuario.add(lblNewLabel_6);
			
			txtUser = new JTextField();
			txtUser.setBounds(12, 49, 199, 22);
			panel_Usuario.add(txtUser);
			txtUser.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Contrasena:");
			lblNewLabel_7.setBounds(12, 88, 81, 16);
			panel_Usuario.add(lblNewLabel_7);
			
			txtPassword = new JTextField();
			txtPassword.setBounds(86, 84, 123, 22);
			panel_Usuario.add(txtPassword);
			txtPassword.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Confirmar contrasena:");
			lblNewLabel_8.setBounds(221, 88, 139, 16);
			panel_Usuario.add(lblNewLabel_8);
			
			txtPasswordC = new JTextField();
			txtPasswordC.setColumns(10);
			txtPasswordC.setBounds(357, 85, 123, 22);
			panel_Usuario.add(txtPasswordC);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
