//program to find the frequency of characters in a string
//P S SIDHARTH
//Roll no:49
import java.util.*;
class frequency
{
	public static void main(String args[])
		{  
		   int count=0;
			Scanner S=new Scanner(System.in);
			System.out.println("enter the string");
			String sc;
			sc=S.nextLine();
			sc.toUpperCase();
			System.out.println("enter word to check");
		   char c= S.next().charAt(0);
		   int l=sc.length();
		   for(int i=0;i<l;i++)
		   {
		   	if(sc.charAt(i)== c)
		   	{
		   	 
		   	
		   		count++;
		   	
		   	}
		   }
		   System.out.println("the frequency of character is"+count);
		   S.close();
		   }
}
