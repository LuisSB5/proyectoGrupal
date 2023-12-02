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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

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
		setTitle("Registrar Secretaria");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegSecretaria.class.getResource("/imagen/regSecre.png")));
		setResizable(false);
		setBackground(SystemColor.text);
		setBounds(100, 100, 534, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_general = new JPanel();
			panel_general.setBackground(new Color(216, 191, 216));
			panel_general.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_general.setBounds(12, 13, 492, 225);
			panel.add(panel_general);
			panel_general.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel.setBounds(258, 26, 56, 16);
			panel_general.add(lblNewLabel);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(316, 23, 164, 22);
			panel_general.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Cedula:");
			lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(12, 26, 56, 16);
			panel_general.add(lblNewLabel_1);
			
			txtCedula = new JTextField();
			txtCedula.setBounds(75, 23, 144, 22);
			panel_general.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Telefono: ");
			lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(12, 65, 66, 16);
			panel_general.add(lblNewLabel_2);
			
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(75, 62, 144, 22);
			panel_general.add(txtTelefono);
			
			JLabel lblNewLabel_3 = new JLabel("Sexo:");
			lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(258, 65, 56, 16);
			panel_general.add(lblNewLabel_3);
			
			JComboBox cbxSexo = new JComboBox();
			cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "F", "M"}));
			cbxSexo.setBounds(316, 64, 164, 19);
			panel_general.add(cbxSexo);
			
			JLabel lblNewLabel_4 = new JLabel("Direccion:");
			lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(12, 94, 81, 16);
			panel_general.add(lblNewLabel_4);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(12, 110, 468, 22);
			panel_general.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Doctor a asignar:");
			lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_5.setBounds(189, 145, 117, 16);
			panel_general.add(lblNewLabel_5);
			
			JComboBox cbxDoc = new JComboBox();
			cbxDoc.setBounds(149, 169, 201, 22);
			panel_general.add(cbxDoc);
			
			JPanel panel_Usuario = new JPanel();
			panel_Usuario.setBackground(new Color(216, 191, 216));
			panel_Usuario.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_Usuario.setBounds(12, 253, 492, 133);
			panel.add(panel_Usuario);
			panel_Usuario.setLayout(null);
			
			JLabel lblNewLabel_6 = new JLabel("Usuario:");
			lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_6.setBounds(12, 36, 56, 16);
			panel_Usuario.add(lblNewLabel_6);
			
			txtUser = new JTextField();
			txtUser.setBounds(112, 33, 123, 22);
			panel_Usuario.add(txtUser);
			txtUser.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Contrasena:");
			lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_7.setBounds(12, 88, 81, 16);
			panel_Usuario.add(lblNewLabel_7);
			
			txtPassword = new JTextField();
			txtPassword.setBounds(112, 84, 123, 22);
			panel_Usuario.add(txtPassword);
			txtPassword.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Confirmar contrase\u00F1a:");
			lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_8.setBounds(291, 52, 176, 16);
			panel_Usuario.add(lblNewLabel_8);
			
			txtPasswordC = new JTextField();
			txtPasswordC.setColumns(10);
			txtPasswordC.setBounds(284, 85, 166, 22);
			panel_Usuario.add(txtPasswordC);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(218, 112, 214));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setForeground(new Color(218, 112, 214));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
