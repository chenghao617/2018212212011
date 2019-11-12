
public class PolymorphismDemo {

	public PolymorphismDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayobject(new Circle(1,"red"),false);
		displayobject(new Rectangle(1,1,"black",true));
		
	}
	
	public static void displayobject(Geometricobject object){
		System.out.println("Created on"+object.getDateCreated()+".color is"+object.getcolor());
	}
}
