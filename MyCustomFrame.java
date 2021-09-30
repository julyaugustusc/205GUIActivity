import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyCustomFrame extends JFrame{
	
	private JButton button;
	private JLabel label;
	private final int width = 800;
	private final int height = 800;
	
	public MyCustomFrame() {
		createComponents();
		setSize(width, height);
		
		
	}
	
	private void createComponents() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		
		button = new JButton ("Push me");
		label = new JLabel ("This is a label");
		
		panel.add(button);
		panel.add(label);
		add(panel);
		
		ClickListener c = new ClickListener();
		
		button.addActionListener(c);

	}
	public class ClickListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			System.out.println("Button was clicked");
		}
		
		public ClickListener() {

		}
		
	}

}
//Kind of confused about how you want me to submit this??
