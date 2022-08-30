abstract class reglog{
    abstract void login();
    abstract void register();
}

class login extends reglog{
        void register(){
          System.out.print("Registered Succssfully ");
    }
    void login(){
          System.out.print("\n  User Login");
    }
  
}
public class AbstractionUsingAbstractClass {

    public static void main(String[] args) {
     login lo= new login();
     lo.register();
     lo.login();
    }
    
}
