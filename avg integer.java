/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum/n);
	}
}
