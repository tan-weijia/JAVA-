# JAVA-
实验二
计G202--2020322101谭唯佳
# 阅读程序
## 实验目的：
```
用类描述计算机中CPU的运行速度和硬盘的容量。
```
## 实验内容：
```
在JAVA应用程序中创建4个类，名字分别为PC、CPU、HardDisk和Test，其中Test是主类。
1. CPU类的getSpeed()返回speed的值，setSpeed(int m)方法将参数m的值赋值给speed；
2. HardDisk类的getAmount()返回amount的值，setAmount(int m)方法将参数m的值赋值给amount；
3. PC类的setCPU(CPU c)将参数c的值赋值给CPU，setHardDisk(HardDisk h)方法将参数h的值赋值给HD，show()方法能显示CPU的速度和硬盘的容量。
4. Test类：（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200；main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200；main方法中创建一个PC对象pc。
          （2）PC调用setCPU(CPU c)方法，调用实时参是cpu；PC调用setHardDisk(HardDisk h)方法，调用实时参是disk；PC调用show()方法。
```
## 核心方法：
1. 方法一
```
 	void setSpeed(int m){
		speed=m;
	}
	
```
2. 方法二
```
	public void setbrand(String brand){
		this.brand=brand;
	}
}
```
3. 方法三
```
	void setAmount(int amount){
		this.amount=amount;
	}
```
4. 方法四
```
	public void setPrice(int price){
		this.price=price;
	}
```
5. 方法五
```
	public void setCPU(CPU c){
		cpu=c;
	}
```
6. 方法六
```
	public void setHardDisk(HardDisk h){
		HD=h;
	}
```
7. 方法七
```
	public void show(){
		System.out.println("cpu的速度:"+cpu.getSpeed()+
				        "硬盘的容量:"+HD.getAmount()+
				        "硬盘价格:"+HD.getPrice()+
				        "cpu的品牌:"+cpu.getbrand());
	}
```
8. 方法八
```
	public static void main(String[] args){
		CPU cpu=new CPU();
		cpu.speed=2200;
		cpu.brand="Intel";
		HardDisk  disk=new HardDisk();
		disk.amount = 200;
		disk.price=2000;
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
```
9. 方法九
```
	HardDisk(){
		
	}
	PC(){
		
	}
```
## 实验结果：
```
CPU的速度：2200 硬盘的容量：200 硬盘价格：2000 CPU的品牌：Intel
```
## 实验感想：
```
这是第一次正式的实验课，第一次上机写java程序和调试程序，虽然学习过C，但接触下来，觉得差别挺大的，c是面向过程的而java是面向对象的，程序编写不太熟练，尤其是调试的时候，错误提示不明显，排错困难  ，但同时也会因正确的调试出程序而带来的成就感让我对编程更加感兴趣,接下来会更加努力学习编程。
```
