package example02;

public class Main {

	public static void main(String[] args) {
		
		example01_01 my_obj = new example01_01();
			my_obj.set_metod('a');	// ������� �������� ������

			char got_metod = my_obj.get_metod();
			System.out.println("� ������� �������� " + got_metod);	//������� ���� ��������
			my_obj.print_metod();		// ���������� �����
			my_obj.set_metod((char)98);	// ������ �������� ������
			my_obj.print_metod();		// ���������� �����
			my_obj.set_metod('N');		// ������� ����� �������� ������
			my_obj.print_metod();		// ���������� ����� � ����� �����������
	}

}
