package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import logico.Cita;
import logico.Clinica;
import logico.Consulta;
import logico.Doctor;

import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarCitasxID extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object[] row;
	private JTextField txtIdDoc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarCitasxID dialog = new ListarCitasxID();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarCitasxID() {
		setTitle("Citas");
		setBackground(SystemColor.text);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarCitasxID.class.getResource("/imagen/icnListarCitas.png")));
		setResizable(false);
		setBounds(100, 100, 413, 542);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 90, 403, 372);
				panel.add(scrollPane);
				{
					model = new DefaultTableModel();
					String [] header = {"Paciente","Día", "Status"};
					table = new JTable();
					table.setForeground(new Color(0, 153, 204));
					table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
					model.setColumnIdentifiers(header);
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.inactiveCaption);
			panel_1.setBounds(0, 0, 403, 92);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("ID Doctor:");
			lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel.setBounds(58, 35, 83, 16);
			panel_1.add(lblNewLabel);
			
			txtIdDoc = new JTextField();
			txtIdDoc.setBounds(130, 32, 116, 22);
			panel_1.add(txtIdDoc);
			txtIdDoc.setColumns(10);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Doctor doc = Clinica.getInstance().buscarDoctorByCedula(txtIdDoc.getText().toString());
					loadCitas(doc);
				}
			});
			btnBuscar.setForeground(new Color(0, 153, 204));
			btnBuscar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			btnBuscar.setBounds(258, 31, 97, 25);
			panel_1.add(btnBuscar);
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("modificar");
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(0, 153, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(SystemColor.text);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setForeground(new Color(0, 153, 204));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void loadCitas(Doctor doc) {
		// TODO Auto-generated method stub
		model.setRowCount(0);	   
		   row = new Object[model.getColumnCount()];
		   for (Cita cit: Clinica.getInstance().getMisCitas()) {
			   if(doc.getCedula().equalsIgnoreCase(cit.getDoctor().getCedula())) {
				   row[0]=cit.getCodCita();
				   row[1]=cit.getPaciente().getNombre();
				   row[2]=cit.getFecha();
				   model.addRow(row);
			   }
		   }
	}
}
