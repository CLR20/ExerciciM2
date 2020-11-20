package ExerciciM2;

import java.util.List;
import java.util.ArrayList;

public class Fase2 {
	
	public static void main (String[] args) {
		
		List<Character> name = new ArrayList <Character>();
		
		name.add('C');
		name.add('a');
		name.add('r');
		name.add('o');
		name.add('l');
		name.add('6');
		name.add('i');
		name.add('n');
		name.add('a');
		
		for (char i : name) {
		if (i == 'a'|| i == 'e' || i == 'i' || i == 'o' || i == 'u') {
			System.out.println("VOCAL");
		}
		else if (i == '0'|| i == '1' || i == '2' || i == '3' || i == '4' || i == '5'|| i == '6' || i == '7' || i == '8' || i == '9'){ 
			System.out.println("Els noms de persones no contenen números!");
		}
		else
			System.out.println("CONSONANT");
	}
		
	}

}
