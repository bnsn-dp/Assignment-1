import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class MCVotingService implements VotingService{
	Question query;
	Map<String, String> answers = new HashMap<String, String>();
	String invalid = "Your answer contains letters that are not \"A, B, C, or D\"";
	String[] validInputs = {"A", "B", "C", "D", "a", "b", "c", "d"};

	/*
	 * Creates a VotingService object with a stored question
	 */
	public MCVotingService(Question query){
		this.query = query;
	}

	/*
	 * Displays the question and prompts for answers
	 */
	@Override
	public void showQuestion(){
		System.out.println(query.display());
	}

	/*
	 * Iterates through Map answers and counts the instances of A, B, C, D
	 */
	@Override
	public void showTotal() {
		int As = 0;
		int Bs = 0;
		int Cs = 0;
		int Ds = 0;
		for(String s : answers.values()){
			if(s.contains("A")  || s.contains("a")){
				As++;
			}
			if(s.contains("B")  || s.contains("b")){
				Bs++;
			}
			if(s.contains("C")  || s.contains("c")){
				Cs++;
			}
			if(s.contains("D")  || s.contains("d")){
				Ds++;
			}
		}
		System.out.println("A: " + As + "\nB: " + Bs + "\nC: " + Cs + "\nD: " + Ds);
	}

	/*
	 * Takes Student bozo and checks for valid input
	 * if all input only contains A-D (case insensitive) adds bozo's ID and attempt to the Map answers
	 */
	@Override
	public boolean verifyAnswer(Student bozo) {
		if(!Arrays.stream(validInputs).anyMatch(bozo.getAttempt()::contains)){
			System.out.println(invalid);
			return false;
		}
		if(answers.containsKey(bozo.getID())){
			answers.replace(bozo.getID(), bozo.getAttempt());
		}else{
			answers.put(bozo.getID(), bozo.getAttempt());
		}
		return true;
	}
	
}
