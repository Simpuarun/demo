package areaprograms;

public class AreaRec {

	int w=5;
	int l=4;

	public void recProgram()
	{
		System.out.println("Area of Rectangle is =" + (w*l));
	}
public static void main(String[] args)
{
	AreaRec a = new AreaRec();
	a.recProgram();
}
}
