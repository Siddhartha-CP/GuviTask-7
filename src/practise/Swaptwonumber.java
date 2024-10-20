package practise;

public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
		/*c= a+b;  //10+20=30
		b= c-b;  //30-20=20
		a= a+b;  //10+10=30
		
		System.out.println(a);
		System.out.println(b);*/
		
		b= b-a;
		a= a+b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
