package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderClass {
	public static void main(String[] args) throws Exception{
//		try {
//			FileReader fReader = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce website - login feature,.txt");
//			BufferedReader reader = new BufferedReader(fReader);
//			String data;
//			while((data = reader.readLine()) != null) {
//				System.out.println(data);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		buffredWriterMethod();
	}
	
	
	public static void buffredWriterMethod() throws IOException {
		FileWriter fWriter = new  FileWriter("C:\\Users\\Dilip\\Desktop\\logout.txt", true);
		BufferedWriter writer = new BufferedWriter(fWriter);
		writer.newLine();
		writer.write(" and Python");
		writer.close();
	}
}
