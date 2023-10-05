import java.util.Scanner;
import java.lang.Math;
public class Student {
	/*
	 * 	Allow students to submit answers. Every student has a unique ID (String), and can
	 * 	submit an answer to the iVote service.
	 */
	private String ID = "";
	private String attempt = "";

	/*
	 * Creates a student object for future reference.
	 * Takes a String ID Parameter
	 */
	public Student(String ID){
		this.ID = ID;
	}
	public Student(){
		String[] numberSpace = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for(int i = 0; i < 7; i++){
			int digit = (int)(Math.random() * 10);
			this.ID = ID + numberSpace[digit];
		}
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
		Scanner input = new Scanner(System.in);
		attempt = input.nextLine();
	}

	public void setAttempt(String attempt){
		this.attempt = attempt;
	}

	/*
	 * Returns the value stored in the attempt field for future use.
	 */
	public String getAttempt(){
		return attempt;
	}
}
