package Day8;
interface Bank
{
	int rateOfInterest(int percent);
	double minimumBalance(double amount);
}
class Kotak implements Bank
{
	@Override
	public int rateOfInterest(int percent) {
		System.out.println("rateOfInterest of Kotak"+percent);
		return percent;
	}
	@Override
	public double minimumBalance(double amount) {
		System.out.println("rateOfInterest of Kotak"+amount);
		return 0;
}
	class SBI implements Bank
	{

		@Override
		public int rateOfInterest(int percent) {
			System.out.println("rateOfInterest of SBI "+ percent);
			return percent;
		}

		@Override
		public double minimumBalance(double amount) {
			System.out.println("minimumBalance of SBI "+ amount);
			return 0;
		}
		
	}
	
	
public class Interface {

	public void main(String[] args) {
		Bank b=new SBI();
		b.minimumBalance(3000);
		b.rateOfInterest(4);

	}
}
}
