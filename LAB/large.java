//P S SIDHARTH
//49 CS(AI)
//
//To print the largest number
import java.lang.*;
import java.util.*;
class large
{
    public static void main(String args[]) 
    {
        int i,n,large=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=s1.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++) 
        {
            int no=s1.nextInt();
            if(large<no)
            {
                large=no;
            }
        }
        System.out.println("The largest number is "+large);
    }
}
