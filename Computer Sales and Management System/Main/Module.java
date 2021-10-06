package module;
import java.util.Scanner;
public class Module {
public void login()
{
    boolean n = true;
    int i=3;
    while(n)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Username :");
    String name = s.nextLine();
    System.out.println("Password :");
    String pass = s.nextLine();
    if(name.equals("ADMIN")&& pass.equals("1234"))
    {
        System.out.println();
         System.out.println("Authentication successfull");
         n = false;
         break;
    }    
    else
    {
        System.out.println();
        System.out.println("Authentication failed");
        i--;
        System.out.println(i+" tries left");
        if(i==0){
            System.out.println("tries limit exceeded");
            System.exit(0);
        }
    }
    }
    
    
}

   
   
}
