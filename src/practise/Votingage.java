package practise;

public class Votingage {
	public static void main(String [] args) {
		int voteage= 17;
		
		if(voteage>=18 == voteage<=64)
		{
			System.out.println("Eligiable to vote ");
		}
		else if (voteage>=65)
		{
			System.out.println("Aged people can vote in application");
		}
		else
		{
			System.out.println("Not Eligiable to vote ");
		}
	}
}
