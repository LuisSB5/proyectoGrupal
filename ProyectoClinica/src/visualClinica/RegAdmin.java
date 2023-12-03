package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class RegAdmin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JTextField txtPassword;
	private JTextField txtPasswordC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegAdmin dialog = new RegAdmin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegAdmin() {
		setResizable(false);
		setTitle("Registrar Administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegAdmin.class.getResource("/imagen/MnUsu.png")));
		setBounds(100, 100, 410, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(SystemColor.text);
				panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion general", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 204)));
				panel_1.setBounds(12, 13, 373, 343);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					txtUser = new JTextField();
					txtUser.setBounds(25, 74, 93, 22);
					panel_1.add(txtUser);
					txtUser.setColumns(10);
				}
				{
					txtPassword = new JTextField();
					txtPassword.setBounds(25, 251, 136, 22);
					panel_1.add(txtPassword);
					txtPassword.setColumns(10);
				}
				{
					txtPasswordC = new JTextField();
					txtPasswordC.setColumns(10);
					txtPasswordC.setBounds(199, 251, 143, 22);
					panel_1.add(txtPasswordC);
				}
				
				JLabel lblUsuario = new JLabel("Usuario:");
				lblUsuario.setForeground(new Color(0, 102, 204));
				lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblUsuario.setBounds(25, 35, 59, 26);
				panel_1.add(lblUsuario);
				
				JLabel lblContraseaNueva = new JLabel("Contrase\u00F1a nueva:");
				lblContraseaNueva.setForeground(new Color(0, 102, 204));
				lblContraseaNueva.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblContraseaNueva.setBounds(18, 204, 143, 22);
				panel_1.add(lblContraseaNueva);
				
				JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
				lblConfirmarContrasea.setForeground(new Color(0, 102, 204));
				lblConfirmarContrasea.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblConfirmarContrasea.setBounds(194, 204, 179, 22);
				panel_1.add(lblConfirmarContrasea);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(RegAdmin.class.getResource("/imagen/icnRegad.png")));
				lblNewLabel.setBounds(183, 38, 150, 116);
				panel_1.add(lblNewLabel);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton regButton = new JButton("Registrar");
				regButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(checkPasswords()==true) {
							User user = new User (txtUser.getText().toString(), txtPassword.getText().toString(),"Admin",null);
							Clinica.getInstance().regUser(user);
							JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Las Contraseñas tienen que ser igual");
						}
					}
				});
				regButton.setBackground(Color.WHITE);
				regButton.setForeground(new Color(0, 102, 204));
				regButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
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
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.setForeground(new Color(0, 102, 204));
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
}
