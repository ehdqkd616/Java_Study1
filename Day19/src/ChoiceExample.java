import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceExample extends Frame {
	
	public ChoiceExample(String name) {
		super(name);
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolKit.getScreenSize();
		setSize(300,300);
		setLocation(screenSize.width/2-150, screenSize.height/2-150);
		setVisible(true);
		Panel p = new Panel();

		Choice choice = new Choice();
		choice.addItem("서울");
		choice.addItem("경기도");
		choice.addItem("제주도");
		choice.addItem("전라도");
		Label l1 = new Label("선택된 값 : 없음");
		Button b1 = new Button("선택");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("선택된 값: "+choice.getSelectedItem());
				p.validate();
			}
			
		});
		p.add(choice); p.add(b1); p.add(l1);
		add(p); validate();
	}
	
	
	public static void main(String[] args) {
		
		new ChoiceExample("초이스 예제용");

	}
	
}
