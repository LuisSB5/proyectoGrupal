package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.Consulta;
import logico.Doctor;
import logico.Enfermedad;
import logico.Paciente;
import logico.Persona;
import logico.Vacuna;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class GenerarConsulta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtConsultaCode;
	private JTextField txtIdPaciente;
	private JTextField txtDiagnostico;
	private JComboBox cbxVacunas;
	private JComboBox cbxEnf;
	private JSpinner spnFecha;
	private JComboBox cbxEstadoEnfermedad;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public GenerarConsulta(Doctor doc) {
		setTitle("Registrar Consulta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GenerarConsulta.class.getResource("/imagen/icnConsultas.png")));
		setResizable(false);
		setBackground(SystemColor.text);
		setBounds(100, 100, 427, 475);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n del paciente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBackground(SystemColor.inactiveCaption);
			panel_1.setBounds(12, 13, 387, 235);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("C\u00F3digo:");
			lblNewLabel.setForeground(new Color(0, 0, 102));
			lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel.setBounds(12, 35, 56, 16);
			panel_1.add(lblNewLabel);
			
			JLabel lblFechaEmisin = new JLabel("Fecha Emisi\u00F3n:");
			lblFechaEmisin.setForeground(new Color(0, 0, 102));
			lblFechaEmisin.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblFechaEmisin.setBounds(240, 35, 95, 16);
			panel_1.add(lblFechaEmisin);
			
			JLabel lblPaciente = new JLabel("Paciente ID:");
			lblPaciente.setForeground(new Color(0, 0, 102));
			lblPaciente.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblPaciente.setBounds(12, 97, 84, 16);
			panel_1.add(lblPaciente);
			
			JLabel lblVacunas = new JLabel("Vacunas:");
			lblVacunas.setForeground(new Color(0, 0, 102));
			lblVacunas.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblVacunas.setBounds(12, 159, 56, 16);
			panel_1.add(lblVacunas);
			
			JLabel lblEnfermedad = new JLabel("Enfermedad:");
			lblEnfermedad.setForeground(new Color(0, 0, 102));
			lblEnfermedad.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblEnfermedad.setBounds(240, 97, 95, 16);
			panel_1.add(lblEnfermedad);
			
			JLabel lblEstatus = new JLabel("Estatus:");
			lblEstatus.setForeground(new Color(0, 0, 102));
			lblEstatus.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblEstatus.setBounds(250, 159, 56, 16);
			panel_1.add(lblEstatus);
			
			txtConsultaCode = new JTextField();
			txtConsultaCode.setEditable(false);
			txtConsultaCode.setBounds(12, 64, 116, 22);
			panel_1.add(txtConsultaCode);
			txtConsultaCode.setText("C-"+Clinica.getInstance().getGeneradorCodigoConsulta());
			txtConsultaCode.setColumns(10);
			
			txtIdPaciente = new JTextField();
			txtIdPaciente.setBounds(12, 126, 116, 22);
			panel_1.add(txtIdPaciente);
			txtIdPaciente.setColumns(10);
			
			cbxVacunas = new JComboBox();
			cbxVacunas.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cbxVacunas.setBounds(12, 188, 116, 22);
			panel_1.add(cbxVacunas);
			
			cbxEstadoEnfermedad = new JComboBox();
			cbxEstadoEnfermedad.setFont(new Font("Tahoma", Font.PLAIN, 10));
			cbxEstadoEnfermedad.setModel(new DefaultComboBoxModel(new String[] {"<Estado de la enfermedad>", "Activa", "Controlada"}));
			cbxEstadoEnfermedad.setBounds(239, 189, 117, 22);
			panel_1.add(cbxEstadoEnfermedad);
			
			spnFecha = new JSpinner();
			spnFecha.setModel(new SpinnerDateModel(new Date(1701662400000L), null, null, Calendar.DAY_OF_YEAR));

	        // Configurar el formato del editor para mostrar solo la fecha (día, mes y año)
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        DateEditor de_spnFecha = new JSpinner.DateEditor(spnFecha, dateFormat.toPattern());
	        spnFecha.setEditor(de_spnFecha);
	        spnFecha.setBounds(240, 62, 116, 22);
			panel_1.add(spnFecha);
			
			cbxEnf = new JComboBox();
			cbxEnf.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cbxEnf.setBounds(240, 124, 116, 22);
			panel_1.add(cbxEnf);
			
			
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Diagn\u00F3stico", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBackground(SystemColor.activeCaption);
			panel_2.setBounds(12, 261, 387, 117);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			txtDiagnostico = new JTextField();
			txtDiagnostico.setBounds(12, 23, 363, 81);
			panel_2.add(txtDiagnostico);
			txtDiagnostico.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Enfermedad enf = Clinica.getInstance().buscarEnfermedadByNomb(cbxEnf.getSelectedItem().toString());
						Paciente paciente = Clinica.getInstance().buscarPacientePorID(txtIdPaciente.getText().toString());
						Vacuna vac = Clinica.getInstance().buscarVacunaByNomb(cbxVacunas.getSelectedItem().toString());
						Consulta cons = new Consulta(txtConsultaCode.getText().toString(), (Date) spnFecha.getValue(), txtDiagnostico.getText().toString(), enf, paciente, doc, vac, cbxEstadoEnfermedad.getSelectedItem().toString());
						Clinica.getInstance().agregarConsulta(cons);
						JOptionPane.showMessageDialog(null, "Consulta Registrada", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
				});
				okButton.setForeground(new Color(51, 51, 102));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setBackground(SystemColor.text);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setForeground(new Color(51, 51, 102));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadVacunasToComboBox();
		loadEnfermedadesToComboBox();
	}
	private void loadVacunasToComboBox() {
		cbxVacunas.removeAllItems();
		String aux = null;
		for(Vacuna vacuna : Clinica.getInstance().getMisVacunas()) {
				aux = ""+vacuna.getNombre();
				cbxVacunas.addItem(aux);
			}
		cbxVacunas.insertItemAt("<Seleccione>", 0);
		cbxVacunas.setSelectedIndex(0);
	}	
	//MC
	private void loadEnfermedadesToComboBox() {
		cbxEnf.removeAllItems();
		String aux = null;
		for(Enfermedad enf : Clinica.getInstance().getMisEnfermedades()) {
				aux = ""+enf.getNombre();
				cbxEnf.addItem(aux);
			}
		cbxEnf.insertItemAt("<Seleccione>", 0);
		cbxEnf.setSelectedIndex(0);
	}	
}
