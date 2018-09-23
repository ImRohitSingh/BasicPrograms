import static java.lang.System.out;

public class ColoredWeightedBox extends WeightedBox 
{
	int len;
	int brea;
	int hei;
	double wei;
	String col;
	ColoredWeightedBox(int len,int brea,int hei,double wei,String col)
	{
		super(len,brea,hei,wei);
		this.col = col;
	}
	void displayCWBox()
	{
		super.displayWBox();
		out.println("Color = "+col);
	}
}
