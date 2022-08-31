interface test{
     void login(); //By Default methods are public abstract in interface if we not write that compiler will automatcaly add public abstract
     abstract void register();
     default void view(){ // In Interface we can only use concrete methods(Methods with body)with default and static keyword 
         System.out.println("View Method");
     }
     static void check(){ // In Interface we can only use concrete methods(Methods with body)with default and static keyword 
         System.out.println("Check Method");
     }
}
class loc implements test{
    public void register(){ // Overrides method i.e. declared in subclass) must not be more restrictive than the parent class overridden method. It can be same or less restrictive
        System.out.println("User Register");
    }
    public void login(){
        System.out.println("User Login");
    }
    

}
public class AbstractionUsingInterface {

    public static void main(String[] args) {
        
       loc ch= new loc();
       ch.register();
       ch.login();
       ch.view();
       test.check(); // as the check method is static it can be accessed without creating an object of a class.

 
    }
    
}
//// Access modifier restrictions in decreasing order:
//private
//default
//protected
//public
//i.e. private is more restricted then default and default is more restricted than protected and so on.