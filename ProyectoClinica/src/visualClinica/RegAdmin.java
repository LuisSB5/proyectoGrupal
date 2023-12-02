package VisualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegAdmin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtPassC;

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
		setBounds(100, 100, 351, 312);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "Informacion general", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBounds(12, 13, 300, 205);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblNewLabel = new JLabel("Usuario:");
					lblNewLabel.setBounds(12, 28, 56, 16);
					panel_1.add(lblNewLabel);
				}
				{
					txtUser = new JTextField();
					txtUser.setBounds(12, 46, 259, 19);
					panel_1.add(txtUser);
					txtUser.setColumns(10);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
					lblNewLabel_1.setBounds(12, 90, 95, 16);
					panel_1.add(lblNewLabel_1);
				}
				{
					txtPass = new JTextField();
					txtPass.setBounds(12, 105, 259, 22);
					panel_1.add(txtPass);
					txtPass.setColumns(10);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Confirmar contrase\u00F1a:");
					lblNewLabel_2.setBounds(12, 152, 136, 16);
					panel_1.add(lblNewLabel_2);
				}
				{
					txtPassC = new JTextField();
					txtPassC.setColumns(10);
					txtPassC.setBounds(12, 168, 259, 22);
					panel_1.add(txtPassC);
				}
			}
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
