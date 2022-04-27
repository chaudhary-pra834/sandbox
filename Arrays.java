public class Arrays {
    public static void main(String[] args) {

        int[] array = new int[10];
        int arraySecond[] = new int[10];


        boolean[] booleanArray = new boolean[1000];
        //
        double[] doubleArray = new double[40];
        // cell size
        Dog[] dogArray = new Dog[50];
        // cell size
        // boolean -> 1 bit
        // char -> 16 bits
        // double -> 64 bits
        // int -> 32 bits

        // data-types -> primitives, classes
        // SYNTAX
        // data-type[] objectName = new data-type[size]

        // Data Structure ,  Algorithms
        // performance index
        // time complexity, space complexity
        // data structures -> read, write, update, delete

        // instantiation
        int[] arr = new int[100];

        // array literal
        int[] arrayLiteral = new int[]{1,2,3,4,5,6,7,8,9,10};
        // 1 2 3 4 5 6 7 8 9 10
        // 0 1 2 3 4 5 6 7 8 9

        System.out.println(arrayLiteral[9]);
        System.out.println(arrayLiteral[0]);

//        arr = new int[1000];

        // update array
        for (int i=0;i<100;i++) {
            // arr[99] = 99
            arr[i] = i;
        }

        // 0 1 2 3 4 5 6 7 8 9 ..... 97 98 99

        arr[99] = -1;

        // read array
//        for (int i=0;i<100;i++) {
//            System.out.println(arr[i]);
//        }


//        System.out.println(arr[]);
    }
}
