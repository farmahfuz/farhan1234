package package4;

public class parame {

	public static void main(String[] args) {
	parame obj=new parame();
	obj.Farhan(40, 2);
	obj.sakif("Farhan", "Mahfuz");

	}
	public void Farhan(int a,int b) {
		int c=a*b;
		System.out.println(c);
		
	}
public void sakif(String firstname, String lastname) {
	String fullname= firstname+lastname;
	System.out.println(fullname);
	
}
}
