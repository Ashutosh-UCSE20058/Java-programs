interface Callback{
	void callback(int param);
}

class Client implements Callback{
	public void callback(int p)
	{
		System.out.println("callback called with " + p);
	}
	void nonmeth(){
		System.out.println("Classes that implements interfaces " );
	}
}

class AccountBalance{
	public static void main(String args[])
	{
		Callback c  = new Client();
		c.callback(42);
		
	}
}