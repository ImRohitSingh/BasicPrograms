
public class DriverInterface 
{
	public static void main(String[] args) 
	{
		//Bird bird = new Bird(); // cannot instantiate Bird type
		Eagle eagle = new Eagle();
		eagle.flyingStatus();
		eagle.runningStatus();
		
		/*eagle = new Ostrich();
		eagle.flyingStatus();
		eagle.runningStatus();*/
		
		Ostrich ost = new Ostrich();
		ost.flyingStatus();
		ost.runningStatus();
		
		Dove dove = new Dove();
		dove.flyingStatus();
		dove.birdType();
		dove.runningStatus();
	}

}
