package day116;

public class animals{

	public static void main(String[] args) {
		Simulater dog1=new Simulater();
		dog1.playSound(new cat());
		dog1.playSound(new dog());
	}
}


class Simulater implements Animal{
	
	public void playSound(Animal animal){
		System.out.println("这是一只"+animal.getAnimalName());
		animal.cry();
	}
	
	@Override
	public void cry() {		
	}

	@Override
	public String getAnimalName() {
		return null;
	}
}

interface Animal{
	void cry();
	String getAnimalName();
}

class dog implements Animal{
	@Override
	public void cry() {
		System.out.println("狗叫");
		
	}
	@Override
	public String getAnimalName() {

		return "狗";
	}
	
}

class cat implements Animal{
	@Override
	public void cry() {
		System.out.println("猫叫");
		
	}
	@Override
	public String getAnimalName() {

		return "猫";
	}
	
}

