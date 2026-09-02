public class Circle {
    private double radius;
    private Point center;

    public Circle() {
        this.radius = 1;
        this.center = new Point();
    }

    public Circle(double radius) {
        //Todo  Implement
    }

    public Circle(double radius, Point center) {
        //Todo  Implement
    }

    public double getRadius() {
        return radius;
    }
    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        //Todo  Implement
    }
    public void setCenter(Point center) {
        this.center = center;
    }




    public double getCircumference(){
        //Todo  Implement
        return 0.0;   // This will make compiler happy
    }

    public double getArea(){
        //Todo  Implement
        return 0.0;   // This will make compiler happy
    }

    public boolean isInside(Point p){
        //Todo  Implement
        //This is a trap!
        return false;   // This will make compiler happy
    }

}
