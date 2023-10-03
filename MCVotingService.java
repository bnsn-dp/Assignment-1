import java.util.Map;
import java.util.HashMap;
public class MCVotingService implements VotingService{
	Question query;
	Map<String, String> answers;

	/*
	 * Iterates through Map answers and counts the instances of A, B, C, D
	 */
	@Override
	public void showTotal() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'showTotal'");
	}

	/*
	 * Takes Student bozo and checks for valid input
	 * if all input only contains A-D (case insensitive) adds bozo's ID and attempt to the Map answers
	 */
	@Override
	public boolean verifyAnswer(Student bozo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'verifyAnswer'");
	}
	
}
