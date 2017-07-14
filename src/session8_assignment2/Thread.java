package session8_assignment2;

class q13Thread
{
	public static void main(String args[])
	{
		new Prime().start();
		new NotPrime().start();
	}
}