package package3;

public class parame {

	public static void main(String[] args) {
		parame obj=new parame();
		obj.Farhan(40, 4000);
		obj.akif("Farhan", "Mahfuz");
		
	}
	public void Farhan(int a,int b) {
		int c= a+b;
		System.out.println(c);
		
		
	}
	public void akif(String firstname, String lastname) {
		
		String Fullname= firstname+lastname;
		
		System.out.println(Fullname);
	}

}
