public class Car extends Vehicles {
    public Car(String brandName, int speed, String color) {
        super(brandName, 4, speed, color);
    }
    @Override
    public void showType(){
        System.out.println("Car");
    }
}
