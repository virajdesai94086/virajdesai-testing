//w.a.j.p to print pattern

/*
 1
 01
 101
 01010
 101010
 */

package com.java;

public class Program8 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
