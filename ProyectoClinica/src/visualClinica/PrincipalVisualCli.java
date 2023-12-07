package visualClinica;

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

import logico.Clinica;
import logico.Doctor;
import logico.Secretaria;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class PrincipalVisualCli extends JFrame {

	private JPanel contentPane;
	//private Dimension dim;

	/**
	 * Create the frame.
	 */
	public PrincipalVisualCli() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileOutputStream empresa2;
				ObjectOutputStream empresaWrite;
				try {
					empresa2 = new  FileOutputStream("clinicaPOO.dat");
					empresaWrite = new ObjectOutputStream(empresa2);
					empresaWrite.writeObject(Clinica.getInstance());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
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
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Doctor")) {
			mnDoctor.setVisible(false);
		}
		mnDoctor.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnDoct.png")));
		mnDoctor.setForeground(new Color(0, 153, 255));
		mnDoctor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnDoctor);
		
		JMenuItem mntmListarCitas = new JMenuItem("Listar Citas");
		mntmListarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCitasxID list= new ListarCitasxID();
				list.setModal(true);
				list.setVisible(true);
				
			}
		});
		mntmListarCitas.setForeground(new Color(51, 102, 204));
		mntmListarCitas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnDoctor.add(mntmListarCitas);
		
		JMenuItem mntmBuscarHistorialPaciente = new JMenuItem("Buscar Historial Paciente");
		mntmBuscarHistorialPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ListarHistorial historial= new ListarHistorial();
					historial.setModal(true);
					historial.setVisible(true);
			}
		});
		mntmBuscarHistorialPaciente.setForeground(new Color(51, 102, 204));
		mntmBuscarHistorialPaciente.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnDoctor.add(mntmBuscarHistorialPaciente);
		
		JMenuItem menuItem = new JMenuItem("Nueva Consulta");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Clinica.getLoginUser().getTipo().equalsIgnoreCase("Doctor") ) {
					Doctor doc = Clinica.getInstance().buscarDoctorByCedula(Clinica.getLoginUser().getPersona().getCedula());
					GenerarConsulta consulta= new GenerarConsulta(doc);
					consulta.setModal(true);
					consulta.setVisible(true);
				}
			
			}
		});
		menuItem.setForeground(new Color(51, 102, 204));
		menuItem.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnDoctor.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Mostrar Consultas ant");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarConsultaxID consulta= new ListarConsultaxID();
				consulta.setModal(true);
			    consulta.setVisible(true);

			}
		});
		menuItem_1.setForeground(new Color(51, 102, 204));
		menuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnDoctor.add(menuItem_1);
		
		JMenu mnPaciente = new JMenu("Paciente");
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Secretaria")) {
			mnPaciente.setVisible(false);
		}
		mnPaciente.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnPa.png")));
		mnPaciente.setForeground(new Color(0, 153, 255));
		mnPaciente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnPaciente);
		
		JMenuItem mntmRegvacunas = new JMenuItem("Generar Cita");
		mntmRegvacunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Clinica.getInstance().getLoginUser().getTipo().equals("Secretaria")){
					GenerarCita cita= new GenerarCita();
					cita.setModal(true);
					cita.setVisible(true);
				}
			}
		});
		mntmRegvacunas.setForeground(new Color(51, 102, 204));
		mntmRegvacunas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnPaciente.add(mntmRegvacunas);
		
		JMenuItem mntmRegpaciente = new JMenuItem("Reg. Paciente");
		mntmRegpaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegPaciente paciente= new RegPaciente();
				paciente.setModal(true);
				paciente.setVisible(true);
			}
		});
		mntmRegpaciente.setForeground(new Color(51, 102, 204));
		mntmRegpaciente.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnPaciente.add(mntmRegpaciente);
		
		JMenu mnVacunas = new JMenu("Vacunas");
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Administrador")) {
			mnVacunas.setVisible(false);
		}
		mnVacunas.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnVa.png")));
		mnVacunas.setForeground(new Color(0, 153, 255));
		mnVacunas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnVacunas);
		
		JMenuItem mntmRegVacunas = new JMenuItem("Reg.Vacunas");
		mntmRegVacunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegVacuna regVa= new RegVacuna();
				regVa.setModal(true);
				regVa.setVisible(true);
			}
		});
		mntmRegVacunas.setForeground(new Color(51, 102, 204));
		mntmRegVacunas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnVacunas.add(mntmRegVacunas);
		
		JMenuItem mntmListarVacunas = new JMenuItem("Listar Vacunas");
		mntmListarVacunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarVacuna listaVa= new ListarVacuna();
				listaVa.setModal(true);
				listaVa.setVisible(true);
			}
		});
		mntmListarVacunas.setForeground(new Color(51, 102, 204));
		mntmListarVacunas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnVacunas.add(mntmListarVacunas);
		
		JMenu mnPatologias = new JMenu("Patolog\u00EDas");
		if(Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Secretaria")) {
			mnPatologias.setVisible(false);
		}
		mnPatologias.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnEnf.png")));
		mnPatologias.setForeground(new Color(0, 153, 255));
		mnPatologias.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnPatologias);
		
		JMenuItem mntmRegpatologas = new JMenuItem("Reg.Patolog\u00EDas");
		mntmRegpatologas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegPatologia regPat= new RegPatologia(null);
				regPat.setModal(true);
				regPat.setVisible(true);

			}
		});
		mntmRegpatologas.setForeground(new Color(51, 102, 204));
		mntmRegpatologas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnPatologias.add(mntmRegpatologas);
		
		JMenuItem mntmListarPatologas = new JMenuItem("Listar Patolog\u00EDas");
		mntmListarPatologas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarPatologia listarPat= new ListarPatologia();
				listarPat.setModal(true);
				listarPat.setVisible(true);
			}
		});
		mntmListarPatologas.setForeground(new Color(51, 102, 204));
		mntmListarPatologas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnPatologias.add(mntmListarPatologas);
		
		JMenu mnViviendas = new JMenu(" Viviendas aso.");
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Administrador")) {
			mnViviendas.setVisible(false);
		}
		mnViviendas.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnVi.png")));
		mnViviendas.setForeground(new Color(0, 153, 255));
		mnViviendas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnViviendas);
		
		JMenuItem mntmRegviviendas = new JMenuItem("Reg.Viviendas");
		mntmRegviviendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegVivienda vivienda= new RegVivienda();
				vivienda.setModal(true);
				vivienda.setVisible(true);
			}
		});
		mntmRegviviendas.setForeground(new Color(51, 102, 204));
		mntmRegviviendas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnViviendas.add(mntmRegviviendas);
		
		JMenuItem mntmListarViviendas = new JMenuItem("Listar Viviendas");
		mntmListarViviendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarVivienda listarvivienda= new ListarVivienda();
				listarvivienda.setModal(true);
				listarvivienda.setVisible(true);
			}
		});
		mntmListarViviendas.setForeground(new Color(51, 102, 204));
		mntmListarViviendas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnViviendas.add(mntmListarViviendas);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Administrador")) {
			mnUsuarios.setVisible(false);
		}
		mnUsuarios.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/MnUsu.png")));
		mnUsuarios.setForeground(new Color(0, 153, 255));
		mnUsuarios.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnUsuarios);
		
		JMenuItem mntmListarUsuarios = new JMenuItem("Listar Usuarios");
		mntmListarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarPersonas persona= new ListarPersonas();
				persona.setModal(true);
				persona.setVisible(true);
			}
		});
		mntmListarUsuarios.setForeground(new Color(51, 102, 204));
		mntmListarUsuarios.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnUsuarios.add(mntmListarUsuarios);
		
		JMenu mnSobreNosotros = new JMenu("Administrador");
		if(!Clinica.getInstance().getLoginUser().getTipo().equalsIgnoreCase("Administrador")){
			mnSobreNosotros.setVisible(false);
		}
		mnSobreNosotros.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/ICNadmi.svg.png")));
		mnSobreNosotros.setForeground(new Color(0, 153, 255));
		mnSobreNosotros.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(mnSobreNosotros);
		
		JMenu mnNewMenu = new JMenu("Registrar Personal");
		mnNewMenu.setForeground(new Color(0, 102, 204));
		mnNewMenu.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		mnSobreNosotros.add(mnNewMenu);
		
		JMenuItem mntRegAd = new JMenuItem("Reg. Administrador");
		mntRegAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegAdmin admi= new RegAdmin();
				admi.setModal(true);
				admi.setVisible(true);
			}
		});
		mntRegAd.setForeground(new Color(0, 153, 204));
		mntRegAd.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		mnNewMenu.add(mntRegAd);
		
		JMenuItem mntmRegSecretaria = new JMenuItem("Reg. Secretaria");
		mntmRegSecretaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegSecretaria secretaria= new RegSecretaria();
				secretaria.setModal(true);
				secretaria.setVisible(true);
			}
		});
		mntmRegSecretaria.setForeground(new Color(0, 153, 204));
		mntmRegSecretaria.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		mnNewMenu.add(mntmRegSecretaria);
		
		JMenuItem mntmRegDoctor = new JMenuItem("Reg. Doctor");
		mntmRegDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegDoctor regCo= new RegDoctor();
				regCo.setModal(true);
				regCo.setVisible(true);
				
			}
		});
		mntmRegDoctor.setForeground(new Color(0, 153, 204));
		mntmRegDoctor.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		mnNewMenu.add(mntmRegDoctor);
		
		JMenu AboutUs = new JMenu("Help");
		AboutUs.setIcon(new ImageIcon(PrincipalVisualCli.class.getResource("/imagen/ICNHelp.png")));
		AboutUs.setForeground(new Color(0, 153, 255));
		AboutUs.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		menuBar.add(AboutUs);
		
		JMenuItem mntmcmoFuncionaEl = new JMenuItem("\u00BFC\u00F3mo Funciona el programa?");
		mntmcmoFuncionaEl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextHelp help= new TextHelp();
				 help.setVisible(true);
			}
		});
		mntmcmoFuncionaEl.setForeground(new Color(51, 102, 204));
		mntmcmoFuncionaEl.setFont(new Font("Segoe UI", Font.BOLD, 15));
		AboutUs.add(mntmcmoFuncionaEl);
		
		
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
		panel.add(lblNewLabelFondoIMG, BorderLayout.WEST);

	}
}
