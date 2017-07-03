package com.hms.DAO;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.hms.factory.DbFactory;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class BookingRoom {
	private JFrame frmBookingRooms;
	DbFactory db;
	Connection con;
	private JTextField textField_LastName;
	int res;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BookingRoom a1 = new BookingRoom();
		a1.bookingInitialize();
	}

	/**
	 * Create the application.
	 */
	public BookingRoom() {
		db = new DbFactory();
		con = db.getCon();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void bookingInitialize() {
		try {
			PreparedStatement st = con.prepareStatement("insert into customerdetail1 values(?,?,?,?,?,?,?,?,?,?,?,?)");
			//("insert into customerdetail values(?,?,?,?,?,?,?,?,?,?,?,?)
			//PreparedStatement  = con.prepareStatement("Insert into registration values(?,?,?,?)");
			
			JTextField textField_CustomerID;
			JTextField textField_FirstName;
			JTextField textField_Address;
			JTextField textField_City;
			JTextField textField_Country;
			JTextField textField_TotalMembers;
			JTextField textField_MobileNo;
			JTextField textField_EmailID;
			
			frmBookingRooms = new JFrame();
			frmBookingRooms.setTitle("Booking Rooms");
			frmBookingRooms.getContentPane().setBackground(new Color(255, 250, 205));
			frmBookingRooms.setResizable(false);
			
			JLabel lblPicture1 = new JLabel("New label");
			lblPicture1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPicture1.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\f7500558b0e911e6b3e502bf5ac07431.jpg"));
			lblPicture1.setBounds(442, 273, 306, 393);
			frmBookingRooms.getContentPane().add(lblPicture1);
			
			
			JLabel lblWelcomeToLa = new JLabel("YAARON DA HOTEL");
			lblWelcomeToLa.setHorizontalAlignment(SwingConstants.CENTER);
			lblWelcomeToLa.setForeground(new Color(138, 43, 226));
			lblWelcomeToLa.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 40));
			lblWelcomeToLa.setBackground(SystemColor.activeCaption);
			lblWelcomeToLa.setBounds(44, 157, 706, 46);
			frmBookingRooms.getContentPane().add(lblWelcomeToLa);
			
			JLabel lblPicture0 = new JLabel("");
			lblPicture0.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPicture0.setHorizontalAlignment(SwingConstants.CENTER);
			lblPicture0.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\beach-welcome.jpg"));
			lblPicture0.setBounds(44, 11, 704, 144);
			frmBookingRooms.getContentPane().add(lblPicture0);
			
			Button btnBookRoom = new Button("Back");
			btnBookRoom.setActionCommand("Back");
			btnBookRoom.setBounds(44, 629, 83, 37);
			frmBookingRooms.getContentPane().add(btnBookRoom);
			
			Button btnCheckIn = new Button("Check In");
			btnCheckIn.setBounds(337, 629, 78, 37);
			frmBookingRooms.getContentPane().add(btnCheckIn);
			
			JLabel lblDuration = new JLabel("Duration");
			lblDuration.setBounds(44, 562, 83, 14);
			frmBookingRooms.getContentPane().add(lblDuration);
			
			JLabel lblEmailId = new JLabel("Email ID");
			lblEmailId.setBounds(44, 538, 83, 14);
			frmBookingRooms.getContentPane().add(lblEmailId);
			
			JLabel lblMobileNo = new JLabel("Mobile No.");
			lblMobileNo.setBounds(44, 512, 83, 14);
			frmBookingRooms.getContentPane().add(lblMobileNo);
			
			JLabel lblTotalMembers = new JLabel("Total Members");
			lblTotalMembers.setBounds(44, 486, 83, 14);
			frmBookingRooms.getContentPane().add(lblTotalMembers);
			
			JLabel lblIDProof = new JLabel("ID Proof");
			lblIDProof.setBounds(44, 461, 83, 14);
			frmBookingRooms.getContentPane().add(lblIDProof);
			
			JLabel lblGender = new JLabel("Gender");
			lblGender.setBounds(44, 436, 83, 14);
			frmBookingRooms.getContentPane().add(lblGender);
			
			JLabel lblCountry = new JLabel("Country");
			lblCountry.setBounds(44, 410, 83, 14);
			frmBookingRooms.getContentPane().add(lblCountry);
			
			JLabel lblCity = new JLabel("City");
			lblCity.setBounds(44, 384, 83, 14);
			frmBookingRooms.getContentPane().add(lblCity);
			
			JLabel lblAddress = new JLabel("Address");
			lblAddress.setBounds(44, 358, 83, 14);
			frmBookingRooms.getContentPane().add(lblAddress);
			
			JLabel lblCustomerFirstName = new JLabel("Customer Fisrt Name");
			lblCustomerFirstName.setBounds(44, 305, 105, 14);
			frmBookingRooms.getContentPane().add(lblCustomerFirstName);
			
			JLabel lblCustomerId = new JLabel("Customer ID");
			lblCustomerId.setBounds(44, 279, 83, 14);
			frmBookingRooms.getContentPane().add(lblCustomerId);
			
			textField_CustomerID = new JTextField();
			textField_CustomerID.setColumns(10);
			textField_CustomerID.setBounds(233, 273, 182, 20);
			frmBookingRooms.getContentPane().add(textField_CustomerID);
			
			textField_FirstName = new JTextField();
			textField_FirstName.setColumns(10);
			textField_FirstName.setBounds(233, 299, 182, 20);
			frmBookingRooms.getContentPane().add(textField_FirstName);
			
			textField_Address = new JTextField();
			textField_Address.setColumns(10);
			textField_Address.setBounds(233, 350, 182, 20);
			frmBookingRooms.getContentPane().add(textField_Address);
			
			textField_City = new JTextField();
			textField_City.setColumns(10);
			textField_City.setBounds(233, 376, 182, 20);
			frmBookingRooms.getContentPane().add(textField_City);
			
			textField_Country = new JTextField();
			textField_Country.setColumns(10);
			textField_Country.setBounds(233, 402, 182, 20);
			frmBookingRooms.getContentPane().add(textField_Country);
			
			textField_TotalMembers = new JTextField();
			textField_TotalMembers.setColumns(10);
			textField_TotalMembers.setBounds(233, 481, 182, 20);
			frmBookingRooms.getContentPane().add(textField_TotalMembers);
			
			textField_MobileNo = new JTextField();
			textField_MobileNo.setColumns(10);
			textField_MobileNo.setBounds(233, 509, 182, 20);
			frmBookingRooms.getContentPane().add(textField_MobileNo);
			
			textField_EmailID = new JTextField();
			textField_EmailID.setColumns(10);
			textField_EmailID.setBounds(233, 535, 182, 20);
			frmBookingRooms.getContentPane().add(textField_EmailID);
			
			JLabel lblRoomNo = new JLabel("Room No.");
			lblRoomNo.setForeground(new Color(95, 158, 160));
			lblRoomNo.setHorizontalAlignment(SwingConstants.LEFT);
			lblRoomNo.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblRoomNo.setBounds(44, 214, 70, 14);
			frmBookingRooms.getContentPane().add(lblRoomNo);
			
			JLabel lblRoomType = new JLabel("Room Type");
			lblRoomType.setForeground(new Color(95, 158, 160));
			lblRoomType.setHorizontalAlignment(SwingConstants.LEFT);
			lblRoomType.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblRoomType.setBounds(272, 214, 70, 14);
			frmBookingRooms.getContentPane().add(lblRoomType);
			
			JLabel lblBeachView = new JLabel("Beach View");
			lblBeachView.setForeground(new Color(95, 158, 160));
			lblBeachView.setHorizontalAlignment(SwingConstants.LEFT);
			lblBeachView.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblBeachView.setBounds(44, 239, 70, 14);
			frmBookingRooms.getContentPane().add(lblBeachView);
			
			JLabel lblCheckIn = new JLabel("Check In");
			lblCheckIn.setForeground(new Color(95, 158, 160));
			lblCheckIn.setHorizontalAlignment(SwingConstants.LEFT);
			lblCheckIn.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblCheckIn.setBounds(272, 239, 70, 14);
			frmBookingRooms.getContentPane().add(lblCheckIn);
			
			JLabel lblBedType = new JLabel("Bed Type");
			lblBedType.setForeground(new Color(95, 158, 160));
			lblBedType.setHorizontalAlignment(SwingConstants.LEFT);
			lblBedType.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblBedType.setBounds(503, 214, 70, 14);
			frmBookingRooms.getContentPane().add(lblBedType);
			
			JLabel lblCheckOut = new JLabel("Check Out");
			lblCheckOut.setForeground(new Color(95, 158, 160));
			lblCheckOut.setHorizontalAlignment(SwingConstants.LEFT);
			lblCheckOut.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
			lblCheckOut.setBounds(503, 239, 70, 14);
			frmBookingRooms.getContentPane().add(lblCheckOut);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setForeground(new Color(255, 0, 0));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBackground(new Color(127, 255, 212));
			lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_3.setBounds(118, 214, 70, 14);
			frmBookingRooms.getContentPane().add(lblNewLabel_3);
			
			JLabel label_12 = new JLabel("");
			label_12.setForeground(new Color(255, 0, 0));
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setBackground(new Color(127, 255, 212));
			label_12.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			label_12.setBounds(345, 214, 70, 14);
			frmBookingRooms.getContentPane().add(label_12);
			
			JLabel label_13 = new JLabel("");
			label_13.setForeground(new Color(255, 0, 0));
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setBackground(new Color(127, 255, 212));
			label_13.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			label_13.setBounds(578, 214, 70, 14);
			frmBookingRooms.getContentPane().add(label_13);
			
			JLabel label_14 = new JLabel("");
			label_14.setForeground(new Color(255, 0, 0));
			label_14.setHorizontalAlignment(SwingConstants.CENTER);
			label_14.setBackground(new Color(127, 255, 212));
			label_14.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			label_14.setBounds(118, 239, 70, 14);
			frmBookingRooms.getContentPane().add(label_14);
			
			JLabel label_15 = new JLabel("");
			label_15.setForeground(new Color(255, 0, 0));
			label_15.setHorizontalAlignment(SwingConstants.CENTER);
			label_15.setBackground(new Color(127, 255, 212));
			label_15.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			label_15.setBounds(345, 239, 70, 14);
			frmBookingRooms.getContentPane().add(label_15);
			
			JLabel label_16 = new JLabel("");
			label_16.setForeground(new Color(255, 0, 0));
			label_16.setHorizontalAlignment(SwingConstants.CENTER);
			label_16.setBackground(new Color(127, 255, 212));
			label_16.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 15));
			label_16.setBounds(578, 237, 70, 14);
			frmBookingRooms.getContentPane().add(label_16);
			
			String choice[] = {"Choose", "Male", "Female"};
			JComboBox comboBox = new JComboBox(choice);
			comboBox.setBounds(233, 428, 182, 20);
			frmBookingRooms.getContentPane().add(comboBox);
			
			String choice1[] = {"Choose", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
			JComboBox comboBox_1 = new JComboBox(choice1);
			comboBox_1.setBounds(233, 559, 182, 20);
			frmBookingRooms.getContentPane().add(comboBox_1);
			
			String[] choice2 = {"Choose", "Aadhar Card", "Voter Id Card", "PassPort", "Driving License"};
			JComboBox cmbIDProof = new JComboBox(choice2);
			cmbIDProof.setBounds(233, 454, 182, 20);
			frmBookingRooms.getContentPane().add(cmbIDProof);
			
			JLabel lblCustomerLastName = new JLabel("Customer Last Name");
			lblCustomerLastName.setBounds(44, 331, 105, 14);
			frmBookingRooms.getContentPane().add(lblCustomerLastName);
			
			textField_LastName = new JTextField();
			textField_LastName.setColumns(10);
			textField_LastName.setBounds(233, 324, 182, 20);
			frmBookingRooms.getContentPane().add(textField_LastName);
			
			btnCheckIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) {
					try {
						String s1 = lblCustomerId.getText();
						//int x1 = Integer.parseInt(s1);
						st.setString(1, s1);
						
						st.setString(2, lblCustomerFirstName.getText());
						
						st.setString(3, lblCustomerLastName.getText());
						
						st.setString(4, lblAddress.getText());
						
						st.setString(5, lblCity.getText());
						
						st.setString(6, lblCountry.getText());
						
						st.setString(7, lblGender.getText());
						
						st.setString(8, lblIDProof.getText());
						
						String s2 = lblTotalMembers.getText();
						//int x2    = Integer.parseInt(s2);
						st.setString(9, s2);
						
						st.setString(10, lblMobileNo.getText());
						
						st.setString(11, lblEmailId.getText());
						
						st.setString(12, lblDuration.getText());
						
						res = st.executeUpdate();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			frmBookingRooms.setSize(800, 730);
			frmBookingRooms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frmBookingRooms.getContentPane().setLayout(null);
			frmBookingRooms.setVisible(true);
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
     }
}
