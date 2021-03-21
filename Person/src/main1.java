
public class main1  {

	public static void main(String[] args) {
	
		Person1 m1 = new Person1();
		
		System.out.println("ur email"+m1.email);
		System.out.println("ur name "+m1.name);
		System.out.println("ur phone"+m1.phoen);
		
		m1.pass();
		
		Student m2 = new Student();
		
		
		System.out.println("number "+m2.number);
		
		System.out.println("number "+m2.mark);
		
		m2.email();
		
		
		Professor m3 = new Professor ();
		
		System.out.println("salary "+m3.salary);
	}

}
