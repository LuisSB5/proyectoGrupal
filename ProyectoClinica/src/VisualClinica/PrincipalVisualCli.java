package VisualClinica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalVisualCli extends JFrame {

	private JPanel contentPane;
	//private Dimension dim;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVisualCli frame = new PrincipalVisualCli();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalVisualCli() {
		//dim= getToolkit().getScreenSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBackground(new Color(0, 204, 204));
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalVisualCli.class.getResource("/imagen/imgIC2.png")));
		setResizable(true);
		setTitle("\u00A1Welcome!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(screenSize.width, screenSize.height - 50);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnDoctor = new JMenu("Doctor");
		mnDoctor.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnDoct.png")));
		mnDoctor.setForeground(new Color(0, 153, 255));
		mnDoctor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnDoctor);
		
		JMenu mnPaciente = new JMenu("Paciente");
		mnPaciente.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnPa.png")));
		mnPaciente.setForeground(new Color(0, 153, 255));
		mnPaciente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnPaciente);
		
		JMenuItem mntmPacienteListado = new JMenuItem("Listado");
		mntmPacienteListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnPaciente.add(mntmPacienteListado);
		
		JMenuItem mntmPacienteRegistrar = new JMenuItem("Registrar");
		mnPaciente.add(mntmPacienteRegistrar);
		
		JMenu mnVacunas = new JMenu("Vacunas");
		mnVacunas.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnVa.png")));
		mnVacunas.setForeground(new Color(0, 153, 255));
		mnVacunas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnVacunas);
		
		JMenu mnPatologias = new JMenu("Patolog\u00EDas");
		mnPatologias.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnEnf.png")));
		mnPatologias.setForeground(new Color(0, 153, 255));
		mnPatologias.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnPatologias);
		
		JMenu mnUsuarios = new JMenu(" Usuarios");
		mnUsuarios.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnUsu.png")));
		mnUsuarios.setForeground(new Color(0, 153, 255));
		mnUsuarios.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnUsuarios);
		
		JMenu mnViviendas = new JMenu(" Viviendas aso.");
		mnViviendas.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnVi.png")));
		mnViviendas.setForeground(new Color(0, 153, 255));
		mnViviendas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnViviendas);
		
		JMenu mnSobreNosotros = new JMenu("Administrador");
		mnSobreNosotros.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/ICNadmi.svg.png")));
		mnSobreNosotros.setForeground(new Color(0, 153, 255));
		mnSobreNosotros.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnSobreNosotros);
		
		JMenu AboutUs = new JMenu("Help");
		AboutUs.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/ICNHelp.png")));
		AboutUs.setForeground(new Color(0, 153, 255));
		AboutUs.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(AboutUs);
		
		
		//setBounds(100, 100, 600, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		ImageIcon imageIcon = new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/4k.jpg"));
		Image image = imageIcon.getImage().getScaledInstance(screenSize.width, screenSize.height - 50, Image.SCALE_SMOOTH);

		ImageIcon scaledImageIcon = new ImageIcon(image);

		JLabel lblNewLabelFondoIMG = new JLabel("");
		lblNewLabelFondoIMG.setIcon(scaledImageIcon);
		panel.add(lblNewLabelFondoIMG, BorderLayout.NORTH);

	}
}
