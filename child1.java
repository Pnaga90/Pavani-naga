package general;

public class child1 extends mom implements dad,grandDad {

	public static void main(String[] args) {
		
		System.out.println("Child's height is " + (dad.height + 10) + " Eyecolour inherited from mom is " + eyecolour);
		System.out.println("Large feet from granddad " + (shoeSize -1));
		
		
	}
	
}
