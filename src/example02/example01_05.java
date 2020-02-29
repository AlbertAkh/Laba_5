package example02;

public class example01_05 {
	private int num_1;
	
	public void setNum_1() 
	{
		num_1 = 0;
	}
	public void setNum_1(int Num_1) 
	{
		seNum_1(Num_1);
	}
	public void seNum_1(int Num_1) 
	{
		if (Num_1>100) num_1 =100;
		else num_1 = Num_1;
	}
	public example01_05()
	{
		num_1 = 0;
	}
	public example01_05(int Num_1)
	{
		seNum_1(Num_1);
	}
	public void  getNum_1()
	{
		System.out.println(num_1);
	}
}