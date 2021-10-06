package employee;

 public class Employee
 
{   //properties
    private String name;
    private String address;
    private String dob; // please enter in format DD/MM/YYYY
    private String gender; //Male or Female
     
    //constructor
    public Employee (String name, String address, String dob, String gender)
    { this.name = name;
      this.address = address;
      this.dob = dob;
      this.gender = gender;
    }
 
 
    //method to print details on employees
    public void printDetails()
    {   
        System.out.println("Employee name: " +this.name);
        System.out.println("Address: "+ this.address);
        System.out.println("D.O.B: " + this.dob);
        System.out.println("Gender: "+this.gender);
    }
 
  
 }

