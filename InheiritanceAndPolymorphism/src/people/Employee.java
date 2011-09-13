package people;

import java.util.Date;

public class Employee extends Person {

	public long employeeNumber;
	
	public Employee(String n) {
		super(n);
		Date d = new Date();
		employeeNumber = d.getTime();
		
	}

}
