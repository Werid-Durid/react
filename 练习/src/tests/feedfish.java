package tests;

public class feedfish {
	
	static class Fish{
		int weight=1;
	}
	static class lake{
		Fish fish;
		void setFish(Fish s) {
			fish=s;
		}
		void foodFish(int m) {
			fish.weight=fish.weight+m;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Fish redFish=new Fish();
		System.out.println(redFish.weight);
		lake lake1=new lake();
		lake1.setFish(redFish);
		lake1.foodFish(120);
		System.out.println(redFish.weight);
		System.out.println(lake1.fish.weight);
	}
}
