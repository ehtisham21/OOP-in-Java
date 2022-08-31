interface test1{
     abstract void login();
}
interface test2{
     abstract void register();
}
class testing implements test1,test2{
    public void login(){
        System.out.println("I am Login Method in Testing Class");
    }
     public void register(){
        System.out.println("I am Register Method in Testing Class");
    }
}
public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {
       testing tt=new testing();
       tt.register();
       tt.login();
    }
    
}
