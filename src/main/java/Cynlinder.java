public class Cynlinder extends Circle {
    private double height=1;

    Cynlinder() {
    }

    Cynlinder(double height) {
        this.height = height;
    }

    Cynlinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    private double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    private double getV(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + " and color= "
                +getColor()
                +" and height= "
                +getHeight()
                +" and V= "
                + getV();
    }
}
