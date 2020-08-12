package stream_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerExample {

	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			String data = null;
			System.out.println("아무거나 입력하세요.");
			System.out.println("스캐너와 다르게 입력스트림을 직접 이용해 Enter키가 아닌 Ctrl+z입력 시 종료됩니다.");
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(IOException e) {
			
		}finally {
			if(br!=null) {try {br.close();}catch(IOException e) {}}
		}

	}

}
