
/*

Name:	Rasel Ahmed Raju
ID: 	2021687642
Course: CSE 215 [Object oriented programming]
Section:10
	
*/


public class Documentary {
	
	private String name;
	private String gender;
	private int age;
	private String address;     //declearing the data fields
	private String height;
	private String weight;
	private String color;
	private String appearance;
	private long nid;
	
	public Documentary() {       //without arguments constructor
		super();
	}
	

	public Documentary(String name, String gender, int age, String address, String height, String weight, String color,
			String appearance, long nid) {            //arguments constructor with the inherited atributes from super class as a perameter
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.appearance = appearance;
		this.nid = nid;
	}


	public String getName() {         //getter setter methods
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public long getNid() {
		return nid;
	}

	public void setNid(long nid) {
		this.nid = nid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}

	
	
	
	
	
}
