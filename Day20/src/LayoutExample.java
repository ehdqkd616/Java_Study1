import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutExample extends Frame {

	public LayoutExample() {
		super("레이아웃");
		setBounds(750,400,300,300);
		setVisible(true);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		p1.add(new Label("Insert : "));
		TextField tf = new TextField(10);
		p1.add(tf);
		Button b1 = new Button("Save");
		p1.add(b1);
		Label l1 = new Label();
		p2.add(l1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Output : "+tf.getText());
				tf.setText("");
				p.validate();
			}
		});
		p.add(p1); p.add(p2); p.add(p3); p.add(p4);
		add(p);
		validate();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		validate();
	}
	
	public static void main(String[] args) {
		
		new LayoutExample();

	}

}
