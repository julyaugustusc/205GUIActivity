import java.awt.*;
import javax.swing.*;
public class createPanel extends JPanel{
	
	private JLabel label;
	private JButton button;
	
	public createPanel(){
		
		setBackground(Color.RED);
		
		button = new JButton ("Push me");
		add(button);
		
		label = new JLabel ("This is a label");
		add(label);
		
	}
	

}
