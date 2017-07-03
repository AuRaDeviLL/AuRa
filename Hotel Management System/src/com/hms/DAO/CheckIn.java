package com.hms.DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

public class CheckIn {

	private JFrame frmCheckIn;
	private JTextField textField_CustomerID;
	private JTextField textField_CustomerName;
	private JTextField textField_RoomNo;
	private JTextField textField_City;
	private JTextField textField_NoOfMembers;
	private JTextField textField_ContactNo;
	private JTextField textField_EmailId;
	private JTextField textField_CheckInDate;
	private JTextField textField_ReservedDays;
	private JTextField textField_RoomType;
	private JTextField textField_BedType;
	private JTextField textField_PriceDay;
	private JTextField textField_Total;
	private JTextField textField_AdvancePayment;
	private JTextField textField_BillToBePaid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckIn window = new CheckIn();
					window.frmCheckIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckIn = new JFrame();
		frmCheckIn.setResizable(false);
		frmCheckIn.getContentPane().setBackground(new Color(255, 250, 205));
		frmCheckIn.getContentPane().setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		frmCheckIn.setTitle("Check In");
		frmCheckIn.setSize(800,730);
		frmCheckIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckIn.getContentPane().setLayout(null);
		
		JLabel lblPicture0 = new JLabel("");
		lblPicture0.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\AUTX_67166509_Guest_Room_King_Bed_960x640_72dpi.jpg"));
		lblPicture0.setBounds(0, 0, 784, 200);
		frmCheckIn.getContentPane().add(lblPicture0);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblCustomerName.setBounds(40, 301, 103, 18);
		frmCheckIn.getContentPane().add(lblCustomerName);
		
		JLabel lblCustomerID = new JLabel("Customer ID");
		lblCustomerID.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblCustomerID.setBounds(40, 276, 103, 18);
		frmCheckIn.getContentPane().add(lblCustomerID);
		
		JLabel lblRoomNo = new JLabel("Room No.");
		lblRoomNo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblRoomNo.setBounds(40, 326, 103, 18);
		frmCheckIn.getContentPane().add(lblRoomNo);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblCity.setBounds(40, 351, 103, 18);
		frmCheckIn.getContentPane().add(lblCity);
		
		JLabel lblNoOfMembers = new JLabel("No. Of Members");
		lblNoOfMembers.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblNoOfMembers.setBounds(40, 376, 103, 18);
		frmCheckIn.getContentPane().add(lblNoOfMembers);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblContactNo.setBounds(40, 401, 103, 18);
		frmCheckIn.getContentPane().add(lblContactNo);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblEmailId.setBounds(40, 428, 103, 18);
		frmCheckIn.getContentPane().add(lblEmailId);
		
		textField_CustomerID = new JTextField();
		textField_CustomerID.setBounds(189, 275, 176, 20);
		frmCheckIn.getContentPane().add(textField_CustomerID);
		textField_CustomerID.setColumns(10);
		
		textField_CustomerName = new JTextField();
		textField_CustomerName.setColumns(10);
		textField_CustomerName.setBounds(189, 300, 176, 20);
		frmCheckIn.getContentPane().add(textField_CustomerName);
		
		textField_RoomNo = new JTextField();
		textField_RoomNo.setColumns(10);
		textField_RoomNo.setBounds(189, 324, 176, 20);
		frmCheckIn.getContentPane().add(textField_RoomNo);
		
		textField_City = new JTextField();
		textField_City.setColumns(10);
		textField_City.setBounds(189, 349, 176, 20);
		frmCheckIn.getContentPane().add(textField_City);
		
		textField_NoOfMembers = new JTextField();
		textField_NoOfMembers.setColumns(10);
		textField_NoOfMembers.setBounds(189, 374, 176, 20);
		frmCheckIn.getContentPane().add(textField_NoOfMembers);
		
		textField_ContactNo = new JTextField();
		textField_ContactNo.setColumns(10);
		textField_ContactNo.setBounds(189, 399, 176, 20);
		frmCheckIn.getContentPane().add(textField_ContactNo);
		
		textField_EmailId = new JTextField();
		textField_EmailId.setColumns(10);
		textField_EmailId.setBounds(189, 426, 176, 20);
		frmCheckIn.getContentPane().add(textField_EmailId);
		
		JLabel lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setForeground(new Color(255, 0, 0));
		lblCustomerInformation.setBackground(new Color(240, 240, 240));
		lblCustomerInformation.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCustomerInformation.setBounds(23, 238, 165, 20);
		frmCheckIn.getContentPane().add(lblCustomerInformation);
		
		JLabel lblCheckInInformation = new JLabel("Check In Information");
		lblCheckInInformation.setForeground(Color.RED);
		lblCheckInInformation.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCheckInInformation.setBackground(SystemColor.menu);
		lblCheckInInformation.setBounds(23, 510, 165, 20);
		frmCheckIn.getContentPane().add(lblCheckInInformation);
		
		JLabel lblCheckInDate = new JLabel("Check In Date");
		lblCheckInDate.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblCheckInDate.setBounds(40, 555, 103, 18);
		frmCheckIn.getContentPane().add(lblCheckInDate);
		
		JLabel lblReservedDays = new JLabel("Reserved Days");
		lblReservedDays.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblReservedDays.setBounds(40, 580, 103, 18);
		frmCheckIn.getContentPane().add(lblReservedDays);
		
		textField_CheckInDate = new JTextField();
		textField_CheckInDate.setColumns(10);
		textField_CheckInDate.setBounds(189, 554, 176, 20);
		frmCheckIn.getContentPane().add(textField_CheckInDate);
		
		textField_ReservedDays = new JTextField();
		textField_ReservedDays.setColumns(10);
		textField_ReservedDays.setBounds(189, 579, 176, 20);
		frmCheckIn.getContentPane().add(textField_ReservedDays);
		
		JLabel lblBillInformation = new JLabel("Bill Information");
		lblBillInformation.setForeground(Color.RED);
		lblBillInformation.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBillInformation.setBackground(SystemColor.menu);
		lblBillInformation.setBounds(404, 238, 165, 20);
		frmCheckIn.getContentPane().add(lblBillInformation);
		
		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblRoomType.setBounds(421, 276, 103, 18);
		frmCheckIn.getContentPane().add(lblRoomType);
		
		textField_RoomType = new JTextField();
		textField_RoomType.setColumns(10);
		textField_RoomType.setBounds(570, 275, 176, 20);
		frmCheckIn.getContentPane().add(textField_RoomType);
		
		JLabel lblBedType = new JLabel("Bed Type");
		lblBedType.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblBedType.setBounds(421, 301, 103, 18);
		frmCheckIn.getContentPane().add(lblBedType);
		
		textField_BedType = new JTextField();
		textField_BedType.setColumns(10);
		textField_BedType.setBounds(570, 300, 176, 20);
		frmCheckIn.getContentPane().add(textField_BedType);
		
		JLabel lblPriceDay = new JLabel("Price/Day");
		lblPriceDay.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblPriceDay.setBounds(421, 326, 103, 18);
		frmCheckIn.getContentPane().add(lblPriceDay);
		
		textField_PriceDay = new JTextField();
		textField_PriceDay.setColumns(10);
		textField_PriceDay.setBounds(570, 324, 176, 20);
		frmCheckIn.getContentPane().add(textField_PriceDay);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblTotal.setBounds(421, 351, 103, 18);
		frmCheckIn.getContentPane().add(lblTotal);
		
		textField_Total = new JTextField();
		textField_Total.setColumns(10);
		textField_Total.setBounds(570, 349, 176, 20);
		frmCheckIn.getContentPane().add(textField_Total);
		
		textField_AdvancePayment = new JTextField();
		textField_AdvancePayment.setColumns(10);
		textField_AdvancePayment.setBounds(570, 374, 176, 20);
		frmCheckIn.getContentPane().add(textField_AdvancePayment);
		
		JLabel lblAdvancePayment = new JLabel("Advance Payment");
		lblAdvancePayment.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblAdvancePayment.setBounds(421, 376, 115, 18);
		frmCheckIn.getContentPane().add(lblAdvancePayment);
		
		textField_BillToBePaid = new JTextField();
		textField_BillToBePaid.setColumns(10);
		textField_BillToBePaid.setBounds(570, 399, 176, 20);
		frmCheckIn.getContentPane().add(textField_BillToBePaid);
		
		JLabel lblBillToBePaid = new JLabel("Bill To Be Paid");
		lblBillToBePaid.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblBillToBePaid.setBounds(421, 401, 115, 18);
		frmCheckIn.getContentPane().add(lblBillToBePaid);
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.setBounds(421, 536, 89, 23);
		frmCheckIn.getContentPane().add(btnCheckIn);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(657, 536, 89, 23);
		frmCheckIn.getContentPane().add(btnDelete);
		
		JButton btnListCheck = new JButton("List Check");
		btnListCheck.setBounds(421, 590, 89, 23);
		frmCheckIn.getContentPane().add(btnListCheck);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(657, 590, 89, 23);
		frmCheckIn.getContentPane().add(btnClose);
	}
}
