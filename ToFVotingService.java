import java.util.Map;
import java.util.HashMap;
public class ToFVotingService implements VotingService{
	Question query;
	HashMap<String, Integer> answers = new HashMap<String, Integer>();
	String invalid = "Your answer was not in the form \"1\" or \"0\"";

	/*
	 * Constructs VotingService
	 */
	public ToFVotingService(Question query){
		this.query = query;
	}

	/*
	 * Prints question and prompts answers
	 */
	@Override
	public void showQuestion(){
		query.display();
	}
	/*
	 * Iterates through answers variable to count 0s and 1s
	 * Prints the totals for each answer
	 */
	@Override
	public void showTotal() {
		int trues = 0;
		int falses = 0;
		for(int i : answers.values()){
			if (i == 0){
				falses++;
			}else{
				trues++;
			}
		}
		System.out.println("False: " + falses + "| True: " + trues);
	}

	/*
	 * Takes Student bozo and parses the attempt field until it finds the first 0 or 1.
	 * Stores the Student's ID and the first integer in their attempt into the Map answers
	 * If the ID already exists in the map, replace that instance, otherwise add to the map
	 * Returns false and prints an error message if input is invalid, otherwise returns true
	 */
	@Override
	public boolean verifyAnswer(Student bozo) {
		int i = Integer.parseInt(bozo.getAttempt());
		if(i != 1 || i != 0){
			System.out.println(invalid);
			return false;
		}
		if(answers.containsKey(bozo.getID())){
			answers.replace(bozo.getID(), Integer.parseInt(bozo.getAttempt()));
		} else{
			answers.put(bozo.getID(), Integer.parseInt(bozo.getAttempt()));
		}
		return true;
	}
}