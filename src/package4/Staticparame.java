package package4;

public class Staticparame {

	public static void main(String[] args) {
		Staticparame.Farhan(2, 40);
Staticparame.Chips("Farhan", "Mahfuz");
	}
	public static void Farhan (int s, int d) {
		int a= s+d;
		System.out.println(a);
		
	}
	public static void Chips (String Firstname, String Lastname) {
		String Fullname= Firstname+ Lastname;
		System.out.println(Fullname);
		
	}
	

}
