package day4_hcl_Assgn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	private String name;
	private String id;
	private String address;
	transient double salary;
	public Emp(String name, String id, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	 
}

public class DemoSerialEX {
	public static void display(Emp object1) 
    { 
  
        System.out.println("name = " + object1.getName()); 
        System.out.println("age = " + object1.getId()); 
        System.out.println("address = " + object1.getAddress()); 
        System.out.println("salary = " + object1.getSalary()); 
    } 


	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		Emp object = new Emp("kavya", "16k526", "sklm", 30000); 
        String filename = "ks.txt"; 
  
        // Serialization 
        try { 
  
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream 
                                           (filename));
                                            
  
           
            out.writeObject(object); 
  
            out.close(); 
          
  
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization."); 
            display(object); 
            
            
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        object = null; 
  
        // Deserialization 
        try { 
  
             
            ObjectInputStream in = new ObjectInputStream 
                                         (new FileInputStream 
                                                 (filename)); 
            object = (Emp)in.readObject(); 
            
            in.close(); 
            
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization."); 
            display(object); 
  
            // System.out.println("z = " + object1.z); 
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
	
	
	}

}
