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
	private JTextField txtDire;

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
		setBounds(100, 100, 513, 606);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_general = new JPanel();
				panel_general.setBackground(SystemColor.inactiveCaption);
				panel_general.setFont(new Font("Segoe UI", Font.BOLD, 13));
				panel_general.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n general", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 204)));
				panel_general.setBounds(0, 13, 497, 308);
				panel.add(panel_general);
				panel_general.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setForeground(new Color(0, 0, 153));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(231, 34, 81, 16);
				panel_general.add(lblNewLabel);
				
				txtNombre = new JTextField();
				txtNombre.setBounds(319, 31, 166, 22);
				panel_general.add(txtNombre);
				txtNombre.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("C\u00E9dula: ");
				lblNewLabel_1.setForeground(new Color(0, 0, 153));
				lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_1.setBounds(12, 34, 81, 16);
				panel_general.add(lblNewLabel_1);
				
				txtCedula = new JTextField();
				txtCedula.setBounds(78, 31, 138, 22);
				panel_general.add(txtCedula);
				txtCedula.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Tel\u00E9fono:");
				lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_2.setForeground(new Color(0, 0, 153));
				lblNewLabel_2.setBounds(12, 69, 81, 16);
				panel_general.add(lblNewLabel_2);
				
				txtTelefono = new JTextField();
				txtTelefono.setBounds(76, 66, 140, 22);
				panel_general.add(txtTelefono);
				txtTelefono.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Especialidad:");
				lblNewLabel_3.setForeground(new Color(0, 0, 153));
				lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_3.setBounds(231, 69, 81, 16);
				panel_general.add(lblNewLabel_3);
				
				txtEspecialidad = new JTextField();
				txtEspecialidad.setBounds(319, 66, 166, 22);
				panel_general.add(txtEspecialidad);
				txtEspecialidad.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("Sexo:");
				lblNewLabel_4.setForeground(new Color(0, 0, 153));
				lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_4.setBounds(12, 104, 81, 16);
				panel_general.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
				lblNewLabel_5.setForeground(new Color(0, 0, 153));
				lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_5.setBounds(12, 158, 138, 16);
				panel_general.add(lblNewLabel_5);
				
				txtCorreo = new JTextField();
				txtCorreo.setBounds(135, 155, 337, 22);
				panel_general.add(txtCorreo);
				txtCorreo.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Direccion:");
				lblNewLabel_6.setForeground(new Color(0, 0, 153));
				lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel_6.setBounds(231, 104, 81, 16);
				panel_general.add(lblNewLabel_6);
				
				txtDireccion = new JTextField();
				txtDireccion.setBounds(29, 223, 237, 72);
				panel_general.add(txtDireccion);
				txtDireccion.setColumns(10);
				
				JComboBox cbxSexo = new JComboBox();
				cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "M", "F"}));
				cbxSexo.setBounds(78, 101, 138, 22);
				panel_general.add(cbxSexo);
				
				txtDire = new JTextField();
				txtDire.setColumns(10);
				txtDire.setBounds(319, 101, 166, 22);
				panel_general.add(txtDire);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.inactiveCaption);
			panel_1.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(0, 361, 516, 130);
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
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
