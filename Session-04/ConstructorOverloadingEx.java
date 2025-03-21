package session3;

public class ConstructorOverloadingEx {

	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloadingEx(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public ConstructorOverloadingEx(String empname, String location) {
		this(empname,0,location); //call invoke using this keyword
	}
	
	public ConstructorOverloadingEx(String empname, int empid) {
		this(empname,empid,null);
	}
	
	public void displayInfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
	public static void main(String[] args) {
		ConstructorOverloadingEx cox = new ConstructorOverloadingEx("Mugilan", 908544, "Vellore");
		ConstructorOverloadingEx cox1 = new ConstructorOverloadingEx("Moses sir", "Coimbatore");
		ConstructorOverloadingEx cox2 = new ConstructorOverloadingEx("Sudhesh", 902511);
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	}
}
