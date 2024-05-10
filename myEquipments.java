package general;

public class myEquipments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equipment 1
		hairDryer myTravelhairDryer = new hairDryer();
		myTravelhairDryer.dry();
		myTravelhairDryer.model ="ifb";
		System.out.println(myTravelhairDryer.model);
		
		//equipment 2
		coffeeMaker myTravelCoffeeMaker = new coffeeMaker();
		myTravelCoffeeMaker.brew();
		
		myTravelCoffeeMaker.capacity=200;
		
		System.out.println(myTravelCoffeeMaker.capacity);
	}

}
