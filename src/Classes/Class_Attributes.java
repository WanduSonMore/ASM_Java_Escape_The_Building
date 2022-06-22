package Classes;

public class Class_Attributes {
    int x = 10;
    final int y = 5;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Class_Attributes myObj = new Class_Attributes();
        Class_Attributes myObj2 = new Class_Attributes();
        Class_Attributes myObj3 = new Class_Attributes();
        Class_Attributes myObj_person = new Class_Attributes();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
//        myObj2.y = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj2.y);
        myObj3.x = 100;
        System.out.println(myObj.x);  // Outputs 25
        System.out.println(myObj3.x); // Outputs 100
        System.out.println("Name: " + myObj_person.fname + " " + myObj_person.lname);
        System.out.println("Age: " + myObj_person.age);
    }

}
