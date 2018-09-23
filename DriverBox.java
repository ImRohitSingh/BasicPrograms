import static java.lang.System.out;

public class DriverBox 
{

	public static void main(String[] args) 
	{
		Box b = new Box (3,4,5);
		out.println("\nBox: \n");
		b.displayBox();
		
		/* b = new WeightedBox(7,8,9,5.6);
		b.displayBox();
		b.displayWeightedBox(); (Cannot create new instance variables; Only base address changes) */
		
		WeightedBox wb = new WeightedBox(7,8,9,5.6);
		out.println("\nWeighted Box: \n");
		// wb.displayBox(); (Can call) 
		wb.displayWBox();
		
		ColoredWeightedBox cwb = new ColoredWeightedBox(7,8,9,5.6,"Pink");
		out.println("\nColored Weighted Box: \n");
		// cwb.displayBox(); (Can call) 
		//cwb.displayWBox(); (Can call)
		cwb.displayCWBox();
	}

}
