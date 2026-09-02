public class GeometryDriver {

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(3, 4));
        Rectangle r2 = new Rectangle(new Point(0, 0), 3, 5);
        Circle c2;

        c2 = new Circle(-4);
        System.out.println(c2);

        try{
            c2.setRadius(-4);
        }
        catch (BadRadiusException e){
            System.out.println("Radius can't be negative");
        }



//        System.out.println(c1);
//        System.out.println(r1);
//        System.out.println(r2);
    }
}
