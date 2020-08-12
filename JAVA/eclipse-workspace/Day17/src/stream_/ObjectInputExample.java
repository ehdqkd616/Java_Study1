package stream_;

import java.io.*;
import java.util.*;

public class ObjectInputExample {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("cus.data");
			ois = new ObjectInputStream(fis);
			ArrayList<Customer> list = 
			(ArrayList<Customer>)ois.readObject();
			System.out.println(list);
		}catch(Exception e) {

		}finally {
			if(ois!=null) {try {ois.close();}catch(IOException e) {}}	
		}
	}

}
