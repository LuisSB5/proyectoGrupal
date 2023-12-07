package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Clinica;
import logico.Consulta;
import logico.Vacuna;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarConsultaxID extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object[] row;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarConsultaxID dialog = new ListarConsultaxID();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarConsultaxID() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarConsultaxID.class.getResource("/imagen/ICNHelp.png")));
		setTitle("Cosultas");
		setBackground(SystemColor.text);
		setBounds(100, 100, 439, 413);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.text);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(SystemColor.inactiveCaption);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 137, 409, 179);
				panel.add(scrollPane);
				{
					model = new DefaultTableModel();
					table = new JTable();
					String [] header = {"Codigo","Fecha", "Enfermedad","Diagnostico", "Status"};
					table.setForeground(new Color(0, 153, 204));
					table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
					model.setColumnIdentifiers(header);
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.setBounds(273, 56, 97, 25);
			panel.add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel("ID Doctor");
			lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
			lblNewLabel.setBounds(45, 60, 70, 16);
			panel.add(lblNewLabel);
			{
				txtId = new JTextField();
				txtId.setBounds(127, 57, 116, 22);
				panel.add(txtId);
				txtId.setColumns(10);
			}
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.control);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
				JButton cancelButton = new JButton("Cancel");
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
		loadConsultas();
	}
	private void loadConsultas () {
		model.setRowCount(0);	   
		   row = new Object[model.getColumnCount()];
		   for (Consulta consul: Clinica.getInstance().getMisConsultas()) {
			   row[0]=consul.getCodeConsulta();
			   row[1]=consul.getFechaConsulta();
			   row[2]=consul.getEnfermedad();
			   row[3]=consul.getDiagnostico();
			   row[4]=consul.getStatus();
			  
			   model.addRow(row);
		   }
	}
}
