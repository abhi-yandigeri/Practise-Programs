package Day10;
class AgeException extends RuntimeException
{
	int age;
	public AgeException(String age)
	
	{
		super(age);
		System.out.println("Checking Eligibility");
		
	}
}
	class Vote
	{
		void AgeApp(int age) throws AgeException
		{
			if(age<18)
			{
				throw new AgeException("you cannot vote");
			}
			else
			{
				System.out.println("You can vote");
			}
		}
	}

public class AgeExeption {

	public static void main(String[] args) {
		Vote v=new Vote();
		v.AgeApp(10);

	}

}
