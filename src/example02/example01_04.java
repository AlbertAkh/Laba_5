package example02;
import java.lang.Math;

public class example01_04 {
	private char simbol ;
	private int num_1;
	
	public example01_04(char simbol, int num_1) 
		{
				simbol = simbol;
					num_1 = num_1;
		}
	
	public example01_04(double numDouble) 
		{
			simbol =(char) Math.floor(numDouble);
				num_1 = (char) Math.floor((numDouble-Math.floor(numDouble))*100);
		}
	
	public void  getS()
		{
			System.out.println(simbol);
				System.out.print(num_1);
	}
}