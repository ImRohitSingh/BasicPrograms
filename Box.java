import static java.lang.System.out;

public class Box 
{
	int len;
	int brea;
	int hei;
	Box(int len,int brea,int hei)
	{
		this.len = len;
		this.brea = brea;
		this.hei = hei;
	}
	void displayBox()
	{
		out.println("Length = "+len);
		out.println("Breadth = "+brea);
		out.println("Height = "+hei);
	}
}
