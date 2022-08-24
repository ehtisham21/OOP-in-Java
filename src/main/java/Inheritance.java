//This Example is for Single Inheritance
class SimpleInheritance {
    //Constructor
    SimpleInheritance() {
         System.out.println("\nI am Parent Class Constrcutor");
    }
    void parent(){
        System.out.println("I am the Parent Class");
    }
}

class student extends SimpleInheritance{
     //Constructor
    student() {
         System.out.println("\nI am Child Class Constrcutor");
    }
    void child(){
        System.out.println("I am the Child Class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        student test=new student();
        test.parent();
        
    }
    
}
