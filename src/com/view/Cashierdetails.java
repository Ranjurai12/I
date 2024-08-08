																																																																																																																package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Cashier;

import com.service.CashierServiceImpl;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Cashierdetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CashieridTxt;
	private JTextField NameTxt;
	private JTextField MobilenoTxt;
	private JTextField AddressTxt;
	private JTextField EmailTxt;
	private JPasswordField PasswordTxt;
	private JTable table;
	private int Cashierid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashierdetails frame = new Cashierdetails();
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
	public Cashierdetails() {
		setTitle("CashierDetails");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1009, 489);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cashierid");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(83, 80, 68, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCashierName = new JLabel("Cashier Name");
		lblCashierName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCashierName.setBounds(49, 117, 101, 13);
		contentPane.add(lblCashierName);
		
		JLabel lblMobileno = new JLabel("Mobileno");
		lblMobileno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileno.setBounds(83, 157, 68, 13);
		contentPane.add(lblMobileno);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(83, 195, 68, 13);
		contentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(97, 233, 68, 13);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(70, 267, 90, 13);
		contentPane.add(lblPassword);
		
		CashieridTxt = new JTextField();
		CashieridTxt.setBounds(192, 79, 146, 19);
		contentPane.add(CashieridTxt);
		CashieridTxt.setColumns(10);
		
		NameTxt = new JTextField();
		NameTxt.setColumns(10);
		NameTxt.setBounds(192, 116, 146, 19);
		contentPane.add(NameTxt);
		
		MobilenoTxt = new JTextField();
		MobilenoTxt.setColumns(10);
		MobilenoTxt.setBounds(192, 156, 146, 19);
		contentPane.add(MobilenoTxt);
		
		AddressTxt = new JTextField();
		AddressTxt.setColumns(10);
		AddressTxt.setBounds(192, 194, 146, 19);
		contentPane.add(AddressTxt);
		
		EmailTxt = new JTextField();
		EmailTxt.setColumns(10);
		EmailTxt.setBounds(192, 232, 146, 19);
		contentPane.add(EmailTxt);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(192, 266, 146, 19);
		contentPane.add(PasswordTxt);
		
		JLabel lblNewLabel_1 = new JLabel("Add Cashier Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(126, 22, 201, 19);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(386, 38, 2, 2);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(362, 22, 594, 404);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cashierid", "Name", "Mobileno", "Address", "Email", "Password"
			}
		));
		scrollPane_1.setViewportView(table);
		displaydata();
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cashier c=new Cashier();
				
				c.setCashierid(Integer.parseInt(CashieridTxt.getText()));
				c.setName(NameTxt.getText());
				c.setMobileno(Integer.parseInt(MobilenoTxt.getText()));
				c.setAddress(AddressTxt.getText());
				c.setEmail(EmailTxt.getText());
				c.setPassword(PasswordTxt.getText());
				CashierServiceImpl cs=new CashierServiceImpl();
				cs.addinfo(c);
				JOptionPane.showMessageDialog(null, "added success");
			    new Cashierdetails().setVisible(true);
				dispose();
				
				
			}
		});
		displaydata();
		
		btnNewButton.setBounds(35, 357, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 Cashier c=new Cashier();
                 c.setCashierid(Integer.parseInt(CashieridTxt.getText()));
                 c.setName(NameTxt.getText());
                 c.setMobileno(Integer.parseInt(MobilenoTxt.getText()));
                 c.setAddress(AddressTxt.getText());
                 c.setEmail(EmailTxt.getText());
                 c.setPassword(PasswordTxt.getText());
                 CashierServiceImpl cs=new CashierServiceImpl();
 				 cs.updateinfo(c);
                 
				JOptionPane.showMessageDialog(null, "update success");
				displaydata();
//				new Cashierdetails().setVisible(true);
//				dispose();
				
			}
		});
		
		btnNewButton_1.setBounds(126, 357, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "select any row");
					return;
				}
				int srow=table.getSelectedRow();
				int cashierid=(int) table.getModel().getValueAt(srow,0);
				CashierServiceImpl cs=new CashierServiceImpl();
				cs.deleteinfo(cashierid);
				JOptionPane.showMessageDialog(null, "delete success");
				new Cashierdetails().setVisible(true);
				displaydata();
				
			}
		});
		btnNewButton_1_1.setBounds(221, 357, 85, 21);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "select any row");
					return;
				}
				int srow=table.getSelectedRow();
				 Cashierid=(int) table.getModel().getValueAt(srow,0);
				CashieridTxt.setText(table.getModel().getValueAt(srow,0).toString());
				NameTxt.setText(table.getModel().getValueAt(srow, 1).toString());
				MobilenoTxt.setText(table.getModel().getValueAt(srow, 2).toString());
				AddressTxt.setText(table.getModel().getValueAt(srow, 3).toString());
				EmailTxt.setText(table.getModel().getValueAt(srow, 4).toString());
				PasswordTxt.setText(table.getModel().getValueAt(srow,5).toString());
				
				
			}
		});
		btnNewButton_2.setBounds(421, 431, 85, 21);
		contentPane.add(btnNewButton_2);
	}
	private void displaydata() {
		Cashier c=new Cashier();
		CashierServiceImpl cs=new CashierServiceImpl();
		 List<Cashier> plist=cs.getallinfo();
		DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
		 tmodel.setRowCount(0);
		 for(Cashier ca:plist) {
			 tmodel.addRow(new Object[] {ca.getCashierid(),ca.getName(),ca.getMobileno(),ca.getAddress(),ca.getEmail(),ca.getPassword()});
			 
		 }
	}
}
