package areaprograms;

public class AreaPrograms {
double a=6;
double b=5;
double h=7;
double w=9;
double l=8;
public void allAreaPrograms()
{
	System.out.println("Area of Parallelogram is =" + (b*h));
	System.out.println("Area of square is =" + (a*a));
	System.out.println("Area of Rectangle is =" + (w*l));
	System.out.println("Area of Triangle is =" + (h*b/2));

}
public static void main(String[] args)
{
	AreaPrograms a=new AreaPrograms();
	a.allAreaPrograms();
}
}
