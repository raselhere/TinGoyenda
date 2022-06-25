
/*

Name:	Rasel Ahmed Raju
ID: 	2021687642
Course: CSE 215 [Object oriented programming]
Section:10
	
*/


public class Suspect extends Documentary {
	
	private String type;     //declaring fields

	public Suspect() {   //without arguments constructor
		super();
	}
                                                 
	public Suspect(String type,String name, String gender, int age, String address, String height, String weight, String color,     
			String appearance, long nid) {                                                      //arguments constructor with the inherited atributes from super class as a perameter
		super();
		this.type = type;
		super.setName(name);
		super.setGender(gender);
		super.setAge(age);
		super.setAddress(address);   //calling the inherited fields from super class
		super.setHeight(height);
		super.setWeight(weight);
		super.setColor(color);
		super.setAppearance(appearance);
		super.setNid(nid);
		
	}

	public String getType() {     //getter setter methods here
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {            //tostring method to print the assigned values in the class
		return "Suspect\n\nType:" + type + "\nName:" + getName() +"\nGender:"+ getGender()+ "\nAge:"
				+ getAge() + "\nAddress:" + getAddress() + "\nHeight:" + getHeight() + "\nWeight:"
				+ getWeight() + "\nColor:" + getColor() + "\nAppearance:" + getAppearance() + "\nNid:"
				+ getNid() ;
	}
	
	
	
}
