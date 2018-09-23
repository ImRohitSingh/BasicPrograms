
public class Sample 
{
	public String toString()
	{
		return "I am an object of Sample class with address @"+Integer.toHexString(hashCode());
		//return "@"+hashCode();
	}
}
