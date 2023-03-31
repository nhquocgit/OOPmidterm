public class Q2Student extends Q2Person{
    private int numCourse;
    private int grade;
    public Q2Student(String name, String address){
        super(name, address);
    }
    @Override
    public void work(){
        System.out.println("Student"+super.getName()+"at"+super.getAddress());
    }
    
}
