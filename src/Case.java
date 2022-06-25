
/*

Name:	Rasel Ahmed Raju
ID: 	2021687642
Course: CSE 215 [Object oriented programming]
Section:10
	
*/


public class Case {
	
	private String date;
	private String end;
	private String caseStatus;   //declaring data fields
	private int caseNo;
	private String caseGuilty;
	
	public Case() {  //without arguments constructor
		super();
	}

	public Case(String date, String end, String caseStatus, int caseNo, String caseGuilty) {   //arguments constructor with the atributes as a perameter
		super();
		this.date = date;
		this.end = end;
		this.caseNo=caseNo;
		this.caseStatus=caseStatus;
		this.caseGuilty=caseGuilty;
		
	}

	public String getDate() {           //getter setter methods here
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	

	public String getCaseGuilty() {
		return caseGuilty;
	}

	public void setCaseGuilty(String caseGuilty) {
		this.caseGuilty = caseGuilty;
	}

	@Override
	public String toString() {        //tostring method to print the assigned values in the class
		return "Case Creation Date:" + getDate() + "\nCase End Date:" + getEnd() + "\nCase Status:"+getCaseStatus()+"\nCaseNo:"+getCaseNo()
		+"\nCase Guilty:"+getCaseGuilty();
	}
	
	
	
}
