
package mainbank;

abstract class Person{
 static  String pName;
	
 
        //Glen Victorio "Method 2"
	public Person(){
		System.out.println("Person Default");
        }
        public Person(String pName){
            this.pName=pName;
        }
        public String Name(){
            return pName;
        }
}
