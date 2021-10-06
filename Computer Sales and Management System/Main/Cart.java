package cart;
public class Cart  {
    private String category[] = new String[10] ;
    private String manufacturer[] = new String[10];
    private String model[] = new String[10];
    private double  price[] = new double[10] ; // 
    
    private int Quantity[] = new int[10];
     
    //constructor
    public Cart (int n,String category[],String manufacturer[], String model[], double price[],int Quantity[])
    {
        for(int i=0;i<n;i++)
        {
      this.category[i] = category[i];
      this.manufacturer[i] = manufacturer[i];
      this.model[i] = model[i];
      this.price[i] = price[i];
     
      this.Quantity [i]= Quantity[i];
        }
    }
 
 
    //method to print details on employees
    public void printDetails(int n)
    {   
        double total =0;
        for(int i=0;i<n;i++)
        {
        System.out.println("Category     : "+ this.category[i]);
        System.out.println("Manufacturer : "+ this.manufacturer[i]);
        System.out.println("Model        : "+ this.model[i]);
        price[i] = Quantity[i] * price[i];
        System.out.println("Price        : "+ this.price[i]);
        total = total + price[i];
        System.out.println("Quantity     : "+ this.Quantity[i]);
        }
        
        System.out.println("Total Cost of all the items : "+ total);
}
}