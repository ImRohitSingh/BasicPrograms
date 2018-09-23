package Star;

public class Stars 
{
	public String toString()
	{
		return getClass().getName()+"ROHIT"+Integer.toHexString(hashCode());
	}
	public static void showStar()
	{
		System.out.println("**********");
	}
}
