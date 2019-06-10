package lab3InputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class CoolBoy2007 extends FilterInputStream {
	
	public CoolBoy2007(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		int c = super.read();
		
		Random rand = new Random();
		int n = rand.nextInt(50);
		
		return (c == -1 ? c: Character.reverseBytes((char) c));
		
	}
	
	
	public int read(byte b[], int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset + result; i++) {
			b[i] = (byte)Character.reverseBytes((char) b[i]);
		}
		return result;
	}
	
	
}
