public class Bicycle extends Vehicles {
    public Bicycle(String brandName, int speed, String color) {
        super(brandName, 1, speed, color);
    }
    @Override
    public void showType(){
        System.out.println("Bicycle");
    }
}
