package Registro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.TextArea;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class inventario {

	private JFrame frame;
	private JTable tableInventario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnModificar;
	private JButton btnCancelar;
	private JLabel lbInventario;
	private DefaultTableModel model;
	private JTextField textField_4;
	private JLabel lblNewLabel_2;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel_3;
	private JComboBox<String> comboBox_1;
	private JTextField textField_5;
	private JTextField textField_6;
	JTextArea textArea;
	private JButton btnCancelar_1;
	private JButton btnCancelar_2;
	JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inventario window = new inventario();
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
	public inventario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1550, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		 panel = new JPanel();
		panel.setBounds(0, 0, 1536, 794);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		model = new DefaultTableModel();
		model.addColumn("Codigo de Barra");
        model.addColumn("Nombre de producto");
        model.addColumn("Categoria");
        model.addColumn("Marca");
        model.addColumn("Precio Compra");
        model.addColumn("Precio Venta");
        model.addColumn("Stock");
        model.addColumn("Descripcion");
		
		tableInventario = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(tableInventario);
		scrollPane.setBounds(620, 131, 633, 465);
		panel.add(scrollPane);
		
		JLabel lbNombreProducto = new JLabel("Buscar nombre de producto");
		lbNombreProducto.setBounds(75, 109, 160, 14);
		panel.add(lbNombreProducto);
		
		textField = new JTextField();
		textField.setBounds(259, 106, 150, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar producto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				try {
//		    		Class.forName("com.mysql.cj.jdbc.Driver");
//		    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprueba","root","Solorzano1522");
//		    		DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprueba","root","Solorzano2215");
//		    		
//		    		Statement statement = con.createStatement();
//		    		
//		    		String Nombre = textField.getText();
//		    		ResultSet resulset=statement.executeQuery("select NombreProducto from inventario where NombreProducto='"+Nombre+"'");
//		    		while(resulset.next()){
//		    			model.addRow(new Object [] {resulset.getString("NombreProducto")});
//		    			  
//		    		        
//		    		}
//		    		//modo.setRowCount(0); 
//		    		con.close();
//		    		
//		    	} catch (ClassNotFoundException o) {
//		    		o.printStackTrace();
//		    	} catch (SQLException l) {
//		    		l.printStackTrace();            	
//		    	}
		}
//			
			
		});
		btnNewButton.setBounds(421, 105, 150, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de producto");
		lblNewLabel_1.setBounds(85, 178, 160, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Precio Compra");
		lblNewLabel_1_1.setBounds(85, 220, 160, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Precio Venta");
		lblNewLabel_1_2.setBounds(85, 246, 160, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Stock");
		lblNewLabel_1_3.setBounds(75, 320, 160, 14);
		panel.add(lblNewLabel_1_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(286, 181, 285, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(286, 218, 150, 20);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(286, 244, 150, 20);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Descripcion");
		lblNewLabel_1_3_1.setBounds(36, 470, 120, 14);
		panel.add(lblNewLabel_1_3_1);
		
		btnModificar = new JButton("Agregar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				try {         		
//					//int Stock=(int)spinner.getValue();
//					if(textField_4.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()) {
//						 JOptionPane.showMessageDialog(null, "Debe completar el formulario");
//					} else {
//            		Class.forName("com.mysql.cj.jdbc.Driver");
//            		java.sql.Connection con = 
//            		DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprueba","root","Solorzano1522");
//            		
//            		java.sql.Statement statement = con.createStatement();
//            		
//            		String codigo = textField_4.getText();
//            		String nombre = textField_1.getText();
//            		String Categoria = (String)comboBox.getSelectedItem();
//            		String marca = (String)comboBox_1.getSelectedItem();
//            		String PrecioVenta =textField_2.getText();
//            		String PrecioCompra=textField_3.getText();
//            		String Descripcion=textArea.getText();
//            		
//            		
//            		statement.executeUpdate("INSERT INTO inventario (CodigoBarra, NombreProducto, Categoria, Marca, PrecioVenta, PrecioCompra, Stock, Descripcion) VALUES ('" + codigo + "', " 
//            		+ "'" + nombre + "','"+Categoria+"','"+marca+"','"+PrecioVenta+"','"+PrecioCompra+"','"+Descripcion+"')");
//guardar();
//            		con.close();
//            		
//					}} catch (ClassNotFoundException o) {
//            		o.printStackTrace();
//            	} catch (SQLException l) {
//            		l.printStackTrace();            	
//            }
        		
				
			}
		});
		btnModificar.setBounds(145, 571, 100, 40);
		panel.add(btnModificar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancelar.setBounds(280, 571, 100, 40);
		panel.add(btnCancelar);
		
		lbInventario = new JLabel("INVENTARIO DE PRODUCTOS");
		lbInventario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbInventario.setBounds(145, 45, 400, 50);
		panel.add(lbInventario);
		
		JLabel lblNewLabel = new JLabel("Codigo de barra");
		lblNewLabel.setBounds(75, 153, 100, 14);
		panel.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(286, 153, 150, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Categoria");
		lblNewLabel_2.setBounds(75, 398, 60, 20);
		panel.add(lblNewLabel_2);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Casual", "Running", "Baloncesto", "Skate"}));
		comboBox.setBounds(286, 398, 150, 21);
		panel.add(comboBox);
		
		lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setBounds(75, 356, 60, 20);
		panel.add(lblNewLabel_3);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Nike", "Adidas", "New Balance", "Air Jordan"}));
		comboBox_1.setBounds(286, 356, 150, 21);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Talla");
		lblNewLabel_1_2_1.setBounds(85, 276, 160, 14);
		panel.add(lblNewLabel_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(286, 274, 150, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(286, 318, 150, 20);
		panel.add(textField_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(220, 429, 313, 82);
		panel.add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setBounds(421, 571, 100, 40);
		panel.add(btnCancelar_1);
		
		btnCancelar_2 = new JButton("Cancelar");
		btnCancelar_2.setBounds(280, 662, 100, 40);
		panel.add(btnCancelar_2);
	}
	
	public void guardar() {
		String codigo=textField_4.getText();
		String nombre=textField_1.getText();
		String precioVenta=textField_2.getText();
		String precioCompra=textField_3.getText();
		String Categoria = (String)comboBox.getSelectedItem();
		String marca = (String)comboBox_1.getSelectedItem();
		//int stock=(int)spinner.getValue();
		String Descripcion=textArea.getText();
		model.addRow(new Object[]{codigo,nombre,Categoria,marca,precioCompra,precioVenta,Descripcion});
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textArea.setText("");
		//spinner.setValue(0);
		
	}
	public JFrame getFrame() {
		return frame;
	}
	public JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}
}