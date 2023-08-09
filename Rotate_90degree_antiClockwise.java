package Practice.Array.TwoDArray.TwoDarray_1.Assignment;

import java.util.Scanner;

public class Rotate_90degree_antiClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Array: ");
        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        System.out.println("Enter the input for 2-D array: ");
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int x=0;x<n/2;x++){
            for (int y=x;y<n-x-1;y++){
                // Store current cell in temp variable
                int temp=arr[x][y];
                // move values from right to top
                arr[x][y]=arr[y][n-1-x];
                // Move values from bottom to right
                arr[y][n-1-x]=arr[n-1-x][n-1-y];
                // Move values from left to bottom
                arr[n-1-x][n-1-y]=arr[n-1-y][x];
                // Assign temp to left
                arr[n-1-y][x]=temp;

            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
