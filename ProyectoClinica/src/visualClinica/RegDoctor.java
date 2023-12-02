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
import javax.swing.JRadioButton;

public class RegDoctor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtEspecialidad;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JTextField txtPasswordC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegDoctor dialog = new RegDoctor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegDoctor() {
		setBounds(100, 100, 561, 514);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_general = new JPanel();
				panel_general.setBorder(new TitledBorder(null, "Informacion general", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_general.setBounds(12, 13, 516, 253);
				panel.add(panel_general);
				panel_general.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setBounds(231, 34, 56, 16);
				panel_general.add(lblNewLabel);
				
				txtNombre = new JTextField();
				txtNombre.setBounds(309, 31, 186, 22);
				panel_general.add(txtNombre);
				txtNombre.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Cedula: ");
				lblNewLabel_1.setBounds(12, 34, 56, 16);
				panel_general.add(lblNewLabel_1);
				
				txtCedula = new JTextField();
				txtCedula.setBounds(78, 31, 138, 22);
				panel_general.add(txtCedula);
				txtCedula.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Telefono:");
				lblNewLabel_2.setBounds(12, 65, 56, 16);
				panel_general.add(lblNewLabel_2);
				
				txtTelefono = new JTextField();
				txtTelefono.setBounds(78, 62, 140, 22);
				panel_general.add(txtTelefono);
				txtTelefono.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Especialidad:");
				lblNewLabel_3.setBounds(227, 65, 81, 16);
				panel_general.add(lblNewLabel_3);
				
				txtEspecialidad = new JTextField();
				txtEspecialidad.setBounds(309, 66, 186, 22);
				panel_general.add(txtEspecialidad);
				txtEspecialidad.setColumns(10);
				
				JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
				rdbtnMasculino.setBounds(91, 90, 127, 25);
				panel_general.add(rdbtnMasculino);
				
				JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
				rdbtnFemenino.setBounds(261, 90, 114, 25);
				panel_general.add(rdbtnFemenino);
				
				JLabel lblNewLabel_4 = new JLabel("Sexo:");
				lblNewLabel_4.setBounds(12, 94, 56, 16);
				panel_general.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
				lblNewLabel_5.setBounds(12, 124, 138, 16);
				panel_general.add(lblNewLabel_5);
				
				txtCorreo = new JTextField();
				txtCorreo.setBounds(139, 124, 297, 22);
				panel_general.add(txtCorreo);
				txtCorreo.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Direccion:");
				lblNewLabel_6.setBounds(12, 153, 81, 16);
				panel_general.add(lblNewLabel_6);
				
				txtDireccion = new JTextField();
				txtDireccion.setBounds(12, 168, 495, 72);
				panel_general.add(txtDireccion);
				txtDireccion.setColumns(10);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(12, 279, 516, 130);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel_7 = new JLabel("Usuario:");
			lblNewLabel_7.setBounds(12, 27, 56, 16);
			panel_1.add(lblNewLabel_7);
			
			txtUser = new JTextField();
			txtUser.setBounds(87, 24, 257, 22);
			panel_1.add(txtUser);
			txtUser.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_8.setBounds(12, 78, 78, 16);
			panel_1.add(lblNewLabel_8);
			
			txtPassword = new JTextField();
			txtPassword.setBounds(87, 75, 135, 22);
			panel_1.add(txtPassword);
			txtPassword.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("Confirmar contrase\u00F1a:");
			lblNewLabel_9.setBounds(234, 78, 144, 16);
			panel_1.add(lblNewLabel_9);
			
			txtPasswordC = new JTextField();
			txtPasswordC.setColumns(10);
			txtPasswordC.setBounds(374, 75, 135, 22);
			panel_1.add(txtPasswordC);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton regButton = new JButton("Registrar");
				regButton.setActionCommand("OK");
				buttonPane.add(regButton);
				getRootPane().setDefaultButton(regButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
