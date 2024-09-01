import java.util.Scanner;

class Cylinder {
    /*this class has attributes for radius and height and
     includes a method area() to calculate the surface 
     area of the cylinder.
    */
    protected double radius;
    protected double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the area
    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

class CylinderVol extends Cylinder {
    /* 
     this class extends cylinder and adds a method volumn()
     to calculate the volumn of the cylinder.
    */
    public CylinderVol(double radius, double height) {
        super(radius, height); // Call the constructor of Cylinder
    }

    // Method to calculate the volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //this method is for you to enter the radius and height of the cylinder.
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // this method creates an instance of CylinderVol, which recieves the radius and height from the user.
        CylinderVol cylinder = new CylinderVol(radius, height);

        // Calls the area() and volume() methods and displays the results with two decimal places.
        double area = cylinder.area();
        double volume = cylinder.volume();

        System.out.printf("Area of the cylinder: %.2f%n", area);
        System.out.printf("Volume of the cylinder: %.2f%n", volume);

        // this is to close the scanner
        scanner.close();
    }
}