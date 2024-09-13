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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registrocliente2 {

	private JFrame frame;
	JPanel PanelFondo,panel;
	DefaultTableModel modo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_6;
	private JPanel panel_1;
	private JLabel lblNewLabel_7;
	private JPanel panel_2;
	private JLabel lblNewLabel_8;
	private JPanel panel_3;
	private JLabel lblNewLabel_9;
	private JPanel panel_4;
	private JLabel lblNewLabel_10;
	private cliente1 tablaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrocliente2 window = new registrocliente2();
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
	
	public registrocliente2() {
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 686, 720);
		
		frame.getContentPane().setLayout(null);
	
		
	 panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(221, 213, 200));
		panel.setBounds(0, 0, 707, 682);
		frame.getContentPane().add(panel);
		panel.setLayout(null);


        modo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID del Cliente", "Cedula del Cliente", "Nombre", "Apellido", "Telefono", "Direccion", "Fecha de Creacion"}
        );
		
		lblNewLabel_1 = new JLabel("Cedula");
		lblNewLabel_1.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/id_card_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_1.setBounds(152, 305, 117, 24);
		lblNewLabel_1.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/face_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_2.setBounds(152, 339, 117, 34);
		lblNewLabel_2.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/person_book_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_3.setBounds(152, 383, 117, 34);
		lblNewLabel_3.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/call_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_4.setBounds(152, 443, 117, 20);
		lblNewLabel_4.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/map_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_5.setBounds(152, 494, 117, 20);
		lblNewLabel_5.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setBounds(354, 308, 175, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(354, 353, 175, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(354, 396, 175, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(354, 445, 175, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(354, 496, 175, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel = new JLabel("Registro de clientes");
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 30));
		lblNewLabel.setBounds(209, 24, 296, 65);
		panel.add(lblNewLabel);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(registrocliente2.class.getResource("/imagenes/sneakers store brand logo sneaker store logo (1) - Hecho con PosterMyWall (2).jpg")));
		lblNewLabel_6.setBounds(239, 99, 200, 157);
		panel.add(lblNewLabel_6);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(42, 619, 130, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_7 = new JLabel("Guardar");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_7.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(37, 10, 58, 20);
		panel_1.add(lblNewLabel_7);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(209, 619, 130, 40);
		panel.add(panel_2);
		
		lblNewLabel_8 = new JLabel("Modificar");
		lblNewLabel_8.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(35, 10, 66, 20);
		panel_2.add(lblNewLabel_8);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(380, 619, 130, 40);
		panel.add(panel_3);
		
		lblNewLabel_9 = new JLabel("Cancelar");
		lblNewLabel_9.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(37, 10, 58, 20);
		panel_3.add(lblNewLabel_9);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(544, 619, 130, 40);
		panel.add(panel_4);
		
		lblNewLabel_10 = new JLabel("Cancelar");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_10.setFont(new Font("Roboto Light", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(37, 10, 58, 20);
		panel_4.add(lblNewLabel_10);
		
	}

	
	public JFrame getFrame() {
		return frame;
	}

	public JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}

}