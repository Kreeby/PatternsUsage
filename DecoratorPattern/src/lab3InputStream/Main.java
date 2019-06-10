package lab3InputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int c; 
		
		try {
			InputStream in = new CoolBoy2007(new BufferedInputStream(new FileInputStream("/Users/kreeby/eclipse-workspace/SoftwareDesign/src/lab3InputStream/lib.txt")));
			while((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		

	}

}
