package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mo = new Mobile();
		mo.makecall();
		mo.sendMsg();
	}

	public void makecall() {
		String Mobilemodel = "Nokia";
		float Weight = 140.80f;
		System.out.println("My Mobile model is :" + Mobilemodel);
		System.out.println("My Mobile weight is :" + Weight);
	}

	public void sendMsg() {
		boolean isFullcharged = false;
		int mobilecost = 1000;
		System.out.println("My Mobile model isFullcharged :" + isFullcharged);
		System.out.println("My Mobile mobilecost :" + mobilecost);
	}

}
