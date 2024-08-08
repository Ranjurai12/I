package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Bill;
import com.model.Cashier;
import com.service.BillServiceImpl;
import com.service.CashierServiceImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Billview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BillTxt;
	private JTextField CustomerTxt;
	private JTextField IdTxt;
	private JTextField PNameTxt;
	private JTextField AmountTxt;
	private JTextField QuantityTxt;
	private JTextField DiscountTxt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billview frame = new Billview();
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
	public Billview() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1053, 561);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(275, 34, 104, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bill No:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 113, 73, 13);
		contentPane.add(lblNewLabel_1);
		
		BillTxt = new JTextField();
		BillTxt.setBounds(184, 107, 162, 19);
		contentPane.add(BillTxt);
		BillTxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Customername");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(46, 140, 96, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Productid");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(46, 175, 73, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Productname");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(46, 208, 85, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Amount");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(46, 241, 73, 13);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Quantity");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(46, 275, 73, 13);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Discount");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(46, 313, 73, 13);
		contentPane.add(lblNewLabel_1_6);
		
		CustomerTxt = new JTextField();
		CustomerTxt.setColumns(10);
		CustomerTxt.setBounds(184, 138, 162, 19);
		contentPane.add(CustomerTxt);
		
		IdTxt = new JTextField();
		IdTxt.setColumns(10);
		IdTxt.setBounds(184, 173, 162, 19);
		contentPane.add(IdTxt);
		
		PNameTxt = new JTextField();
		PNameTxt.setColumns(10);
		PNameTxt.setBounds(184, 206, 162, 19);
		contentPane.add(PNameTxt);
		
		AmountTxt = new JTextField();
		AmountTxt.setColumns(10);
		AmountTxt.setBounds(184, 239, 162, 19);
		contentPane.add(AmountTxt);
		
		QuantityTxt = new JTextField();
		QuantityTxt.setColumns(10);
		QuantityTxt.setBounds(184, 273, 162, 19);
		contentPane.add(QuantityTxt);
		
		DiscountTxt = new JTextField();
		DiscountTxt.setColumns(10);
		DiscountTxt.setBounds(184, 311, 162, 19);
		contentPane.add(DiscountTxt);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill b=new Bill();
				b.setBillno(Integer.parseInt(BillTxt.getText()));
				b.setCustomername(CustomerTxt.getText());
				b.setProductid(Integer.parseInt(IdTxt.getText()));
				b.setProductname(PNameTxt.getText());
				b.setAmount(Integer.parseInt(AmountTxt.getText()));
				b.setQuantity(Integer.parseInt(QuantityTxt.getText()));
				b.setDiscount(Integer.parseInt(DiscountTxt.getText()));
				
				BillServiceImpl bs=new BillServiceImpl();
				bs.addinfo(b);
				JOptionPane.showMessageDialog(null, "show table");
				new Billview().setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(170, 454, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(282, 454, 85, 21);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 107, 550, 343);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Billno", "Customername", "Productid", "Productname", "Amount", "Quantity", "Discount"
			}
		));
		scrollPane.setViewportView(table);
		
		displaydata();
	}
	private void displaydata() {
		Bill b=new Bill();
		BillServiceImpl cs=new BillServiceImpl();
		 List<Bill> plist=cs.getallinfo();
		DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
		 tmodel.setRowCount(0);
		 for(Bill  b1:plist) {
			 tmodel.addRow(new Object[] {b1.getBillno(),b1.getCustomername(),b1.getProductid(),b1.getProductname(),b1.getAmount(),b1.getQuantity(),b1.getDiscount()});
			 
		 }
	}
}
