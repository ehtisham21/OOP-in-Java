//This Example is for Multi Level Inheritance
class first {
    //Constructor
  first() {
         System.out.println("\nI am First Class Constrcutor");
    }
   void out(){
        System.out.print("\n First Class Method");
   }
   
}
class second extends first{
    //Constructor
    second() {
         System.out.println("\nI am Second Class Constrcutor");
    }
    void in(){
        System.out.print("\n Second Class Method");
   }
}

class third extends second{
    //Constructor
    third() {
            System.out.println("\nI am Third Class Constrcutor");
       }
       void pr(){
           System.out.print("\n Third Class Method");
      }
}
public class MultiLevelInheritance {

    public static void main(String[] args) {
       first fir=new first();
       fir.out();
       second sec=new second();
       sec.out();
       sec.in();
       third thi=new third();
       thi.out();
       thi.in();
       thi.pr();
    }
    
}
