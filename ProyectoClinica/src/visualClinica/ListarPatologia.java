package visualClinica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Clinica;
import logico.Enfermedad;
import logico.Persona;

import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarPatologia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object[] row;
	private Enfermedad selected=null;
	private JButton okButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void msain(String[] args) {
		try {
			ListarPatologia dialog = new ListarPatologia();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarPatologia() {
		setBackground(SystemColor.text);
		setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarPatologia.class.getResource("/imagen/icnPatologias.png")));
		setTitle("Listar Patolog\u00EDa");
		setResizable(false);
		setBounds(100, 100, 383, 442);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panelFondoGeneral = new JPanel();
			contentPanel.add(panelFondoGeneral, BorderLayout.CENTER);
			panelFondoGeneral.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPanePatologias = new JScrollPane();
				panelFondoGeneral.add(scrollPanePatologias, BorderLayout.CENTER);
				{
				
					model = new DefaultTableModel();
					String [] header = {"Código","Nombre", "Status"};
					table = new JTable();
					table.setForeground(new Color(0, 153, 204));
					table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
					model.setColumnIdentifiers(header);
					table.setModel(model);
					scrollPanePatologias.setViewportView(table);
					
					
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Modificar");
				okButton.setBackground(SystemColor.text);
				okButton.setForeground(new Color(0, 102, 204));
				okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						RegPatologia update = new RegPatologia (selected);
						update.setModal(true);
						update.setVisible(true);
						
						
						
						
					}
				});
				{
					JButton btnEliminar = new JButton("Eliminar");
					btnEliminar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							eliminarPatologia();
							
						}
					});
					btnEliminar.setForeground(new Color(0, 102, 204));
					btnEliminar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
					btnEliminar.setBackground(Color.WHITE);
					btnEliminar.setActionCommand("OK");
					buttonPane.add(btnEliminar);
				}
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(SystemColor.text);
				cancelButton.setForeground(new Color(0, 102, 204));
				cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadPatologias();
	}
	
	
	public static void loadPatologias() {
	    model.setRowCount(0);

	    for (Enfermedad enf : Clinica.getInstance().getMisEnfermedades()) {
	        Object[] row = new Object[model.getColumnCount()];  // Crear un nuevo arreglo para cada fila
	        row[0] = enf.getCodEnfermedad();
	        row[1] = enf.getNombre();
	        row[2] = enf.getStatus();
	        model.addRow(row);
	    }
	}
	private void eliminarPatologia() {
	    int filaSeleccionada = table.getSelectedRow();

	    if (filaSeleccionada != -1) {
	        String codEnfermedad = (String) model.getValueAt(filaSeleccionada, 0);

	        int confirmacion = JOptionPane.showConfirmDialog(null,
	                "¿Estás seguro de eliminar la patología seleccionada?", "Confirmación de eliminación",
	                JOptionPane.YES_NO_OPTION);

	        if (confirmacion == JOptionPane.YES_OPTION) {
	            Clinica.getInstance().eliminarEnfermedad(codEnfermedad);
	            loadPatologias();
	            JOptionPane.showMessageDialog(null, "Patología eliminada correctamente", "Información",
	                    JOptionPane.INFORMATION_MESSAGE);
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "Selecciona una patología para eliminar", "Error",
	                JOptionPane.ERROR_MESSAGE);
	    }
	}

}
