package example02;

public class example01_02 {
	public String resultat (String str_01, String str_02) {
	
	String max;
		
	String stroka = str_01;
	String stroka2 = str_02;
	
	String alfa = "abcdefghijklmnopqrstuvwxyz";
	int index_01 = alfa.indexOf(str_01);
	int index_02 = alfa.indexOf(str_02);
	
	char[] result = alfa.toCharArray();
	for (int i = index_01; i<index_02+1; i++) {
	System.out.print(result[i]);	
	}
	max = alfa;
	
	
	return max;
	}
	
}