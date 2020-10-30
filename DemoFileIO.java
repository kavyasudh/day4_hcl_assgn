package day4_hcl_Assgn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		String absolutePath = directory + File.separator + fileName;



		try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
		    String fileContent = "This is a sample text.";
		    fileOutputStream.write(fileContent.getBytes());
		} catch (FileNotFoundException e) {
		    System.out.println(e.getMessage());
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}



		try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
		    int ch = fileInputStream.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileInputStream.read();
		    }
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
