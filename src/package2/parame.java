package package2;

public class parame {

	public static void main(String[] args) {
		parame obj= new parame();
		obj.Farhan(30, 3000);
		obj.Sakif("Farhan", "Mahfuz");

	}
	public void Farhan(int a, int b) {
		int c= a-b;
		System.out.println(c);
		
	}
	public void Sakif(String firstname, String lastname) {
		String Fullname= firstname+lastname;
		System.out.println(Fullname);
		
			
		
	}

}
