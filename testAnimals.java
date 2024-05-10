package general;

public class testAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cat smiley = new cat();
		smiley.height = 10;
		smiley.colour= "Brown";
		
		smiley.makeSound();
		smiley.sleep();
		
		dog cesar = new dog();
		cesar.height = 100;
		cesar.colour= "black";
		cesar.makeSound();
		cesar.sleep();
		
		
	}
	
	

}
