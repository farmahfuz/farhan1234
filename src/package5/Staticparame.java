package package5;

public class Staticparame {

	public static void main(String[] args) {
		Staticparame.Farhan(5000, 1000);
Staticparame.Jahan("Farhan", "Mahfuz");
	}
	public static void Farhan(int l, int k) {
		int c= l+k;
		System.out.println(c);
		
	}
	
	public static void Jahan (String Firstname, String Lastname) {
		String Fullname= Firstname + Lastname;
		System.out.println(Fullname);
		
	}

}
