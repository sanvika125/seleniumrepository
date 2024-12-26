package icici.loans.exeptions;

import java.io.BufferedReader;

public class CheckedExceptionDemo 
{
	public static void m1() 
	{
		try {
			BufferedReader b = new BufferedReader(new FileReader("d://abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		m1();
	}

}

