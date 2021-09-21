import javax.swing.JFrame;
import java.awt.*;

public class BingoWindow extends JFrame{
	private static final int WIDTH = 1600;
	private static final int HEIGHT = 1050;

	public BingoWindow(String title, int se){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new BingoCardPanel(se)); 
		setSize(WIDTH,HEIGHT);
		setVisible(true);
	}
}
