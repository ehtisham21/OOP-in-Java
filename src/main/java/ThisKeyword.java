class check{
   private int id;
    public void setid(int id){
        this.id=id; // Simple this keyword is refrence variable that refers to the object and this.id refers the current class instance variable which is for the class object 
        //id=x;
    }
    public void getid(){
        System.out.println(id);   
    }
}
public class ThisKeyword {

    public static void main(String[] args) {
       check test=new check();
       test.setid(10);
        test.getid();
    }
    
}
