package computer;

public class Test {
	public static void main(String[] args){
		CPU cpu=new CPU();
		cpu.speed=2200;
		cpu.brand="华硕";
		HardDisk  disk=new HardDisk();
		disk.amount = 200;
		disk.price=2000;
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
