
/*
 * 
Name:	Rasel Ahmed Raju 
ID: 	2021687642
Course: CSE 215 [Object oriented programming]
Section:10	

*/

import java.util.*;
import java.util.ArrayList; //importing arraylist from util class
							                                         
                                                                     //          *                                                * 
public class CaseManagementSystem {                                  //          * *                                            * *
									                                 // ************* * PASS KEY FOR KISHOR=1 MUSA=2 ROBIN=3 * ******************
	public static void main(String[] args) {                         //          * *                                            * *
		// TODO Auto-generated method stub                           //          *                                                *

		Scanner scan = new Scanner(System.in); // created an scanner object
		System.out.println("***WELCOME TO THE SYSTEM***\n\n");
		System.out.print("Please enter your key=>");
		int i;
		int casecount = 0;
		i = scan.nextInt();
		if (i == 1 || i == 2 || i == 3) { // matching the pass key

			if (i == 1) {
				System.out.print("\n**Welcome Mr. Kishor Pasha**\n\n"); // if else condition to print a massage
			} else if (i == 2) {
				System.out.print("\n**Welcome Mr. Musa Aman**\n\n");
			} else if (i == 3) {
				System.out.print("\n**Welcome Mr. Robin Milford**\n\n");
			}
			ArrayList<Case> c = new ArrayList<>(); // creating new arraylist of Case type to store Case info
			ArrayList<Victim> vic = new ArrayList<>(); // creating new arraylist of Victim type to store Victim info
			ArrayList<Suspect> sus = new ArrayList<>(); // creating new arraylist of Suspect type to store Suspect info

			int o = 1;
			while (o != 0) { // assigned a while loop, the loop will be continued until 0 is assigned to o
				System.out.println("\n--------**--------**--------**--------**-------**--------\n");
				System.out.println("\n1.Create New Case\n2.Modify Old Case\n3.Display Old Case\n4.Exit");
				System.out.print("Enter...");
				int input;
				input = scan.nextInt(); // taking input

				if (input == 1) { // matching input with if else condition
					casecount++;
					System.out.println("\n\n*Enter case description=>\n");

					System.out.println("Enter Case no:");
					int serial;
					serial = scan.nextInt();
					System.out.print("Enter Date:"); // getting inputs for case info in different variables
					String date = new String();
					date = scan.next();
					System.out.print("Enter solving date:");
					String solv = new String();
					solv = scan.next();

					System.out.print("\n\n*Enter all the information for the victim=>\n");

					System.out.print("Enter type:");
					String type;
					type = scan.next();
					System.out.print("Enter Name:");
					String name;
					name = scan.next();
					System.out.print("Enter Gender:"); // getting inputs for Victim info in different variables
					String gender;
					gender = scan.next();
					System.out.print("Enter Age:");
					int age;
					age = scan.nextInt();
					System.out.print("Enter Address:");
					String address;
					address = scan.next();
					System.out.print("Enter Color:");
					String color;
					color = scan.next();
					System.out.print("Enter Appearance:");
					String appearance;
					appearance = scan.next();
					System.out.print("Enter Height:");
					String height;
					height = scan.next();
					System.out.print("Enter Weight:");
					String weight;
					weight = scan.next();
					System.out.print("Enter NID:");
					long nid;
					nid = scan.nextLong();

					System.out.print("\n\n*Enter all the information for the suspect=>\n");

					System.out.print("Enter type:");
					String type1;
					type1 = scan.next();
					System.out.print("Enter Name:");
					String name1; // getting inputs for Suspects info in different variables
					name1 = scan.next();
					System.out.print("Enter Gender:");
					String gender1;
					gender1 = scan.next();
					System.out.print("Enter Age:");
					int age1;
					age1 = scan.nextInt();
					System.out.print("Enter Address:");
					String address1;
					address1 = scan.next();
					System.out.print("Enter Color:");
					String color1;
					color1 = scan.next();
					System.out.print("Enter Appearance:");
					String appearance1;
					appearance1 = scan.next();
					System.out.print("Enter Height:");
					String height1;
					height1 = scan.next();
					System.out.print("Enter Weight:");
					String weight1;
					weight1 = scan.next();

					System.out.print("Enter NID:");
					long nid1;
					nid1 = scan.nextLong();
					System.out.print("Case Status:");
					String status = new String();
					status = scan.next();
					System.out.print("Case Guilty:");
					String caseg;
					caseg = scan.next();

					c.add(new Case(date, solv, status, serial, caseg)); // in arraylist c created new object Case and  passed data as parameter
																	
					vic.add(new Victim(type, name, gender, age, address, height, weight, color, appearance, nid)); // in arraylist vic created new object Victim and passed data as parameter

					sus.add(new Suspect(type1, name1, gender1, age1, address1, height1, weight1, color1, appearance1, nid1)); // in arraylist sus created new object Suspect and passed data as parameter
																														  
							

				}

				else if (input == 2) {

					int p = 0;
					while (p != 1) { // assigned a while loop, the loop will end when 1 will be assigned in p
										// variable
						System.out.println("\nEnter Case No:");
						int no;
						no = scan.nextInt();
						if (casecount > 0 && no != 0 && (no - 1) <= (c.size())) { // checking if the input is undefined
							int w = 1;
							while (w != 0) { // assigned a while loop, the loop will end when 0 will be assigned in w
												// variable
								System.out.println("\nEnter in which section you want to modify=>");
								System.out.println("1.Case\n2.Victim\n3.Suspect\n4.Exit Modify");
								int input2;
								input2 = scan.nextInt();
								if (input2 == 1) {

									System.out.println("\nEnter field:");

									int ex = 1;
									while (ex != 0) { // assigned a while loop, the loop will end when 0 will be
														// assigned in ex variable
										System.out.println(
												"1.Update Date\n2.Update Solving Date\n3.Update Case Status\n4.Update Case Guilty\n5.Exit This Portion");
										int field;
										field = scan.nextInt();

										if (field == 1) {
											System.out.println("Enter New Date:");
											String newdate;
											newdate = scan.next();
											c.get((no - 1)).setDate(newdate); // replacing new input to the previously
																				// created object through setter method
																				// in arraylist c
										} else if (field == 2) {
											System.out.println("Enter New Solving Date:");
											String newdate1;
											newdate1 = scan.next();
											c.get((no - 1)).setEnd(newdate1);
										} else if (field == 3) {
											System.out.println("Enter New Case Status:");
											String newcase;
											newcase = scan.next();
											c.get((no - 1)).setCaseStatus(newcase);
										} else if (field == 4) {
											System.out.println("Enter New Case Guilty:");
											String newguilty;
											newguilty = scan.next();
											c.get((no - 1)).setCaseGuilty(newguilty);
										} else if (field == 5) {
											ex = 0; // 0 assigned to ex and while loop will end here
										} else {
											System.out.println("\n\tInvalid Input");
										}

									}

								} else if (input2 == 2) { // matching input

									System.out.println("\nEnter field:");

									int ex = 1;
									while (ex != 0) { // assigned a while loop, the loop will end when 0 will be
														// assigned in ex variable
										System.out.println("\nEnter field:");
										System.out.println(
												"1.Update Type\n2.Update Name\n3.Update Gender\n4.Update Age\n5.Update Address\n6.Update Colour");
										System.out.println(
												"7.Update Appearance\n8.Update Height\n9.Update Weight\n10.Update NID\n11.Exit This Portion");

										int field;
										field = scan.nextInt();

										if (field == 1) {
											System.out.println("Enter New Types:");
											String newtype;
											newtype = scan.next();
											vic.get((no - 1)).setType(newtype); // replacing new input to the previously
																				// created object through setter method
																				// in arraylist vic
										} else if (field == 2) {
											System.out.print("Enter New Name:");
											String newname;
											newname = scan.next();
											vic.get((no - 1)).setName(newname);
										} else if (field == 3) {
											System.out.print("Enter New Gender:");
											String newgender;
											newgender = scan.next();
											vic.get((no - 1)).setGender(newgender);
										} else if (field == 4) {
											System.out.print("Enter New Age:");
											int newage;
											newage = scan.nextInt();
											vic.get((no - 1)).setAge(newage);
										} else if (field == 5) {
											System.out.print("Enter New Address:");
											String newaddress;
											newaddress = scan.next();
											vic.get((no - 1)).setAddress(newaddress);
										} else if (field == 6) {
											System.out.print("Enter New Colour:");
											String newcolour;
											newcolour = scan.next();
											vic.get((no - 1)).setColor(newcolour);
										} else if (field == 7) {
											System.out.print("Enter New Appearance:");
											String newappearance;
											newappearance = scan.next();
											vic.get((no - 1)).setAppearance(newappearance);
										} else if (field == 8) {
											System.out.print("Enter New Height:");
											String newheight;
											newheight = scan.next();
											vic.get((no - 1)).setHeight(newheight);
										} else if (field == 9) {
											System.out.print("Enter New Weight:");
											String newweight;
											newweight = scan.next();
											vic.get((no - 1)).setWeight(newweight);
										} else if (field == 10) {
											System.out.print("Enter New NID:");
											long newnid;
											newnid = scan.nextLong();
											vic.get((no - 1)).setNid(newnid);
										} else if (field == 11) {
											ex = 0; // 0 assigned to ex and loop ran by ex will end here
										} else {
											System.out.println("\n\tInvalid Input");
										}

									}

								} else if (input2 == 3) { // matching input

									System.out.println("\nEnter field:");

									int ex = 1;
									while (ex != 0) { // assigned a while loop, the loop will end when 0 will be
														// assigned in ex variable
										System.out.println("\nEnter field:");
										System.out.println(
												"1.Update Type\n2.Update Name\n3.Update Gender\n4.Update Age\n5.Update Address\n6.Update Colour");
										System.out.println(
												"7.Update Appearance\n8.Update Height\n9.Update Weight\n10.Update NID\n11.Exit This Portion");

										int field;
										field = scan.nextInt();

										if (field == 1) {
											System.out.print("Enter New Types:");
											String newtype;
											newtype = scan.next();
											sus.get((no - 1)).setType(newtype); // replacing new input to the previously
																				// created object through setter method
																				// in arraylist sus
										} else if (field == 2) {
											System.out.print("Enter New Name:");
											String newname;
											newname = scan.next();
											sus.get((no - 1)).setName(newname);
										} else if (field == 3) {
											System.out.print("Enter New Gender:");
											String newgender;
											newgender = scan.next();
											sus.get((no - 1)).setGender(newgender);
										} else if (field == 4) {
											System.out.print("Enter New Age:");
											int newage;
											newage = scan.nextInt();
											sus.get((no - 1)).setAge(newage);
										} else if (field == 5) {
											System.out.print("Enter New Address:");
											String newaddress;
											newaddress = scan.next();
											sus.get((no - 1)).setAddress(newaddress);
										} else if (field == 6) {
											System.out.print("Enter New Colour:");
											String newcolour;
											newcolour = scan.next();
											sus.get((no - 1)).setColor(newcolour);
										} else if (field == 7) {
											System.out.print("Enter New Appearance:");
											String newappearance;
											newappearance = scan.next();
											sus.get((no - 1)).setAppearance(newappearance);
										} else if (field == 8) {
											System.out.print("Enter New Height:");
											String newheight;
											newheight = scan.next();
											sus.get((no - 1)).setHeight(newheight);
										} else if (field == 9) {
											System.out.print("Enter New Weight:");
											String newweight;
											newweight = scan.next();
											sus.get((no - 1)).setWeight(newweight);
										} else if (field == 10) {
											System.out.print("Enter New NID:");
											long newnid;
											newnid = scan.nextLong();
											sus.get((no - 1)).setNid(newnid);
										} else if (field == 11) {
											ex = 0; // 0 assigneed to ex and loop will end here
										} else {
											System.out.println("\n\tInvalid Input");
										}

									}

								} else if (input2 == 4) { // matching input
									w = 0; // 0 assigned to w and the while loop ran by w will end here
									p = 1; // 1 assigned to p and the while loop ran by p will end here
								} else {
									System.out.println("\nInvalid Input");
								}

							}

						} else {
							System.out.println("\nInvalid Case Number OR The Case Has Not Been Registered\n");
							p = 1;
						}

					}
				}

				else if (input == 3) { // matching input

					System.out.println("\n\nEnter the case no you want to diplay:");
					int caseno;
					caseno = scan.nextInt();
					if (casecount > 0 && caseno != 0 && (caseno - 1) <= (c.size()-1)) {
						System.out.println("\n\t**DETAILS OF THE CASE**\n");
						System.out.println("----------------------------");
						System.out.println(vic.get((caseno - 1)).toString());
						System.out.println("----------------------------");
						System.out.println(sus.get((caseno - 1)).toString());
						System.out.println("\n----------------------------");
						System.out.println(c.get((caseno - 1)).toString());
					} else {
						System.out.println("\n\tInvalid Case Number OR The Case Has Not Been Registered");
					}
				}

				else if (input == 4) { // matching input
					System.out.println("\n\n\t**Have a good day**");
					o = 0; // 0 assigned to o and the loop ran by o ends here

				} else {
					System.out.println("\n\n\tInvalid Input");
				}

			}

		} else {
			System.out.print("\n\t**WRONG PIN**\n\n");
		}

		scan.close(); // scan closed

	}

}
