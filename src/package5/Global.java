package package5;

public class Global {
	int a=600;
	int b=300;
	int v= a+b;
	String Fullname= "Farhan Mahfuz";

	public static void main(String[] args) {
		Global obj=new Global();
		obj.Jahan();

	}
	public void Jahan() {
		System.out.println(v);
		System.out.println(Fullname);
	}

}
