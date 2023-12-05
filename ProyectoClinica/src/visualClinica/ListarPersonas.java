package visualClinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import logico.Clinica;
import logico.Doctor;
import logico.Paciente;
import logico.Persona;
import logico.Secretaria;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarPersonas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object[] row;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarPersonas dialog = new ListarPersonas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarPersonas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarPersonas.class.getResource("/imagen/ICNadmi.svg.png")));
		setBackground(SystemColor.text);
		setTitle("Personas Registradas");
		setResizable(false);
		setBounds(100, 100, 387, 410);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.text);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{

					model = new DefaultTableModel();
					table = new JTable();
					String [] header = {"Nombre","Cedula", "Contacto", "Posicion"};
					table.setForeground(new Color(0, 0, 0));
					table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
					model.setColumnIdentifiers(header);
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Eliminar");
				okButton.setForeground(new Color(0, 153, 255));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadPersonas();
	}
	
	private void loadPersonas() {
		 model.setRowCount(0);
		   
		   row= new Object[model.getColumnCount()];
		   for (Persona persona: Clinica.getInstance().getMisPersonas()) {
			   row[0]=persona.getNombre();
			   row[1]=persona.getCedula();
			   row[2]=persona.getTelefono();
			   
			   if(persona instanceof Paciente) {
				   row[3] = "Paciente";
			   }
			   if(persona instanceof Doctor) {
				   if(persona.getSexo()=='F') {
					   row[3] = "Doctora";
				   }
				   else {
					   row[3] = "Doctor";
				   }
			   }
			   if(persona instanceof Secretaria) {
				   if(persona.getSexo()=='F') {
					   row[3] = "Secretaria";
				   }
				   else {
					   row[3] = "Secretario";
				   }
			   }
			   
			   model.addRow(row);
		
		   }

	}

}
