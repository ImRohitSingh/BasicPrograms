package flowEasy;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class Use 
{
	static Scanner sc = new Scanner(in); 
	static Random r = new Random();
	public static void PLN(String s)
	{
		out.println(s);
	}
	public static void P(String s)
	{
		out.print(s);
	}
	public static void O(Object o)
	{
		out.println(o);
	}
	public static int I()
	{
		return sc.nextInt();
	}
	public static float F()
	{
		return sc.nextFloat();
	}
	public static double D()
	{
		return sc.nextDouble();
	}
	public static String S()
	{
		return sc.nextLine();
	}
	public static char C()
	{
		char c = ' ';
		try
		{
			c = (char)System.in.read();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
	}
	public static int rand(int a)
	{
		return r.nextInt(a);
	}
	
}
