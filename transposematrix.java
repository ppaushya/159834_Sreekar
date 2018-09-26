package day3demo.org.cap;
import java.util.Scanner;

public class transposematrix {


public static void main(String[] args) {

    // TODO Auto-generated method stub

    Scanner scan=new Scanner(System.in);

    int[][] arr=new int[3][3];

    int[][] arr1=new int[3][3];

    System.out.print("enter the 9 values of matrix ");

    for(int i=0;i<3;i++)

    {

           for(int j=0;j<3;j++)

                 arr[i][j]=scan.nextInt();

    }

    for(int i=0;i<3;i++)

    {

           for(int j=0;j<3;j++) {

                 arr1[i][j]=arr[j][i];

           }

}

    for(int i=0;i<3;i++)

    {

           for(int j=0;j<3;j++)

           {

                        System.out.print(" "+arr1[i][j]+"\t");

           }

           System.out.println();

}
}
}