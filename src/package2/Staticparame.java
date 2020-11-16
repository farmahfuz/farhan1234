package package2;

public class Staticparame {

	public static void main(String[] args) {
		Staticparame.Farhan(20, 300);
		Staticparame.sakif("Farhan","Mahfuz");
	}
	public static void Farhan(int a, int b){
		int c= a*b;
	System.out.println(c);
		
	}
	public static void sakif(String Firstname, String Lastname) {
		String Fullname = Firstname + Lastname;
		
		System.out.println(Fullname);
	}
	

}
