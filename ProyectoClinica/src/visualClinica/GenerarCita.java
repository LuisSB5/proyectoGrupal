package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import java.time.LocalTime;
import javax.swing.border.TitledBorder;

import logico.Cita;
import logico.Clinica;
import logico.Consulta;
import logico.Doctor;
import logico.Enfermedad;
import logico.Paciente;
import logico.Persona;
import logico.Secretaria;
import logico.Vacuna;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class GenerarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCita;
	private JTextField txtPaciente;
	private JComboBox<String> cbxDoctor;
	private JComboBox<String> cbxEnfermedad;
	private JSpinner spnFecha;
	private JSpinner spnHora;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public GenerarCita(Secretaria secre) {
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
			panel.setBackground(SystemColor.activeCaption);
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo:");
				lblNewLabel.setForeground(new Color(0, 0, 128));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(12, 37, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				txtCita = new JTextField();
				txtCita.setEditable(false);
				txtCita.setBounds(71, 34, 109, 22);
				panel.add(txtCita);
				txtCita.setText("CITA-"+Clinica.getInstance().getGeneradorCodigoCita());
				txtCita.setColumns(10);
			}
			{
				JLabel lblFecha = new JLabel("Fecha:");
				lblFecha.setForeground(new Color(0, 0, 128));
				lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblFecha.setBounds(12, 107, 56, 16);
				panel.add(lblFecha);
			}
			{
				// Configurar el formato del editor para mostrar solo la fecha (d�a, mes y a�o)
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			}
			{
				JLabel lblHora = new JLabel("Hora:");
				lblHora.setForeground(new Color(0, 0, 128));
				lblHora.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblHora.setBounds(12, 172, 56, 16);
				panel.add(lblHora);
			}
			{
				JLabel lblPaciente = new JLabel("Paciente:");
				lblPaciente.setForeground(new Color(0, 0, 128));
				lblPaciente.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblPaciente.setBounds(192, 37, 74, 16);
				panel.add(lblPaciente);
			}
			{
				txtPaciente = new JTextField();
				txtPaciente.setColumns(10);
				txtPaciente.setBounds(272, 34, 109, 22);
				panel.add(txtPaciente);
			}
			{
				JLabel lblEnfermedad = new JLabel("Enfermedad:");
				lblEnfermedad.setForeground(new Color(0, 0, 128));
				lblEnfermedad.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
				lblEnfermedad.setBounds(192, 107, 86, 16);
				panel.add(lblEnfermedad);
			}
			{
				JLabel lblDoctor = new JLabel("Doctor:");
				lblDoctor.setForeground(new Color(0, 0, 128));
				lblDoctor.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblDoctor.setBounds(192, 172, 74, 16);
				panel.add(lblDoctor);
			}
			{
				cbxEnfermedad = new JComboBox();
				cbxEnfermedad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Hipertensi\u00F3n", "Diabetes", "Neuronal", "Enfermedad Gastroinstetinal", "Enfermedad Ginecol\u00F3gica ", "Enfermedad Hestomal\u00F3gica", "Enfermedad Oncol\u00F3gica"}));
				cbxEnfermedad.setBounds(272, 104, 111, 22);
				panel.add(cbxEnfermedad);
			}
			{
				cbxDoctor = new JComboBox();
				cbxDoctor.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
				cbxDoctor.setBounds(272, 170, 109, 22);
				panel.add(cbxDoctor);
			}
			{
				spnFecha = new JSpinner();
				spnFecha.setModel(new SpinnerDateModel(new Date(1701662400000L), null, null, Calendar.DAY_OF_YEAR));
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				DateEditor de_spnFecha = new JSpinner.DateEditor(spnFecha, dateFormat.toPattern());
				spnFecha.setEditor(de_spnFecha);
				spnFecha.setBounds(71, 105, 109, 22);
			    panel.add(spnFecha);
			}
			{
				Date date = new Date();
				SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);
				
				spnHora = new JSpinner(sm);
				JSpinner.DateEditor de = new JSpinner.DateEditor(spnHora, "hh:mm a");
				de.getTextField().setEditable(false);
				spnHora.setEditor(de);
				spnHora.setBounds(71, 171, 109, 20);
				panel.add(spnHora);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Generar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Paciente paciente = Clinica.getInstance().buscarPacientePorID(txtPaciente.getText().toString());
							Enfermedad enfermedad = Clinica.getInstance().buscarEnfermedadByNomb(cbxEnfermedad.getSelectedItem().toString()); 
							//Cita cita = new Cita(codCita, fecha, paciente, doctor, hora)
							Cita cita = new Cita(txtCita.getText().toString(), (Date) spnFecha.getValue(), paciente, secre.getDoctorAsignado(), (LocalTime) spnHora.getValue());
							//Cita cita = new Cita(txtCita.getText().toString(), (Date) spnFecha.getValue(), paciente, secre.getDoctorAsignado(), spnHora.getValue());
							Clinica.getInstance().agregarCita(cita);
							JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace(); 
						    JOptionPane.showMessageDialog(null, "Se ha producido un error. Consulta la consola para obtener m�s detalles.", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
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
