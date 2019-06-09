package lab_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Student {
	
	int age = 10;
	int currAge = 10;
	
	SportBehaviour sportB;
	TransportBehaivour transportB;
	
	public Student() {
		
	}
	
	
	public void performSport() {
		sportB.goSport();
	}
	
	public void performTransport() {
		transportB.goSchool();
	}
	
	
	
	public int getOlder() {
		 try{    
			   age++;
	           FileWriter fw=new FileWriter("../lab_1.savings/age.txt");    
	           fw.write(age);    
	           fw.close();    
	          }
		 catch(Exception e){
			  System.out.println(e);
			  }    
	          System.out.println("Success...");
		return age;
		
	}
	
	
	public int getAge() {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"../lab_1.savings/age.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		return currAge;
	}
	
	public abstract void display();
	
	
	
}
