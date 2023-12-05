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
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

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
		setBounds(100, 100, 539, 543);
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
				JLabel lblFecha = new JLabel("Fecha de nacimiento:");
				lblFecha.setForeground(new Color(0, 153, 255));
				lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblFecha.setBounds(31, 214, 131, 16);
				panel.add(lblFecha);
			}
			{
				JLabel lblNombre_1 = new JLabel("Peso:");
				lblNombre_1.setForeground(new Color(0, 153, 255));
				lblNombre_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNombre_1.setBounds(31, 257, 56, 16);
				panel.add(lblNombre_1);
			}
			{
				JLabel lblAltura = new JLabel("Altura:");
				lblAltura.setForeground(new Color(0, 153, 255));
				lblAltura.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblAltura.setBounds(31, 301, 56, 16);
				panel.add(lblAltura);
			}
			{
				JLabel lblTipoDeSangre = new JLabel("Tipo de sangre:");
				lblTipoDeSangre.setForeground(new Color(0, 153, 255));
				lblTipoDeSangre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblTipoDeSangre.setBounds(31, 405, 113, 16);
				panel.add(lblTipoDeSangre);
			}
			{
				cbxTipoSangre = new JComboBox();
				cbxTipoSangre.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "A+\t", "A-\t", "B+\t", "B-\t", "AB+\t", "AB-", "O+\t", "O-"}));
				cbxTipoSangre.setBounds(174, 402, 154, 22);
				panel.add(cbxTipoSangre);
			}
			{
				JLabel lblCorreo = new JLabel("Correo:");
				lblCorreo.setForeground(new Color(0, 153, 255));
				lblCorreo.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblCorreo.setBounds(31, 353, 56, 16);
				panel.add(lblCorreo);
			}
			{
				txtCorreo = new JTextField();
				txtCorreo.setColumns(10);
				txtCorreo.setBounds(174, 350, 154, 22);
				panel.add(txtCorreo);
			}
			
			JSpinner spnFecha = new JSpinner();
			spnFecha.setModel(new SpinnerDateModel(new Date(1701662400000L), null, null, Calendar.DAY_OF_YEAR));

	        // Configurar el formato del editor para mostrar solo la fecha (día, mes y año)
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        DateEditor dateEditor = new JSpinner.DateEditor(spnFecha, dateFormat.toPattern());
	        spnFecha.setEditor(dateEditor);
			spnFecha.setBounds(174, 211, 150, 22);
			panel.add(spnFecha);
			{
				spnPeso = new JSpinner();
				spnPeso.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spnPeso.setBounds(174, 254, 154, 22);
				panel.add(spnPeso);
			}
			
			spnAltura = new JSpinner();
			spnAltura.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAltura.setBounds(174, 298, 150, 22);
			panel.add(spnAltura);
			
			JLabel lblNewLabel_2 = new JLabel("Lb.");
			lblNewLabel_2.setBounds(336, 257, 56, 16);
			panel.add(lblNewLabel_2);
			
			JLabel lblCm = new JLabel("Cm.");
			lblCm.setBounds(336, 301, 56, 16);
			panel.add(lblCm);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(new Color(0, 0, 102));
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
			panel_1.setBackground(SystemColor.text);
			panel_1.setBounds(12, 13, 499, 170);
			panel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(12, 84, 56, 16);
				panel_1.add(lblNombre);
				lblNombre.setForeground(new Color(0, 153, 255));
				lblNombre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				JLabel lblNewLabel = new JLabel("C\u00E9dula: ");
				lblNewLabel.setBounds(12, 32, 56, 16);
				panel_1.add(lblNewLabel);
				lblNewLabel.setForeground(new Color(0, 153, 255));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				JLabel lblSexo = new JLabel("Sexo:");
				lblSexo.setBounds(294, 84, 85, 16);
				panel_1.add(lblSexo);
				lblSexo.setForeground(new Color(0, 153, 255));
				lblSexo.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
				lblDireccin.setBounds(294, 32, 85, 16);
				panel_1.add(lblDireccin);
				lblDireccin.setForeground(new Color(0, 153, 255));
				lblDireccin.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setBounds(200, 39, 69, 90);
				panel_1.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon(RegPaciente.class.getResource("/imagen/icnRegPac.png")));
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(83, 81, 85, 22);
				panel_1.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				txtCedula = new JTextField();
				txtCedula.setBounds(83, 29, 85, 22);
				panel_1.add(txtCedula);
				txtCedula.setColumns(10);
			}
			{
				cbxSexo = new JComboBox();
				cbxSexo.setBounds(381, 81, 106, 22);
				panel_1.add(cbxSexo);
				cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "F", "M"}));
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setBounds(381, 29, 106, 22);
				panel_1.add(txtDireccion);
				txtDireccion.setColumns(10);
			}
			{
				JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
				lblTelfono.setBounds(12, 127, 85, 16);
				panel_1.add(lblTelfono);
				lblTelfono.setForeground(new Color(0, 153, 255));
				lblTelfono.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				txtSeguro = new JTextField();
				txtSeguro.setBounds(384, 124, 103, 22);
				panel_1.add(txtSeguro);
				txtSeguro.setColumns(10);
			}
			{
				JLabel lblNumSegura = new JLabel("Num. Seguro:");
				lblNumSegura.setBounds(294, 127, 87, 16);
				panel_1.add(lblNumSegura);
				lblNumSegura.setForeground(new Color(0, 153, 255));
				lblNumSegura.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setBounds(83, 124, 85, 22);
				panel_1.add(txtTelefono);
				txtTelefono.setColumns(10);
			}
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(SystemColor.text);
				panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_2.setBounds(12, 196, 499, 248);
				panel.add(panel_2);
				panel_2.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon(RegPaciente.class.getResource("/imagen/icnPacienteDeco.png")));
				lblNewLabel_3.setBounds(399, 13, 56, 222);
				panel_2.add(lblNewLabel_3);
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

