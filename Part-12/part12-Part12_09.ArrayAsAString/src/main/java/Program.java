
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix1 = new int[rows][columns];
        matrix1[0][1] = 5;
        matrix1[1][0] = 3;
        matrix1[1][2] = 7;
        System.out.println(arrayAsString(matrix1));

        int[][] matrix2 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix2));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder returnString = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                returnString.append(array[row][col]);
            }
            returnString.append("\n");
        }
        return returnString.toString();
    }
}
