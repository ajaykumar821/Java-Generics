package college;

class Gen<t>{
	int num;
	private t az;
	
	public Gen(int num,t st) {
		this.num=num;
		this.az=st;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public t getAz() {
		return az;
	}

	public void setAz(t az) {
		this.az = az;
	}
}



public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen sc=new Gen(45,89.768);
		System.out.println(sc.getAz());
	}

}
