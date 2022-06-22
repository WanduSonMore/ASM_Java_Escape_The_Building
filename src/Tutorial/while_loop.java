package Tutorial;

public class while_loop {
    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i <= 5) {
            // code block to be executed
            System.out.println(i);
            i++;
        }
        System.out.println("===========");
        int j = 0;
        do {
            // code block to be executed
            System.out.println(j);
            j++;
        }
        while (j < 5);
    }
}
