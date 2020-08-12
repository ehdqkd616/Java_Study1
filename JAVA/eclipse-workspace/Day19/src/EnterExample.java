import java.awt.*;
import java.awt.Event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EnterExample extends Frame {

	public EnterExample() {
		super("엔터 저장");
		setBounds(750,400,300,300);
		setVisible(true);
		Panel p = new Panel();
		Label l1 = new Label("input : ");
		Label l2 = new Label();
		TextField tf = new TextField(10);
		Button b1 = new Button("SAVE");
		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b1.requestFocus();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyTyped(KeyEvent e) {

			}

		});

		b1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					l2.setText("Output : "+tf.getText());
					tf.setText("");
					p.validate();
				}
			}
		});

		p.add(l1); p.add(tf); p.add(b1); p.add(l2);
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
		new EnterExample();
	}


}


