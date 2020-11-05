package stream_;

import java.io.*;
import java.util.*;

public class ObjectOutputExample2 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("cus.data");
			oos = new ObjectOutputStream(fos);
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("김", 'M', "gct", 2016));
		list.add(new Customer("신", 'F', "fge", 2014));
		list.add(new Customer("서", 'M', "ABC", 2013));
		oos.writeObject(list);
		System.out.println("파일 작성이 완료되었습니다.");
	}catch(IOException e) {

	}finally {
		if(oos!=null) {try {oos.close();}catch(IOException e) {}}	
	}
}

}
