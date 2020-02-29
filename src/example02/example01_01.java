package example02;

public class example01_01 {

	private char closed_metod;
		
		public void set_metod(char num_1) {
				this.closed_metod = num_1;
		}

		public char get_metod() {	//получил метод
		return this.closed_metod;
		}
		
		public void print_metod() {
		System.out.println("значение закрытого класса " + this.closed_metod + ", код значения это " + (int) this.closed_metod);
		}
}
