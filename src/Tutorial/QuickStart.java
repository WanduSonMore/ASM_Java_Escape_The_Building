package Tutorial;

public class QuickStart {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(3 + 3);
        String name = "Andrew Morris";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);
        int myNum3 = 15;
        System.out.println(myNum3);
        myNum3 = 20;  // myNum is now 20
        System.out.println(myNum3);
        final int myNum4 = 15;
        System.out.println("Hello" + name);
        System.out.println(myNum + myNum3);
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
//        myNum4 = 20;  // will generate an error: cannot assign a value to a final variable
//        int myNum = 5;
//        float myFloatNum = 5.99f;
//        char myLetter = 'D';
//        boolean myBool = true;
//        String myText = "Hello";
        byte myNum5 = 100;
        int divnum = 5 % 2;
        System.out.println(divnum);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        String s1 = "10";
        String s2 = "20";
        String s3 = s1 + s2;
        System.out.println(s3);
        String how_to_put_quatations_in_text = "We are the so-called \"Vikings\" from the north.";
        System.out.println(how_to_put_quatations_in_text);
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
        System.out.println(Math.sqrt(64));
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        int big_num = 10;
        int small_num = 9;
        System.out.println(big_num > small_num);// returns true, because 10 is higher than 9
        System.out.println(10 == 15);
    }
}
