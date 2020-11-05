package inner.bad;

import java.awt.Frame;

public class InnerEx extends Frame {

	public InnerEx() {
		super("예제용 Frame");
		setSize(300,300);
		setVisible(true);
		this.addWindowListener(new WindowAdapter();
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	}
	public static void main(String[] args) {
		new InnerEx();
	}
	
	public class InnerCloser extends WindowAdapter {
		
	}
	
}
