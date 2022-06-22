package Classes;

public class class_methods {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    // Main method
    public static void main(String[] args) {
        myMethod();
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        class_methods myObj = new class_methods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
        class_methods myCar = new class_methods();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}

// Outputs "Hello World!"
// The car is going as fast as it can!
// Max speed is: 200
