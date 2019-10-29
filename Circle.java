package welcome;

public class Circle {

	public static void main(String[] args) {
		
		double radius;
		static int number0f0bjects = 0;
		Circle(){
			radius = 1;
			number0f0bjects++;	
		}
		
		Circle(double newRadius){
			radius = newRadius;
			number0f0bjects++;
		}
		
		static int getnumber0f0bjects() {
			return number0f0bjects;
		}
		
		double getArea() {
			return radius*radius*Math.PI;
		}
	}
}