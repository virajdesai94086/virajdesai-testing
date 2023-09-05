//w.a.p to iterate through all elements in array list

package com.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program21 
{
  public static void main(String[] args) 
  {
   ArrayList<String> fruits = new ArrayList<String>();
   fruits.add("mango");
   fruits.add("apple");
   fruits.add("strawberry");
   System.out.println("my fvt. fruits are"+fruits);
   System.out.println("\nusing listiterator..\n");
   ListIterator<String> itrate = fruits.listIterator();
   while(itrate.hasNext())
   {
	   System.out.println(itrate.next());
   }
   
  }   
}
