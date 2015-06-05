package extra;

public class Employee{
	   String name;
	   int age;
	   String designation;
	   double salary;
		
	   
	   public Employee(String name){// This is the constructor of the class Employee
	      this.name = name;
	   }
	   
	   public void empAge(int empAge){// Assign the age of the Employee  to the variable age.
	      this.age =  empAge;
	   }
	   
	   public void empDesignation(String empDesig){/* Assign the designation to the variable designation.*/
	      this.designation = empDesig;
	   }
	  
	   public void empSalary(double empSalary){ /* Assign the salary to the variable	salary.*/
	      this.salary = empSalary;
	   }
	  
	   public void printEmployee(){ /* Print the Employee details */
	      System.out.println("Name: "+ name );
	      System.out.println("Age: " + age );
	      System.out.println("Designation: " + designation );
	      System.out.println("Salary: " + salary);
	   }
	}


/*
public class Extra {

	public Extra() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/