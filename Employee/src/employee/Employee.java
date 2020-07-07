
//( Practical Q4  )

/* 

public class Practical4Q1 {

  public static void main (String [] args){
  	
  	
  	Employee s1= new Employee("Abu",4000);
  	Employee s2= new Employee("Sohai",5000);
  	

  	
  	System.out.println("Higher salary");
  	if(s1.getSalary() > s2.getSalary()){
  		System.out.println("Name :" + s1.getName());
  	}else{
  			System.out.println("Name :" + s2.getName());
  	}
  	
  	System.out.println("Total Salary : " + (s1.getSalary()+s2.getSalary())  );
  		
  	
  	
  	s1.raiseSalary(8);
  	
  	System.out.println("Before\n");
  	System.out.println("Salary : " + s1.getSalary());
  	
  	
  	System.out.println("After\n");
  	System.out.println("Salary : " + s1.getSalary());	
  }
}




//( Practical Q4  )

/*
public class Employee {

    private String name;
    private double salary;
    
    public void setName(String n){
    	name=n;
    }
    
    public void setSalary(double value){
           salary=value;
    }
    
    public String getName(){
    	return name;
    }
    public double getSalary(){
    	return salary;
    }
    
    public Employee(){
    	name="";
    	salary=0.0;
    }

 
  public Employee(String employeeName, double currentSalary) {
    name = employeeName;
    salary = currentSalary;
}

   void raiseSalary(double percent){
   	
   salary = salary + (salary * percent / 100.0);
  }
}
*/







