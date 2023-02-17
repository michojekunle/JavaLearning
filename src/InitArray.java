package src;

public class InitArray {
    public static void main(String[] args) {
//        Declare variables and initialize it with an array object
//        int[] array = new int[10]; // create the array object
//        int[] array = { 12, 13, 14, 15, 18, 19, 23 };
        final int ARRAY_LENGTH = 10; //Declare Constant
        int[] array = new int[ARRAY_LENGTH];
        int total = 0;

        for(int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s%n", "Index", "Value"); //Column Headings

        //output each array element's value
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
            System.out.printf("The total of the array elements: %d%n", total);
        }
    }
} // end class initArray
