package com.hms.DAO;

import javax.swing.*;
import com.hms.factory.DbFactory;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AvailablityOfRooms {

	private JFrame frmAvailablityOfRooms;
	private JTable table;
	Connection con;
	DbFactory db;
	static int res;
	PreparedStatement st;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		AvailablityOfRooms a1 = new AvailablityOfRooms();
		a1.availableInitialize();
	}

	/**
	 * Create the application.
	 */
	public AvailablityOfRooms() {
		db = new DbFactory();
		con = db.getCon();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void availableInitialize() {
		try {			
			st = con.prepareStatement("select * from roomsdetail where booked = false and bedtype = ? and roomtype = ? and beachview = ?");
			
			frmAvailablityOfRooms = new JFrame();
			frmAvailablityOfRooms.setResizable(false);
			frmAvailablityOfRooms.setTitle("Availablity Of Rooms");
			frmAvailablityOfRooms.getContentPane().setBackground(new Color(255, 250, 205));
			
			JLabel lblPicture0 = new JLabel("");
			lblPicture0.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\perfect-hotel-8.jpg"));
			lblPicture0.setBounds(0, 0, 800, 252);
			frmAvailablityOfRooms.getContentPane().add(lblPicture0);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 350, 518, 321);
			frmAvailablityOfRooms.getContentPane().add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			
			JLabel lblPicture1 = new JLabel("");
			lblPicture1.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\hotel-rooms-booking-service-250x250.jpg"));
			lblPicture1.setBounds(556, 350, 200, 159);
			frmAvailablityOfRooms.getContentPane().add(lblPicture1);
			
			JButton btnCheckRooms = new JButton("Check Rooms");
			btnCheckRooms.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
			btnCheckRooms.setBounds(590, 536, 128, 33);
			frmAvailablityOfRooms.getContentPane().add(btnCheckRooms);
			
			JButton btnBookRoom = new JButton("Book Room");
			btnBookRoom.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
			btnBookRoom.setBounds(590, 580, 128, 33);
			frmAvailablityOfRooms.getContentPane().add(btnBookRoom);
			
			JButton btnClose = new JButton("Close");
			btnClose.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
			btnClose.setBounds(590, 624, 128, 33);
			frmAvailablityOfRooms.getContentPane().add(btnClose);
			
			JLabel lblRoomType = new JLabel("Room Type");
			lblRoomType.setHorizontalAlignment(SwingConstants.CENTER);
			lblRoomType.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblRoomType.setBounds(10, 286, 85, 25);
			frmAvailablityOfRooms.getContentPane().add(lblRoomType);
			
			JLabel lblBeachView = new JLabel("Beach View");
			lblBeachView.setHorizontalAlignment(SwingConstants.CENTER);
			lblBeachView.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblBeachView.setBounds(280, 286, 102, 25);
			frmAvailablityOfRooms.getContentPane().add(lblBeachView);
			
			JLabel lblBedType = new JLabel("BedType");
			lblBedType.setHorizontalAlignment(SwingConstants.CENTER);
			lblBedType.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblBedType.setBounds(558, 286, 94, 25);
			frmAvailablityOfRooms.getContentPane().add(lblBedType);
			
			String choice2[] = {"Choose", "Single Bed", "Double Bed"};
			JComboBox cmbBedType = new JComboBox(choice2);
			cmbBedType.setBounds(662, 289, 94, 20);
			frmAvailablityOfRooms.getContentPane().add(cmbBedType);
			
			String choice1[] = {"Choose", "Yes", "No"};
			JComboBox cmbBeachView = new JComboBox(choice1);
			cmbBeachView.setBounds(392, 289, 94, 20);
			frmAvailablityOfRooms.getContentPane().add(cmbBeachView);

			String choice[] = {"Choose", "AC", "Non AC"};
			JComboBox cmbRoomType = new JComboBox(choice);
			cmbRoomType.setBounds(117, 289, 94, 20);
			frmAvailablityOfRooms.getContentPane().add(cmbRoomType);
			
			btnCheckRooms.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try {
						st.setObject(1,(cmbBedType.getItemAt(cmbBedType.getSelectedIndex())));
						st.setObject(2, cmbRoomType.getItemAt(cmbRoomType.getSelectedIndex()));
						st.setObject(3, cmbBeachView.getItemAt(cmbBeachView.getSelectedIndex()));
						
						ResultSet rs = st.executeQuery();
						if(rs.next()) {
							table.setModel(DbUtils.resultSetToTableModel(rs));
						}
						else {
							JOptionPane.showMessageDialog(frmAvailablityOfRooms, "No Room Available", "RESULT", JOptionPane.PLAIN_MESSAGE);
						}
					}
						catch(Exception e1) {
							e1.printStackTrace();
						}
				}
			});
			
			btnBookRoom.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					BookingRoom.main(null);
				}
			});
			
			btnClose.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					frmAvailablityOfRooms.dispose();
				}
			});

			
			frmAvailablityOfRooms.setSize(800, 720);
			frmAvailablityOfRooms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frmAvailablityOfRooms.getContentPane().setLayout(null);
			frmAvailablityOfRooms.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
