package Classes;

public class modifiers {
    // Final
    final int x = 10;
    final double PI = 3.14;

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        modifiers myObj = new modifiers();
//        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        modifiers myObj2 = new modifiers(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method
    }
}
// Code from filename: Main.java
// abstract class
abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}