import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class AddressBookFrame extends JFrame {
	
	private AddressBook ab;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressBookFrame frame = new AddressBookFrame();
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
	public AddressBookFrame() {
		ab = new AddressBook();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAddressBook = new JMenu("Address Book");
		menuBar.add(mnAddressBook);
		
		JMenuItem mntmCreate = new JMenuItem("Create");
		mntmCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ab = new AddressBook();
				JOptionPane.showMessageDialog(null, "New Address Book created!");
			}
		});
		mnAddressBook.add(mntmCreate);
		
	   
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = ab.display();
				BufferedWriter out = null;
				try {
					out = new BufferedWriter(new FileWriter("Address Book.txt"));
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					out.write(s);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				JOptionPane.showMessageDialog(null, "Saved!");

			}
		});
		mnAddressBook.add(mntmSave);
		
		
		JMenu mnBuddyInfo = new JMenu("Buddy Info");
		menuBar.add(mnBuddyInfo);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuddyInfo buddy = new BuddyInfo();
				String name = JOptionPane.showInputDialog("Please enter the buddy's name: ");
				String address = JOptionPane.showInputDialog("Please enter the buddy's address: ");
				String phone = JOptionPane.showInputDialog("Please enter the buddy's phone number: ");
				buddy.setName(name);
				buddy.setAddress(address);
				buddy.setPhone(phone);
				
				ab.addBuddy(buddy);
				
				JOptionPane.showMessageDialog(null, "Buddy Added to Address Book!");
				
			}
		});
		mnBuddyInfo.add(mntmAdd);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 final JTextArea textArea = new JTextArea();
		 contentPane.add(textArea, BorderLayout.CENTER);
		 
		 JMenuItem mntmDisplay = new JMenuItem("Display");
			mntmDisplay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textArea.setText(ab.display());
				}
			});
			mnAddressBook.add(mntmDisplay);
			
			
	}

}
