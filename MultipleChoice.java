public class MultipleChoice implements Question {
	String body = "";
	String instructions = "\nChoose one or more (Answers should be in the form \"ABCD\", case insensitive)";

	/*
	 * Constructor
	 * Takes a String body and assigns it to the body field or takes no parameter and calls QuestionBank.MC()
	 */
	public MultipleChoice(){
		this.body = QuestionBank.MC();
	}

	public MultipleChoice(String body){
		this.body = body;
	}
	@Override
	public String display() {
		return (body + instructions);
	}
}
