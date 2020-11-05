import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample2 extends Frame{

	public TextFieldExample2() {
		super("텍스트 필드용 예제");
		setBounds(800,400,300,300);
		setVisible(true);
		Panel p = new Panel();
		Label l1 = new Label("입력하세요 :");
		Label l2 = new Label();
		TextField tf = new TextField(10);
		Button b1 = new Button("저장");
		p.add(l1); p.add(tf); p.add(b1);
		add(p); p.add(l2); validate();
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l2.setText("입력한 값 : "+tf.getText());
				tf.setText("");
				p.validate();
			}
		});
		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
					l2.setText(l2.getText().substring(0,l2.getText().length()-2));
				}else {
					l2.setText(l2.getText()+e.getKeyChar());
				}
				p.validate();
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
		
		new TextFieldExample();
		
	}

}
