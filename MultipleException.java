import static flowEasy.Use.*;
public class MultipleException 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int var1 = 0, var2 = 0, var3 = 0;
		var1 = rand(10);
		var2 = rand(10);
		try
		{
			var3 = var1/var2;
			a[var2] = var3;
			PLN("Quotient = "+var3);
			PLN("a["+var2+"] = "+a[var2]);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
		PLN("\nThis will execute without fail.\n");
	}

}
