// We can use final keyword with variables, methods and classes
 //Final Keyword in Class
//When we want that no one will inhert the class so we use final keyword 
final class hello{
      //Final Keyword in Method
    final void m1(){//If we don't want to override method we use final keyword
        System.out.println("Hello I am M1 Method in Hello Class");
    }
}
class bye extends hello{ //Hello Class cannot be inherited because we have used final keyword in  hello class
void m1(){
        System.out.println("Hello I am M1 Method in Bye Class");
    }
}
public class FinalKeyword {

    public static void main(String[] args) {
    //Final Keyword in Varaible 
    //int o=10; // o value will be changed when add 20 in the next statement but if we don't want to change the value of o we will use final keyword
    final int o=10; //value of o cannot be changed because we used final keyword
    //o=o+20;
    System.out.println(o);
    
    
    }
    
}
