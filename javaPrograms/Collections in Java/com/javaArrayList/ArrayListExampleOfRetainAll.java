/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayList example of retainAll()
 */
public class ArrayListExampleOfRetainAll
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.retainAll(al2);
		System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
