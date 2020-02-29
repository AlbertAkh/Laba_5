package example02;

public class example01_06 {
	private int min;
	private int max;
	
	public void setMinMax(int Min, int Max)
	{
		if(Min <= Max)  {min = Min; max = Max; }
			else {max = Min; min = Max;}
	}
	public void setMinMax(int Num)
	{
		if(Num <= max)  {min = Num;  }
			else {max = Num;}
	}
	public example01_06(int Min, int Max)
	{
		setMinMax(Min, Max);
	}
	public example01_06(int Num)
	{
		setMinMax(Num);
	}
	public void showMinMax()
	{
		System.out.println(min + "  "+ max);
	}
}