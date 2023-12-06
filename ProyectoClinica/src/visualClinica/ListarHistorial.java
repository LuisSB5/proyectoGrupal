package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import logico.Clinica;
import logico.Paciente;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarHistorial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object[] row;
	private JTextField txtPacienteId;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ListarHistorial(Paciente paciente) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarHistorial.class.getResource("/imagen/icnListarCitas.png")));
		setTitle("Historial Paciente");
		setBackground(SystemColor.text);
		setResizable(false);
		setBounds(100, 100, 549, 624);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 182, 533, 353);
				panel.add(scrollPane);
				{
					model = new DefaultTableModel();
					String [] header = {"Nombre","Vacunas", "Enfermedades","Estatus de la enfermedad",};
					table = new JTable();
					table.setEnabled(false);
					table.setForeground(new Color(0, 153, 204));
					table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
					model.setColumnIdentifiers(header);
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			{
				JLabel lblNewLabel = new JLabel("ID paciente:");
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
				lblNewLabel.setBounds(75, 47, 119, 41);
				panel.add(lblNewLabel);
			}
			{
				txtPacienteId = new JTextField();
				txtPacienteId.setBounds(172, 57, 116, 22);
				panel.add(txtPacienteId);
				txtPacienteId.setColumns(10);
			}
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
			            String idPaciente = txtPacienteId.getText().toString();
			            Paciente paciente = Clinica.getInstance().buscarPacientePorID(idPaciente);

			            if (paciente != null) {
			                activarTabla(true);
			                //loadPaciente(paciente);// not finished yet 
			            } else {
			                activarTabla(false);
			                throw new IllegalArgumentException("Paciente no encontrado.");
			            }
			        } catch (IllegalArgumentException ex) {
			            System.out.println(ex.getMessage());
			        }
			    }
					
				
			});
			btnNewButton.setBounds(313, 56, 97, 25);
			panel.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Ok");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setForeground(new Color(0, 153, 255));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.setBackground(SystemColor.text);
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
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void activarTabla(boolean status) {
    table.setEnabled(status);
    
}
	private void loadPaciente(Paciente paciente) {
	    model.addRow(new Object[]{paciente.getNombre(), "", "", ""});

	    String medicalHistory = paciente.getHist().getMedicalHistoryAsString();

	    String[] lines = medicalHistory.split("\n");

	    // Populate the table with medical history data
	    for (int i = 0; i < lines.length; i++) {
	        // Assuming that the second column is for vaccines
	        // Assuming that the third column is for diseases
	        // Assuming that the fourth column is for the status of diseases
	        model.addRow(new Object[]{"", lines[i], "", ""});
	    }
	
}

}
	



