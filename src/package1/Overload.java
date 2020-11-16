package package1;

public class Overload {

	public static void main(String[] args) {
		Overload obj=new Overload();
obj.A(20, 300);
obj.A(10.10,20.20);
obj.A("Farhan ", "Mahfuz");
	}
	public void A(int a, int b) {
		
		int c =a+b;
		System.out.println(c);
		
	}
	public void A(String Firstname,String Lastname) {
		String Fullname= Firstname+Lastname;
		System.out.println(Fullname);
	}
	public void A(double a,double b) {
		double lol= a+b;
		
		System.out.println(lol);
	}
	

}
