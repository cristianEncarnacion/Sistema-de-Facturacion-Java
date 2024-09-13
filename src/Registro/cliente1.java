package Registro;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class cliente1 {

	private JFrame frame;
	JPanel PanelFondo;
	DefaultTableModel modo;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JPanel panel_1,panel;
	private JPanel panel_2;
	private JLabel lblAgregarCliente;
	private JPanel panel_3;
	private JLabel lblExportarListado;
	private JLabel lblNewLabel_2;
	private JTable table;
	private registrocliente2 tablaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cliente1 window = new cliente1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cliente1() {
		
		
		initialize();
		registrocliente2 cliente2=new registrocliente2();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1267, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		 panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(221, 213, 200));
		panel.setBounds(0, 0, 1267, 719);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(687, 139, 138, 31);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("Buscar Cliente");
		lblNewLabel.setBounds(10, 10, 124, 20);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(cliente1.class.getResource("/imagenes/search_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 189, 1232, 475);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);


        modo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID del Cliente", "Cedula del Cliente", "Nombre", "Apellido", "Telefono", "Direccion", "Fecha de Creacion"}
        );
        table.setModel(modo);
		
		lblNewLabel_1 = new JLabel("Clientes");
		lblNewLabel_1.setIcon(new ImageIcon(cliente1.class.getResource("/imagenes/person_FILL1_wght400_GRAD0_opsz48.png")));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.BOLD, 40));
		lblNewLabel_1.setBounds(575, 35, 235, 60);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(252, 139, 381, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(1069, 139, 160, 31);
		panel.add(panel_2);
		
		lblAgregarCliente = new JLabel("Agregar Cliente");
		lblAgregarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registrocliente2 cliente2=new registrocliente2();
				cliente2.getFrame().setVisible(true);
			}
		});
		lblAgregarCliente.setIcon(new ImageIcon(cliente1.class.getResource("/imagenes/person_add_FILL1_wght400_GRAD0_opsz24.png")));
		lblAgregarCliente.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		lblAgregarCliente.setBounds(10, 10, 140, 20);
		panel_2.add(lblAgregarCliente);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(880, 139, 160, 31);
		panel.add(panel_3);
		
		lblExportarListado = new JLabel("Exportar listado");
		lblExportarListado.setIcon(new ImageIcon(cliente1.class.getResource("/imagenes/upgrade_FILL1_wght400_GRAD0_opsz40.png")));
		lblExportarListado.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		lblExportarListado.setBounds(0, 0, 150, 30);
		panel_3.add(lblExportarListado);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(cliente1.class.getResource("/imagenes/sneakers store brand logo sneaker store logo (1) - Hecho con PosterMyWall (2).jpg")));
		lblNewLabel_2.setBounds(10, 10, 200, 169);
		panel.add(lblNewLabel_2);
		
	}
	
	
	public JFrame getFrame() {
		return frame;
	}

	public JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}

}