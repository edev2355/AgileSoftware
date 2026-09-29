import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;

@SuppressWarnings("deprecation")
public class MapGUI extends JFrame implements ActionListener, Observer, MouseListener{

	private JPanel centerPanel;
	private JPanel titlePanel;
	private JPanel buttonPanel;
	
	private JButton pick;
	private Timer timer;
	Thread thread;
	Mouse newMouse;
	private boolean pressed = false;
	public MapGUI() {
		super("MapGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		newMouse = new Mouse();
		thread = new Thread(newMouse);
		
		pick = new JButton("Pick this Parking");
		centerPanel = new JPanel();
		titlePanel = new JPanel();
		buttonPanel = new JPanel();
		
		titlePanel.add(new JLabel("Draggable Map"));
		buttonPanel.add(pick);
		add(centerPanel,BorderLayout.CENTER);
		add(titlePanel,BorderLayout.NORTH);
		add(buttonPanel,BorderLayout.SOUTH);
		centerPanel.setBackground(Color.DARK_GRAY);
		setVisible(true);
		centerPanel.addMouseListener(this);
	}
	
	
	

	public void update(Observable obj, Object arg) {
		System.out.println("Updated");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		newMouse.pressed = true;
		System.out.println("Presseed");
		
		thread.start();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		newMouse.pressed = false;
	}
	
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void  actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapGUI newMap = new MapGUI();
		
	}
	

}
