package day12;

public class ConcretteClass extends InterfaceImplementation{
	
	public static void main (String[] args) {
		
		ConcretteClass obj = new ConcretteClass();
		obj.print();
		System.out.println(obj.printreturn());
	}

	public int printreturn() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int printable() {
		// TODO Auto-generated method stub
		return 0;
	}
}
