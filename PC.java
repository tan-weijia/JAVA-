package computer;

public class PC {
	CPU cpu;
	HardDisk HD;
	PC(){
		
	}
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
	public void show(){
		System.out.println("cpu���ٶȣ�"+cpu.getSpeed()+
				        "Ӳ�̵�������"+HD.getAmount());
	}
}
