package project;
import java.util.Scanner;
import module.Module;
import dealer.*;

import cart.Cart;

public class Project {

  
    public static void main(String[] args) {
        Project p = new Project();
       Scanner s = new Scanner(System.in);
       Dealer D1 = new Dealer();
       Dealer D2 = new Dealer();
       Dealer D3 = new Dealer();
       
       D1.addEmployee("arun","EMP01","bhagyanagar","19.09.2001","M");
       D2.addEmployee("Aditya","EMP02","Anandnagar","23/14/2020","M");
       D3.addEmployee("Adit","EMP03","Anandnagar","24/14/2020","M");
       D1.dealerDetails();
       D1.employeeDetails();
       D2.employeeDetails();
       D3.employeeDetails();
       System.out.println("Enter the number of items");
       int n = s.nextInt();
        String category[] = new String[10] ;
        String manufacturer[] = new String[10];
        String model[] = new String[10];
        double  price[] = new double[10] ; // 
        int Quantity[] = new int[10];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the category :");
            category[i] = s.next();
            System.out.println("Enter the name of the manufacturer :");
            manufacturer[i] = s.next();
            System.out.println("Enter the model :");
            model[i] = s.next();
            System.out.println("Enter the price :");
            price[i] = s.nextDouble();
            System.out.println("Enter the Quantity:");
            Quantity[i] = s.nextInt();
           
        }
       Cart c = new Cart(n,category,manufacturer,model,price,Quantity);
       c.printDetails(n);
       
    }
      
         
       
      
       
      
    }
    

