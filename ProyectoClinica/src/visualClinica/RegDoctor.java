package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.Doctor;
import logico.Persona;
import logico.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class RegDoctor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JTextField txtPasswordC;
	private JTextField txtDireccion;
	private JComboBox cbxSexo;
	private JComboBox cbxEspecialidad;

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
		setTitle("Registrar Doctor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegDoctor.class.getResource("/imagen/MnDoct.png")));
		setBackground(SystemColor.text);
		setBounds(100, 100, 518, 468);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_general = new JPanel();
				panel_general.setBackground(SystemColor.text);
				panel_general.setFont(new Font("Segoe UI", Font.BOLD, 13));
				panel_general.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n general", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 204)));
				panel_general.setBounds(0, 13, 497, 204);
				panel.add(panel_general);
				panel_general.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setForeground(new Color(51, 153, 204));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(231, 34, 81, 16);
				panel_general.add(lblNewLabel);
				
				txtNombre = new JTextField();
				txtNombre.setBounds(319, 31, 166, 22);
				panel_general.add(txtNombre);
				txtNombre.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("C\u00E9dula: ");
				lblNewLabel_1.setForeground(new Color(51, 153, 204));
				lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_1.setBounds(12, 34, 81, 16);
				panel_general.add(lblNewLabel_1);
				
				txtCedula = new JTextField();
				txtCedula.setBounds(78, 31, 138, 22);
				panel_general.add(txtCedula);
				txtCedula.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Tel\u00E9fono:");
				lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_2.setForeground(new Color(51, 153, 204));
				lblNewLabel_2.setBounds(12, 69, 81, 16);
				panel_general.add(lblNewLabel_2);
				
				txtTelefono = new JTextField();
				txtTelefono.setBounds(76, 66, 140, 22);
				panel_general.add(txtTelefono);
				txtTelefono.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Especialidad:");
				lblNewLabel_3.setForeground(new Color(51, 153, 204));
				lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_3.setBounds(231, 69, 81, 16);
				panel_general.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Sexo:");
				lblNewLabel_4.setForeground(new Color(51, 153, 204));
				lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_4.setBounds(12, 104, 81, 16);
				panel_general.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
				lblNewLabel_5.setForeground(new Color(51, 153, 204));
				lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_5.setBounds(12, 158, 138, 16);
				panel_general.add(lblNewLabel_5);
				
				txtCorreo = new JTextField();
				txtCorreo.setBounds(148, 155, 337, 22);
				panel_general.add(txtCorreo);
				txtCorreo.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Direcci\u00F3n:");
				lblNewLabel_6.setForeground(new Color(51, 153, 204));
				lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_6.setBounds(231, 104, 81, 16);
				panel_general.add(lblNewLabel_6);
				
				cbxSexo = new JComboBox();
				cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "M", "F"}));
				cbxSexo.setBounds(78, 101, 138, 22);
				panel_general.add(cbxSexo);
				
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(319, 101, 166, 22);
				panel_general.add(txtDireccion);
				
				cbxEspecialidad = new JComboBox();
				cbxEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Cardiolog\u00EDa", "Neurocirug\u00EDa", "Endocrinolog\u00EDa", "Medicina laboral", "Gastroenterolog\u00EDa", "Ginecolog\u00EDa y obstetricia", "Hematolog\u00EDa", "Oncolog\u00EDa"}));
				cbxEspecialidad.setBounds(319, 66, 166, 22);
				panel_general.add(cbxEspecialidad);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.text);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 102, 204)));
			panel_1.setBounds(-1, 266, 516, 130);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel_7 = new JLabel("Usuario:");
			lblNewLabel_7.setForeground(new Color(51, 153, 204));
			lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_7.setBounds(12, 27, 56, 16);
			panel_1.add(lblNewLabel_7);
			
			txtUser = new JTextField();
			txtUser.setBounds(107, 24, 135, 22);
			panel_1.add(txtUser);
			txtUser.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_8.setForeground(new Color(51, 153, 204));
			lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_8.setBounds(12, 78, 78, 16);
			panel_1.add(lblNewLabel_8);
			
			txtPassword = new JTextField();
			txtPassword.setBounds(107, 75, 135, 22);
			panel_1.add(txtPassword);
			txtPassword.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("Confirmar contrase\u00F1a:");
			lblNewLabel_9.setForeground(new Color(51, 153, 204));
			lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel_9.setBounds(329, 27, 144, 16);
			panel_1.add(lblNewLabel_9);
			
			txtPasswordC = new JTextField();
			txtPasswordC.setColumns(10);
			txtPasswordC.setBounds(329, 56, 135, 22);
			panel_1.add(txtPasswordC);
			
			JLabel lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setIcon(new ImageIcon(RegDoctor.class.getResource("/imagen/dec2.png")));
			lblNewLabel_10.setBounds(-31, 230, 528, 16);
			panel.add(lblNewLabel_10);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(RegDoctor.class.getResource("/imagen/decoDoc.png")));
			label.setBounds(500, 220, -3, 16);
			panel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton regButton = new JButton("Registrar");
				regButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(checkUser() == true) {
							if(checkPasswords()==true) {
								try {
									Persona persona = new Doctor (txtCedula.getText().toString(), txtNombre.getText().toString(), txtDireccion.getText().toString(), txtTelefono.getText().toString(), cbxSexo.getSelectedItem().toString().charAt(0), txtCorreo.getText().toString(), cbxEspecialidad.getSelectedItem().toString());
									Clinica.getInstance().agregarPersona(persona);
									User user = new User (txtUser.getText().toString(), txtPassword.getText().toString(), "Doctor", persona);
									Clinica.getInstance().regUser(user);
									JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
									dispose();
								}
								catch (Exception ex) {
									// Manejar excepciones generales
									ex.printStackTrace(); // o loguear el error
									JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Por favor, verifica tus datos e intenta nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Las Contraseñas tienen que ser igual");
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Debe digitar su usuario y contraseña");
						}
					}
				});
				regButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				regButton.setForeground(new Color(51, 153, 204));
				regButton.setActionCommand("OK");
				buttonPane.add(regButton);
				getRootPane().setDefaultButton(regButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(51, 153, 204));
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
	
	private boolean checkPasswords() {
		if(txtPassword.getText().toString().equalsIgnoreCase(txtPasswordC.getText().toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean checkUser() {
		if(txtUser.getText().toString().equals("")||txtPassword.getText().toString().equals("")||txtPasswordC.getText().toString().equals("")) {
			return false;
		}
		else {
			return true;
		}
	}
}
