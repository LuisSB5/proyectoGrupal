package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.User;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileInputStream empresa;
				FileOutputStream empresa2;
				ObjectInputStream empresaRead;
				ObjectOutputStream empresaWrite;
				try {
					empresa = new FileInputStream ("clinicaPOO.dat");
					empresaRead = new ObjectInputStream(empresa);
					Clinica temp = (Clinica)empresaRead.readObject();
					Clinica.setClinica(temp);
					empresa.close();
					empresaRead.close();
			
				} catch (FileNotFoundException e) {
					try {
						empresa2 = new  FileOutputStream("clinicaPOO.dat");
						empresaWrite = new ObjectOutputStream(empresa2);
						User aux = new User("Administrador", "Admin", "Admin",null);
						Clinica.getInstance().regUser(aux);
						empresaWrite.writeObject(Clinica.getInstance());
						empresa2.close();
						empresaWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the dialog.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagen/MnUsu.png")));
		setBackground(new Color(0, 153, 255));
		setBounds(100, 100, 423, 335);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Usuario:");
			lblNewLabel.setBounds(12, 24, 56, 16);
			panel.add(lblNewLabel);
			
			txtUser = new JTextField();
			txtUser.setBounds(12, 43, 256, 22);
			panel.add(txtUser);
			txtUser.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Contrasena:");
			lblNewLabel_1.setBounds(12, 111, 126, 16);
			panel.add(lblNewLabel_1);
			
			txtPassword = new JTextField();
			txtPassword.setColumns(10);
			txtPassword.setBounds(12, 129, 256, 22);
			panel.add(txtPassword);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Iniciar sesion");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Clinica.getInstance().confirmLogin(txtUser.getText(),txtPassword.getText())){
							PrincipalVisualCli frame = new PrincipalVisualCli();
							dispose();
							frame.setVisible(true);
						};
					}
				});
				okButton.setForeground(new Color(0, 102, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setBackground(SystemColor.text);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.text);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setForeground(new Color(0, 102, 204));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
