package com.view;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;
import javax.swing.UIManager;


public class Productview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productview frame = new Productview();
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
	public Productview() {
		setTitle("Product Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 426);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 59, 581, 302);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"productid", "productname", "quantity", "price"
			}
		));
		scrollPane.setViewportView(table);
		displayData();
	}
	private void displayData() {
		 ProductService ps=new ProductServiceImpl();
		 List<Product> plist=ps.getAllProduct();
		 DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
		 tmodel.setRowCount(0);
		 for(Product p:plist) {
			 tmodel.addRow(new Object[] {p.getProductid(),p.getProductname(),p.getQuantity(),p.getPrice()});
			 
		 }

	}

}
