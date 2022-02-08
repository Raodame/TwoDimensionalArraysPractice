public class TwoDimensionalArraysPractice {

    public static void main(String [] args){
        int[][] array2d = {{1,2,3},{4,5,6}};

    }

    //print 2D array
    public static void printArray(int[][] array){

        for (int x = 0; x < array.length; x++){
            System.out.print("[");
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(" " + array[x][y]);
                if (y < array[x].length - 1)
                    System.out.print(",");
            }
            System.out.println(" ]");
        }

    }

    //swap 2 rows in a 2D arrays
    public static void swapRows(int rowX, int rowY, int[][] array1){

        int[][] array2 = array1;
        array1[rowX] = array2[rowY];
        array1[rowY] = array2[rowX];

    }
}
