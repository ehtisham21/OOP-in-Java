class SimpleInheritance {
    void parent(){
        System.out.println("I am the Parent Class");
    }
}

class student extends SimpleInheritance{
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
