import java.util.Scanner;
public class Student {
	/*
	 * 	Allow students to submit answers. Every student has a unique ID (String), and can
	 * 	submit an answer to the iVote service.
	 */
	private String ID = "";
	private String attempt = "";

	/*
	 * Creates a student object for future reference.
	 */
	public Student(String ID){
		this.ID = ID;
	}

	/*
	 * Returns the value stored in the ID field.
	 */
	public String getID(){
		return ID;
	}
	/*
	 * Assigns a value to the attempt field.
	 * One variant takes a String parameter and the other asks for user input.
	 */
	public void setAttempt(){
	}

	/*
	 * Returns the value stored in the attempt field for future use.
	 */
	public String getAttempt(){
		return attempt;
	}
}
