import java.util.Scanner;
public class Circlee extends Point{
	 	  
     public static void main(String[] args) {
    
	 Scanner sc = new Scanner(System.in);
	 Point c=new Point(); 
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circlee c1=new Circlee(); 
	 c1.distance(c,p);  
	
  }
 
}
class Point {
	double x,y;
	double distance(Point p1, Point p2)
	{
		double result;
		result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
 		System.out.print(result);
		return result;		
	}
}
