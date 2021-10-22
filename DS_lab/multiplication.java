// import java.util.*;
// public class multiplication{
//     public static void main(String args[]){
//         int r1, c1, r2, c2;
//         Scanner in = new Scanner(System.in);
//         r1 = in.nextInt();
//         c1 = in.nextInt();
//         r2 = in.nextInt();
//         c2 = in.nextInt();
//         matrix M = new matrix(r1,c1);
//         M.ipMatrix(r1,c1);
//         matrix N = new matrix(r2,c2);
//         N.ipMatrix(r2,c2);
//         in.close();
//     }
// }
// class matrix{
//     int [][] mat;
//     int r,c;
//     matrix(int row, int col){
//         r = row;
//         c = col;
//         mat = new int [row][col];
//     }
//     void ipMatrix(int row, int col){
//         Scanner sc = new Scanner(System.in);
//         int i,j;
//         int r = row, c = col;
//         for (i = 0; i < r; i ++){
//             for (j = 0; j < c; j++){
//                 mat[j][i] = sc.nextInt();
//             }
//         }
//         //return mat;
//         sc.close();
//     }
// } 
import java.util.*;
 public class multiplication
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int order;
		System.out.println("Matrix Multiplication of same    order");
		System.out.print("Enter the order: ");
		order = read.nextInt();
		Matrix A = new Matrix(order);
		Matrix B = new Matrix(order);
		System.out.println("Enter the elements of 1st Matrix");
		A.readMat(read);
		System.out.println("Enter the elements of 2nd Matrix");
		B.readMat(read);
		Matrix C = A.matMultipy(B);
		System.out.println("1st Matrix");
		A.printMat();
		System.out.println("2nd Matrix");
		B.printMat();
		System.out.println("Product Matrix");
		C.printMat();
		read.close();
	}
 }
class Matrix
{
	int mat[][];
	int row, col;
	
	Matrix()
	{
		mat = null;
		row = col = 0;
	}
	Matrix(int order)
	{
		mat = new int[order][order];
		row = col = order;		
	}
	void readMat(Scanner read)
	{
		for(int r = 0; r < row; r++)
			for(int c = 0; c < col; c++)
				mat[r][c] = read.nextInt();
	}
    void printMat()
	{
		for(int r = 0; r < row; r++)
		{
			for(int c = 0; c < col; c++)
				System.out.print(mat[r][c] + " ");
			System.out.println();
		}
	}
	Matrix matMultipy(Matrix m)
	{
		Matrix prod = new Matrix(this.row);
		for(int i = 0; i <this.row; i++)
			for (int j = 0; j <this.col; j++)
			{
				prod.mat[i][j] = 0;
				for(int k = 0; k <this.row; k++)
					prod.mat[i][j] = prod.mat[i][j] + this.mat[i][k] * m.mat[k][j];				
			}
		return prod;
	}
}