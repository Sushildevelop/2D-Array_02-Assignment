package Practice.Array.TwoDArray.TwoDarray_1.Assignment;

import java.util.Scanner;

public class Multiply_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Array: ");
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
        System.out.println("Second Array: ");
        System.out.println("Row: ");
        int n1= sc.nextInt();
        System.out.println("Column: ");
        int m1=sc.nextInt();
        System.out.println("Enter the input for 2-D array");
        int arr1[][]=new int[n1][m1];
        for (int i=0;i<n1;i++){
            for (int j=0;j<m1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        if (m!=n1){
            System.out.println("Invalid input");
            return;
        }
        int ans[][]=new int[n][m1];
        for (int i=0;i<n;i++){
            for (int j=0;j<m1;j++){
                for (int k=0;k<m;k++){
                    ans[i][j]+=(arr[i][k]*arr1[k][j]);

                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m1;j++){
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
