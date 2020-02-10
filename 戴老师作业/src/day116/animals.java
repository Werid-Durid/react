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
		System.out.println("����һֻ"+animal.getAnimalName());
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
		System.out.println("����");
		
	}
	@Override
	public String getAnimalName() {

		return "��";
	}
	
}

class cat implements Animal{
	@Override
	public void cry() {
		System.out.println("è��");
		
	}
	@Override
	public String getAnimalName() {

		return "è";
	}
	
}

