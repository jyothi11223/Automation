package program1;

public class Variables {
	int a=5;
	static int c=9;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7;
		Variables obj=new Variables();
		
		System.out.println("Instance variable "+obj.a);
		System.out.println("Local "+b);
		System.out.println("static "+c);
	}

}
