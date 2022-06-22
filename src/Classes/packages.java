
package Classes;
import java.util.Scanner;
//import package.name.Class;   // Import a single class
//import package.name.*;   // Import the whole package


//public class packages {
//}
class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}

//package mypack;
class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
    }
}