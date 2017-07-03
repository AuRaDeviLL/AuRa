package com.hms.DAO;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.hms.factory.*;
import com.hms.DAO.MainScreen;

public class LoginPage {

	static JFrame frmLogin;
	static JTextField textField_UserName;
	static JPasswordField textfield_password;
	static JButton btn_Login;
	Connection con;
	DbFactory db;
	static int res;
	PreparedStatement st;
	
	public static void main(String[] args) {
		LoginPage a1 = new LoginPage();
		a1.loginInitialize();
	}
	
	public LoginPage() {
		db = new DbFactory();
		con = db.getCon();
	}
	
	public void loginInitialize() {
		try {			
			st = con.prepareStatement("select password from AdminLogin where username = ? and password = ?");
			
			frmLogin = new JFrame();
			frmLogin.setTitle("Login");
			frmLogin.getContentPane().setBackground(new Color(255, 250, 205));
			frmLogin.setResizable(false);
				
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\perfect-hotel-8.jpg"));
			lblNewLabel.setBounds(0, 0, 794, 252);
			frmLogin.add(lblNewLabel);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("DFKai-SB", Font.BOLD, 20));
			lblPassword.setBounds(163, 508, 122, 46);
			frmLogin.getContentPane().add(lblPassword);
			
			JLabel lblUserName = new JLabel("User Name");
			lblUserName.setFont(new Font("DFKai-SB", Font.BOLD, 20));
			lblUserName.setBounds(163, 417, 122, 46);
			frmLogin.getContentPane().add(lblUserName);
			
			textField_UserName = new JTextField();
			textField_UserName.setBounds(326, 417, 312, 46);
			frmLogin.getContentPane().add(textField_UserName);
			textField_UserName.setColumns(10);
			
			JButton btnCancel = new JButton("CANCEL");		
			btnCancel.setForeground(new Color(0, 191, 255));
			btnCancel.setFont(new Font("Andalus", Font.BOLD, 18));
			btnCancel.setBounds(163, 604, 187, 61);
			frmLogin.getContentPane().add(btnCancel);
			
			btn_Login = new JButton("LOGIN");		
			btn_Login.setForeground(new Color(0, 191, 255));
			btn_Login.setFont(new Font("Andalus", Font.BOLD, 18));
			btn_Login.setBounds(451, 604, 187, 61);
			frmLogin.getContentPane().add(btn_Login);
				
			JLabel label = new JLabel("WelCome To Yaaron Da Hotel");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(new Color(138, 43, 226));
			label.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 40));
			label.setBounds(41, 292, 711, 61);
			frmLogin.getContentPane().add(label);
				
			textfield_password = new JPasswordField();
			textfield_password.setBounds(326, 508, 312, 46);
			frmLogin.getContentPane().add(textfield_password);
			
			btn_Login.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try {
						st.setString(1, textField_UserName.getText());
						st.setString(2, textfield_password.getText());
						
						ResultSet rs = st.executeQuery();
						if(rs.next()) {
							MainScreen.main(null);
							frmLogin.dispose();
						}
						else {
							String x1 = "Invalid Credentials Please Try Again";
							JOptionPane.showMessageDialog(frmLogin, x1, "RESULT", JOptionPane.PLAIN_MESSAGE);
						}
					}
						catch(Exception e1) {
							e1.printStackTrace();
						}
				}
			});
			
			
			frmLogin.add(label);
			frmLogin.add(lblUserName);
			frmLogin.add(textField_UserName);
			frmLogin.add(lblPassword);
			frmLogin.add(textfield_password);
			frmLogin.add(btn_Login);
			frmLogin.add(btnCancel);
			frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmLogin.setSize(800, 730);
			frmLogin.setLayout(null);
			frmLogin.setVisible(true);
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
