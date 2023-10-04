public class QuestionBank {
	static String[] mcBank = {

	};
	static String[] tofBank = {

	};

	public static String MC(){
		return mcBank[(int)Math.random()*10];
	}

	public static String ToF(){
		return tofBank[(int)Math.random()*10];
	}
}
