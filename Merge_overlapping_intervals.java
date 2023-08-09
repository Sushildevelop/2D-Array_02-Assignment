package Practice.Array.TwoDArray.TwoDarray_1.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_overlapping_intervals {
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
        Arrays.sort(mat,(a,b)->a[0]-b[0]);
        int count=0;
        int i=0;
        while(i<n){
            while(i<n-1 && mat[i+1][0] <=mat[i][1]){
                mat[i+1][0]=mat[i][0];
                mat[i+1][1]=Math.max(mat[i][1], mat[i+1][1]);
                i++;
            }
            i++;
            count++;

        }
        System.out.println(count);
    }
}
