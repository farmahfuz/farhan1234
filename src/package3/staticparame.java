package package3;

public class staticparame {

	public static void main(String[] args) {
		staticparame.Farhan(5000, 1000);
staticparame.ball("Farhan ", "Mahfuz");
	}
	public static void Farhan(int g, int h) {
		int  v= g - h;
		System.out.println("chicken amount= "+ v);
	}
	public static void ball(String Firstname, String Lastname) {
		String Fullname= Firstname + Lastname;
		System.out.println("his name ="+Fullname);
	}

}
