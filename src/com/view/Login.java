package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.LoginForm;
import com.service.LoginServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsernameTxt;
	private JPasswordField PasswordTxt;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(57, 52, 118, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(57, 88, 118, 13);
		contentPane.add(lblPassword);
		
		UsernameTxt = new JTextField();
		UsernameTxt.setBounds(199, 52, 96, 19);
		contentPane.add(UsernameTxt);
		UsernameTxt.setColumns(10);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(199, 88, 96, 19);
		contentPane.add(PasswordTxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm lf=new LoginForm();
				lf.setUsername(UsernameTxt.getText());
				lf.setPassword(PasswordTxt.getText());
				LoginServiceImpl l=new LoginServiceImpl();
				l.addinfo(lf);
				JOptionPane.showMessageDialog(null, "go to mainpage");
				new Home1().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(210, 163, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "go back to Home");
				new Home().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(90, 163, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Click here to create a new account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register().setVisible(true);

			}
		});
		btnNewButton_2.setBounds(69, 209, 244, 21);
		contentPane.add(btnNewButton_2);
	}

}
