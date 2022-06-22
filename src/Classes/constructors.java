package Classes;

public class constructors {
    int x;  // Create a class attribute
    int modelYear;
    String modelName;

    // Create a class constructor for the Main class
    public constructors(int y, int year, String name) {
        x = y;  // Set the initial value for the class attribute x
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        constructors myObj_Car = new constructors(5, 1969, "Mustang"); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj_Car.x); // Print the value of x
        System.out.println(myObj_Car.modelYear + " " + myObj_Car.modelName);
    }
}

// Outputs 5
// Outputs 1969 Mustang
