import java.util.Map;
import java.util.HashMap;
public class ToFVotingService implements VotingService{
	Question query;
	Map<String, Integer> answers;

	/*
	 * Iterates through answers variable to count 0s and 1s
	 * Prints the totals for each answer
	 */
	@Override
	public void showTotal() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'showTotal'");
	}

	/*
	 * Takes Student bozo and parses the attempt field until it finds the first 0 or 1.
	 * Stores the Student's ID and the first integer in their attempt into the Map answers
	 * If the ID already exists in the map, replace that instance, otherwise add to the map
	 * Returns false and prints an error message if there are no 0s or 1s, otherwise returns true
	 */
	@Override
	public boolean verifyAnswer(Student bozo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'verifyAnswer'");
	}
}
