package Tutorial;

public class for_loop {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            // code block to be executed
            System.out.println(i);

        }
        System.out.println("===========");
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }
        System.out.println("===========");
        //for-each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            // code block to be executed
            System.out.println(i);
        }
    }
}
