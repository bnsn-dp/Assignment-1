import java.util.ArrayList;
import java.lang.Math;
public class SimulationDriver {
	/*
	 * You need a SimulationDriver to automatically simulate the whole process. 
	 * Basically, the driver will 
	 * 	1) create a question type and configure the answers;
	 * 	2) configure the question for iVote Service;
	 * 	3) randomly generate a number students and the answers;
	 * 	4) submit all the students’ answers to iVote Service;
	 * 	5) call the Voting Service output function to display the result.
	 * 
	 * You can randomly generate the IDs and answers for a group of students 
	 * to simulate the submission process and check the results.
	 */

	public static void main(String[] args){
		ArrayList<Student> students = new ArrayList<Student>();
		int numStudents = (int)(Math.random() * 9) + 4;
		TrueOrFalse q1 = new TrueOrFalse();
		MultipleChoice q2 = new MultipleChoice();
		ToFVotingService trueOrFalseExample = new ToFVotingService(q1);
		MCVotingService multipleChoiceExample = new MCVotingService(q2);
		
		for(int i = 0; i < numStudents; i++){
			Student temp = new Student();
			students.add(temp);
		}
		trueOrFalseExample.showQuestion();
		for(Student s : students){
			s.setAttempt(RandomAnswer.trueOrFalseAnswer());
			trueOrFalseExample.verifyAnswer(s);
		}
		trueOrFalseExample.showTotal();
		multipleChoiceExample.showQuestion();
		for(Student s : students){
			s.setAttempt(RandomAnswer.multipleChoiceAnswer());
			multipleChoiceExample.verifyAnswer(s);
		}
		multipleChoiceExample.showTotal();
	}
}
