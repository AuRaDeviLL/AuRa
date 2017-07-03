package com.hms.controller;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Yaaron Da Hotel");
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBounds(945, 0, 406, 23);
		frame.getContentPane().add(toggleButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\1366x768_spa-beach-hotel.jpg"));
		lblNewLabel.setBounds(0, 22, 1350, 687);
		frame.getContentPane().add(lblNewLabel);		
		
		JButton btnNewButton = new JButton("Check Room");
		btnNewButton.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\zoom-in.png"));
		btnNewButton.setBounds(0, 0, 136, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBooking = new JButton("Booking");
		btnBooking.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\smartphone.png"));
		btnBooking.setBounds(135, 0, 136, 23);
		frame.getContentPane().add(btnBooking);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\idea (1).png"));
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCheckOut.setBounds(405, 0, 136, 23);
		frame.getContentPane().add(btnCheckOut);
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\idea.png"));
		btnCheckIn.setBounds(270, 0, 136, 23);
		frame.getContentPane().add(btnCheckIn);
		
		JButton btnBillGenerate = new JButton("Bill Generate");
		btnBillGenerate.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\printer.png"));
		btnBillGenerate.setBounds(810, 0, 136, 23);
		frame.getContentPane().add(btnBillGenerate);
		
		JButton btnFoodMenu = new JButton("Food Menu");
		btnFoodMenu.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\stand.png"));
		btnFoodMenu.setBounds(675, 0, 136, 23);
		frame.getContentPane().add(btnFoodMenu);
		
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setIcon(new ImageIcon("D:\\Ecllipse_Work_Space\\workspace\\Hotel Management System\\images\\photo-camera.png"));
		btnViewReport.setBounds(540, 0, 136, 23);
		frame.getContentPane().add(btnViewReport);
				
	    JMenuBar mb   = new JMenuBar(); 
	    	    
	    JMenu addcustomer = new JMenu("File");
		JMenuItem i10,i20,i30;
	    i10=new JMenuItem("Item 1");  
	    i20=new JMenuItem("Item 2");  
	    i30=new JMenuItem("Item 3");  
	    addcustomer.add(i10); addcustomer.add(i20); addcustomer.add(i30);
		mb.add(addcustomer);
	    
	    JMenu edit    = new JMenu("Edit");   
	    JMenuItem i1,i2,i3;
	    i1=new JMenuItem("Item 1");  
	    i2=new JMenuItem("Item 2");  
	    i3=new JMenuItem("Item 3");  
	    edit.add(i1); edit.add(i2); edit.add(i3);   
	    mb.add(edit);  
	       
	    JMenu transaction    = new JMenu("Transaction");    
		JMenuItem i11,i21,i31;
		i11=new JMenuItem("Item 1");  
		i21=new JMenuItem("Item 2");  
		i31=new JMenuItem("Item 3");    
		transaction.add(i11); transaction.add(i21); transaction.add(i31);  
		mb.add(transaction);  
		       
		JMenu view    = new JMenu("View");  
		JMenuItem i12,i22,i32;
		i12=new JMenuItem("Item 1");  
		i22=new JMenuItem("Item 2");  
		i32=new JMenuItem("Item 3");    
		view.add(i12); view.add(i22); view.add(i32);    
		mb.add(view);  
	       
	    JMenu configure    = new JMenu("Configure");  
	    JMenuItem i13,i23,i33;
	    i13=new JMenuItem("Item 1");  
	    i23=new JMenuItem("Item 2");  
	    i33=new JMenuItem("Item 3");  
	    configure.add(i13); configure.add(i23); configure.add(i33);     
	    mb.add(configure);
	     
	    JMenu report    = new JMenu("Report");    
	    JMenuItem i14,i24,i34;
	    i14=new JMenuItem("Item 1");  
	    i24=new JMenuItem("Item 2");  
	    i34=new JMenuItem("Item 3");   
	    report.add(i14); report.add(i24); report.add(i34);
	    mb.add(report);
	       
	    JMenu help    = new JMenu("Help");  
	    JMenuItem i15,i25,i35;
	    i15=new JMenuItem("Item 1");  
	    i25=new JMenuItem("Item 2");  
	    i35=new JMenuItem("Item 3");  
	    help.add(i15); help.add(i25); help.add(i35);      
	    mb.add(help);
		   
	    frame.setJMenuBar(mb);
	}
}
