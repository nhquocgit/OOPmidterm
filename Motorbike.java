public class Motorbike extends Vehicles {
    public Motorbike(String brandName, int speed, String color) {
        super(brandName, 2, speed, color);
    }
    @Override
    public void showType(){
        System.out.println("Motorbike");
    }
}
