
public class B extends A 
{
	void meth2()
	{
		A.aVar = 123;
		System.out.println("\nmeth2() declared in A, defined in B.\n");
	}
}
