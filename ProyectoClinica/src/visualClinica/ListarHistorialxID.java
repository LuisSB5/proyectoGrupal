package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Paciente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarHistorialxID extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombrePaciente;
	private JButton okButton;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarHistorialxID dialog = new ListarHistorialxID();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarHistorialxID() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarHistorialxID.class.getResource("/imagen/icnListarCitas.png")));
		setTitle("Listar");
		setBackground(SystemColor.text);
		setBounds(100, 100, 420, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("ID del paciente:");
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(24, 73, 150, 16);
				panel.add(lblNewLabel);
			}
			{
				txtNombrePaciente = new JTextField();
				txtNombrePaciente.setBounds(139, 70, 123, 22);
				panel.add(txtNombrePaciente);
				txtNombrePaciente.setColumns(10);
			}
			{
				btnNewButton = new JButton("Buscar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 try {
					            String idPaciente = txtNombrePaciente.getText().toString();
					            Paciente paciente = Clinica.getInstance().buscarPacientePorID(idPaciente);

					            if (paciente != null) {
					                okButton.setEnabled(true);
					            } else {
					                okButton.setEnabled(false);
					                throw new IllegalArgumentException("Paciente no encontrado.");
					            }
					        } catch (IllegalArgumentException ex) {
					            System.out.println(ex.getMessage());
					        }
					    }
				});
				btnNewButton.setBackground(SystemColor.activeCaption);
				btnNewButton.setBounds(283, 69, 97, 25);
				panel.add(btnNewButton);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Listar");
				okButton.setEnabled(false);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String idPaciente = txtNombrePaciente.getText().toString();
			            Paciente paciente = Clinica.getInstance().buscarPacientePorID(idPaciente);
						ListarHistorial list= new ListarHistorial(paciente);
						list.setModal(true);
						list.setVisible(true);
					}
				});
				okButton.setForeground(new Color(0, 153, 255));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(0, 153, 255));
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
