package areaprograms;

public class PerimeterProgram {
	double a=6;
	double b=5;
	double c=7;
	double w=9;
	double l=8;
	public void allPerimeterPrograms()
	{
		System.out.println("Perimeter of Parallelogram is =" + (2*(a+b)));
		System.out.println("Perimeter of square is =" + (4*a));
		System.out.println("Perimeter of Rectangle is =" + (2*(l+w)));
		System.out.println("Perimeter of Triangle is =" + (a+b+c));

	}
	public static void main(String[] args)
	{
		PerimeterProgram p=new PerimeterProgram();
		p.allPerimeterPrograms();
	}
	}

