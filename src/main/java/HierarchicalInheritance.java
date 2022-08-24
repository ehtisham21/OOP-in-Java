//This Example is for Hirerachical Inheritance
class A {
//Constructor
     A() {
         System.out.println("\nI am A Class Constrcutor");
    }
  
   void out(){
        System.out.print("\n A Class Method");
   }
   
}
class B extends A{
    //Constructor
      B() {
         System.out.println("\nI am B Class Constrcutor");
    }
  
    void in(){
        System.out.print("\n B Class Method");
   }
}

class C extends A{
    //Constructor
  C() {
         System.out.println("\nI am C Class Constrcutor");
    }
  
    void pr(){
        System.out.print("\n C Class Method");
   }
}
public class HierarchicalInheritance {

    public static void main(String[] args) {
       A a=new A();
       a.out();
       B b=new B();
       b.out();
       b.in();
       C c=new C();
       c.out();
       c.pr();
    }
    
}
