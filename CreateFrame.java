import javax.swing.*;
import java.awt.*;
public class CreateFrame extends JFrame {
	
	public CreateFrame() {
		
		JPanel panel = new createPanel();
	    add(panel);
		final int FRAME_WIDTH = 800;
	    final int FRAME_HEIGHT = 800;
	    setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    setTitle("My First Frame");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
		
	}

}
