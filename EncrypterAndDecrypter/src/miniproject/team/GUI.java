/* * * * * * * * * * * * * * * * * * * * * * * 
 * Written and Contributed by :
 * @author Dhrumil Mistry
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

//GUI imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public final class GUI extends JFrame {
	
	//Creating Frame
	JFrame frame;
	
	//Creating Buttons for Encryption or Decryption Task
	JButton encButton;
	JButton dencButton;
	
	//Labels
	JLabel inputTextBox;
	JLabel forKey;
	
	//Text Areas
	JTextArea inputL, inputKey, outputL;
	
	
	public GUI() {
		//Creating Frame Object
		frame = new JFrame("Encrypter and Decrypter");
		
		//Creating Text Area for Input and Output!!
		inputL = new JTextArea();
		inputL.setBounds(10, 35, 200, 100);
		outputL = new JTextArea();
		outputL.setBounds(10, 300, 200, 100);
		inputKey = new JTextArea();
		inputKey.setBounds(10, 180, 200, 30);
		
		//Creating Button
		encButton = new JButton("Start Encrypter!");
		encButton.setBounds(250, 290, 200, 50);//Setting Bounds
		dencButton = new JButton("Start Decrypter!");
		dencButton.setBounds(250, 350, 200, 50);
		
		//Creating Label(Text which cannot be edited by user)
		inputTextBox = new JLabel();
		inputTextBox.setBounds(50, 0, 200, 50);//Setting Boundaries
		inputTextBox.setText("Enter your Text here :");
		forKey = new JLabel("Enter Number Key to Encrypt/Decrypt : ");
		forKey.setBounds(10, 150, 400, 30);
		
		//Adding Action Listener to button
		encButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clickOnStartEncrypter) {
				try {
					int key = Integer.parseInt(inputKey.getText()); //Retrieving Integer from String
					String encrypted = EncrypterAndDecrypter.encrypt(inputL.getText(), key);
					outputL.setText(encrypted);
					
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		});
		
		dencButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clickOnStartEncrypter) {
				try {
					int key = Integer.parseInt(inputKey.getText());
					String decrypted = EncrypterAndDecrypter.decrypt(inputL.getText(), key);
					outputL.setText(decrypted);
					
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		});
		
		//Adding Objects to Frame
		frame.add(encButton);
		frame.add(dencButton);
		
		frame.add(inputTextBox);
		frame.add(forKey);
		
		frame.add(inputL);
		frame.add(outputL);
		frame.add(inputKey);
		//Making Objects Visible
		encButton.setVisible(true);
		dencButton.setVisible(true);
		
		forKey.setVisible(true);
		inputTextBox.setVisible(true);
		
		inputL.setVisible(true);
		outputL.setVisible(true);
		inputKey.setVisible(true);
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
	
	
}