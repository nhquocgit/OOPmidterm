public abstract class Vehicles {
    private String brandName;
    private int size;
    private int speed;
    private String color;
    public Vehicles(String brandName, int speed, String color){
        this.brandName=brandName;
        if (speed==1||speed==2||speed==4){
        this.speed=speed;
        }
        else System.out.print("Error");
        this.color=color;
}
    public Vehicles(String brandName, int size, int speed, String color) {
        this.brandName = brandName;
        this.size = size;
        if (speed==1||speed==2||speed==4){
            this.speed=speed;
        }
        else {System.out.println("Error");}
        this.speed = speed;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void showType();
}
