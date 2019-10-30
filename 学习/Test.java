package 学习;

public class Test {
	public static void main(String[] args) {
		CPU cpu=new CPU();
		cpu.speed=2200;
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		PC pc=new PC();
		pc.setCpu(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
	
	
	static	class PC{
		CPU cpu;
		HardDisk HardDisk;

		public void setCpu(CPU cpu) {
			this.cpu = cpu;
		}
		public void setHardDisk(HardDisk hardDisk) {
			HardDisk = hardDisk;
		}
		public void show() {
			System.out.println("这台pc的cpu的速度为：" +this.cpu.speed);
			System.out.println("这台pc的HardDisk的amount为："+this.HardDisk.amount);
			
		}
		
	}
	static class CPU{
		int speed;

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
	}
	static class HardDisk{
		int amount;

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
		
	}
	
}
