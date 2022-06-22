package Tutorial;

public class if_else {
    public static void main(String[] args) throws Exception {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
