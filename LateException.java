package Day10;

class LateExceptions extends RuntimeException
{
	public LateExceptions(String msg)
	{
		super(msg);
		System.out.println("this is constructor in late exception");
	}
}
	class StudentLogin
	{
		void loginTime(int time)
		{
			if(time<9)
			{
				throw new LateExceptions("you are absent");
			}
			else
			{
				System.out.println("you are present");
			}
		}
	}

public class LateException {

	public static void main(String[] args) {
		StudentLogin sl=new StudentLogin();
		sl.loginTime(8);

	}

}
