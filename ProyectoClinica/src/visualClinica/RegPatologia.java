package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.Enfermedad;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RegPatologia extends JDialog {
	

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoPatologia;
	private JTextField txtNombrePatologia;
	private JTextField txtPatologiaEstatus;
	private JTextField txtSintomas;
	private JTextField txtTratamiento;
	
	public static void main(String[] args) {
		try {
			RegPatologia dialog = new RegPatologia();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPatologia() {
		setTitle("Reg Patolog\u00EDa");
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegPatologia.class.getResource("/imagen/icnPatologias.png")));
		setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		setResizable(false);
		setBounds(100, 100, 399, 470);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panelFondoGeneral = new JPanel();
			panelFondoGeneral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelFondoGeneral.setBackground(SystemColor.text);
			contentPanel.add(panelFondoGeneral, BorderLayout.CENTER);
			panelFondoGeneral.setLayout(null);
			
			JLabel lblCode = new JLabel("C\u00F3digo:");
			lblCode.setForeground(new Color(0, 102, 204));
			lblCode.setFont(new Font("Segoe UI", Font.BOLD, 15));
			lblCode.setBounds(12, 34, 59, 26);
			panelFondoGeneral.add(lblCode);
			
			txtCodigoPatologia = new JTextField();
			txtCodigoPatologia.setEditable(false);
			txtCodigoPatologia.setBackground(SystemColor.menu);
			txtCodigoPatologia.setBounds(83, 38, 96, 22);
			panelFondoGeneral.add(txtCodigoPatologia);
			txtCodigoPatologia.setText("ENF-"+Clinica.getGeneradorCodigoPatologia());
			txtCodigoPatologia.setColumns(10);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setForeground(new Color(0, 102, 204));
				lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblNombre.setBounds(12, 106, 78, 26);
				panelFondoGeneral.add(lblNombre);
			}
			{
				txtNombrePatologia = new JTextField();
				txtNombrePatologia.setColumns(10);
				txtNombrePatologia.setBackground(SystemColor.inactiveCaption);
				txtNombrePatologia.setBounds(83, 110, 96, 22);
				panelFondoGeneral.add(txtNombrePatologia);
			}
			{
				JLabel lblStatus = new JLabel("Status:");
				lblStatus.setForeground(new Color(0, 102, 204));
				lblStatus.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblStatus.setBounds(12, 173, 78, 26);
				panelFondoGeneral.add(lblStatus);
			}
			{
				txtPatologiaEstatus = new JTextField();
				txtPatologiaEstatus.setColumns(10);
				txtPatologiaEstatus.setBackground(SystemColor.inactiveCaption);
				txtPatologiaEstatus.setBounds(83, 177, 96, 22);
				panelFondoGeneral.add(txtPatologiaEstatus);
			}
			{
				JLabel lblSintomas = new JLabel("Sintomas:");
				lblSintomas.setForeground(new Color(0, 102, 204));
				lblSintomas.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblSintomas.setBounds(53, 250, 78, 26);
				panelFondoGeneral.add(lblSintomas);
			}
			{
				txtSintomas = new JTextField();
				txtSintomas.setColumns(10);
				txtSintomas.setBackground(SystemColor.inactiveCaption);
				txtSintomas.setBounds(26, 289, 134, 69);
				panelFondoGeneral.add(txtSintomas);
			}
			{
				JLabel lblTratamiento = new JLabel("Tratamiento:");
				lblTratamiento.setForeground(new Color(0, 102, 204));
				lblTratamiento.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblTratamiento.setBounds(237, 250, 91, 26);
				panelFondoGeneral.add(lblTratamiento);
			}
			{
				txtTratamiento = new JTextField();
				txtTratamiento.setColumns(10);
				txtTratamiento.setBackground(SystemColor.inactiveCaption);
				txtTratamiento.setBounds(217, 289, 134, 69);
				panelFondoGeneral.add(txtTratamiento);
			}
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(RegPatologia.class.getResource("/imagen/imgRegPa.png")));
				lblNewLabel.setBounds(217, 34, 154, 164);
				panelFondoGeneral.add(lblNewLabel);
			}
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.inactiveCaptionBorder);
			buttonPane.setForeground(new Color(102, 204, 255));
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(51, 102, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Enfermedad enf = new Enfermedad(txtCodigoPatologia.getText().toString(), txtNombrePatologia.getText().toString(), txtPatologiaEstatus.getText().toString(), txtSintomas.getText().toString(), txtTratamiento.getText().toString());
							Clinica.getInstance().agregarEnfermedad(enf);
							JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
							dispose();
					 	}catch (Exception ex) {
					        ex.printStackTrace(); // o loguear el error
					        JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Por favor, verifica tus datos e intenta nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
					    }
					}
				});
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
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setForeground(new Color(51, 102, 204));
				cancelButton.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(null);
		}
	}
}