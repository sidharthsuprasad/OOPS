//program to find matrix multiplication
//P S SIDHARTH
//49


import java.util.Scanner;
class Matrixmultiplication
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the no of rowsA:");
int rowA =sc.nextInt();
System.out.print("Enter colns of mA and row of mB:");
int colnA =sc.nextInt();
int rowB =colA;
System.out.print("Enter colns of mB:");
int colB = sc.nextInt();
int[][]mA = new int[rowA][colA];
int[][]mB = new int[rowB][colB];
int[][]r = new int[rowA][colB];
System.out.println("Enter elements of mA");
for(int i=0;i<rowA;i++)
{
for(int j=0;i<colA;j++)
{
mA[i][j]=sc.nextInt();
}
}
System.out.println("Enter elements of mB");
for(int i=0;i<rowB;i++)
{
for(int j=0;i<colB;j++)
{
mB[i][j]=sc.nextint();
}
}
for(i=0;i<rowA;++i)
{
for(j=0;j<colB;++j)
{
for(int k=0;k<colA;++k)
{
r[i][j]+=mA[i][k]*mB[k][j];
}
}
}
System.out.println("result");
for(i=0;i<rowA;++i)
{
for(j=0;j<colB;++j)
{
System.out.println("r[i][j]+" ");
}
}
}
System.out.println();
}
}
}
