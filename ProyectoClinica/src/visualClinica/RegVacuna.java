package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.Enfermedad;
import logico.Vacuna;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class RegVacuna extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCode;
	private JTextField txtNombre;
	private JTextField txtDescrip;
	private JSpinner spnCantDisp;
	private JComboBox cbxEnf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegVacuna dialog = new RegVacuna();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegVacuna() {
		setTitle("Registrar Vacuna");
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegVacuna.class.getResource("/imagen/icnVa.png")));
		setBounds(100, 100, 395, 463);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel labelCodigo = new JLabel("C\u00F3digo:");
				labelCodigo.setBounds(24, 34, 77, 21);
				labelCodigo.setForeground(new Color(0, 102, 204));
				labelCodigo.setFont(new Font("Segoe UI", Font.BOLD, 15));
				panel.add(labelCodigo);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setForeground(new Color(0, 102, 204));
				lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblNombre.setBounds(24, 89, 77, 26);
				panel.add(lblNombre);
			}
			{
				JLabel lblDes = new JLabel("Descripci\u00F3n:");
				lblDes.setForeground(new Color(0, 102, 204));
				lblDes.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblDes.setBounds(24, 149, 92, 26);
				panel.add(lblDes);
			}
			{
				txtCode = new JTextField();
				txtCode.setEditable(false);
				txtCode.setBounds(127, 35, 77, 22);
				panel.add(txtCode);
				txtCode.setText("VAC-"+Clinica.getGeneradorCodigoVacuna());
				txtCode.setColumns(10);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(127, 93, 77, 22);
				panel.add(txtNombre);
			}
			{
				txtDescrip = new JTextField();
				txtDescrip.setColumns(10);
				txtDescrip.setBounds(127, 153, 198, 22);
				panel.add(txtDescrip);
			}
			{
				JLabel lblCantdisponible = new JLabel("Cant.disponible:");
				lblCantdisponible.setForeground(new Color(0, 102, 204));
				lblCantdisponible.setFont(new Font("Segoe UI", Font.BOLD, 15));
				lblCantdisponible.setBounds(24, 218, 124, 26);
				panel.add(lblCantdisponible);
			}
			
			spnCantDisp = new JSpinner();
			spnCantDisp.setBounds(140, 222, 185, 22);
			panel.add(spnCantDisp);
			
			JLabel lblEnfermedad = new JLabel("Enfermedad:");
			lblEnfermedad.setForeground(new Color(0, 102, 204));
			lblEnfermedad.setFont(new Font("Segoe UI", Font.BOLD, 15));
			lblEnfermedad.setBounds(24, 291, 92, 26);
			panel.add(lblEnfermedad);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(RegVacuna.class.getResource("/imagen/icnRegVa.png")));
			lblNewLabel.setBounds(236, 25, 106, 101);
			panel.add(lblNewLabel);
			{
				cbxEnf = new JComboBox();
				cbxEnf.setBounds(140, 295, 185, 21);
				panel.add(cbxEnf);
			}
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
						try {
							Vacuna vac = new Vacuna(txtCode.getText().toString(), txtNombre.getText().toString(), txtDescrip.getText().toString(), new Integer (spnCantDisp.getValue().toString()), cbxEnf.getSelectedItem().toString());
							Clinica.getInstance().agregarVacuna(vac);
							JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						} catch (NumberFormatException ex) {
					        JOptionPane.showMessageDialog(null, "Error en el formato de número", "Error", JOptionPane.ERROR_MESSAGE);
					    } catch (Exception ex) {
					        ex.printStackTrace();
					        JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Por favor, inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
					    }
					}
				});
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(0, 102, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setForeground(new Color(0, 102, 204));
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
		loadEnfermedadesToComboBox();
	}
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
