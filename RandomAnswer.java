import java.lang.Math;
public class RandomAnswer {
	static String[] MCSpace = {"a", "b", "c", "d", "A", "B", "C", "D"};
	static String[] ToFSpace = {"0", "1"};

	public static String multipleChoiceAnswer(){
		String s = "";
		int size = (int)((Math.random() * 3) + 1);
		for(int i = 0; i < size; i++){
			s = s + MCSpace[(int)(Math.random() * 8)];
		}
		return s;
	}
	
	public static String trueOrFalseAnswer(){
		return ToFSpace[(int)(Math.random() * 2)];
	}
}
