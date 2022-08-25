//These are the requiremnts for Method Overloading:
                    //// 1) Same Method Name
                    //   2) Same Class
                    //   3) Different Argument
                    //           -Differe No of Arguments
                    //           -Different Sequence of Arguments
                    //           -Different Type of Arguments




public class CompileTimePolymorphismMethodOverloading {
void view(String name ,int roll_no){
    System.out.println("I am First Method");
    System.out.println("Details are "+name+roll_no);
}

void view(int roll_no ,String name){
     System.out.println("I am Second Method");
    System.out.println("Details are "+roll_no+name);
}

void view(int name ,int roll_no){
     System.out.println("I am Third Method");
    System.out.println("Details are "+name+roll_no);
}
    public static void main(String[] args) {
        CompileTimePolymorphismMethodOverloading details= new CompileTimePolymorphismMethodOverloading();
        details.view("Joe", 22);
        details.view(23, "Alex");
         details.view(23, 24);
        
    }
    }


