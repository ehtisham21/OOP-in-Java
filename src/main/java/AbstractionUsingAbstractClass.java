abstract class reglog{
    abstract void login();
      void register(){
          System.out.print("Registered Succssfully ");
    }
}

class login extends reglog{
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
