package visualClinica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextHelp extends JFrame {

    private final JPanel contentPanel = new JPanel();
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            TextHelp dialog = new TextHelp();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public TextHelp() {
    	setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(TextHelp.class.getResource("/imagen/imgIC2.png")));
        setTitle("Info general");
        setBounds(100, 100, 1111, 592);
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

            JScrollPane scrollPane = new JScrollPane();
            panel.add(scrollPane, BorderLayout.CENTER);

            textArea = new JTextArea();
            textArea.setForeground(new Color(0, 0, 0));
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            textArea.setEditable(false);
            scrollPane.setViewportView(textArea);

            
            cargarContenidoArchivo("src/myFile.txt");
        }

        {
            JPanel buttonPane = new JPanel();
            buttonPane.setBackground(SystemColor.inactiveCaption);
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);

            JButton okButton = new JButton("OK");
            okButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
            okButton.setForeground(new Color(0, 153, 255));
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            okButton.setBackground(SystemColor.text);
            okButton.setActionCommand("OK");
            buttonPane.add(okButton);
            getRootPane().setDefaultButton(okButton);

            JButton cancelButton = new JButton("Cancelar");
            cancelButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
            cancelButton.setForeground(new Color(0, 153, 255));
            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            cancelButton.setBackground(SystemColor.text);
            cancelButton.setActionCommand("Cancelar");
            buttonPane.add(cancelButton);
        }
    }

    private void cargarContenidoArchivo(String rutaArchivo) {
        try (BufferedReader lectorMejorado = new BufferedReader(new FileReader(new File(rutaArchivo)))) {
            boolean eof = false;
            String lineaLeida;

            while (!eof) {
                lineaLeida = lectorMejorado.readLine();

                if (lineaLeida != null)
                    textArea.append(lineaLeida + "\n");

                else
                    eof = true;
            }
        } catch (IOException e) {
           
            textArea.setText("Error al cargar el archivo: " + e.getMessage());
        }
    }


}
