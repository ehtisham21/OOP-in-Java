class employee{
    private String emp_name;
    public void setname(String empname){
        emp_name =empname;
    }
    public String getname(){
        return emp_name;
    }
}
public class EncapsulationinJava {

    public static void main(String[] args) {
        employee em= new employee();
        em.setname("Alex");
        System.err.println(em.getname());
    }
    
}
