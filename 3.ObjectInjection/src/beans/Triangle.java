package beans;

public class Triangle {

	private point a;
	private point b;
	private point c;
	
	

	public point getA() {
		return a;
	}



	public void setA(point a) {
		this.a = a;
	}



	public point getB() {
		return b;
	}



	public void setB(point b) {
		this.b = b;
	}



	public point getC() {
		return c;
	}

	public void setC(point c) {
		this.c = c;
	}



	public void draw()
	{
		System.out.println(getA().getX() +" " + getA().getY());
		System.out.println(getB().getX() +" " + getB().getY());
		System.out.println(getC().getX() +" " + getC().getY());
		
	}
}
