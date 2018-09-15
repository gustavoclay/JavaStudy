package collections.com;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add(0, "verde");
		
		System.out.println(cores.toString());
		System.out.println(cores.size());
		System.out.println(cores.get(0));
		System.out.println(cores.indexOf("azul"));
		
		cores.remove(2);
		System.out.println(cores.toString());
		
		System.out.println(cores.contains("azul"));
		
	}

}
