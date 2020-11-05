import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickExample extends Frame{
	int count = 0;
	public ClickExample() {
		super("예제용");
		setSize(300,400);
		setVisible(true);
		Panel p = new Panel();
		Label l1 = new Label("눌러주세요! : ");
		Button b1 = new Button("Push!");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("누른 횟수 : "+ ++count);
				p.validate();
			}
		});
		p.add(l1);
		p.add(b1);
		add(p);
		validate();
	}

	
	public static void main(String[] args) {
		
		new ClickExample();
	}

}
