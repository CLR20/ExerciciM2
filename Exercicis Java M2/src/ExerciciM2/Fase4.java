package ExerciciM2;

import java.util.ArrayList;
import java.util.List;

public class Fase4 {
	
	public static void main(String[] args) {
		
		List<Character> surname = new ArrayList <Character>();
		
		surname.add('L');
		surname.add('o');
		surname.add('z');
		surname.add('a');
		surname.add('n');
		surname.add('o');
		
	
		List<Character> name = new ArrayList <Character>();
	
		name.add('C');
		name.add('a');
		name.add('r');
		name.add('o');
		name.add('l');
		name.add('i');
		name.add('n');
		name.add('a');
		
		List<Character> space = new ArrayList <Character>();
		
		space.add('\t');
		
		List<List> full_name = new ArrayList <List>();
		
		full_name.add(name);
		full_name.add(space);
		full_name.add(surname);
		
		System.out.println(full_name);
		
//Com què no em quadra que sigui així, provo amb taules simples
		
		char[] surname_2 = {'L', 'o', 'z', 'a', 'n', 'o'};
		
		char[] full_name_2 = {'C', 'a', 'r', 'o', 'l', 'i', 'n', 'a', '\t', 'L', 'o', 'z', 'a', 'n', 'o'};
		
		System.out.println(full_name_2);
		
	}

}
