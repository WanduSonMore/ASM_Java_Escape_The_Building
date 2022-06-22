package Tutorial;

public class array {
    public static void main(String[] args) throws Exception {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //Access the Elements of an Array
        System.out.println(cars[0]);
        System.out.println("===========");
        //Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println("===========");
        //Array Length
        System.out.println(cars.length);
        System.out.println("===========");
        //Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("===========");
        //Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("===========");
        //Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
        System.out.println("===========");
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
