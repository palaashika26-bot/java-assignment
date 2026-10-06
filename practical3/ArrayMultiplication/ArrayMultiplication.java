import java.util.*;
public class ArrayMultiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of rows of matrix 1 : ");
        int rows1 = sc.nextInt();
        System.out.print("Please enter the number of cols of matrix 1 : ");
        int cols1 = sc.nextInt();
        System.out.print("Please enter the number of rows of matrix 2 : ");
        int rows2 = sc.nextInt();
        System.out.print("Please enter the number of cols of matrix 2 : ");
        int cols2 = sc.nextInt();
        
        if(cols1!=rows2){
            System.out.println("ERROR : Rows of matrix 1 not equal to Columns of matrix 2");
            return;
        }else{
            int mat1[][] = new int[rows1][cols1];
            int mat2[][] = new int[rows2][cols2];

            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols1; j++){
                    System.out.print("Please enter element of matrix 1 at position : " + i + "," + j + " : ");
                    mat1[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<rows2; i++){
                for(int j=0; j<cols2; j++){
                    System.out.print("Please enter element of matrix 2 at position : " + i + "," + j + " : ");
                    mat2[i][j] = sc.nextInt();
                }
            }

            int result[][] = new int[rows1][cols2];
            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols2; j++){
                    for(int k=0; k<cols1; k++){
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            for(int i=0; i<rows2; i++){
                for(int j=0; j<cols2; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}