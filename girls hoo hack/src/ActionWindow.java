import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//1. Extend JFrame
@SuppressWarnings("serial")
public class ActionWindow extends JFrame{
	JLabel instructionLabel;
	JButton b1;
	JLabel introLabel;
	JTextField textField;
	JLabel username;

	
	//2. Form elements 
	public ActionWindow() {
		instructionLabel = new JLabel("Enter your name: ");
		b1 = new JButton("Done!");
		introLabel = new JLabel();
		username = new JLabel();
		
	}
	
	public static void main(String[] args) {
		WindowRunnable myWindow = new WindowRunnable();
		
		//5. Launch the window using invokeLater 
		javax.swing.SwingUtilities.invokeLater( myWindow );
		
	}
	
	//3. Static method to create the frame 
	public static void createAndShowGui() {
		ActionWindow frame = new ActionWindow();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentsToPane( frame.getContentPane());
		frame.pack();
		frame.setSize(400,400);
        frame.setBounds(0, 0, 400,400);
        frame.setBackground(Color.CYAN);
		frame.setVisible(true);
	}
	//4. Create the Panel 
	public void addComponentsToPane(Container pane) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		b1.setActionCommand("changeLabel");
		panel.add(username);
		panel.add(instructionLabel);
		//enter name label 
		textField = new JTextField(20);
		textField.setLocation(200,200);

		panel.add(textField);
		pane.add(panel);
		// add button 
		panel.add(b1);
		pane.add(panel);
		panel.add(introLabel);
		pane.add(panel);
		
		

		class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ( e.getActionCommand().equals("changeLabel")) {
				introLabel.setText("Hello " + String.valueOf(textField.getText()));
				}
			}
		}
		ButtonListener myListener = new ButtonListener();
		b1.addActionListener(myListener);
	}
	

}

class WindowRunnable implements Runnable{
	public void run() {
		ActionWindow.createAndShowGui();
	}
}
