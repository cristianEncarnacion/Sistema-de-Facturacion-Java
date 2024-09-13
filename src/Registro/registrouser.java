package Registro;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.*;

public class registrouser extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtIngrese;
    private JPasswordField passwordField;
    private JTextField txtIngreseSuContrasea;
    private JTextField txtIngreseSuCedula;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registrouser frame = new registrouser();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public registrouser() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1548, 823);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setForeground(new Color(255, 255, 255));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        //setUndecorated(true);
        
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/registrooo.jpg")));
        lblNewLabel.setBounds(0, 0, 921, 786);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
        lblNewLabel_1.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1.setBounds(931, 318, 142, 29);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Confirmar contraseña");
        lblNewLabel_1_1.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(931, 522, 161, 29);
        contentPane.add(lblNewLabel_1_1);
        
        txtIngrese = new JTextField();
        txtIngrese.setFont(new Font("Roboto", Font.PLAIN, 14));
        txtIngrese.setForeground(new Color(192, 192, 192));
        txtIngrese.setBackground(new Color(255, 255, 255));
        txtIngrese.setText("Ingrese su nombre de usuario");
        txtIngrese.setBounds(979, 357, 512, 41);
        contentPane.add(txtIngrese);
        txtIngrese.setColumns(10);
        txtIngrese.setBorder(null);
        
        JLabel lblNewLabel_2 = new JLabel("REGISTRO");
        lblNewLabel_2.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/inventory_FILL0_wght400_GRAD0_opsz40.png")));
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD, 35));
        lblNewLabel_2.setBounds(1112, 171, 230, 60);
        contentPane.add(lblNewLabel_2);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(Color.BLACK);
        separator_1.setBounds(936, 612, 555, 2);
        contentPane.add(separator_1);
        
        passwordField = new JPasswordField();
        passwordField.setToolTipText("*******");
        passwordField.setForeground(new Color(0, 0, 0));
        passwordField.setBackground(new Color(255, 255, 255));
        passwordField.setBounds(969, 567, 522, 29);
        contentPane.add(passwordField);
        passwordField.setBorder(null);
        
   
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(221, 213, 200));
        panel.setBounds(1177, 716, 114, 48);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Registrar");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        
        
        	public void mouseClicked(MouseEvent e) {
        		  ronads ventanaLogin = new ronads();
        	        // Hacer visible la ventana de ronaldagain
        	        ventanaLogin.getFrame().setVisible(true);
        	        // Cerrar la ventana actual (opcional, dependiendo de tus necesidades)
        	        dispose();
        		
        		
        	}
        });
        lblNewLabel_3.setBounds(0, 0, 114, 48);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setBackground(new Color(221, 213, 200));
        lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBackground(Color.BLACK);
        separator_1_1.setBounds(936, 408, 555, 2);
        contentPane.add(separator_1_1);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/person_FILL0_wght400_GRAD0_opsz40.png")));
        lblNewLabel_4.setBounds(931, 357, 40, 48);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/lock_FILL0_wght600_GRAD0_opsz40.png")));
        lblNewLabel_4_1.setBounds(931, 561, 40, 41);
        contentPane.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/sneakers store brand logo sneaker store logo (1) - Hecho con PosterMyWall (4).jpg")));
        lblNewLabel_5.setBounds(1141, 0, 187, 179);
        contentPane.add(lblNewLabel_5);
        
        txtIngreseSuContrasea = new JTextField();
        txtIngreseSuContrasea.setText("Ingrese su Contraseña");
        txtIngreseSuContrasea.setForeground(Color.LIGHT_GRAY);
        txtIngreseSuContrasea.setFont(new Font("Roboto", Font.PLAIN, 14));
        txtIngreseSuContrasea.setColumns(10);
        txtIngreseSuContrasea.setBorder(null);
        txtIngreseSuContrasea.setBackground(Color.WHITE);
        txtIngreseSuContrasea.setBounds(979, 459, 512, 41);
        contentPane.add(txtIngreseSuContrasea);
        
        JSeparator separator_1_1_1 = new JSeparator();
        separator_1_1_1.setBackground(Color.BLACK);
        separator_1_1_1.setBounds(936, 510, 555, 2);
        contentPane.add(separator_1_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Cedula");
        lblNewLabel_1_2.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_2.setBounds(931, 228, 142, 29);
        contentPane.add(lblNewLabel_1_2);
        
        txtIngreseSuCedula = new JTextField();
        txtIngreseSuCedula.setText("Ingrese su Cedula");
        txtIngreseSuCedula.setForeground(Color.LIGHT_GRAY);
        txtIngreseSuCedula.setFont(new Font("Roboto", Font.PLAIN, 14));
        txtIngreseSuCedula.setColumns(10);
        txtIngreseSuCedula.setBorder(null);
        txtIngreseSuCedula.setBackground(Color.WHITE);
        txtIngreseSuCedula.setBounds(979, 255, 512, 41);
        contentPane.add(txtIngreseSuCedula);
        
        JSeparator separator_1_1_2 = new JSeparator();
        separator_1_1_2.setBackground(Color.BLACK);
        separator_1_1_2.setBounds(936, 306, 555, 2);
        contentPane.add(separator_1_1_2);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/id_card_FILL0_wght400_GRAD0_opsz40.png")));
        lblNewLabel_6.setBounds(931, 255, 45, 41);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1_1.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_1_1.setBounds(931, 420, 95, 29);
        contentPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_4_1_1 = new JLabel("");
        lblNewLabel_4_1_1.setIcon(new ImageIcon(registrouser.class.getResource("/imagenes/lock_FILL0_wght600_GRAD0_opsz40.png")));
        lblNewLabel_4_1_1.setBounds(931, 459, 40, 41);
        contentPane.add(lblNewLabel_4_1_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        comboBox.addItem("Gerente");
        comboBox.addItem("Contable");
        comboBox.addItem("Vendedor");
        comboBox.addItem("Almacenista");
        comboBox.setBounds(931, 656, 560, 21);
        contentPane.add(comboBox);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("");
        lblNewLabel_1_1_2.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_1_2.setBounds(931, 648, 161, 29);
        contentPane.add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_1_3 = new JLabel("Funcion / puesto del Usuario");
        lblNewLabel_1_1_3.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_1_3.setBounds(931, 624, 212, 29);
        contentPane.add(lblNewLabel_1_1_3);
       
        
   
}
    public JFrame getFrame() {
		return getFrame();
	}

 
}