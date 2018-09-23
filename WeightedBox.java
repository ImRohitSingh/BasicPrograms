import static java.lang.System.out;

public class WeightedBox extends Box
{
	int len;
	int brea;
	int hei;
	double wei;
	WeightedBox(int len,int brea,int hei,double wei)
	{
		super(len,brea,hei);
		this.wei = wei;
	}
	void displayWBox()
	{
		super.displayBox();
		out.println("Weight = "+wei);
	}
}
