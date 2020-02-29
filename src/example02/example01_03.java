package example02;

public class example01_03 {
	int num_1;
	int num_2;
	
	public example01_03(){
	System.out.println("без передачи аргументов");     //без передачи аргументов
	}
	
	public example01_03(int num_1) {
	System.out.println("с передачей одного аргумента");	//с передачей одного аргумента
	System.out.println(num_1);
	}
	
	public example01_03(int num_1, int num_2) {
	System.out.println("с передачей двух аргументов");	//с передачей двух аргументов
	System.out.println(num_1 + " " + num_2);
	}
	

}
