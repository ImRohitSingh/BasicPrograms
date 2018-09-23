
public class Dove implements Bird3,Bird2 
{
	public void flyingStatus()
	{
		System.out.println("Can fly!");
		//Bird.def = 11;
		System.out.println(Bird3.def);
	}
	public void runningStatus()
	{
		System.out.println("Cannot Run!");
		System.out.println(Bird3.def);
	}
	public void birdType()
	{
		System.out.println("Herbivore!");
		System.out.println(Bird3.def);
	}
}
