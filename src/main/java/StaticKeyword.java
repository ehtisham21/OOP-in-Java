//Static Keywor can be used with Variable(Class Level), Methods, Block and Inner Class. But Static Variable cannot be local varaible or cannot be outer class.
class alex{
   //Static Variable
   static int a=22; // Static variablle can only be used in class level variables.
 
   void m1(){
    //static int b=20; //If we use static in local variables it will given error
    }
   
   
   //Static Methods
   static void dis(){
       System.out.println("Hello I am Static Method");
       System.out.println(a);// Static Method can only access Static Data. It cannot access nonstatic data or you can say instance variable.
   }
   
}

public class StaticKeyword {

    public static void main(String[] args) {
        System.out.println(alex.a);//Static Variables belongs to class not object
        alex.dis(); //Static Method belongs to class not object
    }
    
}
