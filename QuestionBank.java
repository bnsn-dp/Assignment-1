public class QuestionBank {
	static String[] mcBank = {
		"Which of the following belong to the SOLID Principles of OOP?\n-----\nA: Single Use\nB: Hierarchy\nC: Procedural Programming\nD: Liskov Substitution\n-----",
		"Who is part of the Big Three?\n-----\nA: Naruto\nB: Dragonball\nC: Bleach\nD: One Piece\n-----",
		"In what Cosmere works does Hoid appear?\n-----\nA: Mistborn\nB: Stormlight Archives\nC: The Sunlit Man\nD: Warbreaker"
	};
	static String[] tofBank = {
		"All birds can fly",
		"The sky is blue",
		"Ryan Gosling is literally me"
	};

	public static String MC(){
		return mcBank[(int)(Math.random()*3)];
	}

	public static String ToF(){
		return tofBank[(int)(Math.random()*3)];
	}
}
