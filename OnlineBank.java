
package mainbank;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class OnlineBank {
    
        static double payAmount;
        static String Mail;
  
        // Robert Sebastian "Method 3"
    public static boolean Account(Customer customer) {
           
            boolean GMV=false;
	while(!GMV){	
		System.out.println("Enter Your Password (Q to quit):");
		Scanner user = new Scanner(System.in);
                String Password = user.nextLine(); 
               
                if (Password.equalsIgnoreCase(customer.password)) {
			GMV=true;
                       System.out.println("Continue"); 
                        
		}else if (Password.contains("q") || Password.contains("Q")) {break; }
                else{System.out.print("WRONG PASSWORD, PLEASE TRY AGAIN! \n");
                }
	} 
            return GMV;
    }
    
        // Robert Sebastian "Method 4"
        public static void Choose(Customer customer, Account acc) {
            
            Scanner user = new Scanner(System.in);
        System.out.println("\tWelcome to OBTS\n");
        System.out.println("1-Sign In"
         + " \n2-Sign Up ");
        String choice = user.nextLine();
        
        
         if(choice.equals("1")) {
            boolean pininsystem = Account(customer);              
		if(pininsystem==true){
			Transaction(customer, acc);
		} 
		
                
         }
         if (choice.equals("2")) {
                System.out.println("First Name and Last Name:");
                customer.pName = user.nextLine();
                System.out.println("Address:");
                customer.Address= user.nextLine();
                System.out.println("Contact Number:");  
                customer.ContactNum= user.nextLine();
                System.out.println("Account Number:");  
                customer.AccountNum= user.nextLine();
                 System.out.println("Password:");
                customer.password= user.nextLine();
                System.out.println("Enter the Amount Of deposit:");  
                acc.balance= user.nextInt();
               
                System.out.println("CONGRATULATIONS! YOUR ACCOUNT HAS BEEN CREATED.");
                System.out.println("\n-----------------------------------------------");
                Login(customer, acc);           
       }
       }
        
