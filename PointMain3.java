public class PointMain3 {
    public static void main(String[] args) {
        // Create new 3D Point
        Point p1 = new Point(12, -8, 6);
        // Create new 2D Point
        Point p2 = new Point(31, 61, 68);
        // Create new Point (with default values - (0, 0))
        Point p3 = new Point();
        // Set p3's x-value 
        p3.x = 72;
        // Set p3's y-value 
        p3.y = 42;
        // Set  p3's z-value
        p3.z = 21;
        // Print out the initial points
        // .toString() formats the points in a point format (x, y, z)
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
       
        // Move p1 right __, up __
        p1.translate(62, 8, 54);
        // Print p1
        System.out.println("p1 translated: " + p1.toString());
        // Move p2 right __, up __, forward __ 
        p2.translate(-53, -94, -13);
        // Print p2
        System.out.println("p2 translated: " + p2.toString());
        // Move p3 right , up , forward 
        p3.translate(46, -67, 78);
        // Print p3
        System.out.println("p3 translated: " + p3.toString());
       
        // Check the distance from origin of each Point
        double a = p1.distanceFromOrigin();
        double b = p2.distanceFromOrigin();
        double c = p3.distanceFromOrigin();
       
        // Print each Point's distance from the origin
        System.out.println("Distance of p1 from origin: " + a);
        System.out.println("Distance of p2 from origin: " + b);
        System.out.println("Distance of p3 from origin: " + c);
       
        // Compare the points to see which one is closer to the origin
        if (a < b && a < c) {
            System.out.println("p1 is closer to the origin.");
        } else if (b < a && b < c) {
            System.out.println("p2 is closer to the origin.");
        } else if (c < a && c < b) {
            System.out.println("p3 is closer to the origin.");
        } else {
            System.out.println("All points are the same distance from the origin.");
        }
        
        // halves x, y, z values by 2
        p1.halve();
        System.out.println("p1 halved: " + p1);
        p2.halve();
        System.out.println("p2 halved: " + p2);
        p3.halve();
        System.out.println("p3 halved: " + p3);
        
        // multiplies x, y, z values by 2
        p1.doubled();
        System.out.println("p1 doubled: " + p1);
        p2.doubled();
        System.out.println("p2 doubled: " + p2);
        p3.doubled();
        System.out.println("p3 doubled: " + p3);
    }
}
