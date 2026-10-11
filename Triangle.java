import java.util.Scanner;
/**
 * TriangleDriver for MidTerm Exam Prep
 * @author Rico Cassoni, rcassoni@sdccd.edu
 * @version 1.3
 * @since 2/10/2024
 */
public class Triangle { //Change to Main for Replit or MyProgram for codeHS
    String name;
    double base, height;
    
    public static void main(String args[]) {
        
        System.out.println("First Triangle");
        System.out.println("--------------");
        Triangle triangle1 = new Triangle();
        triangle1.writeOutput();
        triangle1.setName("Tri1");
        triangle1.setBase(5.0);
        triangle1.setHeight(6.0);
        triangle1.writeOutput();
        
        System.out.println("Second Triangle");
        System.out.println("--------------");
        Triangle triangle2 = new Triangle("Tri2",7.3,8.3);
        triangle2.writeOutput();
        
        System.out.println("Third Triangle");
        System.out.println("--------------");
        Triangle triangle3 = new Triangle();
        triangle3.readInput(); // set name to Tri3, base to 8.5, and height to 10.3
        triangle3.writeOutput();
    }  //end main

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {
        final String uk= "Unknown";
        
        name = uk;
        base = 0.0;
        height = 0.0;
    }
    
    public Triangle(String inName, double inBase, double inHeight){
        this.name = inName;
        this.base = inBase;
        this.height = inHeight;
    }
    
    public void writeOutput(){
        final String triName = "Triangle name is: %s %n";
        final String triBase = "Triangle base is: %.1f %n";
        final String triHeight = "Triangle height is: %.1f %n";
        final String triArea = "Triangle area is: %.1f %n%n";
        
        System.out.printf(triName, name);
        System.out.printf(triBase, base);
        System.out.printf(triHeight, height);
        System.out.printf(triArea, getArea());
    }
    
    public void readInput(){
        String triNameIn = "What is the triangle's name: ";
        String tribaseIn = "What is the triangle's base: ";
        String triheightIn = "What is the triangle's height: ";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print(triNameIn);
        this.name = keyboard.nextLine();
        
        System.out.print(tribaseIn);
        this.base = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print(triheightIn);
        this.height = keyboard.nextDouble();
        keyboard.nextLine();
        
        keyboard.close();
        System.out.println();
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setBase(double newBase){
        this.base = newBase;
    }
    
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    
    public double getArea(){
        return (height*base*0.5);
    }
}