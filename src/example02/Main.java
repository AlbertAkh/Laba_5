package example02;

public class Main {

	public static void main(String[] args) {
		
		example01_01 my_obj = new example01_01();
			my_obj.set_metod('a');	// зададим значение методу

			char got_metod = my_obj.get_metod();
			System.out.println("я получил значение " + got_metod);	//получил имею значение
			my_obj.print_metod();		// напечатать метод
			my_obj.set_metod((char)98);	// задать значение методу
			my_obj.print_metod();		// напечатать метод
			my_obj.set_metod('N');		// зададим новое значение методу
			my_obj.print_metod();		// напечатаем метод с новой переменнной
	}

}
