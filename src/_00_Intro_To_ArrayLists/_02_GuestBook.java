package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	public void run() {
		
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
				
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton buttonClick = (JButton) arg0.getSource();
		
		if(buttonClick == button) {
			String name = JOptionPane.showInputDialog("enter name");
			names.add(name);
		}
		if(buttonClick == button2) {
			for(int i=0;i<names.size();i++) {
				String s = names.get(i);
				int e = i+1;
				JOptionPane.showMessageDialog(null, "Guest #" + e + ": " + s);
			}
		}
		
	}

		
	
	
}
