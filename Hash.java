package hash;

public class Hash 
{
	public String toString()
	{
		return getClass().getName()+"ROHIT"+Integer.toHexString(hashCode());
	}
	public void showHash()
	{
		System.out.println("########");
	}
}
