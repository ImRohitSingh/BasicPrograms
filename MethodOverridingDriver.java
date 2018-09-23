
public class MethodOverridingDriver 
{
	public static void main(String[] args) 
	{
		Bird b = new Bird();
		b.flyingStatus();
		Penguin p = new Penguin();
		p.flyingStatus();
		/*b = new Penguin();
		b.flyingStatus(); */
	}

}
