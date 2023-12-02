package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarCitas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIdDoctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarCitas dialog = new ListarCitas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarCitas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarCitas.class.getResource("/imagen/icnListarCitas.png")));
		setTitle("Listar Citas");
		setBackground(SystemColor.text);
		setResizable(false);
		setBounds(100, 100, 351, 270);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("ID Doctor:");
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
				lblNewLabel.setBounds(22, 63, 90, 16);
				panel.add(lblNewLabel);
			}
			{
				txtIdDoctor = new JTextField();
				txtIdDoctor.setBounds(114, 61, 90, 22);
				panel.add(txtIdDoctor);
				txtIdDoctor.setColumns(10);
			}
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.setBackground(SystemColor.activeCaption);
			btnNewButton.setBounds(216, 60, 97, 25);
			panel.add(btnNewButton);
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Listar citas");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setForeground(new Color(0, 153, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(0, 153, 204));
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
