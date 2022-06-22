package Tutorial;

public class break_continue {
    public static void main(String[] args) throws Exception {
        //This is a break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("===========");
        //This is a continue
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
    }

}
