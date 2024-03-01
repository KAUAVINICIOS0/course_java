package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// Instânciando a List
		List<String> list = new ArrayList<>();
		
		// Adicionando na List
		list.add("Maria");
		list.add("Carlos");
		list.add("João");
		list.add("Anna");
		list.add("Alex");
		list.add(2, "Marco");
		System.out.println(list.size());
		
		// Exibindo a List
		for(String x : list) {
			System.out.println(x);
		}
		
		// Removendo Carlos
		
		list.remove(1);
		
		// Procurando na List
		System.out.println("----------------------");
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("Index of Carlos: " + list.indexOf("Carlos"));
		
		// Predicado nada mais é que uma função lambda que retorna um valor boolean no caso um verdadeiro ou falso
		System.out.println("----------------------");
		// Fazendo predicado	
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		// Predicado que procura os nomes que começam com A
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result ) {
			System.out.println(x);
		}
		
		// Verificando se a primeira String do primeiro lugar da List é == A
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}