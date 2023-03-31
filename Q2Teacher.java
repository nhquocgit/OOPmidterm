public class Q2Teacher extends Q2Person {
    private int numCourse;
    private String course;
    public Q2Teacher(String name, String address){
        super(name, address);
    }
    @Override
    public void work(){
        System.out.println("Teacher"+super.getName()+"at"+super.getAddress());
    }
}
