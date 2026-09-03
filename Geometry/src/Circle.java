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
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);   // This will make compiler happy
    }

    public boolean isInside(Point p){

        //This is a trap!
        return false;   // This will make compiler happy
    }
    public String toString(){
        return "radius: " + radius + "\nCenter: " + center;
    }

}
