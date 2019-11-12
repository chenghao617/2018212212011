
public class DynamicbindingDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new object());
	}
	
	public static void m(object x){
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student{
	
}

class Stduent extends Person{
	@Override
	public String toString(){
		return "students";
	}
}

class Person extends objects{
	@Override
	public String toString(){
		return "Person";
	}
}