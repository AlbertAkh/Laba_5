package example02;

public class example01_01 {

	private char closed_metod;
		
		public void set_metod(char num_1) {
				this.closed_metod = num_1;
		}

		public char get_metod() {	//������� �����
		return this.closed_metod;
		}
		
		public void print_metod() {
		System.out.println("�������� ��������� ������ " + this.closed_metod + ", ��� �������� ��� " + (int) this.closed_metod);
		}
}
