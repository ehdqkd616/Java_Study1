package stream_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NodeStreamExample {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\Hi.txt");
			fw = new FileWriter("C:\\Users\\user\\Desktop\\Hi2.txt");
			char[] buffer = new char[128];
			int count = fr.read(buffer);
			while(count>-1) {
				String data = new String(buffer,0,count);
				System.out.println(data);
				fw.write(buffer);
				fw.flush();
				count = fr.read(buffer);
			}
			
		}catch(IOException e){
			
		}finally {
			if(fr!=null) {
				try{fr.close();}catch(IOException e) {};
			}
		}
	}
}
