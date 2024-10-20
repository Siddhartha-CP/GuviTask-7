package practise;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;
		
		if(number<=1) {
			System.out.println("number is invalid");
		}
		else {
			for(int i=2;i<= number/ 2;) {
				if(number==0) {
					System.out.println("Its a Prime number");
					break;
				}
				else {
					System.out.println("Its not a Prime number");
					break;
				}
			}
		}
	}

}

