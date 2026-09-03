public class Rectangle {
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point lower, Point upper){
        upperLeft = upper;
        bottomRight = lower;
    }

    public Rectangle(Point upper, double width, double height){
        upperLeft = upper;
        bottomRight = new Point(upper.getX() + width, upper.getY() - height);
    }

    public double getHeight(){
        return Math.abs(bottomRight.getY() - upperLeft.getY());
    }

    public double getWidth(){
        return Math.abs(bottomRight.getX() - upperLeft.getX());
    }

    public void setHeight(double newHeight){
        bottomRight = new Point(bottomRight.getX(), upperLeft.getY() - newHeight);
    }

    public void setWidth(double newWidth){
        bottomRight = new Point(upperLeft.getX() + newWidth, bottomRight.getY());
    }


    public static Rectangle rectangleOverlap(Rectangle one, Rectangle two){ // Does not work
        Rectangle leftmost = null;
        Rectangle highest = null;
        Rectangle rightmost = null;
        Rectangle lowest = null;
        if (one.upperLeft.getX() >= two.upperLeft.getX()){
            System.out.println("one.upperleft: " + one.upperLeft);
            System.out.println("two.upperleft: " + two.upperLeft);
            leftmost = two;
            rightmost = one;
        }
        else if (two.upperLeft.getX() >= one.upperLeft.getX()){
            leftmost = one;
            rightmost = two;
        }
        if (one.upperLeft.getY() >= two.upperLeft.getY()){
            highest = one;
            lowest = two;
        }
        else if (two.upperLeft.getY() >= one.upperLeft.getY()){
            highest = two;
            lowest = one;
        }
        System.out.println("\n\nleftmost:\n" + leftmost);
        System.out.println("\n\nrightmost:\n" + rightmost);
        System.out.println("\n\nhighest:\n" + highest);
        System.out.println("\n\nlowest:\n" + lowest);
        double overlapWidth = leftmost.bottomRight.getX() - rightmost.upperLeft.getX();
        double overlapHeight = lowest.upperLeft.getY() - highest.bottomRight.getY();
        if ((overlapHeight <= 0) || (overlapWidth <= 0)){
            return null;
        }
        return new Rectangle(new Point(rightmost.upperLeft.getX(), leftmost.upperLeft.getY()), overlapWidth, overlapHeight);
    }

    public String toString(){
        return "Width: " + getWidth() + "\nHeight: " + getHeight() + "\nUpper left point: " + upperLeft + "\nBottom right point: " + bottomRight;
    }
}
