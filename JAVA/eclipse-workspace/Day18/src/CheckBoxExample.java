import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample extends Frame{

	public CheckBoxExample() {
		super("CheckBox 예제용");
		setSize(300,400);
		setVisible(true);
		Panel p = new Panel();
		Checkbox c1 = new Checkbox("Java");
		Checkbox c2 = new Checkbox("Jsp");
		Checkbox c3 = new Checkbox("C++");
		Checkbox c4 = new Checkbox("Javascript");
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox c5 = new Checkbox("M",false,cg);
		Checkbox c6 = new Checkbox("F",false,cg);
		Label l1 = new Label("선택된 값 : ");
		p.add(c1); p.add(c2); p.add(c3); p.add(c4); p.add(c5); p.add(c6);
		Button b1 = new Button("save");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("선택된 값 : ");
				if(c1.getState()) {
					l1.setText(l1.getText()+c1.getLabel()+",");
				}
				if(c2.getState()) {
					l1.setText(l1.getText()+c2.getLabel()+",");
				}
				if(c3.getState()) {
					l1.setText(l1.getText()+c3.getLabel()+",");
				}
				if(c4.getState()) {
					l1.setText(l1.getText()+c4.getLabel());
				}
				p.validate();
			}
		});
		p.add(b1);
		p.add(l1);
		add(p);
		validate();
	}

	
	public static void main(String[] args) {
		
		new CheckBoxExample();
	}

}
