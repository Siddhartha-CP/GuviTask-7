package practise;

class employee {

	
	int empid;
	String empname;
	double empsal;
	employee(int a, String x, double p)
	{
		empid=a;
		empname=x;
		empsal=p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee(122, "siddu", 14000.89);
		System.out.println("employee id is "+ e.empid);
		System.out.println("employee name is "+ e.empname);
		System.out.println("employee salary is "+ e.empsal);
		
	}

}
