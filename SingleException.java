import static flowEasy.Use.*;
public class SingleException 
{
	public static void main(String[] args) 
	{
		int var1 = 0, var2 = 0, var3 = 0;
		PLN("Enter 2 numbers: ");
		var1 = I();
		var2 = I();
		PLN("Enter a charater: ");
		char c = C();
		PLN("Enter a string: ");
		S();S();
		String s = S();
		try
		{
			var3 = var1/var2;
			PLN("This may or may not execute!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		PLN("var3 = "+var3);
		PLN("c = "+c);
		PLN("s = "+s);
	}

}
