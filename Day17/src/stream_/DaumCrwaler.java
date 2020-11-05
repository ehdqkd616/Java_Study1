package stream_;

import java.io.*;
import java.net.*;
import java.util.*;

public class DaumCrwaler {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.daum.net";
		HttpURLConnection con = null;
		BufferedReader br = null;
		FileWriter fw = null;
		while(true) {
			while(true) {
				try {				
					con = (HttpURLConnection)(new URL(url).openConnection());
					con.connect();
					br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					Date date = new Date();
					String fileName = (date .getYear()+1900)+"년 "+(date.getMonth()+1)+"월 "
							+date.getDate()+"일"+date.getHours()+"시 "+date.getMinutes()+"분 의 실시간 검색어.txt ";
					fw = new FileWriter(fileName);
					String data = null;
					int rank = 0;
					int check = 0;
					while((data=br.readLine())!=null) {
						if(data.contains("<span class=\"txt_issue\">")) {
							if(++check%2==0)continue;
							rank++;
							String word = data.split(">")[2].split("<")[0];
							fw.write(rank+"위 : "+word);
							fw.write("\r\n");			
						}
						if(rank==10)break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					if(br!=null) {try {br.close();}catch(IOException e) {}}
					if(fw!=null) {try {fw.close();}catch(IOException e) {}}
				}
				System.out.println("파일 작성이 완료되었습니다.");
				Thread.sleep(60000);
			}
		}
	}
}
