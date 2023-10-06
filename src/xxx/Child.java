package xxx;

public class Child {
	int score = 90;
		
	public void play(int hours) {
		score-=hours;
	}

	public void study(int hours) {
		score+=hours;
	}
	public static void main(String[]args) {
		Child david = new Child();
		Child tim = new Child();
		System.out.println(david.score);
		System.out.println(tim.score);
		
		david.play(3);
		david.study(5);
		
		tim.play(5);
		tim.study(5);
		System.out.println(david.score);
		System.out.println(tim.score);
		
	}
}
