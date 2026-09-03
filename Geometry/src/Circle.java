public class Circle {
    private double radius;
    private Point center;

    public Circle() {
        this.radius = 1;
        this.center = new Point();
    }

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }
    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public boolean isInside(Point p){ // I know this only works if your point is adjacent with the center, I can't think of anything else right now
        if ((p.getX() > (center.getX() - radius)) && ((p.getX() < (center.getX() + radius)))){
            return true;
        }
        if ((p.getY() > (center.getY() - radius)) && ((p.getY() < (center.getY() + radius)))){
            return true;
        }
        return false;
        //This is a trap!
    }

    public String toString(){
        return "radius: " + radius + "\nCenter: " + center;
    }

}
