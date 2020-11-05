import java.awt.*;

public class FrameExample {

	public static void main(String[] args) {

		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolKit.getScreenSize();
		
		Frame f = new Frame("예제용");
		f.setSize(300,300);
		f.setLocation(screenSize.width/2-150, screenSize.height/2-150);
		f.setVisible(true);
		Panel p = new Panel();
		p.add(new Button("b1"));
		p.add(new Button("b2"));
		f.add(p);
	}

}
