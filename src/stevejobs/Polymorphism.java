package stevejobs;

public class Polymorphism 
{
	public int x;
	public float y;
    public char z;
	public String a;
	public boolean b;
	
	public Polymorphism()
	{
		x=10;
		y=(float) 0.1;
		
	}
	public Polymorphism(int p, float q, String s,boolean t)
	{
		x=p;
		y=q;
		
		a=s;
		b=t;
	}
	public void display()
	{
		System.out.println(x+" "+y+" "+z+" "+a+"  "+b);
	}

}

