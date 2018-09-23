
public class MethodOverloading 
{
	int add(int x,int y)
	{
		return x+y;
	}
	float add(int x,float y)
	{
		return x+y;
	}
	float add(float x,int y)
	{
		return x+y;
	}
	String add(String x,String y)
	{
		return x+y;
	}
}
