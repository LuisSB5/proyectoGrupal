package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.HistoriaClinica;
import logico.Paciente;
import logico.Persona;

import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner.DateEditor;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtSeguro;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JSpinner spnFecha;
	private JComboBox cbxSexo;
	private JSpinner spnPeso;
	private JSpinner spnAltura;
	private JComboBox cbxTipoSangre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPaciente dialog = new RegPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPaciente() {
		setResizable(false);
		setTitle("Registrar paciente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegPaciente.class.getResource("/imagen/MnPa.png")));
		setBounds(100, 100, 560, 543);
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
			{
				JLabel lblNewLabel = new JLabel("C\u00E9dula: ");
				lblNewLabel.setForeground(new Color(0, 153, 255));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(12, 26, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				txtCedula = new JTextField();
				txtCedula.setBounds(80, 26, 85, 22);
				panel.add(txtCedula);
				txtCedula.setColumns(10);
			}
			{
				JLabel lblFecha = new JLabel("Fecha de nacimiento:");
				lblFecha.setForeground(new Color(0, 153, 255));
				lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblFecha.setBounds(12, 122, 131, 16);
				panel.add(lblFecha);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setForeground(new Color(0, 153, 255));
				lblNombre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNombre.setBounds(12, 73, 56, 16);
				panel.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(80, 70, 85, 22);
				panel.add(txtNombre);
			}
			{
				JLabel lblNombre_1 = new JLabel("Peso:");
				lblNombre_1.setForeground(new Color(0, 153, 255));
				lblNombre_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNombre_1.setBounds(12, 173, 56, 16);
				panel.add(lblNombre_1);
			}
			{
				JLabel lblAltura = new JLabel("Altura:");
				lblAltura.setForeground(new Color(0, 153, 255));
				lblAltura.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblAltura.setBounds(12, 232, 56, 16);
				panel.add(lblAltura);
			}
			{
				JLabel lblTipoDeSangre = new JLabel("Tipo de sangre:");
				lblTipoDeSangre.setForeground(new Color(0, 153, 255));
				lblTipoDeSangre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblTipoDeSangre.setBounds(187, 173, 113, 16);
				panel.add(lblTipoDeSangre);
			}
			{
				cbxTipoSangre = new JComboBox();
				cbxTipoSangre.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "A+\t", "A-\t", "B+\t", "B-\t", "AB+\t", "AB-", "O+\t", "O-"}));
				cbxTipoSangre.setBounds(297, 170, 117, 22);
				panel.add(cbxTipoSangre);
			}
			{
				JLabel lblNumSegura = new JLabel("Num. Seguro:");
				lblNumSegura.setForeground(new Color(0, 153, 255));
				lblNumSegura.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNumSegura.setBounds(187, 232, 113, 16);
				panel.add(lblNumSegura);
			}
			{
				txtSeguro = new JTextField();
				txtSeguro.setColumns(10);
				txtSeguro.setBounds(297, 229, 117, 22);
				panel.add(txtSeguro);
			}
			{
				JLabel lblCorreo = new JLabel("Correo:");
				lblCorreo.setForeground(new Color(0, 153, 255));
				lblCorreo.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblCorreo.setBounds(12, 286, 56, 16);
				panel.add(lblCorreo);
			}
			{
				txtCorreo = new JTextField();
				txtCorreo.setColumns(10);
				txtCorreo.setBounds(72, 286, 85, 22);
				panel.add(txtCorreo);
			}
			{
				JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
				lblTelfono.setForeground(new Color(0, 153, 255));
				lblTelfono.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblTelfono.setBounds(187, 286, 85, 16);
				panel.add(lblTelfono);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(297, 286, 117, 22);
				panel.add(txtTelefono);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(RegPaciente.class.getResource("/imagen/icnRegPac.png")));
				lblNewLabel_1.setBounds(424, 23, 90, 90);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
				lblDireccin.setForeground(new Color(0, 153, 255));
				lblDireccin.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblDireccin.setBounds(215, 26, 85, 16);
				panel.add(lblDireccin);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(286, 23, 113, 22);
				panel.add(txtDireccion);
			}
			
			JSpinner spnFecha = new JSpinner();
			spnFecha.setModel(new SpinnerDateModel(new Date(1701662400000L), null, null, Calendar.DAY_OF_YEAR));

	        // Configurar el formato del editor para mostrar solo la fecha (día, mes y año)
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        DateEditor dateEditor = new JSpinner.DateEditor(spnFecha, dateFormat.toPattern());
	        spnFecha.setEditor(dateEditor);
			spnFecha.setBounds(151, 119, 121, 22);
			panel.add(spnFecha);
			{
				spnPeso = new JSpinner();
				spnPeso.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spnPeso.setBounds(82, 170, 65, 22);
				panel.add(spnPeso);
			}
			
			spnAltura = new JSpinner();
			spnAltura.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAltura.setBounds(82, 229, 65, 22);
			panel.add(spnAltura);
			
			JLabel lblNewLabel_2 = new JLabel("Lb.");
			lblNewLabel_2.setBounds(151, 173, 56, 16);
			panel.add(lblNewLabel_2);
			
			JLabel lblCm = new JLabel("Cm.");
			lblCm.setBounds(151, 232, 56, 16);
			panel.add(lblCm);
			{
				JLabel lblSexo = new JLabel("Sexo:");
				lblSexo.setForeground(new Color(0, 153, 255));
				lblSexo.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblSexo.setBounds(215, 73, 85, 16);
				panel.add(lblSexo);
			}
			{
				cbxSexo = new JComboBox();
				cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "F", "M"}));
				cbxSexo.setBounds(286, 70, 113, 22);
				panel.add(cbxSexo);
			}
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						HistoriaClinica hist = new HistoriaClinica (txtCedula.getText().toString());
						Persona persona = new Paciente(txtCedula.getText().toString(), txtNombre.getText().toString(), txtDireccion.getText().toString(), txtTelefono.getText().toString(), cbxSexo.getSelectedItem().toString().charAt(0), txtCorreo.getText().toString(), txtSeguro.getText().toString(), hist, new Integer(spnPeso.getValue().toString()), new Integer(spnAltura.getValue().toString()), cbxTipoSangre.getSelectedItem().toString(),((Date) spnFecha.getValue()), null);
						Clinica.getInstance().agregarPersona(persona);
						JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
				});
				btnRegistrar.setForeground(new Color(0, 153, 255));
				btnRegistrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setForeground(new Color(0, 153, 255));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

