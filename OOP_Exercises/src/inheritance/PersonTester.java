package inheritance;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Shiva","kadapa");
		System.out.println(p);
		Student s = new Student("Shiva","kadapa","Diploma",1,2000.0);
		System.out.println(s);
		Staff sf = new Staff("Shiva","kadapa","Model",20000);
		System.out.println(sf);
	}

}
