import java.lang.Math;

public class Point {
    // Make the x, y, z variables (no values in them yet)
    int x;
    int y;
    int z;
   
    // Makes a 3D Point with the given (x, y, z) coordinates
    public Point(int initialX, int initialY, int initialZ) {
        x = initialX;
        y = initialY;
        z = initialZ;
    }
   
    // Makes a 2D Point with given (x, y) coordinates
    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
        // z-axis will be 0 because only using x and y coordinates
        z = 0;
    }
   
    // Moves point in 3D by adding x, y, z to dx, dy, and dz
    public void translate(int dx, int dy, int dz) {
        x += dx;
        y += dy;
        z += dz;
    }
   
    // Moves point in 2D by adding x, y to dx, dy
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
   
    // Calculates the Point's distance from origin
    public double distanceFromOrigin() {
        // Pythagorean Theorem
        double result = Math.sqrt(x * x + y * y + z * z);
        return result;
    }
   
    // default values for Point
    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }
   
    // Returns a point as a string in the (x, y, z) format
    public String toString() {
        return "(" + x  + ", " + y + ", " + z + ")";
    }
    
    // divides x, y, z by 2
    public void halve() {
        x /= 2; 
        y /= 2; 
        z /= 2;
    }
    
    // multiplies x, y, z by 2
    public void doubled() {
        x *= 2;
        y *= 2;
        z *= 2;
    }
}
