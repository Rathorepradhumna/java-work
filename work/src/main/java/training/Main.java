package training;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training t1 = new PublicTraining(1,"java",5000,50);
		System.out.println("Cost of public training is  : " + t1.getOrderValue());
		Training t2 = new CorporateTraining(2,"Bid data",35000,4);
		System.out.println("cost of coorporate training : " + t2.getOrderValue());
	}

}
