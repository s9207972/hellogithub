package xxx;

public class WeightTest {
	public static void main(String[] args) {
		weightable[] ws = new weightable[3];
		
		ws[0] = new Powder();
		ws[1] = new Dog();
 		ws[2] = new Plane();
 		for(int i = 0;i <ws.length;i++) {
 			ws[i].printweighTool();
 		}
	}
}
