
package mainbank;
public class Customer extends Person{
        static     String Address ;
        static     String ContactNum;
        static     String AccountNum;
        static     String password;
        static     String choice ;   
      
        //Gerrymee Tañedo "Method 11"  
 
            public Customer(String spName){
		super(spName);
            }public void Address (String Address){
                this.Address=Address;   
            }public String Address(){
                return Address;
            } 
        
        //Gerrymee Tañedo "Method 12"

             void Contact (String ContactNum){
             this.ContactNum=ContactNum;
            }public String Contact(){
             return Address;
            }  
          
        //Gerrymee Tañedo "Method 13"

            void password(String password){
            this.password=password;
            }public String password(){
            return password;
            }     


 //Ellajane Manlapaz "Method 14"
            void AccNum (String AccountNum ){
            this.AccountNum=AccountNum;
            }public String AccNum(){
            return AccountNum;
            }




}
      

 
