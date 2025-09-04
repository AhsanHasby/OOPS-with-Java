package Practice;


interface Bike{
	void wheels();
}
interface Car{
	public void wheels();
}
interface Bus{
	public void wheels();
}

class Vehicle implements Bike, Car, Bus{
	@Override
	public void wheels(){
		System.out.println("It has 4 wheels");
	}
}

abstract class Cycle{
	public void wheels(){
		System.out.println("It has 2 wheels also");
	}
	
}

public class Interface{
	public static void main(String args[]){
		Bike i1 = new Bike(){
			@Override
			public void wheels(){
				System.out.println("It has 2 wheels");
			}
		};
		i1.wheels();

		Car i2 = new Vehicle();
		i2.wheels();
	
		Vehicle i3 = new Vehicle();
		i3.wheels();
		
		Cycle i4 = new Cycle(){};
		i4.wheels();
	}	
}