package streamAPI2;

public class Employee {
	private int eId;
	private String eName;
	private int eSal;
	//constructor
	public Employee(int eId, String eName, int eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	//generate setter and getter
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSal() {
		return eSal;
	}
	public void seteSal(int eSal) {
		this.eSal = eSal;
	}
	
}
