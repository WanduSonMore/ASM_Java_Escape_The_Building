package Methods;

public class method_parameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " Refsnes");
        System.out.println(fname + " is " + age);
        System.out.println("============");
    }
    static int myMethod2(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        System.out.println("===========");
        int z = myMethod2(5, 3);
        System.out.println(z);
        System.out.println("===========");
        checkAge(20);
    }
}
