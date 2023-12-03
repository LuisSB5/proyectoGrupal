package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtFecha;
	private JTextField txtNombre;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtSeguro;
	private JTextField textField;
	private JTextField txtTelefono;
	private JTextField textField_1;

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
		setBounds(100, 100, 442, 437);
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
				JLabel lblNewLabel = new JLabel("C\u00F3digo:");
				lblNewLabel.setForeground(new Color(0, 153, 255));
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblNewLabel.setBounds(12, 26, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				txtCodigo = new JTextField();
				txtCodigo.setEditable(false);
				txtCodigo.setBounds(80, 26, 85, 22);
				panel.add(txtCodigo);
				txtCodigo.setColumns(10);
			}
			{
				JLabel lblFecha = new JLabel("Fecha de nacimiento:");
				lblFecha.setForeground(new Color(0, 153, 255));
				lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblFecha.setBounds(12, 122, 131, 16);
				panel.add(lblFecha);
			}
			{
				txtFecha = new JTextField();
				txtFecha.setBounds(147, 119, 142, 22);
				panel.add(txtFecha);
				txtFecha.setColumns(10);
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
				txtPeso = new JTextField();
				txtPeso.setColumns(10);
				txtPeso.setBounds(80, 170, 85, 22);
				panel.add(txtPeso);
			}
			{
				JLabel lblAltura = new JLabel("Altura:");
				lblAltura.setForeground(new Color(0, 153, 255));
				lblAltura.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblAltura.setBounds(12, 232, 56, 16);
				panel.add(lblAltura);
			}
			{
				txtAltura = new JTextField();
				txtAltura.setColumns(10);
				txtAltura.setBounds(80, 229, 85, 22);
				panel.add(txtAltura);
			}
			{
				JLabel lblTipoDeSangre = new JLabel("Tipo de sangre:");
				lblTipoDeSangre.setForeground(new Color(0, 153, 255));
				lblTipoDeSangre.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				lblTipoDeSangre.setBounds(187, 173, 113, 16);
				panel.add(lblTipoDeSangre);
			}
			{
				JComboBox cbxTipoSangre = new JComboBox();
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
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(80, 286, 85, 22);
				panel.add(textField);
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
				lblNewLabel_1.setBounds(324, 48, 90, 90);
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
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(187, 44, 113, 51);
				panel.add(textField_1);
			}
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setForeground(new Color(0, 153, 255));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
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
