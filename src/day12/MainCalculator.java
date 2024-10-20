package day12;

public class MainCalculator extends NormalCalculator implements ScientificCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainCalculator obj = new MainCalculator();
		obj.add();
		obj.sub();
		obj.mul();
		obj.cos();
		obj.tan();
	}

	@Override
	public void cos() {
		// TODO Auto-generated method stub
		System.out.println("Cos");
	}

	@Override
	public void tan() {
		// TODO Auto-generated method stub
		System.out.println("tan");
	}

}
