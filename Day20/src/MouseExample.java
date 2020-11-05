import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseExample extends Frame{

	public MouseExample() {
		super("마우스 예제용");
		setBounds(750,400,300,300);
		setVisible(true);
		Panel p = new Panel();
		Label l1 = new Label("입력하세요:");
		Label l2 = new Label();
		TextField tf = new TextField(10);
		Button b1 = new Button("Save");
		tf.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					b1.requestFocus();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {

			}

			@Override
			public void keyTyped(KeyEvent arg0) {

			}
		});
		b1.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					l2.setText("입력한 값 : "+tf.getText());
				}
				p.validate();
				p.requestFocus();
			}
			@Override
			public void keyReleased(KeyEvent e) {

			}
			@Override
			public void keyTyped(KeyEvent e) {

			}
		});
		p.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					l2.setLocation(l2.getLocation().x, l2.getLocation().y-5);
				}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					l2.setLocation(l2.getLocation().x, l2.getLocation().y+5);
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					l2.setLocation(l2.getLocation().x-5, l2.getLocation().y);
				}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					l2.setLocation(l2.getLocation().x+5, l2.getLocation().y);
				}

			}
			@Override
			public void keyReleased(KeyEvent e) {

			}
			@Override
			public void keyTyped(KeyEvent e) {

			}
		});
		p.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) {
					p.setBackground(new Color((int)(Math.random()*1000000)));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {

			}
			@Override
			public void mouseExited(MouseEvent e) {
				p.setBackground(new Color((int)(Math.random()*1000000)));
			}
			@Override
			public void mousePressed(MouseEvent e) {

			}
			@Override
			public void mouseReleased(MouseEvent e) {

			}
		});
		p.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {

			}
			@Override
			public void mouseMoved(MouseEvent e) {
				l2.setLocation(e.getX(), e.getY());
			}
		});
		p.add(l1); p.add(tf); p.add(b1); p.add(l2);
		add(p);
		validate();
	}

	public static void main(String[] args) {
		new MouseExample();
	}

}