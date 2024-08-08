package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.model.*;

import com.service.RegisterServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FirstnameTxt;
	private JTextField LastnameTxt;
	private JTextField UsernameTxt;
	private JTextField BirthdateTxt;
	private JPasswordField PasswordTxt;
	private JPasswordField RetypePassTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 464);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(63, 65, 95, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(0, 0, 0));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLastName.setBounds(63, 88, 95, 13);
		contentPane.add(lblLastName);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setBounds(63, 111, 95, 13);
		contentPane.add(lblUsername);
		
		JLabel lblRetypePass = new JLabel("Retype Pass:");
		lblRetypePass.setForeground(new Color(0, 0, 0));
		lblRetypePass.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRetypePass.setBounds(45, 163, 95, 13);
		contentPane.add(lblRetypePass);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(63, 140, 95, 13);
		contentPane.add(lblPassword);
		
		JLabel lblBirrthdate = new JLabel("BirthDate:");
		lblBirrthdate.setForeground(new Color(0, 0, 0));
		lblBirrthdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBirrthdate.setBounds(63, 186, 95, 13);
		contentPane.add(lblBirrthdate);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(0, 0, 0));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(63, 229, 95, 13);
		contentPane.add(lblAddress);
		
		FirstnameTxt = new JTextField();
		FirstnameTxt.setBounds(155, 59, 144, 19);
		contentPane.add(FirstnameTxt);
		FirstnameTxt.setColumns(10);
		
		LastnameTxt = new JTextField();
		LastnameTxt.setColumns(10);
		LastnameTxt.setBounds(155, 82, 144, 19);
		contentPane.add(LastnameTxt);
		
		UsernameTxt = new JTextField();
		UsernameTxt.setColumns(10);
		UsernameTxt.setBounds(155, 109, 144, 19);
		contentPane.add(UsernameTxt);
		
		BirthdateTxt = new JTextField();
		BirthdateTxt.setColumns(10);
		BirthdateTxt.setBounds(155, 184, 144, 19);
		contentPane.add(BirthdateTxt);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(155, 134, 144, 19);
		contentPane.add(PasswordTxt);
		
		RetypePassTxt = new JPasswordField();
		RetypePassTxt.setBounds(155, 157, 144, 19);
		contentPane.add(RetypePassTxt);
		
		JTextArea AddressTxt = new JTextArea();
		AddressTxt.setBounds(155, 224, 144, 46);
		contentPane.add(AddressTxt);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Go to home");
				new Home().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(114, 319, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(0, 0, 255));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registerform rf=new Registerform();
				rf.setFirstname(FirstnameTxt.getText());
				rf.setLastname(LastnameTxt.getText());
				rf.setUsername(UsernameTxt.getText());
				rf.setPassword(PasswordTxt.getText());
				rf.setRetypepass(RetypePassTxt.getText());
				rf.setBirthdate(Integer.parseInt(BirthdateTxt.getText()));
				rf.setAddress(AddressTxt.getText());
				RegisterServiceImpl rs=new RegisterServiceImpl();
				rs.addinfo(rf);
				JOptionPane.showMessageDialog(null, "go to mainpage");
				new Home1().setVisible(true);
				dispose();
				
				
				
				
				
			
				
				
				

			}
				
			
				
	
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegister.setBounds(238, 319, 95, 21);
		contentPane.add(btnRegister);
		
		JButton btnNewButton_1 = new JButton("Click here to login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(155, 350, 144, 21);
		contentPane.add(btnNewButton_1);
	}

	protected void addinfo(RegisterServiceImpl rs) {
		// TODO Auto-generated method stub
		
	}
}
