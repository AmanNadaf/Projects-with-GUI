package dealer;

 public class Dealer 
{   
   private Employee [] dealer;
   private int size=0;
   private static int count = 0;
     
     
    //constructor
    public Dealer()
    {
        this.dealer = new Employee [10];
        
    }
     
    public void addEmployee(String name,String ID, String address, String dob, String gender)
    { 
         
        this.dealer[size] = new Employee (name,ID, address, dob, gender);
        size++;
        count++;
    }
     
     
     
    public void dealerDetails()
    {
         //Owner Name and shop name the same for all employees
        System.out.println(" Name: ");
        System.out.println("Owner's Name: ");
         
        System.out.println ("Total number of employees: " + count);
    }
     
     
    public void employeeDetails()
        {
            //for loop to print out the details on every employee in the array
        for(int i = 0; i < this.size; i++)
             dealer[i].printDetails();
        }
}
  class Employee 
 
{   //properties
    private String name;
    private String ID;
    private String address;
    private String dob; // please enter in format DD/MM/YYYY
    private String gender; //Male or Female
    public int size=0;
     
    //constructor
    public Employee (String name,String ID, String address, String dob, String gender)
    { this.name = name;
      this.ID = ID;
      this.address = address;
      this.dob = dob;
      this.gender = gender;
    
      
    }
 
 
    //method to print details on employees
    public void printDetails()
    {   
        System.out.println();
        System.out.println("Employee name              :  "+this.name);
        System.out.println("Employee ID                :  "+this.ID);
        System.out.println("Address                    :  "+ this.address);
        System.out.println("D.O.B                      :  "+ this.dob);
        System.out.println("Gender                     :  "+this.gender);
    }
 
 
 
} 