import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample extends Frame{

	public TextFieldExample() {
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
