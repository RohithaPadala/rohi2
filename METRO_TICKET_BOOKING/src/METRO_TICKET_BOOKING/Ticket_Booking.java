package METRO_TICKET_BOOKING;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
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
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(140, 11, 267, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\i2.jpg"));
		lblNewLabel_1.setBounds(-27, 11, 130, 94);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(113, 67, 70, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(113, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(113, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tickets");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(113, 193, 70, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(201, 72, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "L.B Nagar", "Nampally", "Kphb", "Kukatpally", "nagole", "mgbs", "jbs", "sr nagar", "raidurg", "miyapur"}));
		cb1.setBounds(201, 114, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "L.B Nagar", "Nampally", "Kphb", "Kukatpally", "nagole", "mgbs", "jbs", "sr nagar", "raidurg", "miyapur"}));
		cb2.setBounds(201, 156, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb3.setBounds(201, 192, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton b = new JButton("Book");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String p=(String) cb1.getSelectedItem();	
				String p1=(String) cb2.getSelectedItem();
				String p2=(String) cb3.getSelectedItem();
				int not = Integer.parseInt(p2);
				int bill=not*80;
				//JOptionPane.showMessageDialog(b,"Name:"+n+"\nFrom Station:"+p+"\nTo Station :"+p1+"\nno.of tickets:"+p2+"\n price:"+bill);
			    if(p.equals(p1))
			    {
			    	JOptionPane.showMessageDialog(b, "invalid station");
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(b,"Name:"+n+"\nFrom Station:"+p+"\nTo Station :"+p1+"\nno.of tickets:"+p2+"\n price:"+bill);
			    }
			
			}
		});
		b.setFont(new Font("Tahoma", Font.BOLD, 16));
		b.setBounds(142, 227, 89, 23);
		frame.getContentPane().add(b);
	}

}
