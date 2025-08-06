
import java.util.*;

class searchTwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        //input 
        //row 0->rows-1
        for (int i = 0; i < rows; i++) {
            //columns 0->cols-1
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element in: " + i + " " + j);
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //search
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Number is found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}
