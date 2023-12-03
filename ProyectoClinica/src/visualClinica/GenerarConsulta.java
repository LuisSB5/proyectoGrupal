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
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GenerarConsulta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtConsultaCode;
	private JTextField txtIdPaciente;
	private JTextField txtFecha;
	private JTextField txtEnfermedad;
	private JTextField txtDiagnostico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarConsulta dialog = new GenerarConsulta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarConsulta() {
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
			txtConsultaCode.setColumns(10);
			
			txtIdPaciente = new JTextField();
			txtIdPaciente.setBounds(12, 126, 116, 22);
			panel_1.add(txtIdPaciente);
			txtIdPaciente.setColumns(10);
			
			JComboBox cbxVacunas = new JComboBox();
			cbxVacunas.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cbxVacunas.setBounds(12, 188, 116, 22);
			panel_1.add(cbxVacunas);
			
			txtFecha = new JTextField();
			txtFecha.setColumns(10);
			txtFecha.setBounds(240, 62, 116, 22);
			panel_1.add(txtFecha);
			
			txtEnfermedad = new JTextField();
			txtEnfermedad.setColumns(10);
			txtEnfermedad.setBounds(240, 126, 116, 22);
			panel_1.add(txtEnfermedad);
			
			JComboBox cbxEstadoEnfermedad = new JComboBox();
			cbxEstadoEnfermedad.setFont(new Font("Tahoma", Font.PLAIN, 10));
			cbxEstadoEnfermedad.setModel(new DefaultComboBoxModel(new String[] {"<Estado de la enfermedad>", "Activa", "Controlada"}));
			cbxEstadoEnfermedad.setBounds(239, 189, 117, 22);
			panel_1.add(cbxEstadoEnfermedad);
			
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
	}
}
