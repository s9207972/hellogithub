package xxx;

public class PolyAnimal {
	public static void main(String[] args) {
		Animal [] objs= new Animal [3];{
			objs[0]=new Elephant(10, 2000.0f, "David");
			objs[1]= new Animal(2, 5.0f);
			objs[2]=new Elephant(5, 1000.0f, "James");
			
			for(int i = 0;i<objs.length;i++) {
				objs[i].speak();
			}
		}
	}
}	
