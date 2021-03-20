
package mainbank;

public class MainBank {

           //Glen Victorio "Method 1"
       public static void main(String[]args){
            OnlineBank bank= new OnlineBank();
            Account acc= new Account();
            Customer customer= new Customer("Juan Dela Cruz");
        
        
        
 
   
        customer.Address("San isidro, Tarlac City, Tarlac");
        customer.Contact("09123456789");
        customer.password("12345abcde");
        customer.AccNum("233-3444-555");
        acc.balance=100000;
          
       
          bank.Choose(customer, acc);
   
        
    }
}
    
