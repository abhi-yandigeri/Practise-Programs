package Day10;

public class ThrowDemo {
	void longtime(int time)
	{
	System.out.println("you have logged in at"+ time);
	if(time<9)
	{
		throw new ArithmeticException("you are absent");
	}
	else
	{
		
		System.out.println("you are present");
	}
	}

	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		t.longtime(10);
	}

}
