package package1;

public class Global {
	int x= 100;
	int y= 200;
	int u= x-y;
	
	
	public static void main(String[] args) {
		Global pet=new Global();
    pet.cola();
	}
	public void cola() {
		
		System.out.println("total amount is ="+u);
	}

}
