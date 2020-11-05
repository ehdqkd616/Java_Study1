package stream_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("D:\\Rudy\\JAVA\\수업 자료\\수업에 필요한 문서\\Hi.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("D:\\Rudy\\JAVA\\수업 자료\\수업에 필요한 문서\\Hi.csv");
			String data = null;
			int i = 0;
			while((data=br.readLine())!=null) {
				System.out.println(++i+"번째 줄 읽음");
				String[] dummy = data.split(",");
				for(String field : dummy) {
					System.out.print("필드값 : "+field+", ");
					fw.write(field+", ");
					fw.flush();
				}
				System.out.println();
				fw.write("\r\n");
				fw.flush();
			}
		}catch(IOException e){
			
		}finally {
			if(br!=null) {
				try{fr.close();}catch(IOException e) {};
			}
		}
	}
}
