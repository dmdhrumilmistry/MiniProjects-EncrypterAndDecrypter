/* * * * * * * * * * * * * * * * * * * * * * * 
 * Written and Contributed by :
 * 1. Dhrumil Mistry
 * 
 * * * * * * * * * * * * * * * * * * * * * * *
 * For testing GUI for encrypter and decrypter 
 * * * * * * * * * * * * * * * * * * * * * * *
 *
 */

package miniproject.team;

//Listeners and Event Handlers
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public final class GUI extends JFrame implements ActionListener{

	JFrame frame;
	JButton enc;
	JLabel greet;
	JLabel message;
	JLabel encText;
	JTextArea inputL;
	
	
	public GUI() {
		//Creating Frame Object
		frame = new JFrame("Encrypter and Decrypter");
		
		//Creating Text Area for Input!!
		inputL = new JTextArea();
		inputL.setBounds(10, 125, 200, 20);
		//Creating Button
		enc = new JButton("Start Encrypter!");
		enc.setBounds(126, 160, 200, 50);//Setting Bounds
		
		
		//Creating Label(Text which cannot be edited by user)
		greet = new JLabel();
		greet.setBounds(125, 300, 200, 50);//Setting Boundaries
		greet.setText("Happy Encrypting!");
		message = new JLabel();
		message.setBounds(100, 100, 400, 50);
		encText = new JLabel();
		encText.setBounds(10, 450, 450, 50);
		//Adding Action Listener to button
		enc.addActionListener(this);
		
		//Adding Objects to Frame
		frame.add(enc);
		frame.add(greet);
		frame.add(message);
		frame.add(inputL);
		frame.add(encText);
		
		//Making Objects Visible
		enc.setVisible(true);
		message.setVisible(true);
		greet.setVisible(true);
		inputL.setVisible(true);
		encText.setVisible(true);
		
		//Setting Frame Size before displaying
		frame.setSize(500, 500);
		
		//Exiting Program on Closing the window
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Layout should be set first before making Frame Visible
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public void WindowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent clickOnStartEncrypter) {
		try {

			String encrypted = EncrypterAndDecrypter.encrypt(inputL.getText(), 2);
			encText.setText(encrypted);
			System.out.println(encrypted);
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}

