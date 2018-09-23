
class Eagle implements Bird,Bird2
{
	public void flyingStatus()
	{
		System.out.println("Can fly!");
		//Bird.def = 11;
		System.out.println(Bird.def);
	}
	public void runningStatus()
	{
		System.out.println("Cannot Run!");
		System.out.println(Bird.def);
	}
}