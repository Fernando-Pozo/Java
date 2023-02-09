package aplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
	
		List<Pessoa> l = new ArrayList<Pessoa>();
		
		l.add( new Pessoa("Joca",27,'M'));
		l.add( new Pessoa("Kaique",28,'M'));
		l.add( new Pessoa("Luana",23,'F'));
		
		Collections.sort( l );
		
		for( Pessoa p : l) {
			System.out.println(p.getNome());
		}
	}

}
