package day4_hcl_Assgn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBufferedIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		String absolutePath = directory + File.separator + fileName;

		 
		try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath))) {
		    String fileContent = "This is a sample text.";
		    bufferedOutputStream.write(fileContent.getBytes());
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}

		
		
		
		try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))) {
		    int ch = bufferedInputStream.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = bufferedInputStream.read();
		    }
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
