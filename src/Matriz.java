import java.util.ArrayList;

public class Matriz {
	private Head cabeça;
	private Body corpo;
	private ArrayList <Integer> matriz = new ArrayList<>();

	public void escreverMatriz(){
		for(int x = 0; x < matriz.size(); x++) {
			for(int y = 0; y < matriz.size(); y++) {
				System.out.println(matriz.get(x));
			}			
		}
	}
}
