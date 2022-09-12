class Aa {
        int a=10;
        }

class Bb extends Aa{
    int a=20;
    void show(int a){
        System.out.println(a); //30 output
        System.out.println(this.a); //20 outpur
        System.out.println(super.a); // 10 output
    }
}
public class SuperKeyword {

    public static void main(String[] args) {
        Bb testing= new Bb();
        testing.show(30);
    }
    
}
