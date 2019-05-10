// Creating JButtons.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ButtonFrame extends JFrame
{
	private JButton plainJButton; // button with just text
	private JButton fancyJButton; // button with icons

	// ButtonFrame adds JButtons to JFrame
	public ButtonFrame()
	{
		super( "Testing Buttons" );
		setLayout( new FlowLayout() ); // set frame layout

		plainJButton = new JButton( "Plain Button" ); // button with text
		add( plainJButton ); // add plainJButton to JFrame

		Icon calendar = new ImageIcon( getClass().getResource( "small-calendar.png" ) );
		Icon question = new ImageIcon( getClass().getResource( "question.jpg" ) );
		fancyJButton = new JButton( "Button with icon", calendar ); // set image
		fancyJButton.setRolloverIcon(question); // set rollover image
		add( fancyJButton ); // add fancyJButton to JFrame

		// create new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener( handler );
		plainJButton.addActionListener( handler );
	} // end ButtonFrame constructor

	//inner class for button event handling
	private class ButtonHandler implements ActionListener
	{
		// handle button event
		public void actionPerformed( ActionEvent event )
		{
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s",event.getActionCommand()));
		}//end method actionPerformed
	}//end private inner class ButtonHandler
}//end class ButtomFrame