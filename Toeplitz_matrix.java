package Practice.Array.TwoDArray.TwoDarray_1.Assignment;

import java.util.Scanner;

public class Toeplitz_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        System.out.println("Enter the input array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (mat[i][j] !=mat[i-1][j-1]){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
