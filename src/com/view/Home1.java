package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Home1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1();
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
	public Home1() {
		setTitle("QuickBill");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.shadow"));
		panel.setBounds(0, 0, 602, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSearchBill = new JLabel(" Create bill");
		lblSearchBill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Go to bill section");
				new Billview().setVisible(true);
			}
		});
		lblSearchBill.setBounds(187, 25, 74, 15);
		panel.add(lblSearchBill);
		lblSearchBill.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblProductInformation = new JLabel("Product Information");
		lblProductInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "go to product info");
				new Productview().setVisible(true);
			}
		});
		lblProductInformation.setBounds(320, 25, 146, 15);
		panel.add(lblProductInformation);
		lblProductInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setBounds(530, 25, 62, 15);
		panel.add(lblSales);
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel = new JLabel("Cashier");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "go to cashierid");
				new Cashierdetails().setVisible(true);
				
				
			}
		});
		lblNewLabel.setBounds(44, 25, 62, 15);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
	}
}
