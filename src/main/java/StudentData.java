public class StudentData {
    String name;
        int age;
        float cgpa;
    public void details(String n, int a, float c){
        name=n;
        age=a;
        cgpa=c;
    }
   public void showdata(){
       System.out.println("The Student Data is"+" Name: "+name+" Age: "+age+" CGPA: "+cgpa);
   }

    StudentData(int a,int b) {
        int aa=a;
        int bb=b;
        System.out.println(" Addition is: "+(a+b));
        System.out.println(" Multiplication is: "+(aa*bb));
        System.out.println("I am Constructor");
    }
   
}