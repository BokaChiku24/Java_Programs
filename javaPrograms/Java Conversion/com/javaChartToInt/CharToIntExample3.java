/**
 * Java Convert char to int
 */
package com.javaChartToInt;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert char to int
 * @implNote -> We can convert char to int in java using various ways. If we
 *           direct assign char variable to int, it will return ASCII value of
 *           given character.
 * @implNote -> Java char to int Example: String.valueOf()
 */
public class CharToIntExample3
{
	public static void main(String[] args)
	{
		char ch = '1';
		int number = Integer.parseInt(String.valueOf(ch));
		System.out.println("Number is: " + number);
	}
}
