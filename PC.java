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
		System.out.println("cpu的速度:"+cpu.getSpeed()+
				        "硬盘的容量:"+HD.getAmount()+
				        "硬盘价格:"+HD.getPrice()+
				        "cpu的品牌:"+cpu.getbrand());
	}
}
