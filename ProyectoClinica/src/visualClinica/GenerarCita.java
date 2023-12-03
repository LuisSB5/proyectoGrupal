package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GenerarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCita;
	private JTextField txtFecha;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarCita dialog = new GenerarCita();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarCita() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GenerarCita.class.getResource("/imagen/icnGeCitas.png")));
		setTitle("Generar Cita");
		setBackground(SystemColor.text);
		setResizable(false);
		setBounds(100, 100, 409, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.text);
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo:");
				lblNewLabel.setForeground(new Color(0, 153, 255));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(12, 37, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				txtCita = new JTextField();
				txtCita.setEditable(false);
				txtCita.setBounds(64, 34, 116, 22);
				panel.add(txtCita);
				txtCita.setColumns(10);
			}
			{
				JLabel lblFecha = new JLabel("Fecha:");
				lblFecha.setForeground(new Color(0, 153, 255));
				lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblFecha.setBounds(12, 107, 56, 16);
				panel.add(lblFecha);
			}
			{
				txtFecha = new JTextField();
				txtFecha.setBounds(71, 104, 109, 22);
				panel.add(txtFecha);
				txtFecha.setColumns(10);
			}
			{
				JLabel lblHora = new JLabel("Hora:");
				lblHora.setForeground(new Color(0, 153, 255));
				lblHora.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblHora.setBounds(12, 172, 56, 16);
				panel.add(lblHora);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(71, 169, 109, 22);
				panel.add(textField);
			}
			{
				JLabel lblPaciente = new JLabel("Paciente:");
				lblPaciente.setForeground(new Color(0, 153, 255));
				lblPaciente.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblPaciente.setBounds(192, 37, 74, 16);
				panel.add(lblPaciente);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(272, 34, 109, 22);
				panel.add(textField_1);
			}
			{
				JLabel lblEnfermedad = new JLabel("Enfermedad:");
				lblEnfermedad.setForeground(new Color(0, 153, 255));
				lblEnfermedad.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
				lblEnfermedad.setBounds(192, 107, 86, 16);
				panel.add(lblEnfermedad);
			}
			{
				JLabel lblDoctor = new JLabel("Doctor:");
				lblDoctor.setForeground(new Color(0, 153, 255));
				lblDoctor.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblDoctor.setBounds(192, 172, 74, 16);
				panel.add(lblDoctor);
			}
			{
				JComboBox cbxEnfermedad = new JComboBox();
				cbxEnfermedad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Hipertensi\u00F3n", "Diabetes", "Neuronal", "Enfermedad Gastroinstetinal", "Enfermedad Ginecol\u00F3gica ", "Enfermedad Hestomal\u00F3gica", "Enfermedad Oncol\u00F3gica"}));
				cbxEnfermedad.setBounds(272, 104, 109, 22);
				panel.add(cbxEnfermedad);
			}
			{
				JComboBox cbxDoctor = new JComboBox();
				cbxDoctor.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
				cbxDoctor.setBounds(268, 172, 109, 22);
				panel.add(cbxDoctor);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Generar");
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(0, 153, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.text);
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
