import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class ColorExample extends Frame {

	ArrayList<Color> clist = new ArrayList<>();
	
	public ColorExample() {
		super("색깔 변경");
		setBounds(750,400,300,300);
		setVisible(true);
		Panel p = new Panel();
		clist.add(Color.red); clist.add(Color.blue);
		clist.add(Color.black); clist.add(Color.green);
		clist.add(Color.yellow); clist.add(Color.gray);
		p.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					p.setBackground(clist.get((int)(Math.random()*6)));
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(p);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		validate();
	}
	
	public static void main(String[] args) {
		new ColorExample();

	}

}
