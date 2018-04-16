package beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Triangle {

	private List<point> points;
	private HashSet<point> setpoints;
	private HashMap<Integer,point> mappoints;
	

	public HashMap<Integer, point> getMappoints() {
		return mappoints;
	}


	public void setMappoints(HashMap<Integer, point> mappoints) {
		this.mappoints = mappoints;
	}


	public List<point> getPoints() {
		return points;
	}


	public HashSet<point> getSetpoints() {
		return setpoints;
	}


	public void setSetpoints(HashSet<point> setpoints) {
		this.setpoints = setpoints;
	}


	public void setPoints(List<point> points) {
		this.points = points;
	}


	public void draw()
	{
		System.out.println("Points inside list");
		for(point p:points)
		System.out.println("Point: " + p.getX() +" " + p.getY());
		
		System.out.println("Points inside set");
		for(point p:setpoints)
		{
			System.out.println("points are::" + p.getX() + "  " + p.getY());
		}
		
		System.out.println("points inside map");
		for(Map.Entry<Integer, point> entry:mappoints.entrySet())
		{
			System.out.println(entry.getKey() + "x coor " + entry.getValue().getX());
		}
		
	}
	
}
