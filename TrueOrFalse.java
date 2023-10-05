public class TrueOrFalse implements Question {
	String body = "";
	String answers = "\n-----\n0. False\n1. True\n------";
	String instructions = "\nChoose one (Answer should be in the form \"0\" or \"1\")";

	/*
	 * Constructor
	 * Takes a String body and assigns it to the body field or takes no parameter and calls QuestionBank.MC()
	 */
	public TrueOrFalse(){
		this.body = QuestionBank.ToF();
	}

	public TrueOrFalse(String body){
		this.body = body;
	}
	@Override
	public String display() {
		return (body + answers + instructions);
	}
	
}
