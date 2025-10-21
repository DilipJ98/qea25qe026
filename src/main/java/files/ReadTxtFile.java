package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTxtFile {
	public static void main(String[] args) throws Exception{
			FileReader reader = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce website - login feature,.txt");
			int asciVl;
			FileWriter writer = new FileWriter("C:\\Users\\Dilip\\Desktop\\Ecommerce website.txt");

			while((asciVl = reader.read()) != -1) {
				writer.write((char) asciVl);
			}			
			writer.close();
	}
	
}
