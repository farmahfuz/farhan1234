package package3;

public class Global {
	int x=300;
	int y=500;
	int c=x*y;

	String Fullname= "Farhan"+"Mahfuz";

	public static void main(String[] args) {
		Global obj=new Global();
		obj.Farhan();

	}
	public void Farhan() {
		System.out.println(c);
		System.out.println(Fullname);
	}

}
