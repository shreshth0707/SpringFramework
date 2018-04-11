package beans;

public class Triangle {

	public  String type;
	public int area;
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}



	public void draw()
	{
		System.out.println(getType() + " traingle drawn");
		System.out.println("Area "+ getArea());
	}
}
