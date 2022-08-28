//These are the requiremnts for Method Overriding:
                    //// 1) Same Method Name
                    //   2) Different Class
                    //   3) Same Argument
                    //           -Same No of Arguments
                    //           -Same Sequence of Arguments
                    //           -Same Type of Arguments
                    //   4) Inheritance
class bat{
void view(){
    System.out.println("I am First Method");
}}
class alp extends bat{
    void view(){
     System.out.println("I am Second Method");
}
}
public class RunTimePolymorphismMethodOverriding {

    public static void main(String[] args) {
        
        bat hh=new bat();
        hh.view();
        bat testt=new alp(); //bat refrence but alp object
        testt.view();
        alp tt=new alp(); //alp refrence and alp object
        tt.view();

    }
    
}